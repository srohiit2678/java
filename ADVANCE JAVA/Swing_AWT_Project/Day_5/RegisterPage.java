import javax.swing.*;

class RegisterPage extends JPanel
{
	JLabel name_,pass_,contect_;
	JTextField name,pass,contect;
	JButton back,register;
	
	RegisterPage()
	{
	name_ = new JLabel("Enter name:    ");
		add(name_);
		name = new JTextField(30);
		add(name);
	    
		pass_ = new JLabel("Enter pass:  ");
		add(pass_);
		pass = new JTextField(30);
		add(pass);
		
		contect_ = new JLabel("Enter contect: ");
		add(contect_);
		
		contect = new JTextField(30);
		add(contect);
		
		back = new JButton("back");
		add(back);
		
		register = new JButton("Register");
		add(register);
			
	}
}