package com.michalkry.calculator;


import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public double performCalculation(double firstNumber, double secondNumber, OperationType operationType) {

        switch (operationType) {
            case ADD:
                return firstNumber + secondNumber;
            case SUBTRACT:
                return firstNumber - secondNumber;
            case MULTIPLE:
                return firstNumber * secondNumber;
            case DIVIDE:
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("No operation type provided.");
        }


    }

}
