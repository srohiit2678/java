class A
{
	
}

class B extends A
{
	
}

class C extends A
{
	
}

class Out10
{
	public static void main(String[] args)
	{
		A a = new A();
		A b = new B();	// perent class Reference Variable Can Hold Child Class Object-Reference
		A c = new C();	// perent class Reference Variable Can Hold Child Class Object-Reference
	}
}