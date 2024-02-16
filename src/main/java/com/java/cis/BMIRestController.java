package com.java.cis;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIRestController {

    @PostMapping("/bmirest")
    public String calculateBMI(@RequestParam double height, @RequestParam double weight) {
        // Calculate BMI
        double bmi = weight / (height * height)*703;

        // Return BMI as a String
        return String.format("Your BMI is %.2f", bmi);
    }
}