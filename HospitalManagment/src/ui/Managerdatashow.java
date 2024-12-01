package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Manager;
import operations.EmpOperaImp;

public class Managerdatashow extends JFrame{
	JLabel jLabel1;
	JButton button1 , button2;
	
	public Managerdatashow() {
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("show the data");
		
		Manager manager = new Manager();
		button1 = new JButton("click here ");
		button1.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmpOperaImp().Manashowdata(manager);
				
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
