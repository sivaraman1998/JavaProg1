import java.util.*;

class Dept{
	int deptid;
	static String deptname;
	Dept(int id,String name){
		this.deptid=id;
		this.deptname=name;
	}
	static void display() {
		System.out.println("Department name : "+deptname);
	}
}
class Student implements Cloneable{
	int id;
	String name;

	Student(int i, String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Student id is :"+id);
		System.out.println("Student name is :"+name);
		Dept.display();
	}
	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Dept dep=new Dept(101,"Aero");
		Student s1=new Student(11,"Sivaraman");
		
		Student s2=(Student)s1.Clone();
		s2.display();
	}
}
