package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{

	private JButton addTask;
	private JButton clear;
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	//Constructor
	ButtonPanel(){
		this.setPreferredSize(new Dimension(400, 60));
		Color custom = new Color(245, 153, 66);
		this.setBackground(custom);
		
		Color buttonColor = new Color(181, 136, 94);
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif",Font.PLAIN, 22));
		addTask.setBackground(buttonColor);
		
		this.add(addTask);
		
		this.add(Box.createHorizontalStrut(20)); //Adds gap between 2 buttons
		
		clear = new JButton("Clear Completed Tasks");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif",Font.PLAIN, 22));
		clear.setBackground(buttonColor);
		
		this.add(clear);
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
}
