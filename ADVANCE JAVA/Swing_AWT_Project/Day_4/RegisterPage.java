import javax.swing.*;
import java.awt.*;

class RegisterPage extends JPanel
{
	JTextField name,pass,contect;
	JButton back,register;
	
	JLabel name_label,pass_label,contect_label;
	RegisterPage()
	{
		setLayout(null);
		Font f = new Font("Arial",Font.BOLD,15);
		
		// name Label
		name_label = new JLabel("Enter Name: ");
		name_label.setBounds(50,50,150,30);
		name_label.setFont(f);
		add(name_label);

		// name Field		
		name = new JTextField(20);
		name.setBounds(200,50,150,30);
		add(name);
		
		// password Label
		pass_label = new JLabel("Enter Password: ");
		pass_label.setBounds(50,100,150,30);
		pass_label.setFont(f);
		add(pass_label);
		
		// password Field
		pass = new JTextField(20);
		pass.setBounds(200,100,150,30);
		add(pass);

		// Contect Label
		contect_label = new JLabel("Enter Contect No.: ");
		contect_label.setBounds(50,150,150,30);
		contect_label.setFont(f);
		add(contect_label);
		
		// Contect Field
		contect = new JTextField(20);
		contect.setBounds(200,150,150,30);
		add(contect);
			
		
		back = new JButton("Back");
		back.setBounds(50,200,100,40);
		add(back);
		
		register = new JButton("Register");
		register.setBounds(300,200,100,40);
		add(register);

	}
	
}