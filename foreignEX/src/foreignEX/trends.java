package foreignEX;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class trends {
	public static void main(String[] args)
	{
		x obj = new x();
	}
}

class x extends JFrame
{
	public x()
	{
		JLabel l1 = new JLabel("Stock Market Trends    ");
		add(l1);
		JLabel l2 = new JLabel("---- 1USD = 71.65 INR----    " +
				               "---- 1EUR = 79.01 INR----    " +
				               "---- 1JPY = 0.66 INR-----     ");
		add(l2);
		JLabel l3 = new JLabel("YOUR CURRENT AMOUNT IS 65,000 INR");
		add(l3);
		JButton b1 = new JButton("buy stocks");
		add(b1);
		JButton b2 = new JButton("sell stocks");
		add(b2);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ev)
			{
				new buy();
				dispose();
			}
		});
		b2.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent el)
			{
				new sell();
				dispose();
			}
				});
	
		setLayout(new FlowLayout());
		setVisible(true);
	    setSize(400,400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}
}