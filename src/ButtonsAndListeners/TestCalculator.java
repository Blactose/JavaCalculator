package ButtonsAndListeners;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestCalculator extends JFrame implements ActionListener{
	
	// QUICK NOTE: make sure to remember to add the gaps between frames for each button...
	// ...here and for each button on the TestFontSize class
	// also change the JPanel layout on the Calculator class
	
	// Initialising accumulator state variable and creating JButton/Label/Text variables
	
	double total = 0;
	JLabel calc;
	JTextField input;
	JButton clr, add, min, mul, div;
	
	// Adding JLabels, JButtons and JTextFields onto the JFrame
	
	public TestCalculator() {
		calc = new JLabel(total + "", JLabel.RIGHT);
		clr = new JButton("CLR");
		add = new JButton("+");
		min = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		input = new JTextField();
		
		calc.setFont(new Font("Lato", Font.PLAIN, 20));
		input.setFont(new Font("Lato", Font.PLAIN, 20));
		
		setLayout(new GridLayout(3,1));
		
		// Unique panel layout for JButtons
		
		JPanel display1 = new JPanel(new GridLayout(1,5));
		
		// Adding onto the JFrame
		
		add(calc);
		add(input);
		display1.add(clr);
		display1.add(add);
		display1.add(min);
		display1.add(mul);
		display1.add(div);
		add(display1);
		
		input.addActionListener(this);
		clr.addActionListener(this);
		add.addActionListener(this);
		min.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
	}
	
	// JFrame visibility
	
	public static void main(String[] args) {
		TestCalculator t = new TestCalculator();
		t.setSize(500, 300);
		t.setTitle("Calculator");
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

// JButton functionality
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clr) {
			total = 0;
			calc.setText(total + "");
			input.setText(null);
		}
		if(e.getSource() == add) {
			total = total + Double.valueOf(input.getText());;
			calc.setText(total + "");
			input.setText(null);
		}
		if(e.getSource() == min) {
			total = total - Double.valueOf(input.getText());;
			calc.setText(total + "");
			input.setText(null);
		}
		if(e.getSource() == mul) {
			total = total * Double.valueOf(input.getText());;
			calc.setText(total + "");
			input.setText(null);
		}
		if(e.getSource() == div) {
			total = total / Double.valueOf(input.getText());;
			calc.setText(total + "");
			input.setText(null);
		}
		
	}

}
