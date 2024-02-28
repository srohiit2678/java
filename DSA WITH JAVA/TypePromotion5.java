/*
  -> Type Promotion in expressions
		
		NOTE -> it happens omly when the veriable particapte in any opration 
				like arithematic opration, logical opration, binary opration etc. 
	
	
	1.-> java automatically promotes (byte, char, short, int) operand to int type
			while evaluating an exepresion.
			
	
    2.-> else if greatest operand in exepresion is
			long,float,double then they are promoted to 	

			long   -> long
			float  -> float
			double -> double	
*/




class TypePromotion5{
public static void main(String args[]){

// 1->

char ch1 = 'a';
char ch2 = 'b';

System.out.println(ch1+ch2);// 'a'+'b' ->(unicode) 97+98-> 195
System.out.println(ch1-ch2);// 97-98 ->  -1

// 2->
 
System.out.println(ch1); // a -> not any opration is takeing part

// 3->

System.out.println((int)ch1); // 97 -> type casting take place and becouse every character has its unicode. 

// 4->

/*

char ch3 = ch1 - ch2; // error: possible lossy conversion from int to char.

*/

// 5->

int ch4 = ch1+ch2; // 97 + 98
System.out.println(ch4); // 195


// 6->

  byte bt = 3;
short sht = 5;
  char ch = 'a';

int it = bt + sht + ch; // 3 + 5 + 97 -> 105

System.out.println(it);// 105

/* // imp->

NOTE ->
 byte byt = 2;

 byte byt2 = byt * 2; // error:possible lossy conversion from int to byte.

// and if->
 
 byte byt3=3;

 // byt3 = byt3 * 2; // error:possible lossy conversion from int to byte.

  byt3 = (byte)(byt3 * 2);
*/
  
// 7->

/*
 bt = 3;
sht = 5;
 ch = 'a';
short sht2 = bt + sht + ch; // error :possible lossy conversion from int to short
*/

// 8->

int it2 = 4;
long lg = 4l;

long lg1 = it2 + lg; // 8

//9 ->
/*
int it3 = lg + it2; // error: possible lossy conversion from long to int.
*/

//10 ->
int it4 = 4;
long lg2 = 4l;
float flt = 4;

float flt2 = flt + lg2 + it4;

System.out.println(flt2); // 12.0


// 11->
		it4 = 4;
		lg2 = 4l;
		flt = 4;
 double dbl = 4d;

double dbl2 = dbl + flt + lg2 + it4;

System.out.println(dbl2);// 16.0


}

}