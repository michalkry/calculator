package com.michalkry.calculator;


import lombok.Data;

@Data
public class Operation {

    private double firstNumber;

    private double secondNumber;

    private OperationType operationType;

}
