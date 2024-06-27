package view;

import controller.CalculatorController;
import validation.Inputter;
import validation.Validation;

public class Main {
    public static void main(String[] args) throws Validation {
        CalculatorController calculatorController = new CalculatorController();
        Menu menu = new Menu();
        String [] options = new String[]{"Calculator Program","Normal Calculator","BMI Calculator","Exit"};
        while(true){
            int choice = Menu.getChoice(options);
            switch(choice){
                case 1:
                    calculatorController.mathCal();
                    break;
                case 2:
                   calculatorController.heightCall();
                    break;
                default:
                    System.out.println("GOODBYE!");
            }
            if(choice > 2 || choice <1)break;
        }
    }
}