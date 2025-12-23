import java.awt.Dimension;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;
public class JavaLesson21 extends JFrame{
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;

	public static void main(String[] args) {




		new JavaLesson21();

	}

	public JavaLesson21() {
		this.setSize(400, 400);

		Toolkit tk = Toolkit.getDefaultToolkit();

		Dimension dim = tk.getScreenSize();

		int xPos = (dim.width/2) - (this.getWidth() / 2);
		int yPos = (dim.height/2) - (this.getHeight() / 2);

		this.setLocation(xPos, yPos);

		this.setResizable(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("My Second Frame");


		JPanel thePanel = new JPanel();

		button1 = new JButton("Click Here");

		ListenForButton lForButton = new ListenForButton();

		button1.addActionListener(lForButton);

		thePanel.add(button1);

		textField1 = new JTextField("", 15);

		thePanel.add(textField1);

		ListenForKeys lForKeys = new ListenForKeys();
		
		
		textField1.addKeyListener(lForKeys);
		
		
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		
		this.addWindowListener(lForWindow);
		
		this.setVisible(true);
		
		ListenForMouse lForMouse = new ListenForMouse();
		
		thePanel.addMouseListener(lForMouse);
		
		ListenForFocus lForFocus = new ListenForFocus();
		
		thePanel.addFocusListener(lForFocus);

		textArea1 = new JTextArea(15,20);


//		textArea1.setText("Just a whole bunch of text that is important\n");

		textArea1.setLineWrap(true);

		textArea1.setWrapStyleWord(true);

		thePanel.add(textArea1);

		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		thePanel.add(scrollbar1);

		this.add(thePanel);
		
		textField1.addFocusListener(lForFocus);
		textArea1.addFocusListener(lForFocus);

	}


	private class ListenForButton implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				buttonClicked++;
				
				textArea1.append("Button Clicked " + buttonClicked + " times\n");
			}
		}	
	}
	
	private class ListenForKeys implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			textArea1.append("Key Hit " + e.getKeyChar() + "\n" );
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	private class ListenForWindow implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			textArea1.append("Window Created\n");
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			textArea1.append("Window is Closing\n");
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.append("Window is minimized\n");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			textArea1.append("Window in Normal State\n");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			textArea1.append("Window is Active\n");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Window is Not Active\n");
			
		}
		
	}
	private class ListenForMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel pos: " + e.getX() + " " + e.getY()+ "\n");
			textArea1.append("Mouse Screen pos: " + e.getXOnScreen() + " " + e.getYOnScreen()+ "\n");
			textArea1.append("Mouse Button: " + e.getButton() + "\n");
			textArea1.append("Mouse Clicks: " + e.getClickCount() + "\n");

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	private class ListenForFocus implements FocusListener{
		
		@Override
		public void focusGained(FocusEvent e) {
	        if (e.getSource() == textField1) {
	            textField1.setText("TextField focus aldı.");
	        } else if (e.getSource() == textArea1) {
	            textArea1.setText("TextArea focus aldı.");
	        }
	    }

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}

