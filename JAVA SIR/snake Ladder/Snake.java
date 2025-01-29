import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
	JPDemo jp;
	FDemo()
	{
		super.setTitle("Snake & Ladder");
		jp = new JPDemo();
		add(jp);
	}
	
}
class JPDemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11;
	Image swt,board,s1,start,about,reset,player1,player2,player11,player12,dice,dice1;
	
	JTextField tx1,tx2,tx3;
	
	JButton b1,b2,b3,b4;
	
	int px =40;
	int py =620;
	
	JPDemo()
	
	{
		setBackground(Color.black);
		img1 = new ImageIcon("swt.jpg");
		img2 = new ImageIcon("board.jpg");
		img3 = new ImageIcon("s1.png");
		img4 = new ImageIcon("start.jpg");
		img5 = new ImageIcon("about.gif");
		img6 = new ImageIcon("reset.png");
		img7 = new ImageIcon("start.gif");
		img8 = new ImageIcon("player1.png");
		img9 = new ImageIcon("player2.png");
		img10 = new ImageIcon("dice.gif");
		img11 = new ImageIcon("dice1.png");
		
		
		swt = img1.getImage();
		board = img2.getImage();
		s1 = img3.getImage();
		start = img4.getImage();
		about = img5.getImage();
		reset = img6.getImage();
	//	start = img7.getImage();
		player1 = img8.getImage();
		player2 = img9.getImage();
		player11 = img8.getImage();
		player12 = img9.getImage();
		dice = img10.getImage();
		dice1= img11.getImage();
		
	}


	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(swt,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,910,0,this);
		g.drawImage(start,20,540,this);
		g.drawImage(swt,0,0,this);
		g.drawImage(swt,0,0,this);
		g.drawImage(swt,0,0,this);
		g.drawImage(swt,0,0,this);
		g.drawImage(swt,0,0,this);
		g.drawImage(swt,0,0,this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
class Snake
{
	public static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(10,10,990,735);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}





/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame
{	
	JPDemo jp1;
	FDemo()
	{
		super.setTitle("Snake & Ladder");
		jp1 = new JPDemo();
		add(jp1);
	}
}
class JPDemo extends JPanel implements ActionListener
{
		ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11;
		Image swt,board,s1,reset,start,dice,dice1,player1,player11,player12,player2;
		
		JTextField tx1,tx2,tx3,tx4;
		
		JButton b1,b2,b3,b4;
		
		int px=40;
		int py=640;

	JPDemo()
	{
		Font f = new Font("Bauhaus 93",Font.ITALIC,30);
		setBackground(Color.black);
		img1 = new ImageIcon("swt.jpg"); 
		swt = img1.getImage();
		
		img2 = new ImageIcon("board.jpg"); 
		board = img2.getImage();
		
		img3 = new ImageIcon("s1.png");
		s1	= img3.getImage();
		
		img4 = new ImageIcon("about.gif");
		
		img5 = new ImageIcon("reset.png");
		img6 = new ImageIcon("start.jpg");
		start = img6.getImage();
		img7 = new ImageIcon("start.gif");
		img8 = new ImageIcon("player1.png");
		player1 = img8.getImage();
		player11 = img8.getImage();
		img9 = new ImageIcon("player2.png");
		player2 = img9.getImage();
		player12 = img9.getImage();
		img10 = new ImageIcon("dice.gif");
		dice = img10.getImage();
		img11 = new ImageIcon("dice1.png");
	    dice1 = img11.getImage();
		
		
		
		
		setLayout(null);
		b1 = new JButton(img4);
		b1.setBounds(50,120,100,30);
		b1.setBackground(new Color(4,129,225));
		add(b1);
		
		b2 = new JButton(img5);
		b2.setBounds(50,180,100,30);
		b2.setBackground(new Color(4,129,225));
		add(b2);
		
		b3 = new JButton(img7);
		b3.setBounds(20,560,150,70);
		b3.setBackground(new Color(4,129,225));
		add(b3);
		
		b4 = new JButton("Roll");
		b4.setBounds(50,480,100,40);
		b4.setFont(f);
		b4.setForeground(Color.red);
		add(b4);
		b4.addActionListener(this);
		
		tx1 = new JTextField("start game");
		tx1.setBounds(50,230,150,30);
		tx1.setFont(f);
		tx1.setForeground(Color.green);
		tx1.setBackground(Color.black);
		add(tx1);
		
		tx2 = new JTextField("player 1 name");
		tx2.setBounds(50,280,150,30);
		tx2.setFont(f);
		tx2.setForeground(Color.green);
		tx2.setBackground(Color.black);
		add(tx2);
		
		tx3 = new JTextField("player 2 name");
		tx3.setBounds(50,340,150,30);
		tx3.setFont(f);
		tx3.setForeground(Color.green);
		tx3.setBackground(Color.black);
		add(tx3);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(new Color(4,129,225));
		g.fillRect(0,0,200,735);
		g.drawImage(swt,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,910,0,this);
		g.drawImage(start,20,550,this);
		g.drawImage(dice,20,390,this);
		g.drawImage(dice1,110,390,this);
		g.drawImage(player1,10,260,this);
		g.drawImage(player2,10,320,this);
		g.drawImage(player11,px,py,this);
		g.drawImage(player12,120,640,this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{	px=140;
	    py=645;
		int random =(int)Math.round(Math.random()*5+1);
		if(e.getSource()==b4)
		{
			switch(random)
			{
				case 1:
				{
					img11 = new ImageIcon("dice1.png");
					px+=70;
					break;
				}case 2:
				{
					img11 = new ImageIcon("dice2.png");
					px+=140;
						break;
				}case 3:
				{
					img11 = new ImageIcon("dice3.png");
					px+=210;
						break;
				}case 4:
				{
					img11 = new ImageIcon("dice4.png");
					px+=280;
						break;
				}case 5:
				{
					img11 = new ImageIcon("dice5.png");
					px+=350;
						break;
				}case 6:
				{
					img11 = new ImageIcon("dice6.png");
					px+=420;
						break;
				}
			

			}
			dice1 = img11.getImage();
		   repaint();
			
		}
			}
}
class Snake
{
	public static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(0,0,990,735);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}




/*

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
	
	JPDemo jp1;
	
	FDemo()
	{	super.setTitle("Snake & Ladder");
		jp1 = new JPDemo();
		add(jp1);
	}
	
}
class JPDemo extends JPanel implements ActionListener
{
	 ImageIcon img1,img2,img3,img4,img5,img6;
	 ImageIcon img7,img8,img9,img10,img11;
	 Image swt,board,s1,start,dice,dice1;
	 // Image about,reset;
	 Image player1,player2;
	 Image player11,player12;
	 
	 JButton b1,b2,b3,b4;
	 
	 JTextField tx1,tx2,tx3;
	 
	 int px=40,py=620;
	
	JPDemo()
	{
		Font f = new Font("Bauhaus 93",Font.ITALIC,20);
		setBackground(Color.black);
		
		img1 = new ImageIcon("swt.jpg");
		swt = img1.getImage();
		
		img2 = new ImageIcon("board.jpg");
		board = img2.getImage();
		
		img3 = new ImageIcon("s1.png");
		s1 = img3.getImage();
		
		img4 = new ImageIcon("start.jpg");
		start = img4.getImage();
		
		img5 = new ImageIcon("about.gif");
		
		
		img6 = new ImageIcon("reset.png");
		
		
		img7 = new ImageIcon("start.gif");
		
		
		img8 = new ImageIcon("player1.png");
		player1 = img8.getImage();
		player11 = img8.getImage();
		
		img9 = new ImageIcon("player2.png");
		player2 = img9.getImage();
		player12 = img9.getImage();
		
		img10 = new ImageIcon("dice.gif");
		dice = img10.getImage();
		
		img11 = new ImageIcon("dice1.png");
		dice1 = img11.getImage();
		
		setLayout(null);
		
		b1=new JButton(img5);
		b1.setBounds(50,120,100,30);
		add(b1);
		b1.setBackground(new Color(4,129,255));
		
		b2=new JButton(img6);
		b2.setBounds(50,160,100,30);
		add(b2);
		b2.setBackground(new Color(4,129,255));
		
		
		tx1 = new JTextField("start Game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
	
		tx2 = new JTextField("player 1 name");
		tx2.setBounds(50,290,150,30);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		tx3 = new JTextField("player 2 name");
		tx3.setBounds(50,375,150,30);
		add(tx3);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
	
	    b3=new JButton("Roll");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red); 
		
		b4=new JButton(img7);
		b4.setBounds(20,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red); 
		
		b3.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e){
	int random = (int)Math.round(Math.random()*5+1);
	px=140;
	py=645;
		if(e.getSource()==b3){
		switch(random)
		{
			case 1:
			{
				img11 = new ImageIcon("dice1.png");
				px+=70;
				break;
			}case 2:
			{
				img11 = new ImageIcon("dice2.png");
				px+=140;
				break;
			}case 3:
			{
				img11 = new ImageIcon("dice3.png");
			px+=210;
			break;
			}case 4:
			{
				img11 = new ImageIcon("dice4.png");
			px+=280;
			break;
			}case 5:
			{
				img11 = new ImageIcon("dice5.png");
			px+=350;
			break;
			}case 6:
			{
				img11 = new ImageIcon("dice6.png");
			px+=420;
			break;
			}
			
		}
		dice1 = img11.getImage();
			repaint();
		
		}

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(new Color(4,129,255));
		g.fillRect(0,0,200,735);
		
		g.drawImage(swt,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,920,0,this);
		g.drawImage(start,20,550,this);
		g.drawImage(player1,px,py,this);
		g.drawImage(player2,120,620,this);
		
		g.drawImage(player11,20,280,this);
		g.drawImage(player12,20,360,this);
		
		g.drawImage(dice,20,410,this);
		g.drawImage(dice1,120,420,this);
		
		
	}
}

class Snake
{
	public static void main(String ar[]){
	FDemo f = new FDemo();
	f.setVisible(true);
	f.setBounds(200,100,990,735);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}
}









/*

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame{
	JPDemo jp1;
	FDemo(){
		super.setTitle("Snake & Ladder");
		jp1 = new JPDemo();
		add(jp1);
	}
}

class JPDemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11;
	Image swt,board,s1,start,player1,player2,player11,player12,dice,dice1;
	
	JButton b1,b2,b3,b4;
	
	JTextField tx1,tx2,tx3;
	
	int px1=40;
	int py1=620;
	JPDemo(){
		setBackground(Color.black);
		img1  =  new ImageIcon("swt.jpg");
		img2  =  new ImageIcon("board.jpg");
		img3  =  new ImageIcon("s1.png");
		img4  =  new ImageIcon("start.jpg");
		img5  =  new ImageIcon("about.gif");
		img6  =  new ImageIcon("reset.png");
		img7  =  new ImageIcon("start.gif");
		img8  =  new ImageIcon("player1.png");
		img9  =  new ImageIcon("player2.png");
		img10 =  new ImageIcon("dice.gif");
		img11 =  new ImageIcon("dice1.png");
	 
	    swt 	= img1.getImage();	
		board 	= img2.getImage();
		s1 		= img3.getImage();
		start 	= img4.getImage();
		player1 = img8.getImage();
		player2 = img9.getImage();
		
		dice 	= img10.getImage();
		dice1 	= img11.getImage();
	
		setLayout(null);
		
		b1 = new JButton(img5);
		b1.setBounds(50,120,100,30);
		 add(b1);
		b1.setBackground(new Color(4,129,255));
	
		b2 = new JButton(img6);
		b2.setBounds(50,180,100,30);
		 add(b2);
		b2.setBackground(new Color(4,129,255));
		
		Font f = new Font("Arial Black",Font.ITALIC,20);
		
		tx1 = new JTextField("start game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		
		
		tx2 = new JTextField("player 1 game");
		tx2.setBounds(50,290,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		
		tx3 = new JTextField("player 2 game");
		tx3.setBounds(50,375,150,35);
		add(tx3);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
		
		b3 = new JButton("Roll");
		b3.setBounds(50,500,100,30);
		 add(b3);
		b3.setBackground(new Color(4,129,255));
		b3.setFont(f);
		b3.setForeground(Color.red);
		b3.addActionListener(this);
	
		b4 = new JButton(img7);
		b4.setBounds(20,560,150,60);
		 add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(new Color(4,129,255));
		g.fillRect(0,0,200,735);
		
		g.drawImage(swt,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,920,0,this);
		g.drawImage(start,20,550,this);
		
		g.drawImage(player1,px1,py1,this);
		g.drawImage(player2,120,620,this);
		g.drawImage(player11,10,280,this);
		g.drawImage(player12,10,360,this);
		g.drawImage(dice,10,420,this);
		g.drawImage(dice1,110,430,this);
		
	}
	public void actionPerformed(ActionEvent e){
	if(e.getSource()==b3){
		int random = (int)Math.round(Math.random()*5+1);
		px1= 140;
		py1= 645;
	
		switch(random){
			case 1:
			{
				img11 = new ImageIcon("dice1.png");
				px1+=70;
				break;
			}case 2:
			{
				img11 = new ImageIcon("dice2.png");
				px1+=140;
				break;
			}case 3:
			{
				img11 = new ImageIcon("dice3.png");
				px1+=210;
				break;
			}case 4:
			{
				img11 = new ImageIcon("dice4.png");
				px1+=280;
				break;
			}case 5:
			{
				img11 = new ImageIcon("dice5.png");
				px1+=350;
				break;
			}
			case 6:
			{
				img11 = new ImageIcon("dice6.png");
				px1+=420;
				break;
			}
		}	
			dice1 = img11.getImage();
			repaint();
	}
}}
class Snake
{
	public static void main(String arg[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(200,100,990,735);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}}

*/