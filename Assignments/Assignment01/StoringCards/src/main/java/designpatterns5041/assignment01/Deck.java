package designpatterns5041.assignment01;

import java.io.*;
import java.util.*;

class Deck implements Iterable<Card> {
    private List<Card> cards;
    private DeckStorage storage;

    public Deck(StorageFormat format) {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        setStorage(format);
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

    public void setStorage(StorageFormat format) {
        switch (format) {
            case JSON:
                this.storage = new JsonDeckStorage();
                break;
            case BINARY:
                this.storage = new BinaryDeckStorage();
                break;
            default:
                throw new UnsupportedOperationException("Storage format " + format + " not supported");
        }
    }

    public void save() throws IOException {
        if (storage == null) {
            throw new IllegalStateException("Storage format not set");
        }
        storage.save(cards);
    }

    public void load() throws IOException {
        if (storage == null) {
            throw new IllegalStateException("Storage format not set");
        }
        cards = storage.load();
    }
}