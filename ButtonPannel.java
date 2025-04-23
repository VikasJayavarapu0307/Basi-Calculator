package BasicCalculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonPannel extends JPanel {

	JButton[] numberButtons;
	JButton add,subract,multiply,divide,clear,equals;
	ActionHandler actionHandler;
	
	public ButtonPannel(ActionHandler actionHandler) 
	{
		this.actionHandler=actionHandler;
		setLayout(new GridLayout(4,4,5,5));
		numberButtons=new JButton[10];
		for(int i=0;i<10;i++)
		{
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].setFont(new Font("Arial",Font.BOLD,15));
			numberButtons[i].setPreferredSize(new Dimension(40,40));
			numberButtons[i].addActionListener(actionHandler);
			add(numberButtons[i]);
		}
		
		add=new JButton("+");
		subract=new JButton("-");
		multiply=new JButton("*");
		divide=new JButton("/");
		clear=new JButton("C");
		equals=new JButton("=");
		JButton[] operations= {add,subract,multiply,divide,clear,equals};
		for(JButton bt:operations) {
			bt.setFont(new Font("Arial",Font.BOLD,15));
			bt.setPreferredSize(new Dimension(40,40));
			bt.addActionListener(actionHandler);
			add(bt);
		}
	}
}
