package designpatterns5041.assignment01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(StorageFormat.JSON);
        
        // Shuffle and save in JSON format
        deck.shuffle();
        deck.setStorage(StorageFormat.JSON);
        try {
            deck.save();
        } catch (IOException e) {
            System.err.println("Error saving deck to JSON: " + e.getMessage());
        }

        // Create new deck, load from JSON, and print
        Deck loadedDeck = new Deck(StorageFormat.JSON);
        loadedDeck.setStorage(StorageFormat.JSON);
        try {
            loadedDeck.load();
            System.out.println("Loaded from JSON:");
            for (Card card : loadedDeck) {
                System.out.println(card);
            }
        } catch (IOException e) {
            System.err.println("Error loading deck from JSON: " + e.getMessage());
        }

        // Save in binary format
        deck.setStorage(StorageFormat.BINARY);
        try {
            deck.save();
        } catch (IOException e) {
            System.err.println("Error saving deck to binary: " + e.getMessage());
        }

        // Load from binary and print
        loadedDeck.setStorage(StorageFormat.BINARY);
        try {
            loadedDeck.load();
            System.out.println("\nLoaded from binary:");
            for (Card card : loadedDeck) {
                System.out.println(card);
            }
        } catch (IOException e) {
            System.err.println("Error loading deck from binary: " + e.getMessage());
        }
    }
}
