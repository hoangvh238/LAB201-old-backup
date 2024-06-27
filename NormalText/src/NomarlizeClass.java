import java.util.Iterator;

public class NomarlizeClass {
    StringBuffer strBuff;

    public StringBuffer getStrBuff() {
        return strBuff;
    }

    public void setStrBuff(StringBuffer strBuff) {
        this.strBuff = strBuff;
    }

    public NomarlizeClass(StringBuffer strBuff) {
        this.strBuff = strBuff;
    }

    public NomarlizeClass() {

    }

    /* hàm để không có quá 1 khoảng trắng giữa các từ */
    public void norSpaceBetweenWords(int idx) {
        int spaceIdx = this.strBuff.indexOf(" ", idx);
        if (spaceIdx >= 0) {
            int checkSpaceIdx = spaceIdx + 1;

            if (this.strBuff.charAt(checkSpaceIdx) == ' ') {
                this.strBuff.replace(checkSpaceIdx, strBuff.length() - 1, strBuff.substring(checkSpaceIdx + 1));
                this.strBuff.setLength(strBuff.length() - 1);
                norSpaceBetweenWords(spaceIdx);
            } else
                norSpaceBetweenWords(checkSpaceIdx);
        }
    }

    /* hàm để sau dấu , . : luôn có 1 khoảng trắng */
    public void norSpaceAfterSigns(int idx) {
        if (idx < this.strBuff.length()) {
            char currentChar = this.strBuff.charAt(idx);
            if (currentChar == ':' || currentChar == '.' || currentChar == ',') {
                if (this.strBuff.charAt(idx + 1) == ' ') {
                    this.strBuff.replace(idx + 1, strBuff.length() - 1, strBuff.substring(idx + 2));
                    this.strBuff.setLength(strBuff.length() - 1);
                    norSpaceAfterSigns(idx);
                } else if (this.strBuff.charAt(idx + 1) != 46
                    /*
                     * && ((this.strBuff.charAt(idx + 1) >= 48 && this.strBuff.charAt(idx + 1) <=
                     * 57) || (this.strBuff.charAt(idx + 1) >= 65 && this.strBuff.charAt(idx + 1) <=
                     * 90) || (this.strBuff.charAt(idx + 1) >= 97 && this.strBuff.charAt(idx + 1) <=
                     * 122))
                     */ )
                    this.strBuff.insert(idx + 1, ' ');

                if (currentChar == '.')
                    this.strBuff.setCharAt(idx + 2, Character.toUpperCase(this.strBuff.charAt(idx + 2)));
            }
            norSpaceAfterSigns(idx + 1);
        }
    }

    /* hàm để trước dấu , . không có khoảng trắng nào */
    public void norSpaceBeforeSigns(int idx) {
        if (idx < this.strBuff.length()) {
            char currentChar = this.strBuff.charAt(idx);
            if (currentChar == ',' || currentChar == '.') {
                if (this.strBuff.charAt(idx - 1) == ' ') {
                    this.strBuff.replace(idx - 1, this.strBuff.length() - 1, this.strBuff.substring(idx));
                    this.strBuff.setLength(this.strBuff.length() - 1);
                }
            }
            norSpaceBeforeSigns(idx + 1);
        }
    }

    /* hàm để không có khoảng trắng trước vào sau nội dung bên trong " " */
    public void norSpaceInQuotes(int idx, int numberOfQuote) {
        int quoteIdx = this.strBuff.indexOf("\"", idx);
        if (quoteIdx >= 0) {
            if (this.strBuff.charAt(quoteIdx + 1) == ' ' && numberOfQuote % 2 != 0) {
                this.strBuff.replace(quoteIdx + 1, strBuff.length() - 1, strBuff.substring(quoteIdx + 2));
                this.strBuff.setLength(strBuff.length() - 1);
            } else if (this.strBuff.charAt(quoteIdx - 1) == ' ' && numberOfQuote % 2 == 0) {
                this.strBuff.replace(quoteIdx - 1, strBuff.length() - 1, strBuff.substring(quoteIdx));
                this.strBuff.setLength(strBuff.length() - 1);
            }
            quoteIdx++;
            numberOfQuote++;
            norSpaceInQuotes(quoteIdx, numberOfQuote);
        }
    }

    /* hàm để các từ đầu tiên của dòng 1 luôn luôn in hoa */
    public void upperFirstWordInLine(int idx) {
        if (idx == 0)
            this.strBuff.setCharAt(idx, Character.toUpperCase(this.strBuff.charAt(idx)));
        int firstWordIdx = this.strBuff.indexOf("\n", idx);
        if (firstWordIdx >= 0 && firstWordIdx < this.strBuff.length() - 1) {
            this.strBuff.setCharAt(firstWordIdx + 1, Character.toUpperCase(this.strBuff.charAt(firstWordIdx + 1)));
            this.strBuff.replace(firstWordIdx, strBuff.length()-1, strBuff.substring(firstWordIdx+1));
            this.strBuff.setLength(this.strBuff.length()-1);

            if (this.strBuff.charAt(firstWordIdx-1)!='.') this.strBuff.insert(firstWordIdx, ". ");

            upperFirstWordInLine(firstWordIdx + 1);
        }
    }

    /* hàm để không có dòng trống nào xuất hiện */
    public void norBlankLine(int idx) {
        int blankLineIdx = this.strBuff.indexOf("\n\n", idx);
        if (blankLineIdx >= 0) {
            this.strBuff.replace(blankLineIdx, strBuff.length() - 1, strBuff.substring(blankLineIdx + 1));
            this.strBuff.setLength(strBuff.length() - 1);
            norBlankLine(blankLineIdx);
        }
    }

    /* hàm luôn đặt dấu câu vào cuối đoạn text */
    public void addDotAtTheEnd() {
        int lastWord = this.strBuff.lastIndexOf("\n");
        this.strBuff.setCharAt(lastWord, '.');
    }

//	public void norSpaceFirstQuote(int quoteIdx)
//	{
//		while (this.strBuff.charAt(quoteIdx+1)==' ') {
//			this.strBuff.replace(quoteIdx+1, strBuff.length() - 1, strBuff.substring(quoteIdx+2));
//			this.strBuff.setLength(strBuff.length() - 1);
//		}
//	}
//	public void norSpaceSecondQuote(int quoteIdx)
//	{
//		while (this.strBuff.charAt(quoteIdx-1)==' ') {
//			this.strBuff.replace(quoteIdx-1, strBuff.length() - 1, strBuff.substring(quoteIdx));
//			this.strBuff.setLength(strBuff.length() - 1);
//			quoteIdx--;
//		}
//	}
}
