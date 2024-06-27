package controller;

import model.heightCalculator.Status;
import model.operatorCalculator.Operator;
import validation.Inputter;
import validation.Validation;

import java.util.Scanner;

public class CalculatorController {
     Inputter inputter = new Inputter();
     Operator operator = new Operator();
     Status status = new Status();

     // function 1
     public void mathCal() throws Validation {
          double memory=0;
          String operatorChar = null;
          double number = inputNumber(null);
          operatorChar = inputOperator();
          memory += operator.mathCal(number,operatorChar,inputNumber(operatorChar));
          while(true)
          {
               System.err.println("Memory is : "+memory);
               System.out.println("Do you want close ?( enter = to close )");
               String choice = inputter.choiceInput();
               if(choice == "=")break;
               operatorChar = inputOperator();
               memory += operator.mathCal(memory,operatorChar,inputNumber(operatorChar));
          }
     }
     double inputNumber(String operator) throws Validation {
          double a =0;
          while(true)
          {
               try
               {
                    a = inputter.inputDouble("Enter number :");
                    if(a==0 && (operator.contains("/"))) throw new Validation("");
                    break;
               }
               catch(Exception e)
               {
                    System.err.println(e.getMessage());
                    System.err.println("Error input < 0 when you div");
               }
          }
          return a;
     }
     String inputOperator() throws Validation
     {
          String operatorChar;
          operatorChar = inputter.inputChar("Enter operator :");
          return operatorChar;
     }


     // function 2
     public void heightCall() throws Validation {
          double weight = inputter.inputPositiveDouble("Enter Weight(kg):");
          double height = inputter.inputPositiveDouble("Enter Height(cm): ")/100;
          double bmiValue = bmiCalculator(height,weight);
          System.out.println("BMI Number: "+bmiValue);
          System.out.println("BMI Status: "+status.checkStatus(bmiValue));
     }
     double bmiCalculator(double h,double w)
     {
          return w/(h*h);
     }
}

