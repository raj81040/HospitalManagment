package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import classes.*;
import operations.EmpOperaImp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Managerinsert extends JFrame{
	JLabel jLabel1 , jLabel2;
	JTextField field1, field2;
	JButton button1 , button2;
	
	public Managerinsert() {
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("Manager Name ");
		field1  = new JTextField(20);
		
		jLabel2 = new JLabel("managar Id");
		field2 = new JTextField(20);
		
		button1 = new JButton("Submit");
		Manager manager = new Manager();
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				manager.setName(field1.getText());
				manager.setId(Integer.parseInt(field2.getText()));
				
				new EmpOperaImp().Manainsertdata(manager);
				
			}
		});
		
		button2 = new JButton("Home");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new  Home();
				
			}
		});
	
		add(jLabel1);
		add(field1);
		add(jLabel2);
		add(field2);
		add(button1);
		add(button2);
		
		setVisible(true);
		setSize(400 , 400);
		
	}
}
