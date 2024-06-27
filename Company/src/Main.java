import Inputter.Inputter;
import controller.CompanyController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CompanyController cpn = new CompanyController();
        cpn.inputByType("ae");
        cpn.inputByType("ae");
        cpn.inputByType("ac");
        cpn.displayCustomer();
        cpn.displayEmployee();
        cpn.countByType();
    }


}