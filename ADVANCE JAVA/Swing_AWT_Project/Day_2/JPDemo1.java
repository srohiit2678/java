import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class JPDemo1 extends JPanel implements ActionListener
{
	JTextField tx1,tx2;
	JButton login,next;
	
	JPDemo1(FDemo1 f)
	{
		tx1 = new JTextField(10);
		add(tx1);
		tx2 = new JTextField(10);
		add(tx2);
		login = new JButton("login");
		add(login);
		next = new JButton("next");
		add(next);
		
		login.addActionListener(this); 		
		next.addActionListener(f); 		
		
	}
	public void actionPerformed(ActionEvent e)
		{
				System.out.println("ram");
		}
}