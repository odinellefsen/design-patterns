package designpatterns5041.assignment01;

import java.io.IOException;
import java.util.List;

public interface DeckStorage {
    void save(List<Card> cards) throws IOException;
    List<Card> load() throws IOException;
} 