package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadWordFile{

    int readWord(String addr,String word)
    {
        int count=0;
        String fullText= new String();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(addr)));
                String line;
                while ((line = reader.readLine()) != null) {
                    String [] list = line.split(" ");
                    for (String string:list) {
                        if(string.contains(word))count++;
                    }

                }
                reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e);
            }
        return count;
    }
}
