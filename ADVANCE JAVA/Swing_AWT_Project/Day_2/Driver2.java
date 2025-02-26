import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo2 extends JFrame implements ActionListener
{
	CardLayout card;
	JButton b1,b3;
	JPDemo2 jp1;
	Container cn = getContentPane();
	FDemo2()
	{
		card = new CardLayout();
		setLayout(card);
		
		b1 = new JButton("click_1");
		add("A",b1);
		
		jp1 = new JPDemo2();
		add("B",jp1);
		
		b3 = new JButton("click_3");
		add("C",b3);
		
		b1.addActionListener(this);
		jp1.next.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(cn);
	}
	
}
class Driver2
{
	public static void main(String[] args)
	{
		FDemo2 f = new FDemo2();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}