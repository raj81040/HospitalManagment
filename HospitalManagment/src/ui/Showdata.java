package ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import classes.Emp;
import operations.*;

public class Showdata extends JFrame {
	JLabel jLabel1;
	JButton button1 , button2;
	
	public Showdata() {
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("show the data");
		
		Emp emp = new Emp();
		button1 = new JButton("click here ");
		button1.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmpOperaImp().showdata(emp);
				
			}
		});
		
		button2 = new JButton("Home page");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				
			}
		});
		
		add(jLabel1);
		add(button1);
		add(button2);
		
		setVisible(true);
		setSize(400 , 400);
	}

	
}
