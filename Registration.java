package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(()->
		{
			var frame = new StudentRegistration();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		});

	}

}
