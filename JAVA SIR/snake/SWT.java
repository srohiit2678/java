class SWT{
public static void main(String ar[]){
	int n = 25;
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			System.out.print( (i+j)+"\t");	
		}	
			System.out.println();	
	}
	/*
	1		2		3		4		5		6		7		8		9		10		11
	
1-  2       3       4       5       6       7       8       9       10      11      12
2-  3       4       5       6       7       8       9       10      11      12      13
3-  4       5       6       7       8       9       10      11      12      13      14
4-  5       6       7       8       9       10      11      12      13      14      15
5-  6       7       8       9       10      11      12      13      14      15      16
6-  7       8       9       10      11      12      13      14      15      16      17
7-  8       9       10      11      12      13      14      15      16      17      18
8-  9       10      11      12      13      14      15      16      17      18      19
9-  10      11      12      13      14      15      16      17      18      19      20
10- 11      12      13      14      15      16      17      18      19      20      21
11- 12      13      14      15      16      17      18      19      20      21      22





	1		2		3		4		5		6		7		8		9		10		11

1-  2       3       4       5       6       7       8       9       10
2-  3       4       5       6       7       8       9       10      11
3-  4       5       6       7       8       9       10      11      12
4-  5       6       7       8       9       10      11      12      13
5-  6       7       8       9       10      11      12      13      14
6-  7       8       9       10      11      12      13      14      15
7-  8       9       10      11      12      13      14      15      16
8-  9       10      11      12      13      14      15      16      17
9- 10      11      12      13      14      15      16      17      18
*/

	// pattern -- 1
		

	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			
		if(i+j<=(n/2)+2 || i+j>=n+(n/2+1) || i-j>=(n)/2 || j-i>=(n)/2){
	//	if(i+j<=7 || i+j>=17 || i-j>=5 || j-i>=5){	//for n==11		
			System.out.print("* ");
			}
		else{
			System.out.print("  ");
		} 
	}	
		System.out.println();	
	}
	{
		System.out.println();
		System.out.println();
		System.out.println();	
		System.out.println();
		System.out.println();
		System.out.println();
	}			
// pattern -- 2

	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i+j<=(n/2)+2 || i+j>=n+(n/2+1)|| i-j==(n)/2 || j-i==(n)/2){
		//if(i+j<=7 || i+j>=17|| i-j==5 || j-i==5){
			
			System.out.print("* ");
			}
		else{
			System.out.print("  ");
		} 
	}	
		System.out.println();	
	}
	{
		System.out.println();
		System.out.println();
		System.out.println();	
		System.out.println();
		System.out.println();
		System.out.println();	
	}
// pattern -- 3

	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			
	  if(i+j<=(n/2)+2 || i+j>=n+(n/2+1) || i-j==(n)/2 || j-i==(n)/2){
	// if(i+j<=7 || i+j>=17|| i-j==5 || j-i==5){
			System.out.print("  ");
			}
		else{
			System.out.print("* ");
		} 
	}	
		System.out.println();	
	}
	{
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	}

// pattern -- 4

for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
		if((i+j>=(n/2)+2 && j-i<=(n)/2 && i<=(n)/2+1)||i-j>=(n)/2||i+j>=n+(n/2+1)){
	//	if((i+j>=7 && j-i<=5 && i<=6)||i-j>=5||i+j>=17){
	
			System.out.print("* ");
			}
		else{
			System.out.print("  ");
		} 
	}	
		System.out.println();	
	}
	{
		System.out.println();
		System.out.println();
		System.out.println();	
		System.out.println();
		System.out.println();
		System.out.println();
	}
	// pattern -- 5


	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
	 //	if((i+j>=7 && j-i<=5 && i<=6)||(i+j<=12 && i>6)||(i-j<=0 && i>6)||(i==11)||(j==6)){	
	if((i+j>=(n/2)+2 && j-i<=(n)/2 && i<=(n)/2+1)||(i+j<=n+1 && i>(n)/2+1)||(i-j<=0 && i>(n)/2+1)||(i==n)||(j==(n)/2+1)){			
			System.out.print("* ");
			}
		else{
			System.out.print("  ");
		} 
	}	
		System.out.println();	
	}
	

}
}



