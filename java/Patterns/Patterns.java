// import java.util.*;
class Patterns
{
   public static void main(String []args)
{/*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the pattern number : ");
    int n = sc.nextInt();
*/
    // patterns methods
     pattern47(5);
   // pattern32(5);
} 
   


 static int min(int a,int b){
    if(a>b){
        return b;
    }
    else if(b>a){
        return a;
    }
    else{return a;}
}
static void pattern0(int n){ 
   int i,j,k,p;  n = 5;
   for(i=n;i>=1;i--){
      p = 2*i-1;
    for(k=i;k>1;k--){
         System.out.print(" ");
      } 
    for(j=i;j<=n;j++){
     System.out.print(p);  
       p+=2;
   }
    System.out.println();
   } 
      }





static void pattern1(int n){
    int i,j;
    for(i=1;i<=n;i++){
        System.out.print(i);   
     for(j=i+1;j<=n;j++){
      if(i==1 || j==n)
      {System.out.print(j);}
      else 
      {System.out.print(" ");}
       
     }
     System.out.println();
    }
}

static void pattern2(int n){
   int i,j;
    for(i=2*n-1;i>=1;i-=2){
     for(j=1;j<2*n;j+=2){
      if(j<i){System.out.print(" ");}
      else {System.out.print(j);}
       }
    System.out.println(); 
    }
}

static void pattern3(int n){
int i,j;
    int p=1,p1=1;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
     if(i%2==0){System.out.print(p1-- +" ");}
     else{  System.out.print(p+" ");     } 
     p++;
      }
     p1=p+i;
   System.out.println(); 
   }
}

static void pattern4(int n){
    int i,j;
   for(i=0;i<n;i++){
    for(j=1;j<=n;j++){
    if(i+j==n){System.out.print(n);}
    else{ System.out.print((j+i)%n);  }
     
      }
   System.out.println(); 
   }   
}

static void pattern5(int n){
     int i,j;
    char ch;
   for(i=n;i>=1;i--){
    ch=(char)(64+ i);
    for(j=i;j<=n;j++){ 
     System.out.print(ch++);     
      }
   System.out.println(); 
   }
}

static void pattern6(int n){
      int i,j;n=7;
   for(i=1;i<=5;i++){
    for(j=1;j<=n;j++){
     if(i==1 || (i+j)==n+1){System.out.print(n+" ");}
     else{System.out.print("  ");}
     
      }
   System.out.println(); 
   }
}

static void pattern7(int n){
       int i,j,k;n=4;
       int p=1,p1=1;
   for(i=1;i<=n;i++){
    for(k=1;k<=n-i;k++){
        System.out.print(" ");
    }
    for(j=1;j<=i;j++){
    //printf(" %2d",p);
     System.out.print(p+" ");
     p1+=2;
     p+=p1;
      }
   System.out.println(); 
   }
}

static void pattern8(int n){
    int i,j,k;
    char ch=65;
   for(i=1;i<=n;i++){
    for(k=1;k<=n-i;k++){
        System.out.print(" ");
    }
    for(j=1;j<=i;j++){
    if(i%2==0){System.out.print("0 ");   
     if(j==1){ch++;}
     }
     else{System.out.print(ch+" ");}
      }
   System.out.println(); 
   }
}

static void pattern9(int n){
    int i,j;
    char p;
   for(i=1;i<=n;i++){
    p=65;
    for(j=1;j<=i;j++){
        System.out.print(p++ +" ");
      }
   System.out.println(); 
   }
}

static void pattern10(int n){
    int i,j;
   for(i=1;i<=n;i++){
    for(j=1;j<=2*n;j++){
    if(j<=i || j>(2*n-i)){
        System.out.print("*");
    }
        else{
        System.out.print(" ");
     }
        }
   System.out.println(); 
   }
}

static void pattern11(int n){
      int i,j,p=1;
   for(i=1;i<=n+2;i++){
    p=1;
    for(j=1;j<=i;j++){
      System.out.print(p+" " );
     p=p*(i-j)/(j);
     
      }
   System.out.println(); 
   }
}

static void pattern12(int n){
    int i,j,k;
    char ch=65;
   for(i=n;i>=1;i--){
    for(k=i;k<=n;k++){
        System.out.print(" "); }
    for(j=1;j<=i;j++){
     if(j==1 ||j==i){System.out.print(ch+" ");}
     else{System.out.print("  ");}
      }
   System.out.println(); 
    ch++;
   }
}

static void pattern13(int n){
      int i,j;n=3;
   int top,rit,let,bot;
   for(i=0;i<2*n-1;i++){
    for(j=0;j<2*n-1;j++){
     top =i;
     let =j;
     rit =(2*n-1)-1-j;
     bot =(2*n-1)-1-i;
     System.out.print(n-min(min(top,let),min(rit,bot)));
      }
   System.out.println(); 
   }
}

static void pattern14(int n){
     int i,j;
    char p;
   for(i=1;i<=n;i++){
    p=65;
    for(j=1;j<=i;j++){
     if(i%2==0){System.out.print(p++);}
     else{System.out.print(j);}
      }
   System.out.println(); 
   }
}

static void pattern15(int n){
     int i,j,k;
   for(i=1;i<=n;i++){
    for(k=n;k>=i;k--){
        System.out.print(" ");
    }
    for(j=1;j<=i;j++){
     if(j==1 || j==i || i==n){
       System.out.print(j+" ");}
     else{System.out.print("  ");}
      }
   System.out.println(); 
   }
}

static void pattern16(int n){
    int i,j;n=5;
    int p=-1,p1=0;
     System.out.println("*");
   for(i=1;i<=n;i++){
  {System.out.print("*");}
   p  = (i<=(n/2+1))?p+2:p-2;
    for(j=1;j<=p;j++){
     p1 = ((j<=i) &&(j<=p/2+1))?p1+1:p1-1;
        System.out.print(p1);
        } p1=0;
   System.out.println("*");
   
   }
   System.out.println("*");
}

static void pattern17(int n){
      int i,j;n=4;
   for(i=1;i<2*n;i++){
    for(j=1;j<2*n;j++){   
    if(i==n ||(j-i==n-1) ||
     (i+j==(2*n+n-1))){
        System.out.print("* ");  }
     else{System.out.print("  ");  }
      }
   System.out.println(); 
   }
}

static void pattern18(int n){
     int i,j;n=4;
   for(i=1;i<2*n;i++){
    for(j=1;j<2*n;j++){
    if(i==n ||(j+i==n+1) ||(i-j==n-1)){
        System.out.print("* ");  }
     else{System.out.print("  ");  }
      }
   System.out.println(); 
   }

}

static void pattern19(int n){
     int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(i==1 ||j==1 ||i==n||j==n ){
        if(i==j || (i+j==n+1)){
        System.out.print("0 ");}
        else{System.out.print("1 ");} 
          }
    else{System.out.print("0 ");  }
      }
   System.out.println(); 
   }
}

static void pattern20(int n){
        int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(j==1 || j==n || (i==j && i<=(n/2+1))
    || (i+j==n+1 && i<=(n/2+1))){
     System.out.print("* ");}
    else{System.out.print("  ");  }
      }
   System.out.println(); 
   }
}

static void pattern21(int n){
      int i,j;
    if(n%2==0)n++;
   for(i=1;i<2*n;i++){
    for(j=1;j<2*n;j++){
 if(i==n || j==n ||(j-i==1 && i<=n)
 || ((i+j==2*n-1) && (i<=n)) 
 || ((i+j==2*n+1)&&(i>n)) 
 ||((i-j==1)&&(i>n))){
     System.out.print("* ");}
    else{System.out.print("  ");  }
      }
   System.out.println(); 
   }
}

static void pattern22(int n){
        int i,j,k;n=5;
        int p=n+1,p1=-1;
    char ch=65;
   for(i=1;i<2*n;i++){
    p=(i<=n)?p-1:p+1;
    for(k=0;k<=p;k++){
        System.out.print(" ");
    }
   p1= (i<=n)?p1+2:p1-2;
    for(j=1;j<=p1;j++){
        System.out.print(ch);
      } 
      ch++;
      System.out.println();
   }
}

static void pattern23(int n){
       int i,j;
    int p=n+1;
   for(i=1;i<2*n;i++){
   p= (i<=n)?p-1:p+1;
    for(j=1;j<=p;j++){
     System.out.print("* ");
    }
   System.out.println(); 
   }
}

static void pattern24(int n){
       int i,j;

   for(i=1;i<2*n;i++){
    for(j=1;j<2*n;j++){
    if((j<=i && i<=n) || (j>=i && i>=n)  )
     System.out.print("*");
    else {System.out.print(" ");}
    }
   System.out.println(); 
   }
}

static void pattern25(int n){
       int i,j;
    int p=0;
   for(i=1;i<2*n;i++){
   p= (i<=n)?p+1:p-1;
    for(j=1;j<=p;j++){
    if(i%2==0) {  System.out.print("- "); }
    else{  System.out.print("* "); }
    }
   System.out.println(); 
   }
}

static void pattern26(int n){
      int i,j,k,l;n=3;
    int p=1,p1=n*n+1;
   for(i=1;i<=n;i++){

    for(k=1;k<=i;k++){
        System.out.print("  ");  }

    for(j=0;j<=n-i;j++){
     System.out.print(p++ +"*");
    }
    for(l=0;l<=n-i;l++){
        System.out.print(p1++);
       if(l<n-i){ System.out.print("*");}
    }
     p1 = p1-1-2*(n-i);
   System.out.println(); 
   } 
}

static void pattern27(int n){
       int i,j;
    char p='o';
   for(i=1;i<=n;i++){
    p+=i;
    for(j=1;j<=i;j++){
     System.out.print(p--);
    }
   System.out.println(); 
   }
}

static void pattern28(int n){
    int i,j;n=4;
    char p=65;
   for(i=1;i<=n;i++){
    
    for(j=1;j<=n;j++){
     System.out.print(p++);
    }
   System.out.println(); 
   }
}

static void pattern29(int n){
        int i,j,k,l;n=5; 
   for(i=n;i>=1;i--){
    for(j=n;j>=i;j--){
     System.out.print(j);
    }
    for(k=1;k<=2*i-3;k++){
        System.out.print(" ");
    }
    for(l=i;l<=n;l++){
       if(l!=1) System.out.print(l);
    }
   System.out.println(); 
   }
}

static void pattern30(int n){
     int i,j;
   for(i=1;i<=n;i++){
  
    for(j=1;j<=n;j++){
     if(j==(n/2+1)){System.out.print("1");}
    else if(i==(n/2+1)){ System.out.print("0"); }
    else {System.out.print("#"); }
    }
   System.out.println(); 
   }
}

static void pattern31(int n){
        int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i==j || (i+j==n+1)){ System.out.print("1 "); }
    else {   System.out.print("0 ");  }
    }
   System.out.println(); 
   }
}

static void pattern32(int n){
       int i,j;
   for(i=1;i<=n+1;i++){
    for(j=1;j<=n;j++){
    if(j==(n/2+1))
    { System.out.print("0 "); }
    else if(i%2==1 || j%2==0){ 
        System.out.print("* ");  }

    else{  System.out.print("# ");}
    }
   System.out.println(); 
   }
}

static void pattern33(int n){
      int i,j;n=6;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i==n || (i+j==n+1)){ System.out.print("! "); }
    else {   System.out.print("@ ");  }
    }
   System.out.println(); 
   }
}

static void pattern34(int n){
      int i,j;
   for(i=1;i<=n;i++){
    for(j=1;j<2*i;j++){
    if(j==1 || (j==2*i-1)){ System.out.print(i+" "); }
    else {   System.out.print("0 ");  }
    }
   System.out.println(); 
   } 
}

static void pattern35(int n){
   int i,j;n=5;
   int p=1,p1=1;
for(i=1;i<=n;i++){
 for(j=1;j<=i;j++){
 System.out.print(p+" ");
 p+=p1++;
 }
System.out.println(); 
}
}

static void pattern36(int n){
   int i,j,k,p=0;n=5;
   for(i=1;i<2*n;i++){
    for(k=i;k<n;k++)
        {System.out.print(" ");}
      p =  (i<=n)?p+1:p-1;
    for(j=1;j<=p;j++){
      System.out.print("*"); 
    }
   System.out.println(); 
   }
}

static void pattern37(int n){
   int i,j,p=0;n=5;
   for(i=1;i<2*n;i++){
   
      p =  (i<=n)?p+1:p-1;
    for(j=1;j<=p;j++){
      System.out.print("*"); 
    }
   System.out.println(); 
   }
}

static void pattern38(int n){
   int i,j;
   char p=65;
  for(i=1;i<2*n;i++){
 
   for(j=1;j<2*n;j++){
   if((i+j==n+1)||(j-i==n-1)||
   (i-j==n-1)||(i+j==2*n+n-1)) {   
      System.out.print(p);}
    else{ System.out.print(" ");} 
   
   }
  System.out.println(); p++;
  }
}

static void pattern39(int n){
   int i,j,k;
   //upper part
  for(i=n/2;i<=n;i+=2){
     for(k=1;k<=n-i;k++){
        System.out.print(" ");
     }
     for(j=1;j<=i;j++){
     System.out.print("* ");
   }    
   for(k=0;k<=n-i;k++){
        System.out.print("  ");
     }
   for(j=1;j<=i;j++){
     System.out.print("* ");
   }    
     System.out.println();
   }
   for(j=1;j<=2*n+1;j++){
     System.out.print("* ");
   }
   System.out.println();
   //lower part
for(i=n+1;i>=1;i--){

  for(k=i;k<=n;k++){
     System.out.print("  ");
  }
   for(j=1;j<2*i;j++){
    System.out.print("* ");
  } 
    System.out.println();
 }
}

static void pattern40(int n){
   int i,j;
   for(i=1;i<2*n;i++){
    for(j=1;j<2*n;j++){
    if((i+j==n+1)||(j-i==n-1)
    ||(i-j==n-1)||(i+j==2*n+n-1)) {
       System.out.print("*");}
     else{ System.out.print(" ");} 
    
    }
   System.out.println(); 
   }
}

static void pattern41(int n){
   int i,j;
   for(i=1;i<2*n;i++){
    for(j=1;j<2*n;j++){
     if(i+j<=n+1 || j-i>=n-1
     || i-j>=n-1 || i+j>=3*n-1)
            {   System.out.print("* ");   }
     else   {   System.out.print("  ");   }
      }
   System.out.println(); 
   }
}

static void pattern42(int n){
   int i, j;n=9;
   for (i = 1; i <= 8; i++)
   {
       for (j = 1; j <= 7; j++)
       {
       if (j ==n/2 || (i<=n/2-1 && i+j>=n/2+1 && j-i<= n/2-1) 
       || (i <= n/2+2 && i + j >= n-2 && j - i <= 1))
        {
             System.out.print("* ");
        }
           else
        {
          System.out.print("  ");
        }
       }
        System.out.println();
   }
    System.out.print("   *******");
}

static void pattern43(int n){
   int i, j;
   for (i = 1; i <2*n; i++) {
       for (j = 1; j <2*n ; j++) {
      
         if ((i<=n && j-i<=0) || (i<=n && i+j>=2*n) 
         || (i>=n && i+j<=2*n) || (i>=n && j-i >=0))  {
             System.out.print("* ");        }
         else        {
          System.out.print("  ");       }
       }
        System.out.println();
   }
}

static void pattern44(int n){
   int i,j,k ,p=n+1,p1=0;
   
   for (i = 1; i <=2*n+1; i++) {
   if(i<2*n){
      p=(i<=n)?--p:++p;
      
      for(k=1;k<=p;k++){
         System.out.print(" "); 
       }
       p1=(i<=n)?++p1:--p1;
      for (j = 1; j <=p1 ; j++) {
         System.out.print("* ");                
       }
        System.out.println();
      }
if(i>=2*n){  
      p=(i>=2*n)?--p:++p;
   for(k=1;k<=p;k++){
      System.out.print(" "); 
    }
    p1=(i>=2*n)?++p1:--p1;
   for (j = 1; j <=p1 ; j++) {
      System.out.print("* ");                 
    }
    System.out.println();
 }
 }
}

static void pattern45(int n){
   int i,j,k ,p=0,p1=2*n+1;
   for (i = 1; i <2*n; i++) {
      p=(i<=n)?++p:--p; 
      for(k=1;k<=p;k++){
         System.out.print("  "); 
       }
       p1=(i<=n)?p1-2:p1+2; 
      for (j = 1; j <=p1 ; j++) {
         System.out.print(j+" ");                
       }
        System.out.println();
      }   
}

static void pattern46(int n){
   n=4;
   int i,j,k ,p=0,p1=n+1,s=1;
   for (i = 1; i <=2*n; i++) {
      p=(i<=n)?++p:--p; 
      for(k=1;k<=p;k++){
         System.out.print("  "); 
       }
       p1=(i<=n)?--p1:++p1; 
       if(i==n+1){p1--;}
      for (j = 1; j <=p1 ; j++) {
         if(i<=n){
         while(prime(s)==1 || s==2){s++;}
         System.out.printf("%2d ",s++);             
         }
         else{
         while(prime(s)==0 ){s++;}
         if(i==n+1){s=1;} 
         System.out.printf("%3d ",s++); 
        }
      }
        System.out.println();
   }   
}

static void pattern47(int n){
    n=5;
    System.out.println(" * * * * * * * * * * * *  *"); 
    for(int i=1;i<=n+2;i++){
      for(int j=1;j<2*n-1;j++){  
         if(j<4){
            if(i==1||i==7||j==1||j==8||i+1==j 
            ||i+j==9||(j==2&&i==3)||(j==2 && i==5)){
               System.out.print(" * ");
            }
            else{
               System.out.print("   ");
            }
            } 
         else{ 
            if(i==1||i==7||j==1||j==8||i+1==j||i+j==9
            ||(j==7 && i==3)||(j==7 && i==5)){
              if(i+j==9&&i==2){ System.out.print("*   ");}
               else{ System.out.print(" *  ");}
            }
            else{
               System.out.print("    ");
            }
         }         
      }  
      System.out.println();
   }
   System.out.print(" * * * * * * * * * * * *  *");
}

static void pattern48(int n){
/*
S 
S O 
S O F 
S O F T 
S O F T W 
S O F T W A 
S O F T W A R 
S O F T W A R E
S O F T W A R E S
    */
   int i,j;
   char []ch = {'S','O','F','T','W','A','R','E','S'};
   for(i=1;i<=ch.length;i++){
      for(j=0;j<i;j++){
      System.out.print(ch[j]+" ");       
    }  System.out.println();
   }

}

static void pattern49(int n){
   /*
    **** 
   *****
  **  **
 **   **
      **
      ** 
      **
      **
  ***********
    */
    int i,j;n=5;
    for(i=1;i<2*n-1;i++){
      for(j=1;j<2*n;j++){
         if(j==n+2 || j==n+3 ||(i<n && (i+j==n+1
      ||i+j==n+2))||(i==2 && j==n+1)){
         System.out.print("*");}
         else{System.out.print(" ");}
      }
      System.out.println();
    }
    for(j=1;j<n/2;j++){
      System.out.print("  ");
} System.out.print("***********");
}

static void pattern50(int n){
    int i,j,k,p1=n+1,p=0,l=0;
    for(i=1;i<2*n;i++){
      p=(i<=n)?++p:--p;
      l=p;
      for(k=1;k<=p;k++){
         System.out.print("  ");
      }
      p1=(i<=n)?--p1 :++p1;
      for(j=1;j<=p1;j++){
         System.out.print(l++ +" ");
      }
      System.out.println();
    }
   }

static void pattern51(int n){ n=4;
   int i,j,k,p1=2*n+1,p=0;
   for(i=1;i<2*n;i++){
     p=(i<=n)?++p:--p;
     char ch='A';
     for(k=1;k<=p;k++){
        System.out.print("  ");
     }
     p1=(i<=n)?p1-2 :p1+2;
     for(j=1;j<=p1;j++){
        System.out.print(ch++ +" ");
     }
     System.out.println();
   }
}

static void pattern52(int n){
   int i,j,p=0,p1;
   for(i=1;i<=n;i++){
      p=1;  p1=i;
      for(j=1;j<2*n;j++){ 
   if(i+j<=n || j-i>=n){  System.out.print( "* ");}
   else{  
      if(j<n){
       System.out.print( p1-- +" ");}
       else {System.out.print( p++ +" ");}
      }      
     }
     System.out.println();
   }   
}

static void pattern53(int n){n=6;
   int i,j;
   for(i=1;i<=n;i++){
      for(j=1;j<=n;j++){
         if(i==1 || j==1 ||i==j){
            System.out.print("* ");}
         else {System.out.print("  ");}
      }
      System.out.println();
   }   
}

static void pattern54(int n){
   int i,j,k;n=6;
   for(i=1;i<=n;i++){
      for(k=1;k<=n-i;k++){
         System.out.print("  ");
     }
      for(j=1;j<2*i;j++){
        if(i==n){ System.out.print((j+1)%2+" ");}
        else {  System.out.print(j%2+" ");}
        }
      System.out.println();
   }   
}

static void pattern55(int n){
int i,j;  
for(i=1;i<2*n-2;i++){
for(j=1;j<=2*n;j++){
if(i<n && (i+j==n+1 || j-i==n)||(i+j==2*n+3 && i>4)
 ||(i-j==2 && i>=n) || (i>1 &&(i+j==n || j-i==n+1))
   || i<2*n-3 &&(i-j==3 || i+j==14)
      ){ System.out.print(" * ");}
      else { System.out.print("  ");}
   }
    System.out.println();
   } 
}

static void pattern1_1(int n){
    int i,j;
    n=5;
    for(i=1;i<=n;i++){
     for(j=1;j<=n;j++){
         System.out.print(j+" ");
    }
     System.out.println();
    } 
}

static void pattern1_2(int n){
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n+1-i;j++){
      System.out.print(j+" ");
   }
    System.out.println();
   }
}

static void pattern1_3(int n){
       int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=i;j<=n;j++){
      System.out.print(j+" ");
   }
    System.out.println();
   }
}

static void pattern1_4(int n){
      int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
      System.out.print(j+" ");
   }
    System.out.println();
   }  
}

static void pattern1_5(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=i;j>=1;j--){
      System.out.print(j+" ");
   }
    System.out.println();
   }
}

static void pattern1_6(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=5;j>=1;j--){
      System.out.print(j+" ");
   }
    System.out.println();
   }
}

static void pattern1_7(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=5;j>=i;j--){
      System.out.print(j+" ");
   }
    System.out.println();
   }
}

static void pattern1_8(int n){
   
    int i,j;n=5;
   for(i=n;i>=1;i--){
    for(j=5;j>=i;j--){
      System.out.print(j+" ");
   }
    System.out.println();
   } 
}

static void pattern1_9(int n){
    
    int i,j;n=5;
   for(i=n;i>=1;i--){
    for(j=i;j<=5;j++){
      System.out.print(j+" ");
   }
    System.out.println();
   }
}

static void pattern1_10(int n){
    
    int i,j;n=5;
   for(i=0;i<=n;i++){
    for(j=1;j<=i;j++){
      System.out.print(j+" ");
   }
   System.out.println("6");
   }
}

static void pattern1_11(int n){
   
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     System.out.print(i+j+" ");
   }
    System.out.println();
   } 
}

static void pattern1_12(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    System.out.print("* ");
   }
    System.out.println();
   }
}

static void pattern1_13(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
    System.out.print("* ");
   }
    System.out.println();
   }
}

static void pattern1_14(int n){
    
    int i,j;n=5;
   for(i=5;i>=1;i--){
    for(j=1;j<=i;j++){
    System.out.print("* ");
   }
    System.out.println();
   }
}

static void pattern1_15(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(j<=i){ System.out.print(j+" ");}
     else{System.out.print("* ");}
   }
    System.out.println();
   }
}

static void pattern1_16(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(i%2==1){ System.out.print(j+" ");}
     else{System.out.print("* ");}
   }
    System.out.println();
   }
}

static void pattern1_17(int n){
  
    int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
      if(i>=j){System.out.print(i+" ");}
     else{System.out.print(j+" ");}
    }
    System.out.println();
   }  
}

static void pattern1_18(int n){
    
    int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
     System.out.print(j%2 +" ");
    }
    System.out.println();
   }
}

static void pattern1_19(int n){
    
    int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print ((i+j+1)%2+ " ");
    }
    System.out.println();
   }
}

static void pattern1_20(int n){
    
    int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=i;j<=n;j++){
        System.out.print ((i+j+1)%2+ " ");
    }
    System.out.println();
   }
}

static void pattern1_21(int n){
    
    int i,j;n=7;
   for(i=1;i<=n;i++){
    for(j=i;j<=n;j++){
        System.out.print ((j)%2+ " ");
    }
    System.out.println();
   }
}

static void pattern1_22(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     System.out.print(i+" ");
    }
    System.out.println();
   }
}


static void pattern1_23(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
     System.out.print(i+" ");
    }
    System.out.println();
   }
}


static void pattern1_24(int n){
     
    int i,j;n=5;
   for(i=n;i>=1;i--){
    for(j=i;j<=n;j++){
     System.out.print(i+" ");
    }
    System.out.println();
   }
}


static void pattern1_25(int n){
    int i,j;n=4;int k=1;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print( k++ + " ")  ;
    }
    System.out.println();
   }
}


static void pattern1_26(int n){
     
    int i,j;n=4;
    int a=1,b=0,c=0;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print(c+" ")  ;
     c=a+b;
     a=b;
     b=c;
    }
    System.out.println();
   }
}

static int prime(int n){
    int c=0;
    for(int i=2;i<n/2+1;i++){
        if(n%i==0){c=1;}
       }
       return c;
}
static void pattern1_27(int n){
 
    int i,j;n=5;
   int p=1;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
      while(prime(p)==0){
        p++;
        }
        System.out.print( p++ + " ");
    }
    System.out.println();
   }
}



static void pattern1_28(int n){
   int i,j;n=5;
   int p=1;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
      while(prime(p)==1){
        p++;
        }
        System.out.print( p++ + " ");
    }
    System.out.println();
   }
}

static void pattern1_29(int n){
   int i,j;n=4; int k=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print(  k++%5 + " " ) ;
     //k++;
    }
    System.out.println();
   }
}


static void pattern1_30(int n){
     
    int i,j;n=4; int k=3;
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print(k++%3 + " " ) ;
     //k++;
    }
    System.out.println();
   }
}


static void pattern1_31(int n){
     
    int i,j;n=8;
   for(i=1;i<=n;i++){
    if(i%2==0){System.out.print("  ");}
    for(j=1;j<=n;j++){ 
        System.out.print( "*" ) ;
    }
    System.out.println();
   }
}


static void pattern1_32(int n){
     
    int i,j,k;n=6;
   for(i=1;i<=n;i++){
    for(k=1;k<=i;k++){      
        System.out.print( " "  ); 
    }
    for(j=1;j<2*n;j++){
        System.out.print( "*" );
    }
    System.out.println();
   }
}


static void pattern1_33(int n){
    int i,j;n=5; 
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i%2==0){System.out.print("A "); }
   else {  System.out.print( j +" "  );   }
    }
    System.out.println();
   }
}


static void pattern1_34(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i==j){System.out.print("0 ");    }  
    else { System.out.print (j + " " ); }
    }
    System.out.println();
   }
}


static void pattern1_35(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if((i+j)%2==1){System.out.print("* ");}
    else{  System.out.print(j+" ");}
    }
    System.out.println();
   }
}


static void pattern1_36(int n){
     
    int i,j;n=5; int k;
   for(i=1;i<=n;i++){
    k=5;
    for(j=1;j<=n;j++){
    if(i%2==0){System.out.print(k-- +" ");}
    else{  System.out.print(j+" ");}
    
    }
    System.out.println();
   }

}

static void pattern1_37(int n){
    
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i==1 || j==1 || i==n || j==n)
    {System.out.print("* ");}
    else{  System.out.print(j+" ");}
    }
    System.out.println();
   }
} 


static void pattern1_38(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i%2==0){
        System.out.print((i/2*j)+" ");}
    else{ System.out.print(i*j + " "  );}  
    }
    System.out.println();
   }
}


static void pattern1_39(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i%2==1){System.out.print(i +" ");}
    else{  System.out.print(j+" ");}
    }
    System.out.println();
   }
}


static void pattern1_40(int n){
     
    int i,j,k;n=5;
   for(i=1;i<=n;i++){
    for(k = n;k>i;k--){
         System.out.print(" ");
    }
    for(j=1;j<=i;j++){
      System.out.print(j+" ");    
    }
    System.out.println();
   }
}


static void pattern1_41(int n){
     
    int i,j,k;n=5;
   for(i=1;i<=n;i++){
    for(k = n;k>i;k--){
         System.out.print(" ");
    }
    for(j=1;j<2*i;j++){
        System.out.print( j )  ;    
    }
    System.out.println();
   }
}


static void pattern1_42(int n){
    
    int i,j,k;n=5;
   for(i=1;i<=n;i++){
    for(k = n;k>i;k--){
         System.out.print(" ");
    }
    for(j=1;j<2*i;j++){
        System.out.print(i ) ;    
    }
    System.out.println();
   }
}


static void pattern1_43(int n){
 
    int i,j,k;n=5; int p,p1;
   for(i=1;i<=n;i++){
    p=i;    p1=2*i-2;
    for(k = n;k>i;k--){
         System.out.print(" ");
    }
    for(j=1;j<2*i;j++){
    if((2*j-1)<=(2*i-1)){
        System.out.print(p++);
    }
    else{
        System.out.print(p1++);
    }
    }
    System.out.println();
   }
}

static void pattern1_44(int n){
   
    int i,j,k;n=5;int p,p1;
   for(i=1;i<=n;i++){
    p=n;    p1=(n+1)-i;
    for(k=n;k>i;k--){
         System.out.print(" ");}
    for(j=1;j<2*i;j++){
   if(p>=(n+1)-i) {System.out.print(p--);}
    else{ System.out.print(++p1);}
    }
    System.out.println();
   }
}


static void pattern1_45(int n){
     
    int i,j,k;n=5;
   for(i=n;i>=1;i--){
    for(k=1;k<=n-i;k++){
         System.out.print(" ");
    }
    for(j=1;j<2*i;j++){

        System.out.print( i) ;
     }
    System.out.println();
   }
}

static void pattern1_46(int n){
     
    int i,j,k;n=5;
   for(i=n;i>=1;i--){
    for(k=1;k<=n-i;k++){
         System.out.print(" ");
    }
    for(j=1;j<2*i;j++){
        System.out.print(j) ;
     }
    System.out.println();
   }
}

static void pattern1_47(int n){
     
    int i,j,k;n=5; int p;
   for(i=n;i>=1;i--){
    p=i-1;
    for(k=1;k<=n-i;k++){
         System.out.print(" ");
    }
    for(j=1;j<2*i;j++){
      p = (j<=i)?p+1:p-1;  
      System.out.print( p );
     }
    System.out.println();
   }
}

static void pattern1_48(int n){
     
    int i,j,k;n=5; int p;
   for(i=n;i>=1;i--){
     p=n+1;
    for(k=1;k<=n-i;k++){
         System.out.print(" ");
    }
    for(j=2*i-1;j>=1;j--){
        p = (j>=i)?p-1:p+1;
        System.out.print( p) ;
     }
    System.out.println();
   }
}

static void pattern1_49(int n){
     
    int i,j;n=11 ;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i==1 || j==1 || i==n || j==n
 || i==j || j==(n+1)-i || (i+j)==(n/2+2)
    || (j-i)==(n/2) || (i-j)==(n/2)  
    || (i+j)==(n+n/2+1))
    {System.out.print("* ");; }
    else{
        System.out.print("  ");}                                                                                        
     }
    System.out.println();
   }
}

static void pattern1_50(int n){ 
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(i==j || (i+j)==n+1){
        System.out.print("* ");
     }
     else{
        System.out.print(j +" ");
     }
     }
    System.out.println();
   }
}


static void pattern1_51(int n){
    int i,j,k;n=5;
    int p=n,p1=0;
   for(i=1;i<n*2;i++){
    p = (i<=n)? --p: ++p;
    for(k=1;k<=p;k++){
         System.out.print(" ");}
    p1 = (i<=n) ?++p1:--p1;
    for(j=1;j<2*p1;j++){
        System.out.print( "*");
     }
    System.out.println();
   }
}

static void pattern1_52(int n){
     
    int i,j,k;n=5;
    int p=n,p1=0;
   for(i=1;i<n*2;i++){
   p = (i<=n)?p-1:p+1;
    for(k=1;k<=p;k++){
         System.out.print(" ");
    }
     p1 = (i<=n)?p1+1:p1-1;
    for(j=1;j<2*p1;j++){
        System.out.print( p1);
     }
    System.out.println();
   }
}

static void pattern1_53(int n){
     
    int i,j,k;n=5;
    int p=n,p1=0;
   for(i=1;i<n*2;i++){
   p = (i<=n)?p-1:p+1;
    for(k=1;k<=p;k++){
         System.out.print(" ");
    }
     p1 = (i<=n)?p1+1:p1-1;
    for(j=1;j<2*p1;j++){
        System.out.print(j);
     }
    System.out.println();
   }
}

static void pattern1_54(int n){
     
    int i,j,k;n=5;
    char p='A';
   for(i=1;i<=n;i++){
    for(k = n;k>i;k--){
         System.out.print(" ");
    }
    for(j=1;j<=i;j++){
        System.out.print( p++ + " "  );    
    }
    System.out.println();
   }
}

static void pattern1_55(int n){
     
    int i,j,k;n=5;
    int p=1;
   for(i=1;i<=n;i++){
    for(k = n;k>=i;k--){
        System.out.print("  ");
    }
    for(j=1;j<2*i;j++){
     if(j==1 || j == (2*i-1)){
        System.out.print("0 ");
     }
    else{
        System.out.print( p++ + " " ) ;    
    }  
    }
    System.out.println();
   }
}


static void pattern1_56(int n){
     
    int i,j,k;n=11;
   for(i=1;i<=n;i++){
    for(k = n;k>=i;k--){
         System.out.print(" ");}
    for(j=1;j<=i;j++){
        System.out.print("* ");  }
    System.out.println();
   }
}


static void pattern1_57(int n){
     
    int i,j,k;n=11;
   for(i=n;i>=1;i--){
    for(k = 1;k<=n-i;k++){
         System.out.print(" ");
    }
    for(j=1;j<=i;j++){
    System.out.print("* ");
    }
    System.out.println();
   }

}

static void pattern1_58(int n){
     
    int i,j,k;n=11;
   for(i=1;i<=n;i++){
    for(k = n;k>=i;k--){
         System.out.print(" ");
    }
    for(j=1;j<=i;j++){
     if(j==1 || j==i || i==n){  
        System.out.print("* ");}
      else {System.out.print("  ");}
    }
    System.out.println();
   }
}


static void pattern1_59(int n){
     
    int i,j,k;n=11;
   for(i=n;i>=1;i--){
    for(k = 1;k<=n-i;k++){
         System.out.print(" ");
    }
    for(j=1;j<=i;j++){
     if(i==n || j==1 || j==i){   
        System.out.print("* ");}
    else{System.out.print("  ");}
    }
    System.out.println();
   }
}


static void pattern1_60(int n){
     
    int i,j;n=11;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if( i==(n/2+1) || j==(n/2+1)
    || (i==1 && j>(n/2))
    || (j==n && i>(n/2))
    || (i==n && j<=(n/2))
    || (j==1 && i<=(n/2))
    )
      {System.out.print("* "); }
      else{ System.out.print("  ");}
    }
   System.out.println();

}
}

static void pattern1_61(int n){
     
    int i,j;n=11;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if( i==(n/2) || j==(n/2+1)
    || (j==n && i<(n/2))
    || (j==1 && i<(n/2))
    )
      {System.out.print("* "); }
      else{ System.out.print("  ");}
    }
    System.out.println();
   }
}


static void pattern1_62(int n){
     
    int i,j;n=11;
   for(i=1;i<=n;i++){
    
    for(j=1;j<=n;j++){
    if(i==1 || j==1 || i==n || j==n
    || (i+j)==(n/2+2)|| (i==(n/2+1))
    || (j-i)==(n/2) || (i-j)==(n/2)  
    || (i+j)==(n+n/2+1)||(j==(n/2+1))
    
    )
    {System.out.print("* "); }
    else{
        System.out.print("  ");
    }
     }
    System.out.println();
   }
}


static void pattern1_63(int n){
     
    int i,j,k;n=5;
   for(i=1;i<=n;i++){
    for(k=i;k<n;k++){
         System.out.print(" ");
    }
    for(j=1;j<=i;j++){
    if( j==1||j==i){
        System.out.print(i%2 + " ");
    }
      else{ System.out.print("2 ");}
    }
    System.out.println();
   }
}


static void pattern1_64(int n){
     
    int i,j;n=5;
   for(i=n;i>=1;i--){
    for(j=n;j>=1;j--){
     if(j<=i){   System.out.print(i);    }
     else{       System.out.print(j);    } 
    }
     System.out.println();
}
}

static void pattern1_65(int n){
     
    int i,j;n=5;
   for(i=n;i>=1;i--){
    for(j=1;j<=n;j++){
     if(j<=i){   System.out.print(i);    }
     else{       System.out.print(j);    } 
    }
     System.out.println();
   }
}


static void pattern1_66(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
      if(i>=j){System.out.print(i);}
     else{System.out.print(j);}
    }
    System.out.println();
   }

}

static void pattern1_67(int n){
     
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=n;j>=1;j--){
      if(i>=j){System.out.print(i);}
     else{System.out.print(j);}
    }
    System.out.println();
   }
}


static void pattern1_68(int n){
     
    int i,j;n=5; int k,p=1;
   for(i=n;i>=1;i--){
      for(k=i;k<n;k++){
          System.out.print(" ");
      }
    for(j=0;j<i;j++){
        System.out.print(j%p +" ") ;
      }
    System.out.println();  p++;
   }
}


static void pattern1_69(int n){

    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=i;j<=n;j++){
        System.out.print(j%3) ;
      }
    System.out.println(); 
   }
}



static void pattern1_70(int n){

    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(i==3 || j==3){
        System.out.print("3");
     }
     else if(i%2==0 || j%2==0){
        System.out.print("2");
     }
     else{
       System.out.print("1");
     }
      }
    System.out.println(); 
   }

  
}

static void pattern1_71(int n){
     
    int i,j;n=5;
   for(i=n;i>=1;i--){
    for(j=1;j<=n;j++){
        System.out.print(i+j);
      }
    System.out.println(); 
   }
}


static void pattern1_72(int n){
 
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
    if(i==1 || i==n || 
    ((i==2 ||i==n-1)&&(j>n/2)) 
    || j>n/2+1){
      System.out.print("*"); }
    else {
      System.out.print(" ");}
      }
    System.out.println(); 
   }
}



static void pattern1_73(int n){
 
    int i,j;n=5;
    int a=1,b=0,c=0;
   for(i=1;i<=n;i++){
    if(i==5){System.out.print("  ");}
    for(j=i;j<=n;j++){
     System.out.print(" "+ c);
     c=a+b;
     a=b;
     b=c;
      }
    System.out.println(); 
   }
}
static void pattern1_74(int n){
 
    int i,j;n=5;
   for(i=1;i<=n;i++){
    for(j=1;j<=n;j++){
     if(i%2==0){System.out.print(i%2);}
     else{System.out.print((i+j)%2);}
     
      }
    System.out.println(); 
   }
}

}