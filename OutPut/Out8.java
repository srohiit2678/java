class Out8 implements Cloneable
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
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Out8 a1 = new Out8();
		Out8 a2 = a1;
		a1.get(10,20);
		a1.show();
		a2.show();
		a2 = (Out8) a1.clone();
		a2.x = 55;
		a1.show();
		a2.show();
	}
}