class A
{
	
}

class B extends A
{
	
}

class C extends A
{
	
}

class Out11
{
	public static void main(String[] args)
	{
		B b = new A();	// Child class Reference Variable Can Not Hold Parent Class Object-Reference
		C c = new A();	// Child class Reference Variable Can Not Hold Parent Class Object-Reference
	}
}