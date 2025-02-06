package designpatterns5041.assignment04.library;

import java.util.ArrayList;
import java.util.List;

public class CsvPrettyPrinter extends PrettyPrinterBase {
    private List<String> values;
    private List<String> headers;
    private boolean printHeaders;

    public CsvPrettyPrinter(boolean printHeaders) {
        this.printHeaders = printHeaders;
        this.values = new ArrayList<>();
        this.headers = new ArrayList<>();
    }

    public CsvPrettyPrinter() {
        this(false); // Default to basic CSV without headers
    }

    @Override
    protected void printBegin(String className) {
        values = new ArrayList<>();
        headers = new ArrayList<>();
    }

    @Override
    protected void printEnd(String className) {
        if (printHeaders) {
            System.out.println(String.join(", ", headers));
        }
        System.out.println(String.join(", ", values));
    }

    @Override
    protected void printProperty(String propertyName, Object propertyValue) {
        if (printHeaders) {
            // Convert propertyName from camelCase to proper case
            String header = propertyName.replaceAll("([a-z])([A-Z])", "$1 $2");
            headers.add(header);
        }
        values.add(propertyValue.toString());
    }

    @Override
    protected void printPreamble() {
        // Not needed for CSV format
    }
} 