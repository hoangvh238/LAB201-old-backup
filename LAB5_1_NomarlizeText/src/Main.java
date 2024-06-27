import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.Normalizer;

public class Main {
	private static StringBuffer strbuff;
	private static BufferedReader br;
	static NomarlizeClass nc;
	private static BufferedWriter bw;
	
	public static void main(String[] args) {
		File fRead = new File("D:\\Dev\\JavaCourse\\LAB5_1_NomarlizeText\\src\\text.txt");
		File fWrite = new File("D:\\Dev\\JavaCourse\\LAB5_1_NomarlizeText\\src\\textOutput.txt");
		
		StringBuffer sb = readFile(fRead); 
		System.out.println("Đoạn văn ban đầu: \n"+sb); 		/* In đoạn văn ban đầu */
		
		nc = new NomarlizeClass(sb);
		nc.norSpaceBetweenWords(0);		/* hàm để không có quá 1 khoảng trắng giữa các từ */
		nc.norSpaceAfterSigns(0);		/* hàm để sau dấu , . : luôn có 1 khoảng trắng*/
		nc.norSpaceBeforeSigns(0);		/* hàm để trước dấu , . không có khoảng trắng nào*/
		nc.norSpaceInQuotes(0,1);		/* hàm để không có khoảng trắng trước vào sau nội dung bên trong " " */
		nc.norBlankLine(0);				/* hàm để không có dòng trống nào xuất hiện*/
		nc.upperFirstWordInLine(0);		/* hàm để các từ đầu tiên của dòng 1 luôn luôn in hoa*/
		nc.addDotAtTheEnd();			/* hàm luôn đặt dấu câu vào cuối đoạn text*/
		
		System.out.println("\n*****Result*****\n");
		System.out.println("Đoạn văn hoàn chỉnh: \n"+nc.getStrBuff()); /*nc.getStrBuff là hàm lấy ra stringbuffer, nơi lưu đoạn văn hoàn chỉnh*/
		
		writeFile(fWrite, nc.getStrBuff());
	}

	
	/* hàm đọc đoạn text từ 1 file*/
	public static StringBuffer readFile(File f) {
		String strLine = new String();
		try {
			br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			strbuff = new StringBuffer();
			while (true) {
				strLine = br.readLine();
				if (strLine != null)
					strbuff.append(strLine.trim() + "\n");
				else
					break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strbuff;
	}
	
	
	public static void writeFile(File f, StringBuffer sb) {
		try {
			bw = Files.newBufferedWriter(f.toPath(), StandardCharsets.UTF_8);
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
