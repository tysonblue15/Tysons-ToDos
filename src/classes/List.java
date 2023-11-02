package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{

	//Constructor
	List(){
		GridLayout layout = new GridLayout(10,1); //10 rows, 1 column
		layout.setVgap(5);
		
		this.setLayout(layout);
		//this.setBackground(Color.blue);
	}
	
	public void removeTasks() {
		Component[] listItems = this.getComponents();

		for(int i = 0; i < listItems.length; i++) {
			if(listItems[i] instanceof Task && ((Task)listItems[i]).checked == true) {
				this.remove(listItems[i]);
			}	
		}
		//Bug deleting bottom task
	}
	
	public void updateNumbers() {
		Component[] listItems = this.getComponents();
		
		for(int i = 0; i < listItems.length; i++) {
			if(listItems[i] instanceof Task) {
				((Task)listItems[i]).changeIndex(i+1);
			}
		}
	}
}
