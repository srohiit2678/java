class Demo3{
	public static void main(String args[]){
	int x[]={10,20,40,60,30};
	int min,max;
	min=x[0];
	max=x[0];
		for(int i = 0; i<x.length;i++){
			if(min>x[i]){min=x[i];}
			if(max<x[i]){max=x[i];}
			
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		}
}