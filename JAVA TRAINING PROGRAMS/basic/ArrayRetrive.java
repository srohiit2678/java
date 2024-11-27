import java.util.Scanner;
public class ArrayRetrive{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
char ch;



do{       
	   int[][][] x = {{{1,4,213,3,1},{32,234,5,12,5,5,5},{4,3,5,6},{3,4}}}; 
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++){
                    System.out.print(x[i][j][k]+"  ");
                }
                System.out.println();
				System.out.println();
            }
            System.out.println();
			
        }
			
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
	sc.close();
    }
}