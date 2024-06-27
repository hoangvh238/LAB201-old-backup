package controller;

import validation.Validation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {
    Scanner keyboard = new Scanner(System.in);

     int countWordInFile(String source, String word) throws Validation
    {
        int count=0;
        try{
            ReadWordFile readWordFile = new ReadWordFile();
            count = readWordFile.readWord(source,word);
        }
        catch(Exception e)
        {
            System.out.println("wrong");
        }
        return count;
    }

     List<String> getFileNameContainsWordInDirectory(String source, String word) throws Validation {

        File folder = new File(source);
        File [] listFile = folder.listFiles();
        List<String> fileSearch = new ArrayList<>();
        for (File file : listFile) {
            int count = countWordInFile(file.getPath().toString(),word);
            if(count>0)  fileSearch.add(file.getName());
        }
    return fileSearch;
    }

    public void countWord(String source,String word) throws Validation {
        System.out.println("Bount: "+countWordInFile(source,word));
    }

    public void findFile(String source,String word) throws Validation {
        System.out.println("------------ File Name ------------");
        List<String> list = getFileNameContainsWordInDirectory(source,word);
        for (String string :list) {
            System.out.println("File name "+string);
        }
    }
}
