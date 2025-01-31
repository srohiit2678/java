import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Demo5{
	public static void main(String args[]) throws IOException{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		System.out.println("Enter the no.");
		String s1 = br.readLine();
		int no = Integer.parseInt(s1);
		int temp = no;
		int r,s=0;
		while(no!=0){
			r = no%10;
			s = s*10+r;
			no = no/10;
		}
		if(s==temp){
		System.out.println("no. is palindrome");			
		}
		else{
		System.out.println("no. is not palindrome");			
			
		}
	}
	
}