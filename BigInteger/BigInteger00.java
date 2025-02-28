import java.math.*;

class BigInteger00
{
	public static void main(String[] ar)
	{
		BigInteger f = BigInteger.valueOf(1);
		for(int i=1;i<=1000;i++)
		{
			f = f.multiply(BigInteger.valueOf(i));
		}
		System.out.print(f);
	}
}
