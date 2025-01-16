package designpatterns5041.assignment01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. Create a new deck to save as JSON
        System.out.println("-= Json Deck =-");
        Deck jsonDeck = new Deck();
        jsonDeck.shuffle();
        for (Card card : jsonDeck) {
            System.out.println(card);
        }
        jsonDeck.save(StorageFormat.JSON);
        System.out.println();

        // 2. Create a new deck to load from JSON
        System.out.println("-= Restored Json Deck =-");
        Deck restoredJsonDeck = new Deck();
        restoredJsonDeck.shuffle(); // Shuffle for good measure. Will be undone after the load.
        restoredJsonDeck.load(StorageFormat.JSON);
        for (Card card : jsonDeck) {
            System.out.println(card);
        }
        jsonDeck.save(StorageFormat.JSON);
        System.out.println();

        // 3. Create a new deck to save as binary
        System.out.println("-= Binary Deck =-");
        Deck binaryDeck = new Deck();
        binaryDeck.shuffle();
        for (Card card : binaryDeck) {
            System.out.println(card);
        }
        binaryDeck.save(StorageFormat.BINARY);
        System.out.println();

        // 4. Create a new deck to load from binary
        System.out.println("-= Restored Binary Deck =-");
        Deck restoredBinaryDeck = new Deck();
        restoredBinaryDeck.shuffle();
        restoredBinaryDeck.load(StorageFormat.BINARY);
        for (Card card : restoredBinaryDeck) {
            System.out.println(card);
        }
        System.out.println();
    }
}
