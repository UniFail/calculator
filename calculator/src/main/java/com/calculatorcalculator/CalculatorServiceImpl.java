package com.calculatorcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome(){
        return "<b> Welcome to the calculator </b>";
    }
    public String plus(int num1, int num2){
        return  num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2){
        return  num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public String multiply(int num1, int num2){
        return  num1 + " * " + num2 + " = " + (num1 * num2);
    }
    public String divide(int num1, int num2){
        if (num2 == 0){
            return "Cannot be divided by 0";
        }
        return  num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
