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
		Color custom = new Color(245, 153, 66);
		this.setBackground(custom);
		
		JLabel titleText = new JLabel("Tyson's ToDos");
		titleText.setPreferredSize(new Dimension(300, 80));
		titleText.setFont(new Font("Sans-serif", Font.BOLD, 30));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}
