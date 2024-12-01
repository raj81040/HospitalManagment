package HomepageImage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.net.URL;

public class Homeimage extends JFrame{
	private JLabel imagejLabel;
	private JTextArea descriptionArea;
	
	public Homeimage() {
		setLayout(new FlowLayout());
		
	
       try {
    	   ImageIcon imageIcon = new ImageIcon("https://static.vecteezy.com/system/resources/previews/004/493/181/non_2x/hospital-building-for-healthcare-background-illustration-with-"
           		+ "ambulance-car-doctor-patient-nurses-and-medical-clinic-exterior-free-vector.jpg"); // Replace with your image path
           Image image = imageIcon.getImage(); 
           Image newImage = image.getScaledInstance(300, 200, Image.SCALE_SMOOTH); 
           imageIcon = new ImageIcon(newImage);
           
           imagejLabel = new JLabel(imageIcon);
           add(imagejLabel , BorderLayout.NORTH);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
        
        descriptionArea = new JTextArea("Welcome to our application!\nHere you can manage Doctors, Managers, and Staff.\nChoose an action from the menu above.");
        descriptionArea.setEditable(false); // Make it non-editable
        descriptionArea.setLineWrap(true); // Wrap text to fit in the area
        descriptionArea.setWrapStyleWord(true); // Wrap at word boundaries
        add(descriptionArea, BorderLayout.CENTER);
	}
	
}
