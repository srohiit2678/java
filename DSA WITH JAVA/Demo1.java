class DataType{

    public static void main(String args[]){
		int a=10;
		int b=12;
		int c=a+b;
        System.out.println("sum="+c);

    }

}


// byte->       1bute		[-128 _ 127]									[-2^7 _ 2^7-1]
// short->      2byte		[-32768 _ 32767]								[[-2^15 _ 2^15-1]
// char->		2byte		[0 _ 65535]										[(2^15+2^15)-1]
// boolean->    1byte/1bit  [ true,false]
// int->		4byte		[-2147483648 _ 2147483647]						[-2^31 _ 2^31-1]
// long->	    8byte		[-9223372036854775808 _ 9223372036854775807]	[-2^63 _ 2^63-1]
// float-> 		4byte		[]												[-2^31 _ 2^31-1]
// double->   	8byte		[]												[-2^63 _ 2^63-1]