class A
{	
}

class B extends A
{	
}

class C extends A
{
}

class Out15
{
	public static void main(String[] args)
	{	
		B b = new B();
		C c = b;			// No Realtion B/W Both The Classes
		C c1 = (C)b;		// No Realtion B/W Both The Classes 
	
		C c2 = new C();
		B b2 = c2;			// No Realtion B/W Both The Classes
		B b3 = (B)c2;       // No Realtion B/W Both The Classes  
	}
}