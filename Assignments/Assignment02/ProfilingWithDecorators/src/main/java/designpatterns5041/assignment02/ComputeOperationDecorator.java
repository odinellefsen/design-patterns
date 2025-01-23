package designpatterns5041.assignment02;

import designpatterns5041.assignment02.library.ComputeOperation;

public abstract class ComputeOperationDecorator implements ComputeOperation {
    protected ComputeOperation decoratedOperation;
    
    public ComputeOperationDecorator(ComputeOperation operation) {
        this.decoratedOperation = operation;
    }
    
    @Override
    public void compute(int number) {
        decoratedOperation.compute(number);
    }
}
