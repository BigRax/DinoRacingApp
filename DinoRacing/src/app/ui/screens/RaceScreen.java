package app.ui.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.objects.*;

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
	private JPanel panelPlaceBets;
	private JTextField inputRacerID;
	private JTextField inputWagerAmount;
	private JTable tableRace;
	private JTextPane textPaneOdds;
	
	public 	JList<Bet> listBets;
	public JComboBox<User> comboBoxUsers;

	/**
	 * Launch the application.
	 */
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane.setBounds(2, 11, 1415, 704);
		contentPane.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("New tab", null, layeredPane, null);
		layeredPane.setLayout(null);
		
		panelPlaceBets = new JPanel();
		panelPlaceBets.setBounds(0, 0, 1361, 699);
		layeredPane.add(panelPlaceBets);
		
		JPanel panelBetSetup = new JPanel();
		panelBetSetup.setVisible(false);
		panelBetSetup.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBetSetup.setBounds(10, 11, 755, 650);
		
		JPanel panelRaceInfo = new JPanel();
		panelRaceInfo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelRaceInfo.setBounds(775, 11, 565, 650);
		panelPlaceBets.setLayout(null);
		panelPlaceBets.add(panelBetSetup);
		
		JPanel panelWagerSetup = new JPanel();
		
		JLabel lblActiveBets = new JLabel("Active Bets:");
		lblActiveBets.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBeginRace = new JButton("Begin Race");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnRemoveBet = new JButton("Remove Bet");
		GroupLayout gl_panelBetSetup = new GroupLayout(panelBetSetup);
		gl_panelBetSetup.setHorizontalGroup(
			gl_panelBetSetup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBetSetup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelBetSetup.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBeginRace, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelBetSetup.createParallelGroup(Alignment.LEADING, false)
							.addComponent(panelWagerSetup, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
							.addComponent(lblActiveBets))
						.addGroup(gl_panelBetSetup.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnRemoveBet)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panelBetSetup.setVerticalGroup(
			gl_panelBetSetup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBetSetup.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelWagerSetup, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addComponent(lblActiveBets)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelBetSetup.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRemoveBet))
					.addGap(82)
					.addComponent(btnBeginRace, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		listBets = new JList<Bet>();
		scrollPane.setViewportView(listBets);
		
		JLabel lblPlaceYourBet = new JLabel("Place your bet:");
		lblPlaceYourBet.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblGambler = new JLabel("Gambler:");
		
		 comboBoxUsers = new JComboBox<User>();
		
		JLabel lblRacerId = new JLabel("Racer ID:");
		
		inputRacerID = new JTextField();
		inputRacerID.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount:");
		
		inputWagerAmount = new JTextField();
		inputWagerAmount.setColumns(10);
		GroupLayout gl_panelWagerSetup = new GroupLayout(panelWagerSetup);
		gl_panelWagerSetup.setHorizontalGroup(
			gl_panelWagerSetup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWagerSetup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelWagerSetup.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPlaceYourBet)
						.addGroup(gl_panelWagerSetup.createSequentialGroup()
							.addComponent(lblGambler)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxUsers, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblRacerId)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(inputRacerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblAmount)
							.addGap(4)
							.addComponent(inputWagerAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(204, Short.MAX_VALUE))
		);
		gl_panelWagerSetup.setVerticalGroup(
			gl_panelWagerSetup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWagerSetup.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPlaceYourBet)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelWagerSetup.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGambler)
						.addComponent(comboBoxUsers, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRacerId)
						.addComponent(inputRacerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAmount)
						.addComponent(inputWagerAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		panelWagerSetup.setLayout(gl_panelWagerSetup);
		panelBetSetup.setLayout(gl_panelBetSetup);
		panelPlaceBets.add(panelRaceInfo);
		
		textPaneOdds = new JTextPane();
		
		JLabel lblOdds = new JLabel("Odds:");
		lblOdds.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panelRaceInfo = new GroupLayout(panelRaceInfo);
		gl_panelRaceInfo.setHorizontalGroup(
			gl_panelRaceInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRaceInfo.createSequentialGroup()
					.addGroup(gl_panelRaceInfo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRaceInfo.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOdds, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRaceInfo.createSequentialGroup()
							.addGap(44)
							.addComponent(textPaneOdds, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_panelRaceInfo.setVerticalGroup(
			gl_panelRaceInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRaceInfo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOdds, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPaneOdds, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelRaceInfo.setLayout(gl_panelRaceInfo);
		
		JPanel panelRace = new JPanel();
		tabbedPane.addTab("New tab", null, panelRace, null);
		
		tableRace = new JTable();
		panelRace.add(tableRace);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(1248, 715, 97, 30);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("\u00A9 Copyright 2017 BigRax ");
		label.setBounds(1093, 742, 126, 14);
		contentPane.add(label);
		
		
	}
	
	public void setOddsTextPaneTest(String s) {
		textPaneOdds.setText(s);
	}
}
