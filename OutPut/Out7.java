class A implements Cloneable
{
	int x,y;
	void get(int a,int b)
	{
		x = a;
		y = b;
	}
	void show()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Out7
{	
	public static void main(String[] args)throws CloneNotSupportedException
	{	
		A a1 = new A();
		A a2 = a1;
		a1.get(10,20);
		a1.show();
		a2.show();\
		a2 =(A) a1.clone();
		a2.x = 55;
		a1.show();
		a2.show();
	}
}