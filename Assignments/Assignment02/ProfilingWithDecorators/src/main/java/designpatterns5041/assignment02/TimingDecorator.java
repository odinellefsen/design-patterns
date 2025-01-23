package designpatterns5041.assignment02;

import designpatterns5041.assignment02.library.ComputeOperation;

public class TimingDecorator extends ComputeOperationDecorator {
    public TimingDecorator(ComputeOperation operation) {
        super(operation);
    }
    
    @Override
    public void compute(int number) {
        long startTime = System.currentTimeMillis();
        decoratedOperation.compute(number);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time was " + (endTime - startTime) + "ms");
    }
} 