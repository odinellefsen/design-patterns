package designpatterns5041.assignment01;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class Deck implements Iterable<Card> {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Card deal() {
        if (!cards.isEmpty()) {
            Card top = cards.get(0);
            cards.remove(0);
            return top;
        }
        throw new IllegalStateException("No more cards left to deal");
    }

    public void shuffle() {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < cards.size(); i++) {
            int j = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public void arrange() {
        cards.sort(Comparator.naturalOrder());
    }

    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    public void load(StorageFormat format) throws IOException {
        switch (format) {
            case JSON:
                String serialized = new String(Files.readAllBytes(Paths.get("deck.json")));
                Gson gson = new Gson();
                cards = Arrays.asList(gson.fromJson(serialized, Card[].class));
                break;
            case BINARY:
                try (DataInputStream input = new DataInputStream(new FileInputStream("deck.bin"))) {
                    byte[] bytes = new byte[2 * 52];
                    int read = input.read(bytes);
                    List<Card> loaded = new ArrayList<>();
                    int i = 0;
                    while (i + 1 < read) {
                        loaded.add(new Card(Suit.values()[bytes[i]], Rank.values()[bytes[i + 1]]));
                        i += 2;
                    }
                    cards = loaded;
                }
                break;
            default:
                throw new UnsupportedOperationException("Storage format " + format + " not supported");
        }
    }

    public void save(StorageFormat format) throws IOException {
        switch (format) {
            case JSON:
                Gson gson = new Gson();
                String serialized = gson.toJson(cards);
                Files.write(Paths.get("deck.json"), serialized.getBytes());
                break;
            case BINARY:
                try (DataOutputStream output = new DataOutputStream(new FileOutputStream("deck.bin"))) {
                    byte[] bytes = new byte[cards.size() * 2];
                    for (int i = 0; i < cards.size(); i++) {
                        Card card = cards.get(i);
                        bytes[(i*2)] = (byte)card.getSuit().ordinal();
                        bytes[(i*2) + 1] = (byte)card.getRank().ordinal();
                    }

                    output.write(bytes);
                }
                break;
            default:
                throw new UnsupportedOperationException("Storage format " + format + " not supported");
        }
    }
}