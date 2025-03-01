class A
{	
}

class B extends A
{	
}

class C extends A
{
}

class Out13
{
	public static void main(String[] args)
	{
		A a = new B();	 
		B b = a;		// Implecit Type Casting Is Not Allowed, No Matter What Type of Object is Assigning in Child Class ( Object of A Or B Both Gives Error)
		
		A a1 = new C();	 
		C b1 = a1;		// Implecit Type Casting Is Not Allowed, No Matter What Type of Object is Assigning in Child Class ( Object of A Or C Both Gives Error)

		A a2 = new B();	 
		C b2 = a2;		// Implecit Type Casting Is Not Allowed, No Matter What Type of Object is Assigning in Child Class ( Object of A Or C Both Gives Error)

		A a3 = new C();	 
		B b3 = a3;		// Implecit Type Casting Is Not Allowed, No Matter What Type of Object is Assigning in Child Class ( Object of A Or B Both Gives Error)
	}
}