package basic;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable{

	private static String board;
	private transient String imark;
	public static String getBoard() {
		return board;
	}
	public static void setBoard(String board) {
		Student.board = board;
	}
	private long rno;
	private String firstName;
	private String lastName;
	private double marksOfSubject1;
	private double marksOfSubject2;
	private double marksOfSubject3;
}

