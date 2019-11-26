package com.michalkry.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void performCalculationGivenSum(){

        //WHEN
        double result = calculatorService.performCalculation(0.5, 0.5, OperationType.ADD);

        //THEN
        Assertions.assertThat(result).isEqualTo(1.0);

    }

    @Test
    public void performCalculationGivenSubtract(){

        //WHEN
        double result = calculatorService.performCalculation(1.5, 0.5, OperationType.SUBTRACT);

        //THEN
        Assertions.assertThat(result).isEqualTo(1.0);

    }

    @Test
    public void performCalculationGivenMultiple(){

        //WHEN
        double result = calculatorService.performCalculation(1.0, 1.0, OperationType.MULTIPLE);

        //THEN
        Assertions.assertThat(result).isEqualTo(1.0);

    }

    @Test
    public void performCalculationGivenDivide(){

        //WHEN
        double result = calculatorService.performCalculation(10.0, 5.0, OperationType.DIVIDE);

        //THEN
        Assertions.assertThat(result).isEqualTo(2.0);

    }

}