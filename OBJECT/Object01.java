class Object01
{
	public static void main(String [] args)
	{
		Object o = new Object();
		String s = new String();
		StringBuffer sb = new StringBuffer();
		
		System.out.println(o instanceof Object); 		// true
		System.out.println(o instanceof String); 		// false
		System.out.println(o instanceof StringBuffer);  // false

		System.out.println(s instanceof Object);		// true
		System.out.println(s instanceof String);		// true
	//	System.out.println(s instanceof StringBuffer);	// Error

		System.out.println(sb instanceof Object);		// true
	//	System.out.println(sb instanceof String);		// Error
		System.out.println(sb instanceof StringBuffer);	// true



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