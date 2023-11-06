package classes;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AppFrame extends JFrame{

	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;
	
	private JButton addTask;
	private JButton clear;
	
	//Constructor
	AppFrame(){
		this.setSize(400, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		title = new TitleBar();
		list = new List();
		btnPanel = new ButtonPanel();
		
		this.add(title, BorderLayout.NORTH);
		this.add(btnPanel,BorderLayout.SOUTH);
		
		this.add(list, BorderLayout.CENTER);
		
		addTask = btnPanel.getAddTask();
		clear = btnPanel.getClear();
		
		addListeners();
	}
	
	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {		
				Component[] listItems = list.getComponents();
				if(listItems.length < 10) {
					Task task = new Task();
					list.add(task);
					list.updateNumbers();
					UserInput userInput = new UserInput(task);
					
					
					task.getDone().addMouseListener(new MouseAdapter() {
						@Override
						public void mousePressed(MouseEvent e) {
							task.changeState();
							revalidate();
						}
					});
					revalidate();	
				}
				else {
					JOptionPane.showMessageDialog(null, "Maximum number of tasks added.","Error Result", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				list.removeTasks();
				list.updateNumbers();
				
				revalidate();
			}
		});
	}
	
}
