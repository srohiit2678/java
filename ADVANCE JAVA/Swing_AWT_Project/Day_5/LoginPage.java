import javax.swing.*;

class LoginPage extends JPanel
{	JLabel name_,pass_;
	JTextField name,pass;
	JButton back,menu;
	LoginPage()
	{
		name_ = new JLabel("Enter name: ");
		add(name_);
		name = new JTextField(30);
		add(name);
	    
		pass_ = new JLabel("Enter pass:   ");
		add(pass_);
		pass = new JTextField(30);
		add(pass);
		
		back = new JButton("back");
		add(back);
		
		menu = new JButton("menu");
		add(menu);
	
	}
}
