class Employee
{
	
}

class Object01
{
	public static void main(String [] args)
	{
		Employee e = new Employee();
		
		//public final native java.lang.Class<?> getClass();
		
		System.out.println(e.getClass()); // class Employee
		System.out.println(e.getClass().getName()); //Employee
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