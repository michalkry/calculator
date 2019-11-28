package com.michalkry.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;


    @GetMapping("/index")
    public String show(Model model){

        model.addAttribute("newOperation", new Operation());

        return "index";

    }


    @PostMapping("/calculate") //bo chce przeslac dane do mojego backendu;
    public String calculate (Model model,
                             Operation operation){

        Double calculationResult = calculatorService.performCalculation(operation.getFirstNumber(),
                                                                        operation.getSecondNumber(),
                                                                        operation.getOperationType());
        model.addAttribute("calculationResult", calculationResult);
        model.addAttribute("newOperation", new Operation());

        return "index";

    }


}
