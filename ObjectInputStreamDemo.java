package basic;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = null;

		ois = new ObjectInputStream(new FileInputStream("c:\\object.txt"));

		String board = ois.readLine();
		Object readObject = null;
		Student student = null;
		System.out.println(board);
		try {
			while((readObject = ois.readObject()) != null) {		
				if(readObject instanceof Student) {
					student  = (Student)readObject;
					System.out.println(student);
				}
			}
		}catch(EOFException ex) {

		}
		ois.close();
	}
}