package com.example.calculator;

public class Values
{
    private String firstOperation;
    private String secondOperation;

    public boolean equalsTovalue(Values values)
    {
        return firstOperation.equals(values.firstOperation)&&secondOperation.equals(values.secondOperation);
    }

    public String getFirstOperation() {
        return firstOperation;
    }

    public void setFirstOperation(String firstOperation) {
        this.firstOperation = firstOperation;
    }

    public String getSecondOperation() {
        return secondOperation;
    }

    public void setSecondOperation(String secondOperation) {
        this.secondOperation = secondOperation;
    }
}
