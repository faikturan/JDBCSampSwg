package com.faikturan;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonUI extends JFrame {
	
	private JTextField idField = new JTextField(10);
	private JTextField fNameField = new JTextField(10);
	private JTextField mNameField = new JTextField(10);
	private JTextField lNameField = new JTextField(10);
	private JTextField emailField = new JTextField(10);
	private JTextField phoneField = new JTextField(10);
	
	private JButton createButton = new JButton("New...");
	private JButton updateButton = new JButton("Update");
	private JButton deleteButton = new JButton("Delete");
	private JButton firstButton = new JButton("First");
	private JButton prevButton = new JButton("Previous");
	private JButton nextButton = new JButton("Next");
	private JButton lastButton = new JButton("Last");
	
	private PersonBean bean = new PersonBean();
	
	private JPanel initButtons()
	{
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));
		panel.add(createButton);
		createButton.addActionListener(new ButtonHandler());
		
		panel.add(updateButton);
		updateButton.addActionListener(new ButtonHandler());
		
		panel.add(deleteButton);
		deleteButton.addActionListener(new ButtonHandler());
		
		panel.add(firstButton);
		firstButton.addActionListener(new ButtonHandler());
		
		panel.add(prevButton);
		prevButton.addActionListener(new ButtonHandler());
		
		panel.add(nextButton);
		nextButton.addActionListener(new ButtonHandler());
		
		panel.add(lastButton);
		lastButton.addActionListener(new ButtonHandler());
		
		return panel;
		
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	

}
