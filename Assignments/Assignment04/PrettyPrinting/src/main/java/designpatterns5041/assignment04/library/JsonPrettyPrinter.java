package designpatterns5041.assignment04.library;

public class JsonPrettyPrinter extends PrettyPrinterBase {

    @Override
    protected void printBegin(String className) {
        System.out.println("{");
    }

    @Override
    protected void printEnd(String className) {
        System.out.println("}");
    }

    @Override
    protected void printProperty(String propertyName, Object propertyValue) {
        // Add quotes around property name and value (if it's a String)
        String value = propertyValue instanceof String ? 
            "\"" + propertyValue + "\"" : 
            String.valueOf(propertyValue);
        
        // Check if this is the last property to handle comma
        System.out.println("    \"" + propertyName + "\": " + value + ",");
    }

    @Override
    protected void printPreamble() {
        // Remove preamble as it's not needed for JSON format
    }
}
