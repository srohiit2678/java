class A
{	
	int x,y;
	A(int a,int b)
	{
		x = a;
		y = b;
	}
	public void finalize()throws Throwable
	{
		System.out.println("finalize method call");
	}
}



class Out17
{
	public static void main(String[] args)
	{	
		A a = new A(10,20);
		a = null;
		System.gc();
	}
}