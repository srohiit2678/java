import java.awt.*;
import java.awt.event.*;
class SDemo extends Frame implements ActionListener
{	Button b1;
	boolean b=false;
	SDemo(){
		Font f = new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		b1 = new Button("click");
		add(b1);
		b1.addActionListener(this);
	}
	public void paint(Graphics g){
		if(b){
			g.fillRect(100,100,100,100);
		}
	}
	public void actionPerformed(ActionEvent e){
		if(b1==e.getSource()){
			b=true;
			repaint();
		}
	}
}
class Demo2{
	public static void main(String args[]){
		SDemo s  = new SDemo();
		s.setVisible(true);
		s.setSize(800,800);
		s.setLocation(100,100);
	}
}