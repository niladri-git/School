package Tryit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class JTextFieldDemo extends JFrame {

	JButton button = new JButton("Click me to Run");
	JTextField jtfText1 = new JTextField(10);
	
	public JTextFieldDemo() {
		
		super("TextField Test Demo");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		container.add(jtfText1);
		
	    button.setBounds(55,100,160,30);
	    container.add(button);	  

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String text = jtfText1.getText();
				jtfText1.setText("");
				
				FileWriter fWriter = null;
		        BufferedWriter writer = null;
		        
		        try {
		        	
		            fWriter = new FileWriter("text.txt");
		            writer = new BufferedWriter(fWriter);
		            writer.write(text);
		            writer.newLine();
		            writer.close();
		            System.err.println("Your input of " + text.length() + " characters was saved.");
		            
		          } catch (Exception e) {
		              System.out.println("Error!");
		          }
		        
		   }
		});
	    
		setSize(325, 100);
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		
		JTextFieldDemo test = new JTextFieldDemo();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 
		final JFrame frame = new JFrame("Change Backlight");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
	    panel.setLayout(new FlowLayout());
	    frame.add(panel);
	    
		JTextField myTextField = new JTextField(10);
		panel.add(myTextField);
		
		JButton button = new JButton("Click me to Run");
	    button.setBounds(55,100,160,30);
	    panel.add(button);
	    
	    frame.setSize(260,180);
	    frame.setVisible(true);
	    
	    */
		
	}
	
}