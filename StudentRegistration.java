package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		addBtn.setBounds(100, 200, 75,30);
		add(addBtn);
		addBtn.addActionListener((event)-> {
			JOptionPane.showMessageDialog(this, "Data from database fetched !");
			this.showData();
		});
	
		delBtn = new JButton("Delete");
		delBtn.setBounds(200, 200, 75, 30);
		add(delBtn);
		
	}
	
	public void showData() {
		Connection con;
		PreparedStatement pst;
		  ResultSet rs;
		  
		  String fname=null;
		  String lname=null;
		  int id=0;
		  int roll=0;
		  int marks=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentreg","root","");
			pst = con.prepareStatement("select * from registration");
			rs = pst.executeQuery();
			 while(rs.next()){
		         fname = rs.getString("first_name");
		         lname = rs.getString("last_name");
		         id = rs.getInt("id");
		         roll = rs.getInt("roll");
		        marks=rs.getInt("marks");
			 }
			 this.fNameTxt.setText(fname);
			 this.lNameTxt.setText(lname);
			 this.rollTxt.setText(Integer.toString(roll));
			
		}
		catch(Exception e) {
			
			
		}
		
	}
	
	
	
}
