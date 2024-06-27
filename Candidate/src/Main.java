import Data.Controller;
import Data.Experience;
import Data.Fresher;
import Data.Intern;
import Inputter.Inputter;
import Inputter.Validation;

import java.util.Scanner;

public class Main {
    private static Controller controller;

    public static void main(String[] args) throws Validation {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String id = null;
        String firstname = null;
        String lastName = null;
        int birthDay = 0;
        String address = null;
        String phone = null;
        String email = null;
        Controller controller = new Controller();
        do {
            System.out.println("Menu");
            System.out.println("1.Add Intern");
            System.out.println("2.Add exp");
            System.out.println("3.Add fresher");
            System.out.println("4.Search");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());


            if (choice != 4) {
                System.out.println("Enter id");
                id = scanner.nextLine();
                System.out.println("Enter first name : ");
                firstname = scanner.nextLine().trim();
                System.out.println("Enter last name : ");
                lastName = scanner.nextLine().trim();
                birthDay = Inputter.inputDayOfBirth();
                System.out.println("Enter address");
                address = scanner.nextLine();
                phone = Inputter.inputPhone();
                email = Inputter.inputEmail();
            }
            //0 1 2
            switch (choice) {
                case 1:

                    System.out.println("Enter major");
                    String major = scanner.nextLine();
                    System.out.println("Enter semeter ");
                    int semeter = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter university name : ");
                    String nameUni = scanner.nextLine();
                    Intern intern = new Intern(id, firstname, lastName, birthDay, address, phone, email, 2, major, semeter, nameUni);
                    controller.interns.add(intern);
                    break;
                case 2:
                    int exp = Inputter.inputYearExp();
                    System.out.println("Enter proskill :");
                    String proSkill = scanner.nextLine();
                    Experience experience = new Experience(id, firstname, lastName, birthDay, address, phone, email, 0, exp, proSkill);
                    controller.experiences.add(experience);
                    break;
                case 3:
                    System.out.println("Enter graduated  time : ");
                    String graTime = scanner.nextLine();
                    String rank = Inputter.rankGra();
                    System.out.println("Enter school name :");
                    String univer = scanner.nextLine();
                    Fresher fresher = new Fresher(id, firstname, lastName, birthDay, address, phone, email, 1, graTime, rank, univer);
                    break;
                case 4:
                    controller.displayAll();
                    System.out.println("Enter name want search");
                    String name = scanner.nextLine();
                    System.out.println("Enter type");
                    int type = Integer.parseInt(scanner.nextLine());
                    controller.found(name, type);
                    break;
            }
            System.out.println("Do you want continute (Y/N)?");
            String yesOrNor = scanner.nextLine();
            if (yesOrNor.toUpperCase().equals("N")) break;

        }
        while (choice > 0 && choice < 5);
    }

}