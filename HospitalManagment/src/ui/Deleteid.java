package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import operations.*;

import classes.Emp;

public class Deleteid extends JFrame{
	JLabel jLabel1;
	JTextField field1;
	JButton button1, button2;
	
	public Deleteid() {
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("What your id");
		field1 = new JTextField(20);
		
		Emp emp = new Emp();
		button1 = new JButton("Delete");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				emp.setId(Integer.parseInt(field1.getText()));
				
				new EmpOperaImp().deletedata(emp);
				System.out.println("Deleted");
			}
		});
		
		button2 = new JButton("Home");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				
			}
		});
		
		add(jLabel1);
		add(field1);
		add(button1);
		add(button2);
		
		setVisible(true);
		setSize(400 , 400);
		
	}
}
