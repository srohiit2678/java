interface Inter1 {
   
    void show();
}

class A implements Inter1
{
	public void show()
	{
		System.out.println("Hello");
	}
}

public class Out5 {
    public static void main(String[] args) {
        A a = new A();
		a.show();
    }
}
