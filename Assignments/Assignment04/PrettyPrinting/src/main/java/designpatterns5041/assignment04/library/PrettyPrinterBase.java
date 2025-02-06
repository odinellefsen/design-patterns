package designpatterns5041.assignment04.library;

import java.util.Map;

// | ----------------------------- |
// | You can NOT change this class |
// | ----------------------------- |

public abstract class PrettyPrinterBase implements PrettyPrinter {

    protected void printPreamble() { }

    protected abstract void printBegin(String className);

    protected abstract void printEnd(String className);

    protected abstract void printProperty(String propertyName, Object propertyValue);

    @Override
    public final void print(Map<String, Object> object, String name) {
        printPreamble();

        printBegin(name);

        for(Map.Entry<String, Object> entry : object.entrySet()) {
            printProperty(entry.getKey(), entry.getValue());
        }

        printEnd(name);
    }
}
