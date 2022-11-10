package basic;


public abstract class Onclass1 {
	private int a;
	private String s;
	
	abstract   void show();
	
	int age() {
		int b=2;
		int c=b*a;
		return c;
		
	}

	@Override
	public String toString() {
		return "Onclass1 [a=" + a + ", s=" + s + ", age()=" + age() + ", getA()=" + getA() + ", getS()=" + getS()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
