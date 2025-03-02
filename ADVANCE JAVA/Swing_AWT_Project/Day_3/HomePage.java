import javax.swing.*;
import java.awt.*;
class HomePage extends JPanel
{
	JButton login,regis;
	
	HomePage()
	{
		setLayout(null);
		
		Font f = new Font("Arial",Font.BOLD,30);

		JLabel l = new JLabel("Welcome to HomePage");
		l.setBounds(70,25,350,100);
		l.setFont(f);
		add(l);
		
		
		login = new JButton("Login");
		login.setBounds(100,150,80,80);
		add(login);	
		
		regis = new JButton("Register");
		regis.setBounds(300,150,90,90);
		add(regis);
	}
	
}