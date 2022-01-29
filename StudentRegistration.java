package UI;

import javax.swing.*;

public class StudentRegistration extends JFrame {

	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 400;
	JLabel fnameLabel;
	JTextField fNameTxt;
	JLabel lnameLabel;
	JTextField lNameTxt;
	JLabel rollLabel;
	JTextField rollTxt;
	JButton addBtn;
	JButton delBtn;
	JButton updateBtn;
	JButton view;
	
	
	
	
	public StudentRegistration() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setTitle("Student Registration");
		setLayout(null);
		fnameLabel = new JLabel("First Name");
		fNameTxt = new JTextField(20);
		fnameLabel.setBounds(100,50,100,30);//setBounds(int x-coordinate, int y-coordinate, int width, int height)
		add(fnameLabel);
		fNameTxt.setBounds(175, 50, 100, 30);
		add(fNameTxt);
		
		lnameLabel = new JLabel("Last Name");
		lNameTxt = new JTextField(20);
		lnameLabel.setBounds(100,100,100,30);//setBounds(int x-coordinate, int y-coordinate, int width, int height)
		add(lnameLabel);
		lNameTxt.setBounds(175, 100, 100, 30);
		add(lNameTxt);
		
		rollLabel = new JLabel("Roll");
		rollTxt = new JTextField(20);
		rollLabel.setBounds(100,150,100,30);//setBounds(int x-coordinate, int y-coordinate, int width, int height)
		add(rollLabel);
		rollTxt.setBounds(175, 150, 100, 30);
		add(rollTxt);
		
		addBtn= new JButton("Add");
		addBtn.setBounds(200, 200, 75,30);
		add(addBtn);
		
	}
	
	
	
}
