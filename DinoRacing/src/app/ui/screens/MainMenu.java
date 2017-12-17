package app.ui.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import app.ui.listeners.*;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	private MainMenuListener mainMenuListener = new MainMenuListener();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainMenu() {
		setTitle("Dino Racing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblWelcome = new JLabel("Welcome to Dino Racing!!");
		lblWelcome.setBounds(130, 16, 261, 66);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.setLayout(null);
		contentPane.add(lblWelcome);
		
		JButton btnManagementScreen = new JButton("Management Screen");
		btnManagementScreen.addActionListener(mainMenuListener);
		btnManagementScreen.setActionCommand("ManagementScreen");
		btnManagementScreen.setBounds(130, 85, 261, 50);
		contentPane.add(btnManagementScreen);
		
		JButton btnBeginRace = new JButton("Begin Race");
		btnBeginRace.setBounds(130, 154, 261, 52);
		btnBeginRace.addActionListener(mainMenuListener);
		btnBeginRace.setActionCommand("BeginRace");
		contentPane.add(btnBeginRace);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(130, 223, 261, 46);
		btnExit.addActionListener(mainMenuListener);
		btnExit.setActionCommand("Exit");
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("\u00A9 Copyright 2017 BigRax ");
		label.setBounds(374, 304, 126, 14);
		contentPane.add(label);
	}
}
