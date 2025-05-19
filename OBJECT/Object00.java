import java.lang.reflect.*;
class Object00
{
	public static void main(String[] args)throws ClassNotFoundException
	{
		Class it = Class.forName("java.lang.Object");
	//	Method[] m = it.getMethods();
		Method[] m = it.getDeclaredMethods();
		for(Method	 i :  m)
		{
			System.out.println(i);
		}
		
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