package website.ndlamdev.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import website.ndlamdev.bignumber.MyBigNumber;
import website.ndlamdev.spring.dto.CalculationRequest;
import website.ndlamdev.spring.dto.CalculationResponse;

/**
 * Author: Nguyen Dinh Lam
 * Email: kiminonawa1305@gmail.com
 * Phone number: +84 855354919
 * Create at: 08/10/2025
 * User: kimin
 **/

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public CalculationResponse calculate(@RequestBody CalculationRequest request) {
        long startTime = System.nanoTime();
        
        String result = MyBigNumber.sum(request.getNumber1(), request.getNumber2());
        
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0; // Convert to milliseconds
        
        return new CalculationResponse(result, executionTime);
    }
}

