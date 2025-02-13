package designpatterns5041.assignment05;

import java.util.Iterator;

public class Node implements Iterable<Integer> {
    private final int value;
    private final Node left;
    private final Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }
}
