import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo1 extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	CardLayout card;
	Container cn = getContentPane();
	JPDemo1 jp1;
	
	FDemo1()
	{
		card = new CardLayout();
			setLayout(card);
		b1 = new JButton("click_1");
		add("A",b1);
		
		b2 = new JButton("click_2");
		add("B",b2);
		jp1 = new JPDemo1(this);
		add("C",jp1);
		b3 = new JButton("click_3");
		add("D",b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(cn);
	}
}

class Driver1
{
	public static void main(String[] args)
	{
		FDemo1 f = new FDemo1();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}