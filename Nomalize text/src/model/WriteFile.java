package model;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void writeFileData(String data,String url)
    {
        writeFile(data,url);
    }

     void writeFile(String export,String url)
    {
        StringBuilder input = new StringBuilder(export);
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.write(input.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

    }
}
