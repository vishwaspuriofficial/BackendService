package backend.service.service;

import backend.service.api.model.Calculate;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private Calculate eqn;

    public void setEquation(double firstNumber, double secondNumber, String sign) {
        this.eqn = new Calculate(firstNumber, secondNumber, sign);
    }

    public double calculate()
    {
        return switch (eqn.getSign()) {
            case "plus" -> eqn.getFirstNumber() + eqn.getSecondNumber();
            case "minus" -> eqn.getFirstNumber() - eqn.getSecondNumber();
            case "multiply" -> eqn.getFirstNumber() * eqn.getSecondNumber();
            case "divide" -> eqn.getFirstNumber() / eqn.getSecondNumber();
            default -> 0;
        };
    }

}
