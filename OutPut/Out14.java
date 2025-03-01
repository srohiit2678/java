class A
{	
}

class B extends A
{	
}

class C extends A
{
}

class Out14
{
	public static void main(String[] args)
	{	
		//	 No Issue At Compiletime
		A a = new B();	 
		B b = (B)a;		    // Explecit Type Casting Is Allowed, No Matter What Type of Object is Assigning in which Child Class, No Issue At Compiletime
		
		A a1 = new C();	 
		C c1 = (C)a1;		// Explecit Type Casting Is Allowed, No Matter What Type of Object is Assigning in Which Child Class, No Issue At Compiletime

		A a2 = new B();	 
		C b2 = (C)a2;		// Explecit Type Casting Is Allowed, No Matter What Type of Object is Assigning in Which Child Class, No Issue At Compiletime
		
		A a3 = new C();	 
		B b3 = (B)a3;		// Explecit Type Casting Is Allowed, No Matter What Type of Object is Assigning in Which Child Class, No Issue At Compiletime
	
	
		//	 No Issue At Runtime As Well
		A a4 = new B();	 
		B b4 = (B)a4;		// Explecit Type Casting Is Allowed, Because a4 Contain Object of B Type, No Issue At Runtime As Well
		
		A a5 = new C();	 
		C c2 = (C)a5;		// Explecit Type Casting Is Allowed, Because a5 Contain Object of C Type, No Issue At Runtime As Well


		//	 Issue At Runtime
		A a6 = new B();	 
		C c3 = (C)a6;		// Gives Runtime Exception: ClassCastException a6 Is Not Of C Type
		
		A a7 = new C();	 
		B b5 = (B)a7;		// Gives Runtime Exception: ClassCastException a7 Is Not Of B Type
	}
}