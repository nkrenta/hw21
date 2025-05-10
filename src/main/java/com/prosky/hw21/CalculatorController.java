package com.prosky.hw21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return """
                Hello, My dear User
                You're welcome!
                You can use me like a calculator! I'll explain how...
                
                Ask me like this: /calculator/'plus,minus,multiply,divide'?num1=10&num2=5""";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
        try {
            return calculatorService.divide(num1, num2);
        } catch (DivideByZero e) {
            return "U can't divide by zero";
        }
    }
}

