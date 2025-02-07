import java.util.Scanner;

class Test4
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st value=");
int x=sc.nextInt();

System.out.print("Enter 2nd value=");
int y=sc.nextInt();
try
{
System.out.println("inside try");
int z=x/y;

System.out.println("Value="+z);
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("chalega hi chalega");
}
System.out.println("Rest code");
}
}