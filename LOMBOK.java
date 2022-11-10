package basic;

import java.util.Comparator;

public class LOMBOK implements Comparator<LOMBOK> {

	
   private int id;
   private String name;
   private int age;
   @Override
public String toString() {
	return "LOMBOK [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
}
public LOMBOK(int id, String name, int age, String city) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.city = city;
}
public LOMBOK() {
	// TODO Auto-generated constructor stub
}
private String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public int compare(LOMBOK o1, LOMBOK o2) {
	if(o1.getAge()>o2.getAge()) 
		return 1;
	else if (o1.getAge()<o2.getAge())
	return -1;
	else return 0;
}

	
			}
