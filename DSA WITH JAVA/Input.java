import java.util.Scanner;

/*
->for taking input from usser we make an obj of Scanner class.
->for which we have to import util pakage in which Scanner class placed
*/

/*
next()-> used to take String until first space not found.

nextLine()-> it takes complete String along with space.

nextInt()-> 	it take int value
nextByte()-> 	it take byte value
nextFloat()-> 	it take float value
nextDouble()-> 	it take double value
nextBoolean()-> it take boolean value
nextShort()-> 	it take short value
nextLong()-> 	it take long value
*/

class Input{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
// for String		
		System.out.println("Enter 1st string");

// for single word String
			
		 String input_String = sc.next();
		
		System.out.println("By next() method: "+input_String);
	   
// for complete string
	     
		 sc.nextLine(); //the remaning String or space left by next() method will take by this
		 
		System.out.println("Enter 2nd String ");
	   
         input_String = sc.nextLine();

		System.out.println("By nextLine() method: "+input_String);

// this time we don't need to use sc.nextLine() method bcs previous nextLine() method does not remains any String or space

		System.out.println("Enter 3rd String ");
	   
         input_String = sc.nextLine();

		System.out.println("By nextLine() method: "+input_String);

// for int
		
		System.out.println("Enter 1st int number");
         
		 int input_integer1 = sc.nextInt();
        
		System.out.println("Enter 2nd int number");
		 
		 int input_integer2 = sc.nextInt();
		 
		  int sum = input_integer1+input_integer2;
		 
		 System.out.println("int sum is :"+sum);
		 
// for byte
		
		System.out.println("Enter 1st byte number");
		
		 byte input_byte1 =sc.nextByte();
		
		System.out.println("Enter 2nd byte number");
 
		  byte input_byte2 = sc.nextByte();
		  
		System.out.println("byte sum is:="+(input_byte1+input_byte2));
	
//for short

        System.out.println("Enter 1st short number");
		
		 short input_short1 =sc.nextShort();
		
		System.out.println("Enter 2nd short number");
 
		  short input_short2 = sc.nextShort();
		  
		System.out.println("short sumis :="+(input_short1+input_short2));
	
// for float
        System.out.println("Enter 1st float number");
		
		 float input_float1 =sc.nextFloat();
		
		System.out.println("Enter 2nd float number");
 
		 float input_float2 = sc.nextFloat();
		  
		System.out.println("float sum is :="+(input_float1+input_float2));

// for long

// for programmer while initialisation an lond should use 'l' after the number to know compailar about long value not int 

        System.out.println("Enter 1st long number");
		
		 long input_long1 =sc.nextLong();
		
		System.out.println("Enter 2nd long number");
 
		 long input_long2 = sc.nextLong();
		  
		System.out.println("long sum is:="+(input_long1+input_long2));

// for double

        System.out.println("Enter 1st double number");
		
		 double input_double1 =sc.nextDouble();
		
		System.out.println("Enter 2nd double number");
 
		  double input_double2 = sc.nextDouble();
		  
		System.out.println("double sum is :="+(input_double1+input_double2));

// for boolean
// booleandata type only store one value either true or false

      System.out.print(" & of two boolean T and F:");
		
		 boolean input_bool1 = true;
		
		 boolean input_bool2 = false;
		  
		System.out.println(input_bool1&input_bool2);
			
	}

}