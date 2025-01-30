import java.awt.*;
import java.awt.event.*;
class PLDDemo extends Frame implements ActionListener{
	TextField tx1,tx2;
	Button b1;
	PLDDemo(){
		Font f = new Font("Arial Black",Font.BOLD,40);
		setFont(f);
		setLayout(new FlowLayout());
		
		Label l = new Label("Enter number");
		add(l);
				
		tx1 = new TextField(10);
		add(tx1);
		
		b1 =new Button("Check No. :");
		add(b1);
		b1.addActionListener(this);
		
		tx2 = new TextField(20);
		add(tx2);
	}
	public void actionPerformed(ActionEvent e){
		String s1 = tx1.getText();
		int no = Integer.parseInt(s1);
		int temp = no;
		int r,s=0;
		while(no!=0){
			r = no%10;
			s = s*10+r;
			no = no/10;
		}
		if(s==temp){
			tx2.setText(" "+s1 + " is Palindrome");
		}
		else{
			tx2.setText(" "+s1 + " is not Palindrome");
		}
	}
}
class Demo7{
	public static void main(String Args[]){
		PLDDemo p =new PLDDemo();
		p.setVisible(true);
		p.setSize(450,400);
		p.setLocation(100,100);			
	}
}