class A
{
	
}

class B extends A
{
	
}

class C extends A
{
	
}

class Out12
{
	public static void main(String[] args)
	{
		B b = new C();	// Whithout Child Parent Relation One Class Object-Reference Can Not Be Pointed By Another Class Reference Variable 
		C c = new B();	// Whithout Child Parent Relation One Class Object-Reference Can Not Be Pointed By Another Class Reference Variable
	}
}