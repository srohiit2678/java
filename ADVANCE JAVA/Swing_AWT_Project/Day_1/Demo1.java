import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo1 extends JFrame
{	
	JButton b1,b3,b4,b5,b6;
	JPDemp1 jp1;
	FDemo1()
	{
		setLayout(new GridLayout(2,3));
		b1 = new JButton("Click__1");
		add(b1);
		
		jp1 = new JPDemp1();
		add(jp1);
		
		b3 = new JButton("Click__3");
		add(b3);
		
		b4 = new JButton("Click__4");
		add(b4);
		
		b5 = new JButton("Click__5");
		add(b5);
		
		b6 = new JButton("Click__6");
		add(b6);	
	}
}
class Demo1
{
	public static void main(String[] args)
	{
		FDemo1 f = new FDemo1();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }	
}