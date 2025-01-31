import java.util.Scanner;
class Demo6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int no = sc.nextInt();
		int temp = no;
		int r,s=0;
		while(no!=0){
			r = no%10;
			s = s*10+r;
			no = no/10;
		}
		if(s==temp){ System.out.println("no. is palindrome"); }
		else{ System.out.println("no. is not palindrome"); }
	}
}