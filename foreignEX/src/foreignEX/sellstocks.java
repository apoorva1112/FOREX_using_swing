package foreignEX;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class sellstocks {
	public static void main(String[] args)
	{
		sell obj = new sell();
	}
}

class sell extends JFrame
{
	public sell()
	{
		JLabel l1 = new JLabel("Select the currency you want to sell-  ");
		add(l1);
		JRadioButton r1 = new JRadioButton("USD");
		JRadioButton r2 = new JRadioButton("EUR");
		JRadioButton r3 = new JRadioButton("JPY");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		add(r1);
		add(r2);
		add(r3);
		JLabel l2 = new JLabel("enter the amount you want to sell");
		add(l2);
		JTextField t1 = new JTextField(15);
		add(t1);
		JButton b = new JButton("SELL");
		add(b);
		JLabel l3 = new JLabel("you sold stocks of ");
		add(l3);
		JLabel l4 = new JLabel("xxx");
		add(l4);
		b.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent ae)
			{
				if(r1.isSelected())
				{
					int amt = Integer.parseInt(t1.getText());
					amt = amt*71 ;
					l4.setText(amt + "INR");
				}
				if(r2.isSelected())
				{
					int amt = Integer.parseInt(t1.getText());
					amt = amt*79 ;
					l4.setText(amt + "INR");
				}
				if(r3.isSelected())
				{
					int amt = Integer.parseInt(t1.getText());
					amt = amt/2 ;
					l4.setText(amt + "INR");
				}
			}
				});
		
		setLayout(new FlowLayout());
		setVisible(true);
	    setSize(400,400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}