package designpatterns5041.assignment05;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NodeIterator implements Iterator<Integer> {
    private final Node node;
    private boolean visited;
    private final Iterator<Integer> leftIterator;
    private final Iterator<Integer> rightIterator;

    public NodeIterator(Node node) {
        this.node = node;
        this.leftIterator = (node.getLeft() == null) ? null : node.getLeft().iterator();
        this.rightIterator = (node.getRight() == null) ? null : node.getRight().iterator();
    }

    @Override
    public boolean hasNext() {
        if (!visited) {
            return true;
        }
        if (leftIterator != null && leftIterator.hasNext()) {
            return true;
        }
        if (rightIterator != null && rightIterator.hasNext()) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!visited) {
            visited = true;
            return node.getValue();
        }
        if (leftIterator != null && leftIterator.hasNext()) {
            return leftIterator.next();
        }
        if (rightIterator != null && rightIterator.hasNext()) {
            return rightIterator.next();
        }
        throw new NoSuchElementException();
    }
}
