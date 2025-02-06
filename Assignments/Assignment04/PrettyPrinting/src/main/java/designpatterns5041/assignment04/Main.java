package designpatterns5041.assignment04;

import designpatterns5041.assignment04.library.PrettyPrinter;
import designpatterns5041.assignment04.library.XmlPrettyPrinter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Build a dynamic "object"
        Map<String, Object> person = new LinkedHashMap<>() {{
            put("FirstName", "Thomas A." );
            put("LastName", "Anderson" );
            put("Occupation", "Hacker" );
        }};

        PrettyPrinter prettyPrinter = new XmlPrettyPrinter();
        prettyPrinter.print(person, "Person");
    }
}