import javax.swing.*;

class HomePage extends JPanel
{
	JButton login,regis;
	HomePage()
	{
		//setLayout(null);
		login  = new JButton("login");
		add(login);
		
		regis = new JButton("Register");
		add(regis);
	}
	
}