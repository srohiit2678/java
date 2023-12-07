//  public class Student5{
//     int rollno;
//     int age;
//     String name;
//     long phone;

//     Student5(int rollno, int age, String name, long phone){
//     //     masking || shlowing: here all the variabals considerd as a local also 
//     //     rollno = rollno;
//     //     age = age;
//     //     name = name;
//     //     phone = phone;
//         // System.out.println("rollno is: "+ rollno);
//         // System.out.println("age is: "+ age);
//         // System.out.println("name is: "+ name);
//         // System.out.println("phonrollno is: "+ phone);

//     //this: it refers to object variabal     
//            this.rollno = rollno;
//            this.age = age;
//            this.name = name;
//            this.phone = phone; 

//     }
//     public static void main(String arg[]){
//         Student5 s5 = new Student5(11, 20, "Rohit", 876_944_2277l);
//         System.out.println("rollno is: "+ s5.rollno);
//         System.out.println("age is: "+ s5.age);
//         System.out.println("name is: "+ s5.name);
//         System.out.println("phonrollno is: "+ s5.phone);
//     }
//  }


//~ super constructer

public class Student5{
    int rollno;
    int age;
    String name;
    long phone;

    Student5(int rollno, int age, String name, long phone){
        
            this.rollno = rollno;
            this.age = age;
            this.name = name;
            this.phone = phone; 
        
       
    }
    
    Student5(int rollno, int age, String name){
         this(rollno,  age,  name,12l);
        // System.out.println("rollno is: "+ rollno);
        // System.out.println("age is: "+ age);
        // System.out.println("name is: "+ name);
      
    }
    public static void main(String arg[]){
        Student5 s5 = new Student5(11, 20, "Rohit", 876_944_2277l);
        Student5 s51 = new Student5(12, 30, "Ram");       
        System.out.println("this is main");
        System.out.println("rollno is: "+ s5.rollno);
        System.out.println("age is: "+ s5.age);
        System.out.println("name is: "+ s5.name);
        
        System.out.println("phone is: "+ s5.phone);
        System.out.println("rollno is: "+ s51.rollno);
        System.out.println("age is: "+ s51.age);
        System.out.println("name is: "+ s51.name);
        System.out.println("phone is: "+ s51.phone);
    }
 }