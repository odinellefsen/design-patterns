package designpatterns5041.assignment04.library;

// | ----------------------------- |
// | You can NOT change this class |
// | ----------------------------- |

public class XmlPrettyPrinter extends PrettyPrinterBase {
    @Override
    protected void printPreamble() {
        System.out.println("<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>");
    }

    @Override
    protected void printBegin(String className) {
        System.out.print("<" + className + ">");
    }

    @Override
    protected void printEnd(String className) {
        System.out.print("</" + className + ">");
    }

    @Override
    protected void printProperty(String propertyName, Object propertyValue) {
        System.out.print("<" + propertyName + ">" + propertyValue + "</" + propertyName + ">");
    }
}
