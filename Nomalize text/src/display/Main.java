package display;

import controller.FileController;
import model.WriteFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileController fileController = new FileController();
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the place of the file (example D:\\name.format");
        String url = scanner.nextLine();
        string = fileController.getStringNormal(url);
        ///
        System.out.println("---------------------------------");
        System.out.println("Enter the place of the file export ");
        url = scanner.nextLine();
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileData(string,url);
        System.out.println("Bye");
    }


}
