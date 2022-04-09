package ButtonsAndListeners;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestFontSize extends JFrame implements ActionListener{
	
	//initialising fontSize variable and labels/buttons
	
	int fontSize = 18;
	
	JLabel x, num;
	JButton inc, dec;
	
	public TestFontSize() {
		
		// adding labels and setting their properties

		x = new JLabel("X", JLabel.RIGHT);
		num = new JLabel(fontSize + "", JLabel.LEFT);
		
		inc = new JButton("Increase");
		dec = new JButton("Decrease");
		
		inc.setBackground(Color.white);
		dec.setBackground(Color.white);
		
		x.setFont(new Font("Serif", Font.PLAIN, fontSize));
		
		inc.setOpaque(true);
		dec.setOpaque(true);
		
		// layout for entire frame
		
		setLayout(new GridLayout(2,2));
		
		// panel layout for each button
		
		JPanel display1 = new JPanel(new GridLayout(2,1));
		JPanel display2 = new JPanel(new GridLayout(2,1));
		
		// adding labels/buttons/layouts to JFrame
		
		add(x);
		add(num);
		display1.add(inc);
		add(display1);
		display2.add(dec);
		add(display2);
		
		// button listener
		
		inc.addActionListener(this);
		dec.addActionListener(this);
	}

	public static void main(String[] args) {
		
		// JFrame Properties
		
		TestFontSize t = new TestFontSize();
		t.setSize(300, 150);
		t.setTitle("Font Size");
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		// Increase button functionality
		
		if(e.getSource()==inc) {
			fontSize += 1;
			num.setText(fontSize + "");
			x.setFont(new Font("Serif", Font.PLAIN, fontSize));
		}
		// Decrease button functionality
			
		if(e.getSource()==dec && fontSize > 0) {
			fontSize -= 1;
			num.setText(fontSize + "");
			x.setFont(new Font("Serif", Font.PLAIN, fontSize));
		}
	}

}
