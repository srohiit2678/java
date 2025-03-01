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
		if(this == 0)return true;
		
		if(o instanceof Employee)
		{
			Employee e = (Employee)o;
			if(id == e.id && (name.equals(e.name)))
			return true;
			return false;
		}
		else return false;
	}
}
 
class Object02
{
	public static void main(String [] args)
	{
		
		Employee e1 = new Employee(101,"aaa");
		Employee e2 = new Employee(102,"bbb");
		Employee e3 = new Employee(101,"aaa");
		Employee e4 = e1;
		
		System.out.println(e1 == e2);			// false
		System.out.println(e1 == e3);			// false 
		System.out.println(e1 == e4);			// true
		
		System.out.println(e1.equals(e2));		// false
		System.out.println(e1.equals(e3));		// true
		System.out.println(e1.equals(e4));		// true
		System.out.println(e1.equals(101));		// false	
		System.out.println(e1.equals("aaa"));	// false	
		System.out.println(e1.equals(null));	// false
		


	}
}

/*
   //Compiled from "Object.java"
  public class java.lang.Object {
  public java.lang.Object();
  
  public java.lang.String toString();
  public native int hashCode();
  public boolean equals(java.lang.Object);
  protected void finalize() throws java.lang.Throwable;
  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  
  public final native java.lang.Class<?> getClass();
  public final native void notify();
  public final native void notifyAll();
  public final void wait() throws java.lang.InterruptedException;
  public final native void wait(long) throws java.lang.InterruptedException;
  public final void wait(long, int) throws java.lang.InterruptedException;
  
  => private static native void registerNatives();
  
  static {};
}
*/