package ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import operations.*;

import classes.Emp;

public class Updatename extends JFrame {
	JLabel jLabel1, jLabel2;
	JTextField field1,field2;
	JButton button1, button2;
	
	public Updatename() {
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("what your id to Update your name");
		field1 = new JTextField(20);
		jLabel2 = new JLabel("Name");
		field2 = new JTextField(20);
		
		Emp emp = new Emp();
		button1 = new JButton("Update");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			emp.setId(Integer.parseInt(field1.getText()));
			emp.setName(field2.getText());
			
			new  EmpOperaImp().updatedata(emp);
		
			}
		});
		
		button2 = new JButton("Home");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Home();
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
