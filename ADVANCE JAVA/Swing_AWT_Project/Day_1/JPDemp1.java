import javax.swing.*;

class JPDemp1 extends JPanel
{
		JTextField tx1,tx2;
		JButton b1;
		
		JPDemp1()
		{
			tx1 = new JTextField(10);
			add(tx1);
			
			b1 = new JButton("Login");
			add(b1);
		}	
}
