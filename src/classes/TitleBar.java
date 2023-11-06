package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{

	//Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(400, 80));
		//this.setBackground(Color.red);
		
		JLabel titleText = new JLabel("Tyson's To Do List"); //Make custom
		titleText.setPreferredSize(new Dimension(200, 80));
		titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}
