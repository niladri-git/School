package Tryit;

import java.applet.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dialog;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.util.*;
import java.io.BufferedWriter;

public class Runcommand3 {
	
  public static void main(String[] args) throws FileNotFoundException, IOException
  {
    //JApplet applet = new JApplet();
    //applet.init();

    final JFrame frame = new JFrame("Change Backlight");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    frame.add(panel);
    
    JTextField myTextField = new JTextField(10);
    // Your code, set size and position of textfield
    panel.add(myTextField);
    
    JButton button = new JButton("Click me to Run");
    button.setBounds(55,100,160,30);
    //panel.add(button);

    frame.setSize(260,180);
    frame.setVisible(true);
    //This is an Action Listener which reacts to clicking on the button
    button.addActionListener(new ButtonHandler());
  }
  
}

class ButtonHandler implements ActionListener{
	
    public void actionPerformed(ActionEvent event){
    	
    	double value = Double.parseDouble(
    			
    			JOptionPane.showInputDialog("please enter backlight value"));
                //File theFile = new File("thisfile.txt");
                //theFile.write(value);
                String command = "xbacklight -set " + value;
                try {
                	Runtime run = Runtime.getRuntime();
                	Process pr = run.exec(command);
                	} catch(IOException t) {
                		t.printStackTrace();
                	}
        }
}
