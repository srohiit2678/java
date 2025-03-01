abstract class A {
   
    void show(){
        System.out.print("class A");
    }
}

class B extends A { }

public class Out4 {
    public static void main(String[] args) {
        A a = new A(){};
		a.show();
    }
}
