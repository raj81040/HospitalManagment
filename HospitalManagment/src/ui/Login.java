package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import connection.Connect;

public class Login extends JFrame {
	JLabel jlabel1 , jlabel2;
	JTextField  field1 , field2;
	JButton button1 , button2;
	
	public Login (){
		setLayout(new FlowLayout());
		
		jlabel1 = new JLabel("username");
		jlabel2 = new JLabel("password");
		field1 = new JTextField(20);
		field2 = new JTextField(20);
		
		button1 = new JButton("submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet resultSet = Connect.getConnection()
							.prepareStatement("select * from login ").executeQuery();
					resultSet.next();
					String name = resultSet.getString(1);
					String password = resultSet.getString(2);
					
					if (field1.getText().equals(name) && field2.getText().equals(password)) {
						new Home();
						System.out.println("Logeed in");
					}else {
						System.out.println("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			};
		});
		
		button2 = new JButton("reset");
		button2.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Reset");
				
			}
			
		});
		
		add(jlabel1);
		add(field1);

		add(jlabel2);
		add(field2);

		add(button1);
		add(button2);

		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
	
}
