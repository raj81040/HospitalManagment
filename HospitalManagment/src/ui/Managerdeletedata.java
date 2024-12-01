package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import classes.*;
import operations.EmpOperaImp;

public class Managerdeletedata extends JFrame{
	JLabel jLabel;
	JTextField field;
	JButton button , button2;
	
	public Managerdeletedata() {
		setLayout(new FlowLayout());
		jLabel = new JLabel("Id you want to delete");
		field = new JTextField(20);
		
		Manager manager = new Manager();
		button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				manager.setId(Integer.parseInt(field.getText()));
				new EmpOperaImp().Manadeletedata(manager);
				
			}
		});
		button2 = new JButton("Home");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				
			}
		});
		
		add(jLabel);
		add(field);
		add(button);
		add(button2);
		
		setVisible(true);
		setSize(400 , 400);
	}
}
