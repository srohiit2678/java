import javax.swing.*;
import java.awt.*;

class JPDemo2 extends JPanel
{
	JTextField tx1,tx2;
	JButton login,next;
	JPDemo2()
	{
		tx1 = new JTextField(10);
		add(tx1);
		tx2 = new JTextField(10);
		add(tx2);
		login = new JButton("login");
		add(login);
		next = new JButton("next");
		add(next);
		}
	
}