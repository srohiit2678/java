class A
{	
}

class B extends A
{	
int x;
}

class C extends B
{
}

class Out16
{
	public static void main(String[] args)
	{	
		B b = new B();
		A a = b;			// Parent Can Hold Child Reference
		C c = b;			// Implicit Not Possible  
		C c1 = (C)b;		// Compile Time No Issue But Runtime Not Allowed, Child Can Not Hold Parent Reference

		C c2 = new C();
		B b2 = c2;			// Allowed Parent Can Hold Child Reference
		B b3 = (B)c2;       // Allowed Parent Can Hold Child Reference But This Is Called Explicit Casting 
		A a2 = c2;			// Allowed Parent Can Hold Child Reference
		A a3 = b2;			// Allowed Parent Can Hold Child Reference
		b2.x=20;
		System.out.println(c2.x);
	}
}