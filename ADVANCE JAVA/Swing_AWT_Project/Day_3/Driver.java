 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 class FDemo extends JFrame implements ActionListener
 {
	 Container cn = getContentPane();
	 CardLayout card;
	 
	 HomePage home;
	 LoginPage login;
	 RegisterPage regis;
	 FDemo()
	 {
		 card = new CardLayout();
		 setLayout(card);
		 
		 home = new HomePage();
		 add(home,"home");
		 
		 login = new LoginPage();	
		 add(login,"login");
		 
		 regis = new RegisterPage();
		 add(regis,"Register");
		
		
		home.login.addActionListener(this);
		home.regis.addActionListener(this);
	 
		login.back.addActionListener(this);
		regis.back.addActionListener(this);
	 	 
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==home.login)
		 {
			 card.show(cn,"login");
		 }
		 if(e.getSource()==home.regis)
		 {
			 card.show(cn,"Register");
		 }
		 if(e.getSource()==login.back || e.getSource()==regis.back)
		 {
			 card.show(cn,"home");
		 }
	 }
	 
 }
 
 class Driver
 {
	 public static void main(String[] args)
	 {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	 }
 }