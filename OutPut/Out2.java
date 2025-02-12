public class Out2
{
	public static void main(String[] args)
	{
		int x = 10;
		int y;
		
		y = x++; // put at palce of x is 10 --> x = become 11 --> assign 10 in y
		x = x++; // put at palce of x is 11 --> x = become 12 --> assign 11 in x 
		
			System.out.println(x); //11
			System.out.println(y); //10
			System.out.println(x); //11
	}
}