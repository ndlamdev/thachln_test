package website.ndlamdev.spring.dto;

/**
 * Author: Nguyen Dinh Lam
 * Email: kiminonawa1305@gmail.com
 * Phone number: +84 855354919
 * Create at: 08/10/2025
 * User: kimin
 **/

public class CalculationRequest {
    private String number1;
    private String number2;

    public CalculationRequest() {
    }

    public CalculationRequest(String number1, String number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }
}

