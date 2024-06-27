package display;

import controller.ContactController;
import validation.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Validation {
        ContactController controller = new ContactController();
        Menu menu = new Menu();
        String [] options = new String[]{"CONTACT PROGRAM","Add contact","Display all contact","Delete by id","Exit"};
        while(true){
            int choice = Menu.getChoice(options);
            switch(choice){
                case 1:
                    controller.inputInfo();
                    break;
                case 2:
                    controller.display();
                    break;
                case 3:
                    controller.deleteById();
                    break;
                default:
                    System.out.println("GOODBYE!");
            }
            if(choice > 4 || choice <1)break;
        }
    }
}