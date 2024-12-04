import java.util.Scanner;
public class TriangleArea {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    char ch;
    do{
       System.out.print("--------- Enter 1 if you only have Base and Height \n---------  And 2 for having all three sides --------");
        switch(sc.nextInt()){
            case 1:{
                System.out.print("Enter the Base :");
                float base = sc.nextFloat();
                System.out.print("Enter the Height :");
                float height = sc.nextFloat();
                System.out.println("Area of the Triangle is :"+((.5)*(base*height)));
                break;
            }
            case 2:{
                System.out.print("Enter the First side :");
                float a = sc.nextFloat();
                System.out.print("Enter the  Secound side :");
                float b = sc.nextFloat();
                System.out.print("Enter the  Therd side :");
                float c = sc.nextFloat();
                float s = (.5f)*(a+b+c);
                
                System.out.println("Area of the Triangle is :"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                break;
            }
                default :{
                System.out.println("Enter a valid choice : ");
            }       
            
        }

       System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
        ch = sc.next().charAt(0);
  }while(ch=='N' ||  ch=='n');
  sc.close();
}    
}
