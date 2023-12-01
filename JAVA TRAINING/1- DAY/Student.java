
public class Student{
	
	int age = 0;
	String name = " ";
	public static void main(String args[]){
		Student s1 = new Student();
		s1.name = "ravi";
		s1.age = 20;
		Student s3 = new Student();
		s3.name = "rahul";
		s3.age = 30;
		System.out.print("sum of both Student Student is: "+(s1.age+s3.age));
	}
}