import java.util.Scanner;

public class GpS{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
char ch;
do{
    System.out.print("Enter Starting Term :");
    int start = sc.nextInt();
    System.out.print("Enter the Difference : ");
    int diff = sc.nextInt();
    System.out.print("Enter the length of series :");
   int len = sc.nextInt();
    
   for(int i=1;i<=len;i++){
        
        System.out.print((start)+" " );
        start *= diff;
    }
   
    System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
    ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();	
    }
}
