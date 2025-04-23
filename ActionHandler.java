package BasicCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ActionHandler implements ActionListener {
	JTextField display;
	double num1,num2,result;
	char operator;
	boolean OperatorPress;

	public ActionHandler(JTextField display) {
		this.display=display;
		this.OperatorPress=false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String Command=e.getActionCommand();
		if(Command.charAt(0)>='0' && Command.charAt(0)<='9')
		{
			if(OperatorPress)
			{
				display.setText(Command);
				OperatorPress=false;
			}
			else
			{
				display.setText(display.getText()+Command);
			}
		}
		else if(Command.charAt(0)=='C')
		{
			display.setText("");
			num1=num2=result=0;
			OperatorPress=false;
		}
		else if(Command.charAt(0)=='=')
		{
			num2=Double.parseDouble(display.getText());
			switch(operator)
			{
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				if(num2!=0)
				{
					result=num1/num2;
				}
				else {
					display.setText("Error");
					return;
				}
				break;
			}
			display.setText(String.valueOf(result));
			OperatorPress=false;			
		}
		else 
		{
			if(!display.getText().isEmpty())
			{
				num1=Double.parseDouble(display.getText());
				operator=Command.charAt(0);
				OperatorPress=true;
			}
		}
	}
}
