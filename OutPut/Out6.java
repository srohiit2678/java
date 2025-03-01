class A 
{
	private void show()
	{
		System.out.println("hello");
	}
}
class B
{
	int x(int a){return a;}
}

class demo
{
	// static {
		
	// A a = new A();
	// a.show();
// System.exit(0);	
	// }
	public static void main(String ar[])
	{
		// Class c = A.class;
	//	A a = new A();
	//	Method m = 
	B b = new B();
	System.out.println(b.x(12));
	
	}
}