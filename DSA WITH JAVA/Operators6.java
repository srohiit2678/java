/*
 -> oprators 
 
 1.-> Arithmetic oprators
 2.-> Relational oprators
 3.-> Logical oprators
 4.-> Bitwise oprators
 5.-> Assignment oprators
 6.-> shift oprator
 
*/

class Operators6{
	
	public static void main(String args[]){
	
	 int int_var1 = 10;
	 int int_var2 = 2;
	
	/* // Arithmetic oprators
		
		( ++ , -- , * , / , % , + , - )
		
		int_var1 + int_var2;  ==> expresion
		
		int_var1 => operand
		int_var2 => operand
		
		+ ==> oprator
		
	*/
	
	System.out.println(int_var1 + int_var2); // 12
	System.out.println(int_var1 - int_var2); // 8
	System.out.println(int_var1 * int_var2); // 20
	System.out.println(int_var1 / int_var2); // 5
	System.out.println(int_var1 % int_var2); // 0
	
	System.out.println(int_var1++); // 10
	System.out.println(int_var1);   // 11
	System.out.println(++int_var1); // 12
	
	int_var1 = 10;
	int_var2 = 2;
	
	/* // Relational oprators
		
		 (  < , > , <= , >= , != , == )
		
		Equality oprators==> (!= , ==)
	
	*/
	
	
	System.out.println(int_var1 > int_var2);  // true
	System.out.println(int_var1 >= int_var2); // true
	System.out.println(int_var1 < int_var2);  // false
	System.out.println(int_var1 <= int_var2); // false
	
	System.out.println(int_var1 != int_var2); // true
	System.out.println(int_var1 == int_var2); // false




    /* // Logical oprators
			
			( && , || , ! )
			
			&& => true && true ==> true , false && true ==> false , true && false ==> false , false && false ==> false 
			|| => true || true ==> true , false || true ==> true , true || false ==> true , false || false ==> false
			!  => true ==> false , false ==> true
			
    */

	System.out.println(true && true);  //true
	System.out.println(true || false); //true
	System.out.println(!false);        //true
	
	
	
	/* // Bitwise oprators
		
		( & , ^ , | )
		
	 
	
	*/
	
	System.out.println(int_var1 & int_var2); // 2
	System.out.println(int_var1 | int_var2); // 10
	System.out.println(int_var1 ^ int_var2); // 8
	
	/* // Assignment oprators
	
		( += , -= , *= , /= , %= ) 
 	
	*/
	
	System.out.println(int_var1 += int_var2); // 12
	System.out.println(int_var1 -= int_var2); // 10
	System.out.println(int_var1 *= int_var2); // 20
	System.out.println(int_var1 /= int_var2); // 10
	System.out.println(int_var1 %= int_var2); // 0



	int_var1 = 10;
	int_var2 = 2;
	
	
	/* // shift oprator
     
	  ( >> , << ,>>>)
	  

	*/
	System.out.println(int_var1 >> int_var2); // 2
	System.out.println(int_var1 << int_var2); // 40
	System.out.println(int_var1 >>> int_var2);// 2
	
	}
	
}