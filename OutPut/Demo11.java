import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	int x=100;
	int y=100;
	int i,j,k=0;
	FDemo()
	{
		Font f1=new Font("Brush Script MT",Font.ITALIC,30);
		setFont(f1);
		setLayout(null);
		for(i=0;i<9;i++)
		{
			for(j=0;j<9;j++);
			{
				b[k]=new Button();
				b[k].setSize(100,100);
				b[k].setLocation(x,y);
				add(b[k]);
				b[k].addActionListener(this);
				x=x+100;
				k++;
			}
			x=100;
			y=y+100;
		}
	}
	int c=1;
	public void actionPerformed(ActionEvent e)
	{
		Button b11=(Button) e.getSource();
		if(c%2==1)
		{
			b11.setLabel("x");
		}
		else
		{
			b11.setLabel("0");
		}
		c++;
		b11.removeActionListener(this);
	}
}
class Demo11
{
	public static void main(String []args)
	{
		FDemo f1=new FDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setLocation(200,100);
	}
}
	
	
				
		
	