package view;

import controller.PersonController;
import validation.Inputter;

public class Main {
    public static void main(String[] args) {
        Inputter inputter = new Inputter();
        int value = inputter.inputNumber("Enter number of person :");
        PersonController personController = new PersonController(value);
        personController.bubbleSort();
        personController.display();
    }
}