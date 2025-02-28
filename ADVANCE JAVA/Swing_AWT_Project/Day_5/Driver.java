import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Frame extends JFrame implements ActionListener
{
	Container cn = getContentPane();
	CardLayout card;
	
	// cards
	HomePage home;
	LoginPage login;
	RegisterPage register;
	MenuPage menu; 
	Frame()
	{
		card = new CardLayout();
		setLayout(card);
	// cards
		home = new HomePage(); 
		add(home,"Home");
		home.login.addActionListener(this);
		home.regis.addActionListener(this);
		
	    login = new LoginPage();
		add(login,"Login");
		
		login.back.addActionListener(this);
		login.menu.addActionListener(this);
		
		register = new RegisterPage();
		add(register,"Register");
	   
	    register.back.addActionListener(this);
		register.register.addActionListener(this);
		
		menu = new MenuPage();	
		add(menu,"Menu");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==home.login)
		{card.show(cn,"Login");}
		if(e.getSource()==home.regis)
		{card.show(cn,"Register");}
		if(e.getSource()==login.back)
		{card.show(cn,"Home");}
		if(e.getSource()==login.menu)
		{
			String name = login.name.getText(); 
			String pass = login.pass.getText(); 
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql:///a","root","root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from r Where n='"+name+"' and p = '"+pass+"'");
				if(rs.next()){
					card.show(cn,"Menu");
				}
				else
				{
					JOptionPane.showMessageDialog(login.menu,"Invalid User pass.");
				}
				con.close();
				login.name.setText(""); 
			    login.pass.setText(""); 
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
			
		}
		if(e.getSource()==register.back)
		{card.show(cn,"Home");}
		if(e.getSource()==register.register)
		{
			String name = register.name.getText();
			String pass = register.pass.getText();
			String contect = register.contect.getText();
			if(name.equals("")||pass.equals("")||contect.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter data propery.");
			}
			
			else
			{
				try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql:///a","root","root");
				Statement st = con.createStatement();
				int n = st.executeUpdate("insert into r values ('"+name+"','"+pass+"','"+contect+"')");
				con.close();
				if(n!=0)
				{
					JOptionPane.showMessageDialog(null,"Registerstion one Successfully.");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Registerstion Faild.");
					
				}
				register.name.setText("");
			    register.pass.setText("");
				register.contect.setText("");

			}
			catch(Exception e1)
			{
				System.out.println(e1);				
			}
			}
		
		}
	}
	
}

class Driver 
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
			f.setVisible(true);
			f.setBounds(1000,540,500,500);
			f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
















/*
		// from Home Page to login Page
		home.login.addActionListener(this);
		// from Login Page to Home Page
		login.back.addActionListener(this);
		// from Home Page to Register Page
		home.regis.addActionListener(this);
		// from Register Page Home Page
		regis.back.addActionListener(this);
		// from Login Page to Menu Page
		login.menu.addActionListener(this);
		// from Register Page Menu Page
		regis.menu.addActionListener(this);


*/