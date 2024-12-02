import java.util.Scanner;
public class SecoundLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
char ch;

do{
    System.out.print("Enter the Number of Elements : ");
    int[] list = new int[sc.nextInt()];   
    System.out.print("Enter the Elements one by one : ");
    for(int i=0;i<list.length;i++){
        list[i] = sc.nextInt(); 
    }
    int max1 = list[0];
    int max2 = list[0];

    for(int i=0;i<list.length;i++){
        if(max1<list[i]){
            max2=max1;
            max1=list[i];
        }
        else if(max2<list[i] && max1 == max2){
            max2 = list[i];
        }
    }
    System.out.println("Secound Largest is :"+ max2); 
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
    ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
    }
}
