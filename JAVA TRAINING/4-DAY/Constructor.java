public class Constructor{
    int rollno;
    String  name;
    long phone;
    Constructor(int nrollno,String nname,long nphone){
        rollno = nrollno;
        name = nname;
        phone = nphone;

        post();
    }
    Constructor(int nrollno,String nname){
        rollno = nrollno;
        name = nname;

        post();
    }
    Constructor(){
        post();
    }
    void post(){
        System.out.println("Student name  is: "+name);
        System.out.println("Student roll  is: "+rollno);
        System.out.println("Student phone is: "+phone);
    }
    public static void main(String []args){
        Constructor obj0 = new Constructor(); 
        Constructor obj = new Constructor(30,"Rohit", 8767442277l);
        Constructor obj1 = new Constructor(40,"Rohan");
        Constructor obj2 = new Constructor(); 
       // obj.post();
       // i am bellow just bfor avoiding the warning
       obj0.name ="Srohit";
       obj.name = "Srohit";
       obj1.name ="Srohit";
       obj2.name = "Srohit";
    }
}
