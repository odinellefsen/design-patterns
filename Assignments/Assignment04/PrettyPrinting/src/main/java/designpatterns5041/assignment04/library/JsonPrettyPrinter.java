package designpatterns5041.assignment04.library;

public class JsonPrettyPrinter extends PrettyPrinterBase {
    private boolean firstProperty;

    @Override
    protected void printBegin(String className) {
        firstProperty = true;
        System.out.println("{");
    }

    @Override
    protected void printEnd(String className) {
        System.out.println("\n}");
    }

    @Override
    protected void printProperty(String propertyName, Object propertyValue) {
        if (!firstProperty) {
            System.out.println(",");
        }
        
        String value = propertyValue instanceof String ? 
            "\"" + propertyValue + "\"" : 
            String.valueOf(propertyValue);
        
        System.out.print("    \"" + propertyName + "\": " + value);
        firstProperty = false;
    }

    @Override
    protected void printPreamble() {
        // Not needed for JSON format
    }
}
