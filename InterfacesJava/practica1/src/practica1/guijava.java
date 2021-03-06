package practica1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class guijava {

	private JFrame frmPractica;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guijava window = new guijava();
					window.frmPractica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guijava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPractica = new JFrame();
		frmPractica.getContentPane().setBackground(new Color(0, 255, 255));
		frmPractica.setTitle("REGISTRO NETFLIX");
		frmPractica.setBounds(100, 100, 639, 940);
		frmPractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPractica.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(88, 43, 57, 31);
		frmPractica.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(225, 48, 143, 20);
		frmPractica.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(88, 101, 71, 14);
		frmPractica.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 98, 143, 20);
		frmPractica.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("E-Mail");
		lblNewLabel_2.setBounds(88, 151, 57, 14);
		frmPractica.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 148, 143, 20);
		frmPractica.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a\r\n");
		lblNewLabel_3.setBounds(88, 251, 71, 14);
		frmPractica.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 248, 143, 20);
		frmPractica.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Repetir contrase\u00F1a");
		lblNewLabel_4.setBounds(88, 301, 112, 14);
		frmPractica.getContentPane().add(lblNewLabel_4);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(225, 298, 143, 20);
		frmPractica.getContentPane().add(passwordField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0-12", "13-18", "19-65", "65-+"}));
		comboBox.setBounds(225, 198, 82, 20);
		frmPractica.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Edad");
		lblNewLabel_5.setBounds(88, 201, 46, 14);
		frmPractica.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TARIFAS\r\n");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(88, 351, 319, 31);
		frmPractica.getContentPane().add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("7.99\u20AC , 1 usuario, calidad 480p\r\n");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 0));
		rdbtnNewRadioButton.setBounds(88, 412, 319, 23);
		frmPractica.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("10.99\u20AC, 2 usuarios, calidad HD");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(0, 255, 0));
		rdbtnNewRadioButton_1.setBounds(88, 450, 319, 23);
		frmPractica.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("13.99\u20AC, 4 usuarios, calidad 4K");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBackground(new Color(0, 255, 0));
		rdbtnNewRadioButton_2.setBounds(88, 491, 319, 23);
		frmPractica.getContentPane().add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto t\u00E9rminos y condiciones legales\r\n");
		chckbxNewCheckBox.setBackground(new Color(255, 215, 0));
		chckbxNewCheckBox.setBounds(88, 578, 319, 23);
		frmPractica.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Deseo recibir informaci\u00F3n de terceros y promociones\r\n");
		chckbxNewCheckBox_1.setBackground(new Color(255, 215, 0));
		chckbxNewCheckBox_1.setBounds(88, 613, 319, 23);
		frmPractica.getContentPane().add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(266, 829, 102, 48);
		frmPractica.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(56, 829, 103, 48);
		frmPractica.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(476, 829, 102, 48);
		frmPractica.getContentPane().add(btnNewButton_2);
	}
}
