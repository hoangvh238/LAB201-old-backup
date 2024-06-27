package controller;

import model.File;
import model.ReadFile;
public class FileController {
    private String normalText(String input)
    {
        input = NormalizeText.formatOneSpace(input);
        input = NormalizeText.formatSpecialCharacters(input);
        input = NormalizeText.afterDotUpperCase(input);
        input = NormalizeText.noSpaceQuotes(input);
        input = NormalizeText.firstUpercase(input);
        input = NormalizeText.lastAddDot(input);
        return input;
    }

    public String getStringNormal(String url)
    {
        ReadFile readFile = new ReadFile();
        File file = new File(readFile.getFileData(url));
        return normalText(file.getStr());
    }

}
