import javax.swing.*;
import java.awt.*;

class RegisterPage extends JPanel
{
	JTextField name,pass,contect;
	JButton back,menu;
	
	JLabel name_label,pass_label,contect_label;
	RegisterPage()
	{
		//setLayout(null);
		Font f = new Font("Arial",Font.BOLD,15);
		name_label = new JLabel("Enter Name: ");
		name_label.setBounds(50,50,100,100);
		name_label.setFont(f);
		add(name_label);

		name = new JTextField(20);
		add(name);
		pass = new JTextField(20);
		add(pass);
		contect = new JTextField(20);
		add(contect);
		
		back = new JButton("Back");
		add(back);
		menu = new JButton("Menu");
		add(menu);
	}
}