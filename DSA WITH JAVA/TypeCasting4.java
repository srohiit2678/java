 /*
 -> Type casting in java -> narrowning or expicit
		
	->java does not allows type casting it gives error : possible lossy conversion
		but programmer can do this forcefully as their requirment.
	
	->and which is also a information lossy conversion in many time( byte variabel = 128;//-127)
	    if data is out or range or storing floting value into integers.
	
	-> point to be remmber
   	
	1. -> type compatible{
		
		float -> int  is possible 
		
		but
		
		int -> boolean  is not possible
	}
	
    2. -> syntax for type casting{

     	destination_type_variable = (destination_type) source_type_variable;
	 }
		
	3. ->
		 int int_variable = 'A'; 
		 System.out.println(int_variable); // 65
		 
		 it is possible becouse every charcater has a particular assigned value in java
			that value is known as unicode.
 
			A-Z -> 97 - 122
			a-z -> 65 - 90
			0-9 -> 48 - 57


*/

class TypeCasting4{
	public static void main(String args[]){
		
		double a = 123456789.123456789d;  // sop(a)-> 1.2345678912345679E8
	     float b = (float)a;  			  // sop(b)-> 1.2345679E8
		  long c = (long)b;				  // sop(c)-> 123456792
		   int d = (int)c;				  // sop(d)-> 123456792 // int is 4byte can store -2^31 to 2^31-1	
		 short e = (short)d;			  // sop(d)-> -13032 
		  byte f = (byte)e;			      // sop(d)-> -13032		
		
		System.out.println(f);            // 24


	/*
	float float_variable = 123456789.154346f;
	long long_variable   = (long)float_variable;
		
	System.out.println(long_variable); // sop-> 123456792
	*/
	
	/*
	long long_variable2 = 987654321987654l;
	int int_variable = (int)long_variable2;

//	System.out.println(int_variable); // sop -> 822468678
     
	 long_variable2  = 9876543219l;
	 int_variable = (int)long_variable2;

//	 System.out.println(int_variable); // sop -> 1286608627
	
	 long_variable2  = 987654l;
	 int_variable = (int)long_variable2;

	 System.out.println(int_variable); // sop -> 987654
	*/
	
	
	
	
	/*
	 	 short short_variable =  -13032; 
         byte byte_variable   = (byte)-short_variable;	
		
	    	System.out.println(byte_variable);            // 24
		
	*/
	}
}