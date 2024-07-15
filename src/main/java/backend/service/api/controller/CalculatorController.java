package backend.service.api.controller;
import backend.service.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/healthy")
    public String healthCheck(@RequestParam String check) {
        return check;
    }

    @GetMapping("/calculate")
    public int calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String symbol) {
        System.out.println("CHECKKKKK num1: " + num1 + ", num2: " + num2 + ", symbol: " + symbol);
        calculatorService.setEquation(num1, num2, symbol);
        return calculatorService.calculate();
    }

}

