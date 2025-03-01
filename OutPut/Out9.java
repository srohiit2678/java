import java.lang.reflect.*;

class Out9
{
	public static void main(String []ar)throws ClassNotFoundException
	{
		Object o = new Object();
		Class c = Class.forName("java.lang.Object");	//Use Fully Qullyfaid Name Only	
		Method[] m = c.getDeclaredMethods();			//import java.lang.reflect.*;
		
		int counter = 0;
		for(Method m1 : m)
		{
			System.out.println(m1);
		}
	
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		// Count methods
		for(Method m1 : m)
		{
			counter++;
			// System.out.println(counter);
		}
			System.out.println(counter);
			
	}
}