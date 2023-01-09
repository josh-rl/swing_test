package app;

import java.io.*;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
    	JFrame frame = new JFrame();
    	JButton btn = new JButton("Click Me!");
    	// x axis, y axis, width, height
    	btn.setBounds(150, 200, 220, 50);
    	frame.add(btn);
    	frame.setSize(500, 600);
    	frame.setLayout(null);
    	frame.setVisible(true);
    }
}
