package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
	
	private JLabel index;
	public JTextField taskName;
	private JButton done;
	
	public boolean checked;
	
	//Constructor
	Task(){
		this.setPreferredSize(new Dimension(40, 20));
		this.setBackground(Color.red);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20, 20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		
		taskName = new JTextField("Your take here!");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.red);
		this.add(taskName,BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40, 20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done,BorderLayout.EAST);
	}
	
	public JButton getDone() {
		return done;
	}
	
	public void changeIndex(int num) {
		this.index.setText("" + num);
		this.revalidate();
	}
	
	public void changeState() {
		if(checked == false) {
			this.setBackground(Color.green);
			taskName.setBackground(Color.green);
			checked = true;
			done.setText("Undo");	
		}
		else {
			this.setBackground(Color.red);
			taskName.setBackground(Color.red);
			checked = false;
			done.setText("Done");
		}
	}
}
