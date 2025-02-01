class Demo4{
	public static void main(String args[]){
	int x[]={10,20,400,60,30};
	int max1,max2;
	max1=x[0];
	max2=x[0];
	
		for(int i = 1; i<x.length;i++){
			if(max1<x[i]){
				max2=max1;
				max1=x[i];
				}
			else if(max2<x[i] && max1!= max2){
				max2=x[i];
				}
			
		}
		System.out.println("max1="+max1);
		System.out.println("max2="+max2);
		}
}