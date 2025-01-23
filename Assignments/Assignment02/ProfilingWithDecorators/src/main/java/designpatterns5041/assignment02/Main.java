package designpatterns5041.assignment02;

import designpatterns5041.assignment02.library.ComputeOperation;
import designpatterns5041.assignment02.library.DefaultComputeOperation;

public class Main {
    public static void main(String[] args) {
        ComputeOperation operation = new DefaultComputeOperation();
        operation.compute(100);
    }
}