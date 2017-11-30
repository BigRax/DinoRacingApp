package app.ui.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class ManagementScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField inputUpdateDinoValue;
	private JTextField inputDinoName;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagementScreen frame = new ManagementScreen();
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
	public ManagementScreen() {
		setTitle("Dino Racing Management Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1027, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panelfooter = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelfooter, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 986, Short.MAX_VALUE))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelfooter, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JButton btnExit = new JButton("Exit");
		
		JButton btnMainMenu = new JButton("Main Menu");
		
		JButton btnBeginRace = new JButton("Begin Race");
		
		JLabel lblCopyright = new JLabel("\u00A9 Copyright 2017 BigRax ");
		GroupLayout gl_panelfooter = new GroupLayout(panelfooter);
		gl_panelfooter.setHorizontalGroup(
			gl_panelfooter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelfooter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelfooter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelfooter.createSequentialGroup()
							.addComponent(btnMainMenu)
							.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
							.addComponent(btnBeginRace)
							.addGap(703)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCopyright, Alignment.TRAILING))
					.addGap(332))
		);
		gl_panelfooter.setVerticalGroup(
			gl_panelfooter.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelfooter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelfooter.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBeginRace, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addComponent(btnMainMenu, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addGap(27)
					.addComponent(lblCopyright))
		);
		panelfooter.setLayout(gl_panelfooter);
		
		JPanel panelUserManagement = new JPanel();
		tabbedPane.addTab("User Management", null, panelUserManagement, null);
		
		JPanel panelAddUser = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnRemoveUser = new JButton("Remove User");
		
		JLabel labelRemoveUser = new JLabel("Remove User:");
		labelRemoveUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_panelUserManagement = new GroupLayout(panelUserManagement);
		gl_panelUserManagement.setHorizontalGroup(
			gl_panelUserManagement.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelUserManagement.createSequentialGroup()
					.addGroup(gl_panelUserManagement.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelUserManagement.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelUserManagement.createParallelGroup(Alignment.LEADING)
								.addComponent(panelAddUser, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelUserManagement.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnRemoveUser))))
						.addGroup(gl_panelUserManagement.createSequentialGroup()
							.addGap(20)
							.addComponent(labelRemoveUser, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(607, Short.MAX_VALUE))
		);
		gl_panelUserManagement.setVerticalGroup(
			gl_panelUserManagement.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelUserManagement.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelAddUser, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(labelRemoveUser)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelUserManagement.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRemoveUser))
					.addContainerGap())
		);
		
		JList listUsers = new JList();
		scrollPane.setViewportView(listUsers);
		panelAddUser.setLayout(null);
		
		JLabel lblAddUser = new JLabel("Add User:");
		lblAddUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddUser.setBounds(10, 11, 68, 14);
		panelAddUser.add(lblAddUser);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(20, 36, 46, 14);
		panelAddUser.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(77, 33, 173, 20);
		panelAddUser.add(textField);
		textField.setColumns(10);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setBounds(275, 32, 89, 23);
		panelAddUser.add(btnAddUser);
		panelUserManagement.setLayout(gl_panelUserManagement);
		
		JPanel panelManageDinos = new JPanel();
		tabbedPane.addTab("Manage Dinos", null, panelManageDinos, null);
		
		JLabel label = new JLabel("Racer ID:");
		
		JButton buttonMD_SaveChanges = new JButton("Save Changes");
		buttonMD_SaveChanges.setActionCommand("Save Changes");
		
		JComboBox comboBoxRacerID = new JComboBox();
		
		JCheckBox chckbxActiveracing = new JCheckBox("Active (Racing)");
		
		JLabel lblOdds = new JLabel("Payout = Wager ");
		
		JRadioButton rdbtnUpdateDinoMultiply = new JRadioButton("Multiply");
		rdbtnUpdateDinoMultiply.setSelected(true);
		
		JRadioButton rdbtnUpdateDinoDivideDivide = new JRadioButton("Divide");
		
		JLabel lblBy = new JLabel("by");
		
		inputUpdateDinoValue = new JTextField();
		inputUpdateDinoValue.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Update:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JPanel panel = new JPanel();
		GroupLayout gl_panelManageDinos = new GroupLayout(panelManageDinos);
		gl_panelManageDinos.setHorizontalGroup(
			gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelManageDinos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxActiveracing)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxRacerID, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(lblOdds)
							.addGap(6)
							.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnUpdateDinoDivideDivide)
								.addComponent(rdbtnUpdateDinoMultiply))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblBy, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(inputUpdateDinoValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel)
						.addComponent(buttonMD_SaveChanges, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		gl_panelManageDinos.setVerticalGroup(
			gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelManageDinos.createSequentialGroup()
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(comboBoxRacerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelManageDinos.createSequentialGroup()
									.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelManageDinos.createSequentialGroup()
											.addGap(18)
											.addComponent(rdbtnUpdateDinoMultiply)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtnUpdateDinoDivideDivide))
										.addGroup(gl_panelManageDinos.createSequentialGroup()
											.addGap(35)
											.addComponent(lblOdds)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxActiveracing))
								.addGroup(gl_panelManageDinos.createSequentialGroup()
									.addGap(37)
									.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblBy)
										.addComponent(inputUpdateDinoValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buttonMD_SaveChanges, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(171, Short.MAX_VALUE))
		);
		
		JLabel lblAddNewDino = new JLabel("Add New Dino:");
		lblAddNewDino.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblName_1 = new JLabel("Name:");
		
		inputDinoName = new JTextField();
		inputDinoName.setColumns(10);
		
		JLabel lblBreed = new JLabel("Breed:");
		
		JComboBox comboBox = new JComboBox();
		
		JButton btnNewButton = new JButton("Add Dino");
		
		JLabel label_1 = new JLabel("Payout = Wager ");
		
		JRadioButton radioButton = new JRadioButton("Multiply");
		radioButton.setSelected(true);
		
		JRadioButton radioButton_1 = new JRadioButton("Divide");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("by");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblAddNewDino)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblName_1)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(inputDinoName, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblBreed)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddNewDino)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName_1)
						.addComponent(inputDinoName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBreed)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(17)
							.addComponent(label_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(radioButton)
							.addGap(3)
							.addComponent(radioButton_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addComponent(label_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		panelManageDinos.setLayout(gl_panelManageDinos);
		contentPane.setLayout(gl_contentPane);
	}
}
