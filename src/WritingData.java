import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) {
		String filePath = "d:/cijd-13/JavaFileConcept/demo.html";
		File fileObject = new File(filePath);
		FileWriter writerObject = null;
		
		try {
			writerObject = new FileWriter(fileObject);
			String data="<html><head><title>Demo Site</title></head>"
					+ "<body><h1>Welcome to my Web site</h1></body></html>";
			writerObject.write(data);
			writerObject.close();
			System.out.println("Data has been saved successfully..");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
