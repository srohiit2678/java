import java.util.*;
public class MyProg{
public static void main(String[] args)
{
	
System.out.print("enter no.");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i; sc.close();
int [] sce = new int[a];
     for(i=0;i<a;i++){	
	System.out.println("enter"+i+"value");
	sce[i]=sc.nextInt();
}
	for(i=0;i<a;i++){	
	System.out.println("value of "+i+" element of arr "+ sce[i]);
	
}
/*
int sum=0;
int a=50;
char x=(char)a;
*/
/*for(String st : args){
	sum=sum+Integer.parseInt(st);
	System.out.println(sum);*/
sc.close();
}

}
