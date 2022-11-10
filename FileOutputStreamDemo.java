package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fe=null;
		try {
			fos = new FileOutputStream("C:\\test/fos.txt");
			fos.write('M');
			fos.close();
		} catch (FileNotFoundException e) {
			
		}catch (IOException e) {
			
		}
		
		try {
			 fe = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\MassMutual\\classroom\\src\\basic\\demo.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int readByte = -1;
		
			int available = 0;
			try {
				available = fe.available();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i=0; i<available; i++) {
			 try {
				readByte = fe.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 System.out.print((char)readByte);
		}


	}
	}	
