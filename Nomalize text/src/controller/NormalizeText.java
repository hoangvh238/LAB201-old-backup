package controller;

public class NormalizeText {

    static int countQuotes = 0;

    //only one space with specialChar
    public static String formatOneSpaceSpecial(String input, String character) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = input.split("\\s*\\\\" + character + "\\s*");
        //remove word and char one space
        for (String oneWord : strings) stringBuffer.append(oneWord + " " + character+" ");
        return stringBuffer.toString().trim().substring(0, stringBuffer.length() - 3);
    }

    //only one space 
    public static String formatOneSpace(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("\\s+", " ");
        input = formatOneSpaceSpecial(input, ".");
        input = formatOneSpaceSpecial(input, ",");
        input = formatOneSpaceSpecial(input, ":");
        input = formatOneSpaceSpecial(input, "\"");
        return input.trim();
    }

    // after special char
    public static String formatSpecialCharacters(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        //check , . : to delete
        for (int i = 0; i < stringBuffer.length() - 1; i++) {
            if (stringBuffer.charAt(i) == ' '
                    && stringBuffer.charAt(i + 1) == '.'
                    || stringBuffer.charAt(i + 1) == ','
                    || stringBuffer.charAt(i + 1) == ':') {
                stringBuffer.deleteCharAt(i);
            }
        }
        return stringBuffer.toString().trim();
    }
    // no space quotes
    public static String noSpaceQuotes(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == '"' && countQuotes % 2 == 0) {
                stringBuffer.deleteCharAt(i + 1);
                countQuotes++;
            } else if (stringBuffer.charAt(i) == '"' && countQuotes % 2 == 1
                    && i != 0) {
                stringBuffer.deleteCharAt(i - 1);
                countQuotes++;
            }
        }
        return stringBuffer.toString().trim();
    }

    //up case with first or after "."
    public static String afterDotUpperCase(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        int inputLength = stringBuffer.length();
        //check .
        for (int i = 0; i < inputLength - 2; i++) {
            if (stringBuffer.charAt(i) == '.') {
                char afterDot = stringBuffer.charAt(i + 2);
                stringBuffer.setCharAt(i + 2, Character.toUpperCase(afterDot));
            }
        }
        return stringBuffer.toString().trim();
    }


    //first character Uppercase
    public static String firstUpercase(String input) {
        input = input.substring(0);
        StringBuffer stringBuffer = new StringBuffer(input);
        for (int i = 0; i<input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                stringBuffer.setCharAt(i, Character.toUpperCase(input.charAt(i)));
                break;
            }
        }
        return stringBuffer.toString().trim();
    }

    //end dot text
    public static String lastAddDot(String input) {
        if (input.endsWith(".")) {
            return input;
        } else {
            return input + ".";
        }
    }

}