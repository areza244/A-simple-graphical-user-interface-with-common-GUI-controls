/*
Author: Amirreza Pazira 
UCID: 30133500 
Tutorial: 08

Version: 5-April-2021

Program: A simple graphical user interface with common GUI controls 

Features: Creates a simple user interface with one button - when button is pressed the button text changes and with each press
another JFrame window appears that contains the same non-default text contained in the button
*/
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyButtonListener implements ActionListener
{
	// Method for reacting to button press which takes the "ActionEvent e" as argument
    public void actionPerformed (ActionEvent e)
    {
    	// Creating a button same as the button on which the event occurred using casting and getSource()
	    JButton aButton = (JButton) e.getSource();
	    // Changing the button text when pressed
    	aButton.setText("Pressed!");
    	// Creating a new JFrame window with every press
    	JFrame mf = new JFrame ("Pressed!");
    	// Setting frame's close behaviour to DISPOSE_ON_CLOSE
    	mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	mf.setSize (350,300);
    	mf.setVisible(true);
    }
}
