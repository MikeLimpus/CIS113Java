
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CounterPanel extends JPanel{
	
	// ************************************************************************
	// Declare GUI Objects
	// ************************************************************************
	
	private JButton increase, decrease;
	private JLabel labelNumber, labelInput;
	private JPanel panelValue, panelStyle, panelColor;
	
	private JTextField inputNumber;
	
	private JCheckBox bold, italic;
	
	private JRadioButton red, green, blue;
	
	private int counter;
	
	public CounterPanel()
	{
		counter = 0;
		
		// *****************************************************************
		// Define Buttons and Text Box Input
		// *****************************************************************
		
		increase = new JButton("Increase");
		decrease = new JButton("Decrease");
		
		ButtonListener listener = new ButtonListener();
		increase.addActionListener(listener); 
		decrease.addActionListener(listener);
		
		inputNumber = new JTextField(5);
		inputNumber.addActionListener(new InputListener());
		
		labelNumber = new JLabel("Counter Value: " + counter);
		labelNumber.setFont(new Font("Helvetica", Font.PLAIN, 12));
		labelNumber.setForeground(Color.white);
		
		labelInput = new JLabel("Please enter a number");
		labelInput.setForeground(Color.white);
		
		panelValue = new JPanel();
		panelValue.setPreferredSize(new Dimension(200, 60));
		panelValue.setBackground(Color.blue);
		
		panelValue.add(increase);
		panelValue.add(decrease);
		panelValue.add(labelInput);
		panelValue.add(inputNumber);
		
		// *******************************************************************
		// Define Check Boxes
		// *******************************************************************
		
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.green);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.green);
		
		StyleListener cbListener = new StyleListener();
		bold.addItemListener(cbListener);
		italic.addItemListener(cbListener);
		
		panelStyle = new JPanel();
		panelStyle.setPreferredSize(new Dimension(200, 40));
		panelStyle.setBackground(Color.green);
		
		panelStyle.add(bold);
		panelStyle.add(italic);
		
		// ****************************************************************
		// Define Radio Buttons
		// ****************************************************************
		
		red = new JRadioButton("Red");
		red.setBackground(Color.yellow);
		green = new JRadioButton("Green");
		green.setBackground(Color.yellow);
		blue = new JRadioButton("Blue");
		blue.setBackground(Color.yellow);
		
		ButtonGroup colorGroup = new ButtonGroup();
		colorGroup.add(red);
		colorGroup.add(green);
		colorGroup.add(blue);
		
		ColorListener rbListener = new ColorListener();
		red.addActionListener(rbListener);
		green.addActionListener(rbListener);
		blue.addActionListener(rbListener);
		
		panelColor = new JPanel();
		panelColor.setPreferredSize(new Dimension(200, 40));
		panelColor.setBackground(Color.yellow);
		
		panelColor.add(red);
		panelColor.add(green);
		panelColor.add(blue);
		
		
		// *****************************************************************
		// Establish final frame options
		// *****************************************************************
		
		setPreferredSize(new Dimension(200, 200));
		setBackground(Color.black);
		add(labelNumber);
		add(panelValue);
		add(panelStyle);
		add(panelColor);
		
		
	}
	
	// **********************************************************************************
	// Action Listeners (interactivity)
	// **********************************************************************************
	
	// ButtonListener
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			if(event.getSource() == increase)
			{
				counter++;
			}
			else
			{
				counter--;
			}
			labelNumber.setText("Counter Value: " + counter);
		}
	}
	
	//Textbox Listener
	private class InputListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String text = inputNumber.getText();
			
			counter = Integer.parseInt(text);
			labelNumber.setText("Counter Value: " + counter);
		}
	}
	
	// Checkbox Listener
	private class StyleListener implements ItemListener
	{
		public void itemStateChanged (ItemEvent event)
		{
			int style = Font.PLAIN;
			
			if(bold.isSelected())
				style += Font.BOLD;
			
			if(italic.isSelected())
				style += Font.ITALIC;
			
			labelNumber.setFont(new Font("Helvetica", style, 12));
		}
	}
	
	// Radio Button Listener
	private class ColorListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			Object source = event.getSource();
			
			if(source == red)
				labelNumber.setForeground(Color.red);
			else if(source == green)
				labelNumber.setForeground(Color.green);
			else if(source == blue)
				labelNumber.setForeground(Color.blue);
		}
	}
}


