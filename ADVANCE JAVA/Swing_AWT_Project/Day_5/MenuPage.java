import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class MenuPage extends JPanel
{	JTabbedPane tab;
	
	Insert insert;
	Search search;
	Update update;
	Delete delete;
	ShowAll showAll;
	LogOut logOut;
	MenuPage()
	{
		setLayout(new BorderLayout());
		tab = new JTabbedPane();
		
		insert  = new Insert();
		tab.add(insert,"Insert");
		search= new Search();
		tab.add(search,"Search");
		update = new Update();
		tab.add(update,"Update");
		delete = new Delete();
		tab.add(delete,"Delete");
		showAll = new ShowAll();
		tab.add(showAll,"ShowAll");
		logOut = new LogOut();	
		tab.add(logOut,"LogOut");
		
		
		add(tab);
		
	}
}

class Insert extends JPanel implements ActionListener
{
	JLabel rl,na,ph,ch,ma;
	JTextField r,n,p,c,m;
	JButton i;
	Insert()
	{
		 rl = new JLabel("roll");
		 add(rl);
		 r = new JTextField(40);
			add(r);
  
		na = new JLabel("name");
		 add(na);
     	 n = new JTextField(38);
			add(n);
		 
		 ph = new JLabel("phy");
		 add(ph);
		 p = new JTextField(40);
			add(p);
			
		 ch = new JLabel("che");
		 add(ch);
		 c = new JTextField(40);
			add(c);		 

		 ma = new JLabel("math");
		 add(ma);
		 m = new JTextField(38);
			add(m);
		 
		 i = new JButton("insert Data");
			add(i);		 
		 i.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1 = r.getText();
		String s2 = n.getText();
		String s3 = p.getText();
		String s4 = c.getText();
		String s5 = m.getText();
		if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Enter Valid Details.");
		}
		else
		{
			try
			{
				//Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql:///a","root","root");
				Statement st = con.createStatement();
				int n = st.executeUpdate("insert into s values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
				con.close();
				if(n!=0){
					JOptionPane.showMessageDialog(null,"Data Inserted.");
				}
				else{
					JOptionPane.showMessageDialog(null,"Failed To Insert.");
					
				}
			}
			catch(Exception e1 )
			{
		System.out.println(e1);
				
			}
		
		}
		
		r.setText("");
		n.setText("");
		p.setText("");
		c.setText("");
		m.setText("");
		
	}
}
class Search extends JPanel
{
	
	Search()
	{
		
	}
	
}
class Update extends JPanel
{
	Update()
	{
		
	}
	
}
class Delete extends JPanel implements ActionListener
{
	JLabel rl;
	JTextField r;
	JButton d;
	Delete()
	{
		setLayout(null);
		
		rl = new JLabel("Enter roll: ");
		rl.setBounds(50,50,80,30);
		add(rl);
		
		r = new JTextField();
		r.setBounds(150,50,100,30);
		add(r);
		
		d = new JButton("Delete");
		d.setBounds(100,100,100,40);
		add(d);
		d.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = r.getText(); 
		if(!s.equals(""))
		{
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///a","root","root");
			Statement st = con.createStatement();
			int n = st.executeUpdate("delete from s where r ='"+s+"'");	
			con.close();
			if(n!=0){
			JOptionPane.showMessageDialog(null,"Roll. "+s+" Deleted.");				
			}
			else{
			JOptionPane.showMessageDialog(null,"Enter Valid Roll.");
			}
			}
			catch(Exception e1){}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Enter Valid Roll.");
		}
		r.setText(""); 
	}
	
}
class ShowAll extends JPanel
{
	ShowAll()
	{
		
	}
	
}
class LogOut extends JPanel
{
	LogOut()
	{
		
	}
	
}
