import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingDataFromFile {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(isr);
		
		try {
		System.out.println("Enter the file path to read...");
		String filePath = read.readLine();
		
		File fileObject = new File(filePath);
		
		FileReader readerObject = new FileReader(fileObject);
		
		//BufferedReader br = new BufferedReader(readerObject);
		
		//String line = br.readLine();
		
		Scanner scan = new Scanner(readerObject);
		String line = scan.nextLine();
		while(! line.equals(null)) {
			System.out.println(line);
			//line = br.readLine();
			line = scan.nextLine();
		}
		}catch(IOException e) {
			
		}
		catch(Exception e) {
			System.out.println("=============THE END================");
		}
		
	}
}
