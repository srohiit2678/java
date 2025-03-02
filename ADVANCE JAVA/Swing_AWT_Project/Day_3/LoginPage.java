import javax.swing.*;
import java.awt.*;

class LoginPage extends JPanel
{
	JTextField name,pass;
	JLabel name_label,pass_label;
	JButton menu,back;
	LoginPage()
	{
		setLayout(null);
		
		Font f = new Font("Arial",Font.BOLD,15);
		
		name_label = new JLabel("Enter Name: ");
		name_label.setBounds(50,50,100,100);
		name_label.setFont(f);
		add(name_label);
		
		name = new JTextField(20);
		name.setBounds(170,90,200,20);
		add(name);
		
		pass_label = new JLabel("Enter Password: ");
		pass_label.setBounds(50,100,150,100);
		pass_label.setFont(f);
		add(pass_label);
		
		
		
		pass = new JTextField(20);
		pass.setBounds(170,140,200,20);
		add(pass);
		
		back =  new JButton("Back");
		back.setBounds(100,200,70,50);
		add(back);
		menu =  new JButton("menu");
		menu.setBounds(300,200,70,50);
		add(menu);	
	}
}