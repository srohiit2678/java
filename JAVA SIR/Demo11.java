class Parent{
	public String toString(){
		return "Parent";
	}
}

class Child extends Parent{
	public String toString(){
		return "Child";
	}
}
class Demo11{
public static void main(String[] arr){
Child c = new Child();
System.out.println(c);

Parent p = new Parent();
System.out.println(p);

Object o = new Object();
System.out.println(o);


}
}



















/*
static short[][] show(short[][] x,int n){
	short y[][] = new short[n][n];
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
	
	 y[n-j-1][i] = x[i][j];
}
}
return y;
}
public static void main(String[] arr){

short[][] x = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
				{130,140,150,160}
			  };
x  = show(x,4);
for(int i[]:x){
for(int j:i){
System.out.print(j+"\t");
}
System.out.println();
}

*/







/*
class Demo11
 public static void main(String ar[]){
 byte[][]y = new byte[4][4];
 byte[][]x = new byte[3][3];
 byte b = 11
 byte[][][][] a = new byte[2][3][2][2];
}
y[1][o] = b;
a[1][o][1][1] = y[1][1];
D a[1][1] = y;
a[1][o][1] = y;
//a[1] [o][1] = y[1][1] ;
*/


//String s = "ram";
/*
int s.length()
char s.charAt(int)
String s.trim()
String[] s.split(String)
String s.subString(int)
String s.subString(int,int)
boolean s.equals(String)
boolean s.equalsIgnoreCase()
int s.campairTo(String)
int s.campairToIgnoreCase(String)
int s.indexOf(String)
int s.lastIndexOf(String)
boolean s.startsWith(String)
boolean s.endsWith(String)
String s.toUpperCase()
String s.toLowerCase()
String s.concat(String)
String s.replace(char)









public abstract interface Frobnicate {public void twiddle(String s);}

Which is a correct class? (Choose all that apply.)

a. public abstract class Frob implements Frobnicate {
public abstract void twiddle(String s) {}
}
B. public abstract class Frob implements Frobnicate {}
C. public class Frob extends Frobnicate {
public void twiddle(Integer i){}
}
D. public class Frob implements Frobnicate {
public void twiddle(Integer i){}
}
E. public class Frob implements Frobnicate {
public void twiddle(String i){}
public void twiddle(Integer s){}
}






*/

/*	
		int ptr=0,k=0;
		   for(int i=0;i<arr.length;i++){
			 
			 ptr = arr[i];
			 while(i<arr.length && ptr==arr[i] ){
				i++;
			 }
			 arr[k]=ptr;	k++;	i--;
		 }
		 return k;
	}
  */      
	
/*	
//	int String=0;
//	int []a={0,0,1,1,1,2,2,3,3,4,5,6,7,8,9,9,9};
//		System.out.println(abc.length);
*/



/*	x:
	  for(int i=1;i<=10;i++){
		   for(int j=1;j<=10;j++){
			if(5==i)continue x;
		System.out.print(i+" ");
		  
	  }
		  System.out.println();
		  
	  }
*/
		 
	


/*
/*

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String next = strs[i];
            int index = 0;
            while(index < next.length() && index < prefix.length() && prefix.charAt(index) ==  next.charAt(index)) {
                index++;
            }
            prefix = prefix.substring(0, index);
        }
            
        return prefix;
    }
}
*/


	


/*

	for(String i:abc){
	s=s+Integer.parseInt(i);
	}
	System.out.println("sum="+s);
	s=0;
	for(int i=0;i<abc.length;i++){
	s=s+Integer.parseInt(abc[i]);	
	}
	System.out.println("sum="+s);

*/