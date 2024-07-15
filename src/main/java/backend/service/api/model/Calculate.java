package backend.service.api.model;

public class Calculate {
    private int firstNumber;
    private int secondNumber;
    private Symbol sign;

    public Calculate(int firstNumber, int secondNumber, Symbol sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Symbol getSign() {
        return sign;
    }

    public void setSign(Symbol sign) {
        this.sign = sign;
    }
}
