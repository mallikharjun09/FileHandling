import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class CopyingData {
	public static void main(String[] args) {
		String sourcePath,targetPath;
		File sourceFile, targetFile;
		FileInputStream fis;
		FileOutputStream fos;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.println("Enter the file path to read...");
			sourcePath = br.readLine();
			System.out.println("Enter the file path to write...");
			targetPath = br.readLine();
			sourceFile = new File(sourcePath);
			targetFile = new File(targetPath);
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(targetFile);
			
			byte data[] = new byte[512];
			
			while(fis.read(data) != -1) {
				fos.write(data);
			}
			System.out.println("Data has been copied successfully....");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
