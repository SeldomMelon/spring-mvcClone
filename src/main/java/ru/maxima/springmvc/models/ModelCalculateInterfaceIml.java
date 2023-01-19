package ru.maxima.springmvc.models;

import org.springframework.stereotype.Component;

@Component
public class ModelCalculateInterfaceIml implements CalculateInterface{



    public double calculateInter(double num1, double num2, String operation) {
        double result = 0;

        switch (operation) {
            case "adding" :
                result = num1 + num2;
                break;
            case "subtracting" :
                result = num1 - num2;
                break;
            case "multiplication" :
                result = num1 * num2;
                break;
            case "division" :
                result = num1 / num2;
                break;
        }
        return result;
    }
}

