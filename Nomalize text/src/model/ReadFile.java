package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public String getFileData(String url) {
        return readFile(url);
    }
    String readFile(String addr)
    {
        String fullText= new String();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(addr)));
                String line;
                while ((line = reader.readLine()) != null) {
                    fullText+=line;
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e);
            }
        return fullText;
    }
}
