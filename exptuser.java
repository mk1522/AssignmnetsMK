package basic;

class User extends Exception {

	public User(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class exptuser extends Exception {
	
	static int add(int x,int y) throws User {
		return x/y;
	}

	public static void main(String[] args)  {
		
		try{
			
			
			add(2,0);
			}
		
		catch(User u) {
			
		}
		
	}
	
	

}
