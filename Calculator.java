package BasicCalculator;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame 
{
	JTextField display;
	ButtonPannel buttonpannel;
	ActionHandler actionHandler;
	
	public Calculator(){
		setLayout(new BorderLayout());
		display=new JTextField();
		display.setEditable(false);
		display.setFont(new Font("Arial",Font.BOLD,30));
		add(display,BorderLayout.NORTH);
		actionHandler=new ActionHandler(display);
		buttonpannel=new ButtonPannel(actionHandler);
		add(buttonpannel,BorderLayout.CENTER);
		
		setTitle("Calculator");
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
