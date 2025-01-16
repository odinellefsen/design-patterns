package designpatterns5041.assignment01;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonDeckStorage implements DeckStorage {
    private final Gson gson = new Gson();
    
    @Override
    public void save(List<Card> cards) throws IOException {
        String serialized = gson.toJson(cards);
        Files.write(Paths.get("deck.json"), serialized.getBytes());
    }
    
    @Override
    public List<Card> load() throws IOException {
        String serialized = new String(Files.readAllBytes(Paths.get("deck.json")));
        return Arrays.asList(gson.fromJson(serialized, Card[].class));
    }
} 