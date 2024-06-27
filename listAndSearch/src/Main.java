import controller.FileController;
import validation.Inputter;
import validation.Validation;
import view.Menu;


public class Main {
    public static void main(String[] args) throws Validation {
        FileController fileController = new FileController();
        Inputter inputter = new Inputter();
        int choice;
        String [] options = new String[]{"Word Program ", "Count Word In File","Find File By Word", "Exist"};
        while(true)
        {
            try
            {
                do {
                    choice = Menu.getChoice(options);
                    switch (choice) {
                        case 1:
                            fileController.countWord(inputter.inputNonBlankString("Enter path :"),inputter.inputNonBlankString("Enter word :"));
                            break;
                        case 2:
                            fileController.findFile(inputter.inputNonBlankString("Enter path :"),inputter.inputNonBlankString("Enter word :"));
                            break;
                    }
                }while(choice>0&&choice <3);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Error input !");
            }
        }
    }
}