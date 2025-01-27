class StringSort{
	public static void main(String Ar[]){
		String []a = {"rohit","addi","mohit","suraj","yash","harshi","niru","arjun","kuldeep","sandeep","prathem"};
		String temp;
		for(int i = 0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
		{
		//	System.out.println((""+(a[0].charAt(0))).compareToIgnoreCase(""+(a[1].charAt(0))));
			}
		if(a[j].charAt(0)> a[j+1].charAt(0)){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}	
		}
	}
		
		for(int j=0;j<a.length;j++){
		System.out.print("  "+a[j]);
		}

	}
}
