package com.prosky.hw21;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + num1 * num2;
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZero("Divide by zero");
        } else {
            return num1 + " / " + num2 + " = " + num1 / num2;
        }
    }
}
