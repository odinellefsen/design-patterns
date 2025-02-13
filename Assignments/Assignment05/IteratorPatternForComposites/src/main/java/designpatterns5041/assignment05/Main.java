package designpatterns5041.assignment05;

public class Main {

    // You are not allowed to change this!
    public static void main(String[] args) {
        Node node = new Node(
                42,
                new Node(69, new Node(420, null, null), new Node(1337, null, null)),
                new Node(80085, null, null)
        );

        for (int value : node) {
            System.out.print(value);
        }
    }
}