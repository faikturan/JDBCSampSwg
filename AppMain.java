package com.faikturan;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class AppMain {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		f.getContentPane().add(new PersonUI());
		f.setSize(600, 280);
		f.setResizable(false);
	    f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
