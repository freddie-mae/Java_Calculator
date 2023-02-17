package org.example;

public class Calculator implements SimpleCalculator {

    public int num1;
    public int num2;

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;

    }
}
