public class TestS{

    String name;
    int rollno;
    int age = 22;
    // age = 10 ~ it's wrong in java. 
    void get(int r, String n, int a){
        rollno = r;
        name = n;
        age = a;
    }
    void post(){
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+rollno);
        System.out.println("Age  is: "+age);
    }
    public static void main(String []args){
        TestS obj = new TestS();
        //  System.out.println("Name is: "+obj.name);
        //  System.out.println("Roll is: "+obj.rollno);
        //  System.out.println("Age  is: "+obj.age);

        //  obj.name = Rahul;
        //  obj.rollno = 11;
        //  obj.age = 30;

        //  System.out.println("Name is: "+obj.name);
        //  System.out.println("Roll is: "+obj.rollno);
        //  System.out.println("Age  is: "+obj.age);

        obj.get(11,"Rahul",21);
        
        TestS obj2 = new TestS();
        obj2.get(22,"Rohan",35);
		
		obj.post();
		obj2.post();
        
    }
}