package basic;


import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		FileWriter writer = null;
		
		writer = new FileWriter("C:\\test\\writer.txt");
		
		
		//writer.wait();
		//writer.notify();
		
		writer.write("हिन्दी বাংলা తెలుగు मराठी தமிழ் ગુજરાતી ಕನ್ನಡ മലയാളം ਪੰਜਾਬੀ");
		
		writer.close();
		System.out.println("Written Successfully ");
		
FileReader reader = null;
		
		reader = new FileReader("C:\\test\\writer.txt");
		
		int readChar = 0;
		
		while((readChar = reader.read()) != -1) {
			System.out.print((char)readChar);
		}
		reader.close();

	}
}
