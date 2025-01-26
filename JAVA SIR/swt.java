import java.awt.*;
import java.awt.event.*;
class FFDemo extends Frame implements ActionListener
{
	Button b1[] = new Button[9];
	int x=100;
	int y=100;
	int count=0;
	FFDemo(){
		Font f1 = new Font("Arial Black",Font.BOLD,50);
		setFont(f1);
		setLayout(null);
		int i,j,k=0;
		for( i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				b1[k]=new Button();
				b1[k].setSize(100,100);
				b1[k].setLocation(x,y);
				add(b1[k]);
				b1[k].addActionListener(this);
				k++;
				x+=100;
			}
			x=100;
			y+=100;
		}
	}
	public void actionPerformed(ActionEvent e){
	Button	b = (Button)e.getSource();
		if(count%2==0){
			b.setLabel("o");
		}
		else{
			b.setLabel("X");
		}
		b.removeActionListener(this);
		count++;
	}
	
}
class swt {
	public static void main(String A[]){
		FFDemo f = new FFDemo();
		f.setVisible(true);
		f.setSize(900,900);
		f.setLocation(100,100);
	}
}