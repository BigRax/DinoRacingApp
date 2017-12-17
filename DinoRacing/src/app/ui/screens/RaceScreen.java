package app.ui.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.objects.*;
import app.ui.listeners.RaceScreenListener;
import app.ui.models.RaceTableModel;

import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class RaceScreen extends JFrame {
	private static final long serialVersionUID = -4062472924971977269L;
	private JPanel contentPane;
	private JTable tableRace;
	public RaceTableModel raceTableModel =  new RaceTableModel();

	private RaceScreenListener rsl = new RaceScreenListener();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RaceScreen frame = new RaceScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RaceScreen() {
		setTitle("Dino Racing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1371, 795);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRace = new JPanel();
		panelRace.setBounds(0, 0, 1354, 699);
		contentPane.add(panelRace);
		panelRace.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1334, 677);
		panelRace.add(scrollPane);
		
		tableRace = new JTable();
		tableRace.setBounds(680, 6, 0, 0);
		panelRace.add(tableRace);
		tableRace.setModel(raceTableModel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(1248, 715, 97, 30);
		contentPane.add(btnExit);
		btnExit.setActionCommand("Exit");
		btnExit.addActionListener(rsl);
		
		JLabel label = new JLabel("\u00A9 Copyright 2017 BigRax ");
		label.setBounds(1093, 742, 126, 14);
		contentPane.add(label);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setBounds(10, 710, 97, 35);
		btnRoll.setActionCommand("Roll");
		btnRoll.addActionListener(rsl);
		contentPane.add(btnRoll);
		
		
	}
}
