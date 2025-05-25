 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.sql.*;
 
 class FDemo extends JFrame implements ActionListener
 {
	 Container cn = getContentPane();
	 CardLayout card;
	 
	 HomePage home;
	 LoginPage login;
	 RegisterPage regis;
	 MenuPage menu;
	 
	 FDemo()
	 {
		 card = new CardLayout();
		 setLayout(card);
		 
		 home = new HomePage();
		 add(home,"Home");
		 
		 login = new LoginPage();	
		 add(login,"Login");
		 
		 regis = new RegisterPage();
		 add(regis,"Register");
		
		 menu = new MenuPage(cn,card);
		 add(menu,"Menu");
		
		home.login.addActionListener(this);
		home.regis.addActionListener(this);
	 
		login.back.addActionListener(this);
		regis.back.addActionListener(this);
	 	
		login.menu.addActionListener(this);
		regis.register.addActionListener(this);
		
			
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==home.login)
		 {
			 card.show(cn,"Login");
		 }
		 if(e.getSource()==home.regis)
		 {
			 card.show(cn,"Register");
		 }
		 if(e.getSource()==login.back || e.getSource()==regis.back)
		 {
			 card.show(cn,"Home");
		 }
		 if(e.getSource()==login.menu)
		 {
			 String name = login.name.getText();
			 String pass = login.pass.getText();
			 if(name.equals("") || pass.equals(""))
			 {
				JOptionPane.showMessageDialog(login.menu,"Invalid User & Password","Alert",JOptionPane.WARNING_MESSAGE);		
			 } 
			 else if(isPresent(name,pass))
				//if(true)
			 {
	 			 card.show(cn,"Menu");
			 }
			 else
			 {
				JOptionPane.showMessageDialog(login.menu,"Invalid User & Password","Alert",JOptionPane.WARNING_MESSAGE);
			 }
		 }
		if(e.getSource()== regis.register)
		 {
			 String name = regis.name.getText();
			 String pass = regis.pass.getText();
			 String contect = regis.contect.getText();
				
			 if(name.equals("") || pass.equals("") || contect.equals(""))
			 {
				JOptionPane.showMessageDialog(regis.register,"User Already Present.\n Enter Valid Details","Alert",JOptionPane.WARNING_MESSAGE);		
			 } 
			 else if(registerStudent(name,pass,contect))
			 {
			   JOptionPane.showMessageDialog(regis.register,"You Have Successfully Registered.","WelCome",JOptionPane.INFORMATION_MESSAGE);
			 }				
			
			 else
			 {
			   JOptionPane.showMessageDialog(regis.register,"User Already Present.\n OR Enter Valid Details","Alert",JOptionPane.WARNING_MESSAGE);
			 }

			 regis.name.setText("");
			 regis.pass.setText("");
			 regis.contect.setText("");		 
		 
		 }
	
		
	 }
	 
	 public boolean registerStudent(String name, String pass, String contect)
	 {
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
			 Statement st = cn.createStatement();
		     st.executeUpdate("insert into registration values('"+name+"','"+pass+"','"+contect+"')");
			 cn.close();		 			 
		 }
		 catch(Exception e1)
		 {
			 System.out.println(e1);
		 }
	return true;
	 }

	public boolean isPresent(String name,String pass)
	{  boolean Is_Present = false;
		try
		 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
		Statement st = cn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from registration where uname = '"+name+"'AND upass='"+pass+"'");
		if(rs.next()){
			Is_Present = true;			
		 }
		cn.close();
		 }
		 catch(Exception e1)
		 {
			 System.out.println(e1);
		 }
		
		 // if no user match
		 return Is_Present;
	}	
 }
 
 class Driver
 {
	 public static void main(String[] args)
	 {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(1000,10,500,500);
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
		regis.register.addActionListener(this);


       // JOptionPane.showMessageDialog(component object,"Message","title",JOptionPane.message_type);

 */