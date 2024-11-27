import java.util.Scanner;
public class Anonymous {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
char ch;
do{ 
	System.out.println("sum = "+ sum(new int[]{12,12,34,5,6,7}));
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
	sc.close();   
    }
	static int sum(int[] x){
		int sum=0;
		for(int y:x){
			sum+=y;
		}
	return sum;
	}
}
