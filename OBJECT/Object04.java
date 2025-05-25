class Employee
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object o)
	{
		if(this == o) return true;
			if(o instanceof Employee)
			{
				Employee e = (Employee) o;
				if(this.id == e.id && this.name.equals(e.name))
				{
					return true;
				}
				else return false;
			}
			else return false;
	}
}

class Object04
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(101,"aaa");
		Employee e2 = new Employee(102,"bbb");
		Employee e3 = new Employee(101,"aaa");
		Employee e4 =  e1;
		
	//public boolean equals(Object);
		System.out.println(e1 == e2); // false
		System.out.println(e1 == e3); // false
		System.out.println(e1 == e4); // true
		System.out.println();
		System.out.println(e1.equals(e2)); // false
		System.out.println(e1.equals(e3)); // true
		System.out.println(e1.equals(e4)); // true		
		System.out.println();
		System.out.println(e1.equals(101));   // false
		System.out.println(e1.equals("aaa")); // false
		System.out.println(e1.equals(null));  // false

	}	
}


/*
public final native Class<?> getClass();
public String toString();
public native int hashCode();
public boolean equals(Object);
pubilc final void wait()throws InterruptedException;
pubilc native final void wait(long)throws InterruptedException;
pubilc final void wait(long,int)throws InterruptedException;
pubilc final void native notify();
pubilc final native void notifyAll();
protected void finalize()throws Throwable;
protected native Object clone()throws CloneNotSupportedException;
private static native void registerNatives();
*/