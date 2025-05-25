class Employee
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public int hashCode()
	{
		return this.id;
	}
	public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
}
 
class Object03
{
	public static void main(String [] args)
	{
		Employee e1 = new Employee(101,"Ram");
		Employee e2 = new Employee(102,"Sita");

		//public native int hashCode();
		
		System.out.println(e1); // Employee@65
		System.out.println(e2); // Employee@66
	}
}

/*
   //Compiled from "Object.java"
  public class java.lang.Object {
  public java.lang.Object();
  
  public final native java.lang.Class<?> getClass();
  public java.lang.String toString();
  
  public native int hashCode();
  public boolean equals(java.lang.Object);
  protected void finalize() throws java.lang.Throwable;
  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  
  public final native void notify();
  public final native void notifyAll();
  public final void wait() throws java.lang.InterruptedException;
  public final native void wait(long) throws java.lang.InterruptedException;
  public final void wait(long, int) throws java.lang.InterruptedException;
  
  => private static native void registerNatives();
  
  static {};
}
*/