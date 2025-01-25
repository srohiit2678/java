import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*; 

class FDemo extends Frame implements ActionListener{
	Button b1,b2,b3;
	FDemo(){
		Font f = new Font("Brush Script MT",Font.ITALIC,30);
		setFont(f);
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		b1 = new Button("RRR");
		add(b1);
		 b2 = new Button("GGG");
		add(b2);
		b3 = new Button("BBB");
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){setBackground(Color.red);}
		if(e.getSource()==b2){setBackground(Color.green);}
		if(e.getSource()==b3){setBackground(Color.blue);}
	}
	}
class Demo11111{
	public static void main(String []args){
	FDemo f = new FDemo();
	f.setVisible(true);
	f.setSize(500,500);
	f.setLocation(50,50);
	f.setBackground(Color.black);
	f.setForeground(Color.white);
	
}
	
}
/*

FDemo(){
		Font f1 = new Font("Arial Black",Font.BOLD,30);
		setFont(f1);
		
		setTitle("Login page");
		
	//	FlowLayout fl = new FlowLayout();
		setLayout(null);
		
		Label un = new Label("Enter Naame :");
		un.setSize(310,50);
		un.setLocation(300,100);
		add(un);
		
		TextField tx1 = new TextField(10);
		tx1.setSize(210,50);
		tx1.setLocation(650,100);
		add(tx1);
		
		Label up = new Label("Enter pass  :");
		up.setSize(310,50);
		up.setLocation(300,200);
		add(up);
		
		TextField tx2 = new TextField(10);
		tx2.setSize(210,50);
		tx2.setLocation(650,200);
		tx2.setEchoChar('*');
		add(tx2);
		
		Button b1 = new Button("Login");
		b1.setSize(100,50);
		b1.setLocation(550,300);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);	
		
		setResizable(false);
		
	}
	public void paint(Graphics g){
		g.drawRect(50,50,220,250);
		
		g.drawOval(110,60,100,100);
		
		g.drawRoundRect(70,190,180,90,40,40);
	}
	


*/


/*

FDemo(){
		
		Font rf = new Font("Arial Black",Font.BOLD,30);
		setFont(rf);
		
		
		
		setTitle("LogIN Page");
		
		setLayout(null);
		
		Label en = new Label("Enter Name :");
		en.setSize(200,50);
		en.setLocation(100,100);
		add(en);
	
		TextField tx1 = new TextField(10);
		tx1.setSize(200,50);
		tx1.setLocation(300,100);
		add(tx1);
	
		Label ep = new Label("Enter Pass :");
		ep.setSize(200,50);
		ep.setLocation(100,200);
		add(ep);
	
		TextField tx2 = new TextField(10);
		tx2.setSize(200,50);
		tx2.setLocation(300,200);
		tx2.setEchoChar('*');
		add(tx2);
	
		Button b1 = new Button("Login");
		b1.setSize(250,50);
		b1.setLocation(200,300);
		b1.setBackground(Color.black);	
	    b1.setForeground(Color.white);
		add(b1);
		
		setResizable(false);
	
	
	}
*/




/*

		public void paint(Graphics g){
			int i,j;
			int x=100,y=100;
			int r1,g1,b1;		
			for(i=1;i<=10;i++){
				g.drawString(""+i+" = ",x-50,y);
				for(j=1;j<=10;j++){
				
				try{Thread.sleep(50);}catch(Exception e){}
					
				r1 = (int) Math.round(Math.random()*255);
				g1 = (int) Math.round(Math.random()*255);
				b1 = (int) Math.round(Math.random()*255);

				
				Color c1 = new Color(r1,g1,b1); 
				g.setColor(c1);
				g.drawString(""+i*j,x,y);
				x+=50;
			}
			x=100;
			y+=50;
			}
		}
	

*/


/*
	
	
	
public void paint(Graphics g){
	Color c1 = new Color(255,127,39);
    g.setColor(c1);
	g.fillRect(300,200,400,100);
	
	Color c2 = new Color(255,255,255);
    g.setColor(c2);
	g.fillRect(300,300,400,100);
	
	Color c3 = new Color(10,102,12);
    g.setColor(c3);
	g.fillRect(300,400,400,100);
	for(int i = 0;i<=360;i+=15){
	
		Color c41 = new Color(35,41,115);
        g.setColor(c41);
		g.drawArc(450,305,90,90,i,7);

		Color c4 = new Color(35,41,115);
		g.setColor(c4);
		g.fillArc(450,305,90,90,i,7);

	
	
	}

	
	Color c5 = new Color(120,120,120);
	g.setColor(c5);
    g.fillRect(280,200,20,660);
	
	Color c6 = new Color(255,127,39);
	g.setColor(c6);
	g.fillRect(180,860,220,20);	
	
	Color c7 = new Color(255,255,255);
	g.setColor(c7);
	g.fillRect(160,880,260,20);	
	
	Color c8 = new Color(10,102,12);
	g.setColor(c8);
	g.fillRect(140,900,300,20);	
	
	Color c9 = new Color(255,215,0);
	g.setColor(c9);
	g.fillOval(276,170,30,35);
    
	Color c10 = new Color(255,127,39);
	g.setColor(c10);
	g.drawArc(220,200,150,150,90,180);
	 
	Color c11 = new Color(255,127,39);
	g.setColor(c11);
	g.drawArc(220,350,150,150,90,-180);

    Color c12 = new Color(255,255,255);
	g.setColor(c12);
	g.drawArc(220,500,150,150,90,180);

	
	Color c13 = new Color(255,255,255);
	g.setColor(c13);
	g.drawArc(220,650,150,150,90,-180);

	Color c14 = new Color(10,102,12);
	g.setColor(c14);
	g.drawArc(220,800,150,150,90,180);
	
	//emoji
	
	Color c15 = new Color(166,0,26);
	g.setColor(c15);
	g.fillArc(550,650,200,200,0,360);
	
	Color c17 = new Color(255,255,255);
	g.setColor(c17);
	g.drawOval(600,700,20,20);
	Color c18 = new Color(255,255,255);
	g.setColor(c18);
	g.drawOval(685,700,20,20);
	g.drawLine(650,740,650,770);
	g.drawArc(550,615,200,200,230,80);
	
	
	
	
	Color c16 = new Color(255,242,0);
	g.setColor(c16);
	g.fillArc(800,650,200,200,0,360);


	Color c19 = new Color(0,0,0);
	g.setColor(c19);
	g.drawOval(840,700,20,20);
	Color c20 = new Color(0,0,0);
	g.setColor(c20);
	g.drawOval(930,700,20,20);
	g.drawLine(900,740,900,770);
	g.drawArc(800,615,200,200,230,80);
	
	
	Color c21 = new Color(255,255,255);
	g.setColor(c21);
	
	g.drawString("JAI HIND",750,350);
	}
	

*/


/*

	// 0832IT221052
	// Cdgi@2024#
public void paint(Graphics g){
		g.drawString("krishna_Ji",900,55);
		g.drawRoundRect(50,50,800,550,40,40);
		
		g.drawLine(350,70,600,70);
		g.drawString("--->  INTRODUCTION  <---",400,85);
		g.drawLine(350,90,600,90);
		g.drawString("Good Evening All... ",75,120);
		g.drawString("My name is ROHIT KUMAR OJHA and my father's name is MR. SHREE GOPAL OJHA and he is FARMER. AND MY mother's name is ",90,150);
        g.drawString("Mrs. ANITA OJHA and she is house wife. i have completed my 10th & 12th from RAJASTHAN BOARD. curently i am pursuing my ba - ",90,170)  ;
		g.drawString("chelor's DEGREE in INFORMATION TECHNOLOGY. i have maintained my CGPA more than 7.0. i continuously strive to enhance my ",90,190);
		g.drawString("proficiency in programming. my favorate programming language is JAVA. and i also have good knowladge of c/c++ and DSA ",90,210);
		g.drawString("my goal is to become a DEVELOPER at big MNC company. my HOBBIES are playing CRICKET and BADMINTON, ",110,240);
		g.drawLine(300,270,650,270);
		g.drawString("--->  THANK YOU FOR LISTENING  <---",350,285);
		g.drawLine(300,290,650,290);
	
		g.drawRect(100,320,700,250);
		g.drawRect(120,340,670,210);
		g.drawRect(140,360,640,160);
		g.drawRect(160,380,610,110);
		g.drawRect(180,400,570,60);
		g.drawString("RADHE   RADHE   RADHE   RADHE",350,435);
	 
	}
*/


/*
int n,sum=0;
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(i);
	System.out.println("enter no..");
	String s = br.readLine();
	StringTokenizer st = new StringTokenizer(s);
	          // st.countTokens()= return number of tokens present
			  n=st.countTokens();
			//  for(int j=1;j<=n;j++){
			 while(st.hasMoreTokens()){
			  sum=sum+Integer.parseInt(st.nextToken());
			  }
			System.out.println("sum"+sum);	
	
*/





/*
{
    InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(i);
	System.out.println("enter digit string");
	String s1 = br.readLine(); 
	System.out.println("enter digit string");
	String s2 = 4 br.readLine();
	int x = Integer.parseInt(s1);
	int y = Integer.parseInt(s2);

	System.out.println(s1);


*/

	/*
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		System.out.println("enter char");
		char x =(char)br.read();
		System.out.println("char = "+x);
	*/
	
	
	
	/*
		Demo dm = new Demo(); //class in same folder
		int i,j,n=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				while(dm.prime(n)==0)n++;
				System.out.print(n++);
			}
			System.out.println();
		}
	}	
	}
	*/
		
		/*
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		System.out.println("Enter name:");
		String s1 = br.readLine();
		System.out.println("Enter G:");
	    char g =(char)br.read();
		 //  br.readLine();   //working
		//   clearBuffer(br); //error
		//   br.reset();      // error
		//   br.skip(1);      // not working
		//   flushBuffer(br); // not working
		System.out.println("Enter address:");
		String s2 = br.readLine();
		
		System.out.println("Name="+s1);
		System.out.println("G="+g);
		System.out.println("address="+s2);
 	*/
	
	
	
		
/*

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table no. :");
			int x = sc.nextInt();
		
		// particular no table
		for(int i =1;i<=10;i++){
			System.out.println(x+" x "+i+" = "+(x*i));
		}
			System.out.print("Enter the number up to you wants table :");
			int y = sc.nextInt();
			
	// 1 to y table
		for(int i=1;i<=y;i++)
		{
			for(int j=1;j<=10;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}


*/	
	
	
	//System.out.println("softwaves indore \rSOFTWAVES");
	//System.out.println("jaishreeram\rSOFTWAVES");
	
	//	System.out.println(Double.MIN_VALUE);
	//	System.out.println(Double.MAX_VALUE);
	//	System.out.println(Float.MIN_VALUE);
	//	System.out.println(Float.MAX_VALUE);

	//	System.out.print("softwaves indore SOFTWAVES");
	//	System.out.println(" softwaves indore \rsoftwavesss");
	
	
	
	
	

	/*
	for(int x=1;x<=11;x++){
		for(k=1;k<x;k++){
			System.out.print(" ");
		}
		for(int j=1;j<=12-x;j++){
			if(x==1 || j==1 || j==(12-x)){
				System.out.print("x ");
			}
			else{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	*/