import javax.swing.JOptionPane;
class Adder
{
	public static void main(String[] args) 
	{
		String firstNum,secondNum;
		double num1, num2, sum=0;
		firstNum = JOptionPane.showInputDialog("Input number 1 : ");
		secondNum = JOptionPane.showInputDialog("Input number 2 : ");
		num1 = Double.parseDouble( firstNum );
		num2 = Double.parseDouble( secondNum );
		JOptionPane.showMessageDialog( null, sum=num1+num2, "Adder", JOptionPane.INFORMATION_MESSAGE );
	}
}
