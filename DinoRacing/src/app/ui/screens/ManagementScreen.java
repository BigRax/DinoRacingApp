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
	private JTextField inputDinoMount;
	private JTextField inputDinoSpeed;
	private JTextField inputDinoCritSpeed;
	private JTextField inputSkillCheck;
	private JTextField inputAC;
	private JTextField inputHitPoints;
	private JTextField inputAttack;
	private JTextField inputNumberOfDice;
	private JTextField inputCostitution;
	private JTextField inputConstitutionModifier;
	private JTextField inputRacerID;
	private JTextField textFieldMD_Mount;
	private JTextField textFieldMD_NumOfDice;
	private JTextField textFieldMD_Constitution;
	private JTextField textFieldMD_ConstitutionMod;
	private JTextField textFieldMD_Attack;
	private JTextField textFieldMD_HitPoints;
	private JTextField textFieldMD_AC;
	private JTextField textField_10;
	private JTextField textFieldMD_CritSpeed;
	private JTextField textFieldMD_Speed;
	private JTextField textField;

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
		setBounds(100, 100, 1372, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panelfooter = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelfooter, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1326, Short.MAX_VALUE)
						.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1326, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelfooter, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
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
						.addGroup(Alignment.TRAILING, gl_panelfooter.createSequentialGroup()
							.addComponent(btnMainMenu)
							.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
							.addComponent(btnBeginRace)
							.addGap(1025)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCopyright, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_panelfooter.setVerticalGroup(
			gl_panelfooter.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelfooter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelfooter.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panelfooter.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnBeginRace, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
							.addComponent(btnMainMenu, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
						.addComponent(btnExit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addGap(16)
					.addComponent(lblCopyright)
					.addContainerGap())
		);
		panelfooter.setLayout(gl_panelfooter);
		
		JPanel panelManageDinos = new JPanel();
		tabbedPane.addTab("Manage Dinos", null, panelManageDinos, null);
		
		JLabel label = new JLabel("Racer ID:");
		
		JLabel label_1 = new JLabel("Mount Name or Description:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textFieldMD_Mount = new JTextField();
		textFieldMD_Mount.setColumns(50);
		
		JPanel panel_1 = new JPanel();
		
		JLabel label_2 = new JLabel("Damge:");
		
		JLabel label_3 = new JLabel("Type of Dice:");
		
		JLabel label_4 = new JLabel("# of Dice:");
		
		JComboBox comboBoxMD_Dice = new JComboBox();
		
		textFieldMD_NumOfDice = new JTextField();
		textFieldMD_NumOfDice.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 236, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_3))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_4)
							.addGap(4)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxMD_Dice, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldMD_NumOfDice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(textFieldMD_NumOfDice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_3)
					.addGap(10)
					.addComponent(comboBoxMD_Dice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel label_5 = new JLabel("Consitution:");
		
		textFieldMD_Constitution = new JTextField();
		textFieldMD_Constitution.setColumns(10);
		
		JLabel label_6 = new JLabel("Constitution Modifier:");
		
		textFieldMD_ConstitutionMod = new JTextField();
		textFieldMD_ConstitutionMod.setColumns(10);
		
		JLabel label_7 = new JLabel("Attack ");
		
		JLabel label_8 = new JLabel("Hit Points:");
		
		textFieldMD_Attack = new JTextField();
		textFieldMD_Attack.setColumns(10);
		
		textFieldMD_HitPoints = new JTextField();
		textFieldMD_HitPoints.setColumns(10);
		
		JLabel label_9 = new JLabel("Dino AC:");
		
		textFieldMD_AC = new JTextField();
		textFieldMD_AC.setColumns(10);
		
		JLabel label_10 = new JLabel("Skill Check:");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel label_11 = new JLabel("Crit Speed:");
		
		textFieldMD_CritSpeed = new JTextField();
		textFieldMD_CritSpeed.setColumns(10);
		
		JLabel label_12 = new JLabel("Base Speed:");
		
		textFieldMD_Speed = new JTextField();
		textFieldMD_Speed.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("Is there a * by the Skill check in the book?");
		
		JLabel label_13 = new JLabel("Does the dino have a chance to go beserk if an Animal Handling check made with advantage fails by 5 or more?");
		panel_2.add(label_13);
		
		JRadioButton radioButtonMD_BeserkYes = new JRadioButton("Yes");
		panel_2.add(radioButtonMD_BeserkYes);
		
		JRadioButton radioButtonMD_BeserkNo = new JRadioButton("No");
		radioButtonMD_BeserkNo.setSelected(true);
		panel_2.add(radioButtonMD_BeserkNo);
		
		JButton buttonMD_SaveChanges = new JButton("Save Changes");
		buttonMD_SaveChanges.setActionCommand("Save Changes");
		
		JComboBox comboBoxRacerID = new JComboBox();
		
		JCheckBox chckbxActiveracing = new JCheckBox("Active (Racing)");
		GroupLayout gl_panelManageDinos = new GroupLayout(panelManageDinos);
		gl_panelManageDinos.setHorizontalGroup(
			gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelManageDinos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label)
							.addGap(50)
							.addComponent(comboBoxRacerID, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textFieldMD_Mount, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(textFieldMD_Speed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(textFieldMD_CritSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(textFieldMD_AC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(textFieldMD_HitPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(51)
							.addComponent(textFieldMD_Attack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(textFieldMD_Constitution, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textFieldMD_ConstitutionMod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(chckbxActiveracing)
						.addComponent(buttonMD_SaveChanges, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(774, Short.MAX_VALUE))
		);
		gl_panelManageDinos.setVerticalGroup(
			gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelManageDinos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(comboBoxRacerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(2)
							.addComponent(label_1))
						.addComponent(textFieldMD_Mount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_12))
						.addComponent(textFieldMD_Speed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_11))
						.addComponent(textFieldMD_CritSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_10))
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_9))
						.addComponent(textFieldMD_AC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_8))
						.addComponent(textFieldMD_HitPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7)
						.addComponent(textFieldMD_Attack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(textFieldMD_Constitution, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panelManageDinos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelManageDinos.createSequentialGroup()
							.addGap(3)
							.addComponent(label_6))
						.addComponent(textFieldMD_ConstitutionMod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxActiveracing)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(buttonMD_SaveChanges, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelManageDinos.setLayout(gl_panelManageDinos);
		
		JPanel panelAddDino = new JPanel();
		tabbedPane.addTab("Add New Dino", null, panelAddDino, null);
		
		JLabel lblMount = new JLabel("Mount Name or Description:");
		lblMount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		inputDinoMount = new JTextField();
		inputDinoMount.setColumns(50);
		
		JLabel lblBaseSpeed = new JLabel("Base Speed:");
		
		inputDinoSpeed = new JTextField();
		inputDinoSpeed.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Crit Speed:");
		
		inputDinoCritSpeed = new JTextField();
		inputDinoCritSpeed.setColumns(10);
		
		JLabel lblSkillCheck = new JLabel("Skill Check:");
		
		inputSkillCheck = new JTextField();
		inputSkillCheck.setColumns(10);
		
		JPanel panelBeserkChance = new JPanel();
		panelBeserkChance.setToolTipText("Is there a * by the Skill check in the book?");
		
		JLabel lblDinoAc = new JLabel("Dino AC:");
		
		inputAC = new JTextField();
		inputAC.setColumns(10);
		
		inputHitPoints = new JTextField();
		inputHitPoints.setColumns(10);
		
		JLabel lblHitPoints = new JLabel("Hit Points:");
		
		JLabel lblAttack = new JLabel("Attack ");
		
		inputAttack = new JTextField();
		inputAttack.setColumns(10);
		
		JPanel panelDamage = new JPanel();
		
		JLabel lblConsitution = new JLabel("Consitution:");
		
		inputCostitution = new JTextField();
		inputCostitution.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Constitution Modifier:");
		
		inputConstitutionModifier = new JTextField();
		inputConstitutionModifier.setColumns(10);
		
		JButton btnSaveDinosaur = new JButton("Save Dinosaur");
		
		JLabel lblRacerId = new JLabel("Racer ID:");
		
		inputRacerID = new JTextField();
		inputRacerID.setEditable(false);
		inputRacerID.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("Active (Racing)");
		GroupLayout gl_panelAddDino = new GroupLayout(panelAddDino);
		gl_panelAddDino.setHorizontalGroup(
			gl_panelAddDino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAddDino.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAddDino.createSequentialGroup()
							.addComponent(lblMount, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(inputDinoMount, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelDamage, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelAddDino.createSequentialGroup()
							.addComponent(lblConsitution)
							.addGap(32)
							.addComponent(inputCostitution, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelAddDino.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(inputConstitutionModifier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelAddDino.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panelAddDino.createSequentialGroup()
								.addGroup(gl_panelAddDino.createParallelGroup(Alignment.LEADING)
									.addComponent(lblAttack)
									.addComponent(lblHitPoints))
								.addGap(36)
								.addGroup(gl_panelAddDino.createParallelGroup(Alignment.TRAILING)
									.addComponent(inputAttack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(inputHitPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_panelAddDino.createSequentialGroup()
								.addComponent(lblDinoAc)
								.addGap(43)
								.addComponent(inputAC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelAddDino.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panelAddDino.createSequentialGroup()
								.addComponent(lblSkillCheck)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(inputSkillCheck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panelAddDino.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(inputDinoCritSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panelAddDino.createSequentialGroup()
								.addComponent(lblBaseSpeed)
								.addGap(33)
								.addComponent(inputDinoSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panelBeserkChance, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelAddDino.createSequentialGroup()
							.addComponent(lblRacerId)
							.addGap(48)
							.addComponent(inputRacerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnSaveDinosaur, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(774, Short.MAX_VALUE))
		);
		gl_panelAddDino.setVerticalGroup(
			gl_panelAddDino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAddDino.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRacerId)
						.addComponent(inputRacerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMount, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(inputDinoMount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBaseSpeed)
						.addComponent(inputDinoSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(inputDinoCritSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSkillCheck)
						.addComponent(inputSkillCheck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelBeserkChance, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDinoAc)
						.addComponent(inputAC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(inputHitPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHitPoints))
					.addGap(12)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.LEADING)
						.addComponent(inputAttack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAttack))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelDamage, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConsitution)
						.addComponent(inputCostitution, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAddDino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(inputConstitutionModifier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox)
					.addGap(25)
					.addComponent(btnSaveDinosaur, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		
		JLabel lblDamge = new JLabel("Damge:");
		
		JLabel lblOfDice = new JLabel("# of Dice:");
		
		inputNumberOfDice = new JTextField();
		inputNumberOfDice.setColumns(10);
		
		JComboBox comboBoxDice = new JComboBox();
		
		JLabel lblTypeOfDice = new JLabel("Type of Dice:");
		GroupLayout gl_panelDamage = new GroupLayout(panelDamage);
		gl_panelDamage.setHorizontalGroup(
			gl_panelDamage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDamage.createSequentialGroup()
					.addGroup(gl_panelDamage.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDamge)
						.addGroup(gl_panelDamage.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTypeOfDice))
						.addGroup(gl_panelDamage.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOfDice)
							.addGap(4)
							.addGroup(gl_panelDamage.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxDice, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addComponent(inputNumberOfDice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(147, Short.MAX_VALUE))
		);
		gl_panelDamage.setVerticalGroup(
			gl_panelDamage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDamage.createSequentialGroup()
					.addComponent(lblDamge)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDamage.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOfDice)
						.addComponent(inputNumberOfDice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblTypeOfDice)
					.addGap(10)
					.addComponent(comboBoxDice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panelDamage.setLayout(gl_panelDamage);
		
		JLabel lblBeserk = new JLabel("Does the dino have a chance to go beserk if an Animal Handling check made with advantage fails by 5 or more?");
		panelBeserkChance.add(lblBeserk);
		
		JRadioButton rdbtnBeserkYes = new JRadioButton("Yes");
		panelBeserkChance.add(rdbtnBeserkYes);
		
		JRadioButton rdbtnBeserkNo = new JRadioButton("No");
		panelBeserkChance.add(rdbtnBeserkNo);
		rdbtnBeserkNo.setSelected(true);
		panelAddDino.setLayout(gl_panelAddDino);
		
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
		contentPane.setLayout(gl_contentPane);
	}
}
