class Demo9
{
public static void main(String ar[])
{
int x[][] = {
		 {1,2,3},{4,5,6},{7,8,9}
		};
int z[][]=new int [3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			z[2-i][2-j] = x[i][j];
			}
		}
		
		for(int i[]:z){
			for(int j:i){
		System.out.print(j+"  ");
		}
		System.out.println();
		}
}
}