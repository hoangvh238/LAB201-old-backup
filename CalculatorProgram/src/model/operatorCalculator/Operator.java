package model.operatorCalculator;

import validation.Validation;

public class Operator {
    public double mathCal(double a,String operator,double b) throws Validation {
        switch (operator)
        {
            case "+": return add(a,b);
            case "-": return digit(a,b);
            case "*": return plus(a,b);
            case "/": return div(a,b);
            case "^":return pow(a,b);
        }
        return 0;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    double digit(double a,double b)
    {
        return a-b;
    }
    double plus(double a,double b)
    {
        return a*b;
    }
    double div(double a,double b)
    {
        return a/b;
    }
    double pow(double a,double b)
    {
        return Math.pow(a,b);
    }
}
