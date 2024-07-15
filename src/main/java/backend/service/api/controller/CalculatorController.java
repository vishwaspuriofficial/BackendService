package backend.service.api.controller;
import backend.service.api.model.User;
import backend.service.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public double calculate(@RequestParam double num1, double num2, String symbol) {
        calculatorService.setEquation(num1, num2, symbol);
        return calculatorService.calculate();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return "Hello, "+user.getFirstName();
    }

}

