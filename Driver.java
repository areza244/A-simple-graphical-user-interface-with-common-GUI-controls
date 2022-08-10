/*
Author: Amirreza Pazira 
UCID: 30133500 
Tutorial: 08

Version: 5-April-2021

Program: A simple graphical user interface with common GUI controls 

Features: Creates a simple user interface with one button - when button is pressed the button text changes and with each press
another JFrame window appears that contains the same non-default text contained in the button
*/
import javax.swing.JFrame;
import javax.swing.JButton;

public class Driver
{
     public static void main (String [] args)
     {
     	// Creating a new Frame and a new button with the text "Not pressed!"
        JFrame mf = new JFrame ("");
        JButton aButton = new JButton ("Not Pressed!");
        // Setting the window frame size
        mf.setSize (350,300);
        // Creating an MyButtonListener object to do stuff when the button is pressed
        MyButtonListener aButtonListener = new MyButtonListener();
        aButton.addActionListener(aButtonListener);
        // Setting frame's close behaviour to DISPOSE_ON_CLOSE
        mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Adding the button to the frame
        mf.add(aButton);
        // Setting the frame's visibility to true 
        mf.setVisible(true);
     }
}
