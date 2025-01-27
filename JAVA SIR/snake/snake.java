import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame{
JPDemo jp;
FDemo(){
jp = new JPDemo();
add(jp);
}
}
class JPDemo extends JPanel implements ActionListener,KeyListener{
	ImageIcon img1,img2,img3,img4;
	Image dot,head,food,main;
	int dots = 5;
	boolean sg = false;
	boolean left = false,right = true,up = false,down = false;
	int r1=0,r2=0;
	int x[] = new int[100];
	int y[] = new int[100];
JPDemo(){
	x[0] = 120;
	y[0] = 100;
	x[1] = 100;
	y[1] = 100;
	x[2] = 80;
	y[2] = 100;
	x[3] = 60;
	y[3] = 100;
	x[4] = 40;
	y[4] = 100;
	
	setLayout(null);
	setBackground(Color.black);
	img1 = new ImageIcon("dot.png");
	dot = img1.getImage();
	img2 = new ImageIcon("head2.png");
	head = img2.getImage();
	img3 = new ImageIcon("food.png");
	food = img3.getImage();
	img4 = new ImageIcon("main.jpg");
	main = img4.getImage();
	
	Timer t = new Timer(200,this);
	t.start();
	addKeyListener(this);
	setFocusable(true);
	random();
}
void random(){
	r1 = (int)Math.round(Math.random()*45+1);
	r1=r1*20;
	r2 = (int)Math.round(Math.random()*45+1);
	r2=r2*20;
}
public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.drawImage(main,0,0,this);
    g.drawImage(food,r1,r2,this);
	for(int i=0;i<dots;i++){ 
	if(i==0){
	g.drawImage(head,x[i],y[i],this);
	}
	else{
	g.drawImage(dot,x[i],y[i],this);
	}
	}
}
public void actionPerformed(ActionEvent e){
	if(x[0] == r1 && y[0] == r2){
		dots++;
		random();
	}
	if(sg){
	for(int i=dots;i>0;i--){
	x[i] = x[i-1];
	y[i] = y[i-1];
	}
	if(right){
	x[0] = x[0]+20;
	}
	if(left){
	x[0] = x[0]-20;
	}
	if(up){
	y[0] = y[0]-20;
	}
	if(down){
	y[0] = y[0]+20;
	}
	
	}
	repaint();
}
public void keyPressed(KeyEvent e){
	sg = true;
	if(e.getKeyCode()==KeyEvent.VK_LEFT){
	left = true;
	right =false;
	up = false;
	down = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT){
	left = false;
	right =true;
	up = false;
	down = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_UP){
	left = false;
	right =false;
	up = true;
	down = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_DOWN){
	left = false;
	right =false;
	up = false;
	down = true;
	}
	
	
}
public void keyReleased(KeyEvent e){
}
public void keyTyped(KeyEvent e){
}
}
class Snake{
public static void main (String args[]){
FDemo f = new FDemo();
f.setVisible(true);
f.setSize(1600,1800);
f.setLocation(150,0);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}