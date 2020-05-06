package foreignEX;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.applet.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Login {
	public static void main(String[] args)
	{
		lpage obj = new lpage();
		
	}

}
class lpage extends JFrame 

{
	JLabel l1;
	JLabel l2;
	JTextField t1;
	JLabel l3;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;
	//JRadioButton r1,r2;
	//JCheckBox c1,c2;
	public lpage()
	{
		l1 = new JLabel("WELCOME TO FOREX ONLINE PLATFORM                                     ");
		//l1.setBounds(234, 104, 200, 200);
		l2 = new JLabel("Username-    ");
		//l2.setBounds(81, 64, 60, 60);
		t1 = new JTextField(15);
		l3 = new JLabel("password-    ");
		//l3.setEchoChar("*");
		t2 = new JTextField(15);
		b1 = new JButton("submit");
		b2 = new JButton("forgetpassword");
		b3 = new JButton("newuser signup");
		
		//r1 = new JRadioButton("male");
		//r2 = new JRadioButton("female");
		
		//ButtonGroup bg = new ButtonGroup();
		//bg.add(r1);
		//bg.add(r2);
		//c1 = new JCheckBox("dancing");
		//c2 = new JCheckBox("singing");
		
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		
		/*c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				System.out.println("dancer");
			}
		});*/
		
		
		b1.addActionListener(ae -> 
			{
				String name = t1.getText();
				String pw = t2.getText();
				
				if(name.equals("Apoorva") && pw.equals("abc"))
				{
					new x();
					dispose();
				}
				
				/*if(c1.isSelected())
				{
					name = name + "dancer";
				}
				else
				{
					name = name +"singer";
				}
				
				l.setText(name);
				
				*/
			}
		);
		
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " , " + y);
				
			}
	    
		
		});
		
		
		//setBackGround(Color.darkGray);
		setLayout(new FlowLayout());
		setVisible(true);
	    setSize(800,800);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	}
	
}