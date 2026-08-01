package com.pro.calculator.Service;

import com.pro.calculator.Calculator;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

    private final Calculator calculator = new Calculator();

    public float executeOperation(int option, float num1, float num2) {
        switch (option) {
            case 1:
                return calculator.Add(num1, num2);
            case 2:
                return calculator.Sub(num1, num2);
            case 3:
                return calculator.Multiply(num1, num2);
            case 4:
                return calculator.Divide(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid option selected");
        }
    }
}

