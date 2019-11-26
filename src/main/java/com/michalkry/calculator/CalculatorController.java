package com.michalkry.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

}
