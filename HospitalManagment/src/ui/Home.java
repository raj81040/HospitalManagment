package ui;			

import java.awt.FlowLayout;
import HomepageImage.*;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.net.URL;

public class Home  extends JFrame{
	JMenuBar bar;
	JMenu jMenu1 , jMenu2 ,jMenu3;
	JMenuItem item1, item2 , item3 , item4 ,item5 ,item6 , item7 ,item8 , item9;
	
	public Home() {
		setLayout(new FlowLayout());
		
		bar = new JMenuBar();
		bar.setBounds(0, 0, 300, 400);
		
		jMenu1 = new JMenu("Doctor");
		jMenu2 = new JMenu("Manager");
		jMenu3 = new JMenu("Staff");
		
		item1 = new JMenuItem("Doctor Insert");
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Doctorinsert();				
			}
		});
		
		item2 =  new JMenuItem("Delete id");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Deleteid();
				
			}
		});
		
		item3 = new JMenuItem("Update name with id");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Updatename();
				
			}
		});
		
		item4 = new JMenuItem("Show data");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Showdata();
				
			}
		});
		
		item5 = new JMenuItem("Manager insertdata");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Managerinsert();
				
			}
		});
		
		item6 = new JMenuItem("Manager delete id");
		item6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Managerdeletedata();
				
			}
		});
		item7 = new JMenuItem("Show data");
		item7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Managerdatashow();
				
			}
		});
		
		item8 = new JMenuItem("Insert staff data");
		item8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Insertstaffdata();
				
			}
		});
		
		
		item9 = new JMenuItem("Delete staff id");
		item8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new deletestaffid();
				
			}
		});
		
		jMenu1.add(item1);
		jMenu1.add(item2);
		jMenu1.add(item3);
		jMenu1.add(item4);
		
		jMenu2.add(item5);
		jMenu2.add(item6);
		jMenu2.add(item7);
		
		jMenu3.add(item8);
		jMenu3.add(item9);
		
		bar.add(jMenu1);
		bar.add(jMenu2);
		bar.add(jMenu3);
		
		setJMenuBar(bar);
		
		
		Homeimage homeimage = new Homeimage();
		add(homeimage.getContentPane());
		
		
		setSize(400 , 400);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Home();
	}
}
