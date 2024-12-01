package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import operations.EmpOperaImp;

import classes.Emp;

public class Doctorinsert extends JFrame{
	
	JLabel jLabel1,jLabel2;
	JTextField field1,field2;
	JButton button1,button2;
	
	public Doctorinsert() {
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("Name");
		field1 = new JTextField(20);
		jLabel2 = new JLabel("id");
		field2 = new JTextField(20);
		
		Emp emp = new Emp();
		button1 = new JButton("submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				emp.setName(field1.getText());
				emp.setId(Integer.parseInt(field2.getText()));
				
				new EmpOperaImp().insertdata(emp);		
				System.out.println("Inserted data");
			}
		});
		
		
		button2 = new JButton("Home");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				System.out.println("Home");
				
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
