package classes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class UserInput extends JFrame{
	
	
	private JTextField inputField;
	private JButton submitButton;
	private String taskName = "Task Name";
	
	UserInput(Task currentTask){
		this.setTitle("Input task name");
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		inputField = new JTextField(15);
		submitButton = new JButton("Submit");
		
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setInput(inputField.getText());
				currentTask.taskName.setText(taskName);
				
				Window window = SwingUtilities.windowForComponent(submitButton);
	            if (window instanceof JFrame) {
	                ((JFrame) window).dispose();
	            }
			}
		});
		
		add(inputField);
		add(submitButton);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setInput(String input) {
		taskName = input;
	}
}
