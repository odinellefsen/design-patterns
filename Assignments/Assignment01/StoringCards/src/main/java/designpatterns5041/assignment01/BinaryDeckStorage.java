package designpatterns5041.assignment01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryDeckStorage implements DeckStorage {
    @Override
    public void save(List<Card> cards) throws IOException {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("deck.bin"))) {
            byte[] bytes = new byte[cards.size() * 2];
            for (int i = 0; i < cards.size(); i++) {
                Card card = cards.get(i);
                bytes[(i*2)] = (byte)card.getSuit().ordinal();
                bytes[(i*2) + 1] = (byte)card.getRank().ordinal();
            }
            output.write(bytes);
        }
    }
    
    @Override
    public List<Card> load() throws IOException {
        try (DataInputStream input = new DataInputStream(new FileInputStream("deck.bin"))) {
            byte[] bytes = new byte[2 * 52];
            int read = input.read(bytes);
            List<Card> loaded = new ArrayList<>();
            int i = 0;
            while (i + 1 < read) {
                loaded.add(new Card(Suit.values()[bytes[i]], Rank.values()[bytes[i + 1]]));
                i += 2;
            }
            return loaded;
        }
    }
} 