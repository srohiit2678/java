class Demo8
{
public static void main(String args[]){
int x[][] = {
		 {1,2,3},{4,5,6},{7,8,9}
		};
int y[][] = {
		 {1,2,3},{4,5,6},{7,8,9}
		};
int z[][]=new int [3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			z[i][j]=x[i][j]+y[i][j];
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
		System.out.print(z[i][j]+"  ");
		}
		System.out.println();
		}
}
}