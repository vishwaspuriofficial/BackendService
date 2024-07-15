package backend.service.service;

import backend.service.api.model.Calculate;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private Calculate eqn;

    public void setEquation(int firstNumber, int secondNumber, String sign) {
        this.eqn = new Calculate(firstNumber, secondNumber, sign);
    }

    public int calculate()
    {
        return switch (eqn.getSign()) {
            case "+" -> eqn.getFirstNumber() + eqn.getSecondNumber();
            case "-" -> eqn.getFirstNumber() - eqn.getSecondNumber();
            case "*" -> eqn.getFirstNumber() * eqn.getSecondNumber();
            case "/" -> eqn.getFirstNumber() / eqn.getSecondNumber();
            default -> 0;
        };
    }

}
