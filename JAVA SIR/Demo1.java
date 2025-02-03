import java.awt.*;
import java.awt.event.*;
class CDemo extends Frame implements ActionListener{
	TextField t1,t2,t3;
	int k=0,x=100;
	Button b1[]=new Button[4];
	CDemo(){
		Font f = new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
		
		Label l1 = new Label("Enter First NO.");
		l1.setSize(250,50);
		l1.setLocation(100,100);
		add(l1);
		t1 = new TextField(20);
        t1.setSize(200,50);
		t1.setLocation(400,100);
		add(t1);
		
        Label l2 = new Label("Enter Second NO.");
		l2.setSize(250,50);
		l2.setLocation(100,200);
		add(l2);		
		t2 = new TextField(10);
        t2.setSize(200,60);
		t2.setLocation(400,200);
		add(t2);
		
		for(int i= 0; i<4;i++){
		if(i==0)b1[k] = new Button("+");
		if(i==1)b1[k] = new Button("-");
		if(i==2)b1[k] = new Button("X");
		if(i==3)b1[k] = new Button("/");
		
		b1[k].setSize(80,80);
		b1[k].setLocation(x,350);
		add(b1[k]);
		b1[k].addActionListener(this);
		x+=150; k++;
		}
		

		Label l3 = new Label("OUTPUT :");
		l3.setSize(200,50);
		l3.setLocation(100,500);
		add(l3);		
		t3 = new TextField(10); 
		t3.setSize(300,50);
		t3.setLocation(300,500);
		add(t3);
	}
	public void actionPerformed(ActionEvent e){
	Button b = (Button)e.getSource();
	String s1 = t1.getText();
	String s2 = t2.getText();
	String op = b.getLabel();
	int n1= Integer.parseInt(s1);
	int n2= Integer.parseInt(s2);
	if(op=="+"){
		t3.setText(""+(n1+n2));
	}
	if(op=="-"){
		t3.setText(""+(n1-n2));
	}
	if(op=="X"){
		t3.setText(""+(n1*n2));
	}if(op=="/"){
		t3.setText(""+(n1/n2));
	}
}
}
class Demo1{
	public static void main(String args[]){
		CDemo c  = new CDemo();
		c.setVisible(true);
		c.setSize(800,800);
		c.setLocation(100,100);
	}
}