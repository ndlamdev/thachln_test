package website.ndlamdev.spring.dto;

/**
 * Author: Nguyen Dinh Lam
 * Email: kiminonawa1305@gmail.com
 * Phone number: +84 855354919
 * Create at: 08/10/2025
 * User: kimin
 **/

public class CalculationResponse {
    private String result;
    private double executionTime; // in milliseconds

    public CalculationResponse() {
    }

    public CalculationResponse(String result, double executionTime) {
        this.result = result;
        this.executionTime = executionTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(double executionTime) {
        this.executionTime = executionTime;
    }
}

