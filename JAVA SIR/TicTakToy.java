import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class FDemo extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
	int count = 1;
	FDemo(){
		Font f1 = new Font("Brush Script MT",Font.ITALIC,50);
		setFont(f1);
		setLayout(null);
		b1 = new Button();
		b1.setSize(100,100);
		b1.setLocation(100,100);
		add(b1);
		b1.addActionListener(this);
		
		b2 = new Button();
		b2.setSize(100,100);
		b2.setLocation(200,100);
		add(b2);
		b2.addActionListener(this);
		
		b3 = new Button();
		b3.setSize(100,100);
		b3.setLocation(300,100);
		add(b3);
		b3.addActionListener(this);
		
		b4 = new Button();
		b4.setSize(100,100);
		b4.setLocation(100,200);
		add(b4);
		b4.addActionListener(this);
	
		b5 = new Button();
		b5.setSize(100,100);
		b5.setLocation(200,200);
		add(b5);
		b5.addActionListener(this);
	
		b6 = new Button();
		b6.setSize(100,100);
		b6.setLocation(300,200);
		add(b6);
		b6.addActionListener(this);
	
		b7 = new Button();
		b7.setSize(100,100);
		b7.setLocation(100,300);
		add(b7);
		b7.addActionListener(this);
	
		b8 = new Button();
		b8.setSize(100,100);
		b8.setLocation(200,300);
		add(b8);
		b8.addActionListener(this);
	
		b9 = new Button();
		b9.setSize(100,100);
		b9.setLocation(300,300);
		add(b9);
		b9.addActionListener(this);
	}
	public void	actionPerformed(ActionEvent e){
				
			
			if(e.getSource()==b1){
				if(c1==0){c1++;	
				if(count%2==1){
					count++; 
					b1.setLabel("O");
				}
				else{
					count++;
					b1.setLabel("X");
					}
			}}
			
			
			if(e.getSource()==b2){
				if(c2==0){c2++;
				if(count%2==1){
					count++; 
					b2.setLabel("O");
				}
				else{
					count++; 
					b2.setLabel("X");
				}
			}}
			
			
			if(e.getSource()==b3){
				if(c3==0){c3++;
				if(count%2==1){
					count++;
					b3.setLabel("O");
					}
				else{
					count++; 
				b3.setLabel("X");
				}
			}}
			
			if(e.getSource()==b4){
			if(c4==0){c4++;
			if(count%2==1){
					count++;
					b4.setLabel("O");
					}
				else{
					count++;
					b4.setLabel("X");
					}
			}}
			
			if(e.getSource()==b5){
			if(c5==0){c5++;		
		   if(count%2==1){
				count++; 
				b5.setLabel("O");
				}
				else{
					count++;
					b5.setLabel("X");
					}
			}}
			
			if(e.getSource()==b6){
			if(c6==0){c6++;
				if(count%2==1){count++; 
				b6.setLabel("O");
				}
				else{count++; 
				b6.setLabel("X");}
			}}
			
			if(e.getSource()==b7){
			if(c7==0){c7++;
			
			if(count%2==1){count++; 
				b7.setLabel("O");
				}
				else{count++; 
				b7.setLabel("X");}
			}}
			
			
			if(e.getSource()==b8){
			if(c8==0){c8++;			
			if(count%2==1){count++; 
				b8.setLabel("O");
				System.out.println(b8.getLabel());
				}
				else{count++; 
				b8.setLabel("X");
				System.out.println(b8.getLabel());
				}
			}}
			
			
			if(e.getSource()==b9){
				if(c9==0){c9++;
				if(count%2==1){count++; 
				b9.setLabel("O");
				}
				else{count++; 
				b9.setLabel("X");
				}
			}}
			
}}
class TicTakToy
{
	public static void main(String args[]){
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocation(50,50);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}