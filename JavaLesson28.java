import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class JavaLesson28 extends JFrame{

	JButton button1, button2, button3, button4, button5;
	String outputString = "";
	
	public static void main(String[] args) {

		new JavaLesson28();





	}
	public JavaLesson28() {
		this.setSize(400,400);

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("My Seventh Frame");
		
		
		/* FLOW LAYOUT */
//		JPanel thePanel = new JPanel();
//		
//		thePanel.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
//		
//		button1 = new JButton("Button 1");
//		button2 = new JButton("Button 2");
//		
//		thePanel.add(button1);
//		thePanel.add(button2);
		
		
		/* BORDER LAYOUT */
//		JPanel thePanel = new JPanel();
//		
//		thePanel.setLayout(new BorderLayout());
//		
//		button1 = new JButton("Button 1");
//		button2 = new JButton("Button 2");
//		button3 = new JButton("Button 3");
//		button4 = new JButton("Button 4");
//		button5 = new JButton("Button 5");
//		
//		thePanel.add(button1,BorderLayout.NORTH);
//		thePanel.add(button2,BorderLayout.SOUTH);
//		thePanel.add(button3,BorderLayout.EAST);
//		thePanel.add(button4,BorderLayout.WEST);
//		thePanel.add(button5,BorderLayout.CENTER);
//		
//		JPanel thePanel2 = new JPanel();
//		
//		thePanel2.add(button1);
//		thePanel2.add(button2);
//		
//		thePanel.add(thePanel2,BorderLayout.NORTH);
		/* BOX LAYOUT */
		Box theBox = Box.createHorizontalBox();
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button1);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button2);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(Box.createRigidArea(new Dimension(30,20)));
		theBox.add(button3);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button4);
		
		
		this.add(theBox);

		this.setVisible(true);

		
		
		

	}

	

	}
	
		
	

