import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

class MenuPage extends JPanel// implements ActionListener
{
	JTabbedPane tabes;
	Insert insert;
	Search search;
	Update update;
	Show show;
	Delete delete;
	LogOut logOut;
	
	MenuPage(Container cn,CardLayout cr)
	{
		tabes = new JTabbedPane();
		setLayout(new BorderLayout());
		
		insert = new Insert();
		tabes.add(insert,"Insert");
		
		
		search = new Search();
		tabes.add(search,"Search");
		
		update = new Update();
		tabes.add(update,"Update");
		
		
		show = new Show();
		tabes.add(show,"show All");
		
		delete = new Delete();
		tabes.add(delete,"Delete");
		//add(tabes);	

        logOut = new LogOut(cn,cr);
		tabes.add(logOut,"logOut");
		add(tabes);	
	//	logOut.home.addActionListener(this);	
	}
	
	//public void actionPerformed(ActionEvent e)
  //{
  // }	
}


class Insert extends JPanel implements ActionListener
{
	JLabel roll_label,name_label,phy_label,che_label,math_label;
	JTextField roll,name,phy,che,math;
	JButton insert;
	Insert()
	{
		Font f = new Font("Arial",Font.BOLD,25);
		// set Labels for all TextFields
		setLayout(null);
		roll_label = new JLabel("Enter Roll No.  :");
		roll_label.setBounds(30,15,200,100);
		add(roll_label);
		roll_label.setFont(f);

		name_label = new JLabel("Enter Name      :");
		name_label.setBounds(30,65,200,100);
		add(name_label);
		name_label.setFont(f);
		
		phy_label = new JLabel("Enter phy No.   :");
		phy_label.setBounds(30,115,200,100);
		add(phy_label);
		phy_label.setFont(f);
		
		che_label = new JLabel("Enter che No.   :");
		che_label.setBounds(30,160,200,100);
		add(che_label);
		che_label.setFont(f);
		
		math_label = new JLabel("Enter math No. :");
		math_label.setBounds(30,215,200,100);
		add(math_label);
		math_label.setFont(f);
		
		// TextField
		
		roll = new JTextField();
		roll.setBounds(220,50,150,25);
		add(roll);

		name = new JTextField();
		name.setBounds(220,100,150,25);
		add(name);
		
		phy = new JTextField();
		phy.setBounds(220,150,150,25);
		add(phy);
		
		che = new JTextField();
		che.setBounds(220,200,150,25);
		add(che);
		
		math = new JTextField();
		math.setBounds(220,250,150,25);
		add(math);
		
		insert = new JButton("Insert...");
		insert.setBounds(100,300,100,20);
		add(insert);
		insert.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==insert)
		{
			String _roll =  roll.getText();
			String _name =  name.getText();
			String _phy  =  phy.getText();
			String _che  =  che.getText();
			String _math =  math.getText();
			
			if(insertData(_roll,_name,_phy,_che,_math))
			{
			 JOptionPane.showMessageDialog(insert,"Data Inserted Successfully.","Message",JOptionPane.INFORMATION_MESSAGE);	
			}
			else
			{
			JOptionPane.showMessageDialog(insert,"Re-Enter data","Alert",JOptionPane.ERROR_MESSAGE);	
			}
			
     		roll.setText("");
			name.setText("");
			phy.setText("");
			che.setText("");
			math.setText("");

		}
		
	}	
	
	public boolean insertData(String roll,String name,String phy,String che,String math)
	{
		if(roll.equals("") ||name.equals("") ||phy.equals("") ||che.equals("") ||math.equals(""))
		{return false;}
		int n = 0;
		try{
			Integer.parseInt(phy);
			Integer.parseInt(che);
			Integer.parseInt(math);		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
		Statement st = cn.createStatement();
		n = st.executeUpdate("insert into Student values('"+roll+"','"+name+"','"+phy+"','"+che+"','"+math+"')");
		cn.close();
		}
		catch(Exception e){
			return false;//		System.out.println(e);
		}
		if(n!=0)
		{
			return true;			
		}
		else{
			return false;			
		}
	}
	
	
}

class Search extends JPanel implements ActionListener
{
    JLabel roll_label,name_label,phy_label,che_label,math_label;
	JTextField roll,name,phy,che,math;
	JButton search;
	Search()
	{
		Font f = new Font("Arial",Font.BOLD,25);
		// set Labels for all TextFields
		setLayout(null);
		roll_label = new JLabel("Enter Roll No.  :");
		roll_label.setBounds(30,15,200,100);
		add(roll_label);
		roll_label.setFont(f);

		name_label = new JLabel("Name :");
		name_label.setBounds(30,65,200,100);
		add(name_label);
		name_label.setFont(f);
		
		phy_label = new JLabel("phycis :");
		phy_label.setBounds(30,115,200,100);
		add(phy_label);
		phy_label.setFont(f);
		
		che_label = new JLabel("Chemistry :");
		che_label.setBounds(30,160,200,100);
		add(che_label);
		che_label.setFont(f);
		
		math_label = new JLabel("Math :");
		math_label.setBounds(30,215,200,100);
		add(math_label);
		math_label.setFont(f);
		
		// TextField
		
		roll = new JTextField();
		roll.setBounds(220,50,150,25);
		add(roll);

		name = new JTextField();
		name.setBounds(220,100,150,25);
		add(name);
		
		phy = new JTextField();
		phy.setBounds(220,150,150,25);
		add(phy);
		
		che = new JTextField();
		che.setBounds(220,200,150,25);
		add(che);
		
		math = new JTextField();
		math.setBounds(220,250,150,25);
		add(math);
		
		search = new JButton("search...");
		search.setBounds(100,300,100,20);
		add(search);
		
		search.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		String roll_NO = roll.getText();
		
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from Student where roll = '"+roll_NO+"'");
		
			if(rs.next())
			{
		       name.setText(rs.getString(2)); 	
			   phy.setText(rs.getString(3));
			   che.setText(rs.getString(4));
			   math.setText(rs.getString(5));			   
			}
			else
			{
    		   JOptionPane.showMessageDialog(search,"No Such Roll No Exist In List.","Alert",JOptionPane.ERROR_MESSAGE);
			   roll.setText("");
			   name.setText(""); 	
			   phy.setText("");
			   che.setText("");
			   math.setText("");	
				
			}		
			
			cn.close();
		}
		catch(Exception e1)
		{
				System.out.println(e);
		}
	}
}

class Update extends JPanel implements ActionListener
{
    JLabel roll_label,name_label,phy_label,che_label,math_label;
	JTextField roll,name,phy,che,math;
	JButton search ,update;
	Update()
	{
		Font f = new Font("Arial",Font.BOLD,25);
		// set Labels for all TextFields
		setLayout(null);
		roll_label = new JLabel("Enter Roll No.  :");
		roll_label.setBounds(30,15,200,100);
		add(roll_label);
		roll_label.setFont(f);

		name_label = new JLabel("Name :");
		name_label.setBounds(30,65,200,100);
		add(name_label);
		name_label.setFont(f);
		
		phy_label = new JLabel("phycis :");
		phy_label.setBounds(30,115,200,100);
		add(phy_label);
		phy_label.setFont(f);
		
		che_label = new JLabel("Chemistry :");
		che_label.setBounds(30,160,200,100);
		add(che_label);
		che_label.setFont(f);
		
		math_label = new JLabel("Math :");
		math_label.setBounds(30,215,200,100);
		add(math_label);
		math_label.setFont(f);
		
		// TextField
		
		roll = new JTextField();
		roll.setBounds(220,50,150,25);
		add(roll);

		name = new JTextField();
		name.setBounds(220,100,150,25);
		add(name);
		
		phy = new JTextField();
		phy.setBounds(220,150,150,25);
		add(phy);
		
		che = new JTextField();
		che.setBounds(220,200,150,25);
		add(che);
		
		math = new JTextField();
		math.setBounds(220,250,150,25);
		add(math);
		
		search = new JButton("search...");
		search.setBounds(100,300,100,20);
		add(search);
		
		update = new JButton("update...");
		update.setBounds(300,300,100,20);
		add(update);
		
		search.addActionListener(this);
		
		update.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==search)
	{
				String roll_NO = roll.getText();
		
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from Student where roll = '"+roll_NO+"'");
		
			if(rs.next())
			{
		       name.setText(rs.getString(2)); 	
			   phy.setText(rs.getString(3));
			   che.setText(rs.getString(4));
			   math.setText(rs.getString(5));			   
			}
			else
			{
    		   JOptionPane.showMessageDialog(update,"No Such Roll No Exist In List.","Alert",JOptionPane.ERROR_MESSAGE);
			   
			   roll.setText("");
			   name.setText(""); 	
			   phy.setText("");
			   che.setText("");
			   math.setText("");	
				
			}		
			
			cn.close();
		}
		catch(Exception e1)
		{
				System.out.println(e);
		}	
	}	
	if(e.getSource()==update)
	{
		    String roll_ = roll.getText();
		    String name_ = name.getText();
		    String phy_ = phy.getText();
		    String che_ = che.getText();
		    String math_ = math.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
			Statement st = cn.createStatement();
			int change = st.executeUpdate("update student set name = '"+name_+"', phy = '"+phy_+"',che = '"+che_+"', math = '"+math_+"' where roll = '"+roll_+"'");
			if(change!=0)
			{
		       JOptionPane.showMessageDialog(update,"Data Update.","Message",JOptionPane.INFORMATION_MESSAGE);
			   roll.setText("");
			   name.setText(""); 	
			   phy.setText("");
			   che.setText("");
			   math.setText("");	
			}
			else
			{
    		   JOptionPane.showMessageDialog(update,"No Such Roll No Exist In List.","Alert",JOptionPane.ERROR_MESSAGE);
			   roll.setText("");	
			}		
			
			cn.close();
		}	
		catch(Exception e1)
		{
				System.out.println(e);
		}	

	}
	
	}
}
class Show extends JPanel implements ActionListener{
    JTable table;
    JScrollPane jsp;
	JButton showAll;
	String[][] data;
    String[] col = {"Roll No.", "Name", "Phycis", "Chemistry", "Math","Total"};

	Show() {
		
		data = new String[0][0];

        setLayout(new BorderLayout()); // Use BorderLayout for proper placement
       
        table = new JTable(data, col);
        jsp = new JScrollPane(table); // Add table inside JScrollPane

        add(jsp, BorderLayout.CENTER); 
		
		
		// Add JScrollPane to JPanel
		
		showAll	= new JButton("showAll");
		add(showAll,BorderLayout.SOUTH);
		showAll.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		remove(jsp);
        data = showData();
	    table = new JTable(data, col);
	    jsp = new JScrollPane(table); // Add table inside JScrollPane
        add(jsp, BorderLayout.CENTER);
	    
		revalidate();
		repaint();
	 
	}
	
	public String[][] showData()
	{
		//String[][] data = new String[50][6];  
		  List<String[]> data = new ArrayList<>(); // Use dynamic list for unknown row count

		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from Student");
		
		// int n = 0;
		while(rs.next()){
		/*	
			data[n][0] = rs.getString(1);
			data[n][1] = rs.getString(2);
			data[n][2] = rs.getString(3);
			data[n][3] = rs.getString(4);
			data[n][4] = rs.getString(5);
			
			data[n][5] = Integer.parseInt(data[n][2])+Integer.parseInt(data[n][3])+Integer.parseInt(data[n][4])+"";
			
			n++;
			*/
			// /*
			   String[] row = new String[6]; // 6 columns
                row[0] = rs.getString(1); // Use index starting from 1
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = Integer.parseInt(row[2])+Integer.parseInt(row[3])+Integer.parseInt(row[4])+"";

                data.add(row); // Add row to list
		}	
		cn.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
		 return data.toArray(new String[0][0]);
		//return data;
	}
	
	
}


class Delete extends JPanel implements ActionListener
{
	JLabel roll_label;
	JTextField roll;
	JButton delete;
	Delete()
	{
		Font f = new Font("Arial",Font.BOLD,25);
		// set Labels for all TextFields
		setLayout(null);
		roll_label = new JLabel("Enter Roll No.  :");
		roll_label.setBounds(30,15,200,100);
		add(roll_label);
		roll_label.setFont(f);
		
		roll = new JTextField();
		roll.setBounds(220,50,150,25);
		add(roll);
		
		delete = new JButton("delete...");
		delete.setBounds(150,100,100,20);
		add(delete);
		
		delete.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{	 
		String roll_ = roll.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root");
			Statement st = cn.createStatement();
			int change = st.executeUpdate("delete from student where roll = '"+roll_+"'");
			if(change != 0)
			{
				JOptionPane.showMessageDialog(delete,"Student Data Delete Successfully.","Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(delete,"Student Data Dose't Delete.\n Cheack Roll No. ","Alert",JOptionPane.ERROR_MESSAGE);
			}
			cn.close();

		}
        catch(Exception e1)
		{
			System.out.println(e1);
		}		
		
		
		
	}
	
}

class LogOut extends JPanel implements ActionListener
{
	JButton home;
    Container cn;
	CardLayout cr;
	LogOut(Container cn,CardLayout cr)
	{
		this.cn = cn;
		this.cr = cr;		
	
		home = new JButton("home");
		add(home);
		home.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e )
	{		
		cr.show(cn,"Home");
	}
}