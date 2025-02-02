import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{	Button b1[] = new Button[9];
	int x = 100;
	int y = 100;
	int count=0;
	FDemo(){
		Font f = new Font("Arial black",Font.BOLD,50);
		setFont(f);
	    setLayout(null);
		int i,j,k=0;	
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				b1[k]=new Button();
				b1[k].setSize(100,100);
				b1[k].setLocation(x,y);
				add(b1[k]);
				b1[k].addActionListener(this);
			x+=100;
			k++;
			}
			x=100;
			y+=100;
		}
	}
	public void actionPerformed(ActionEvent e){

		Button b = (Button)e.getSource();
			
			if(count%2==1){
				b.setLabel("o");
			}
			else{
				b.setLabel("X");
			}
			b.removeActionListener(this);
			count++;
	}
}  

class Demo{
	public static void main(String a[]){
	FDemo f1 = new FDemo();
	f1.setVisible(true);
	f1.setSize(800,800);
	f1.setLocation(100,100);
	}
}


/*

		System.out.println(Math.max(20,30));
		System.out.println(Math.min(20,30));
		System.out.println(Math.pow(2,5));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.cbrt(64));
		System.out.println(Math.sin(30));
		System.out.println(Math.cos(30));
		System.out.println(Math.tan(30));


*/


/*

class Demo{
	
	int prime(int n){
		int c=1,i;
		for(i=2;i<n;i++){
			if(n%i==0){
				c=0;
			}
		}
	return c;
	}	
}


*/
