package practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class guijava {

	private JFrame frmRegistro;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guijava window = new guijava();
					window.frmRegistro.setVisible(true);
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
		frmRegistro = new JFrame();
		frmRegistro.getContentPane().setBackground(Color.CYAN);
		frmRegistro.setTitle("REGISTRO");
		frmRegistro.setBounds(100, 100, 650, 961);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(108, 79, 56, 16);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("APELLIDOS\r\n");
		lblNewLabel_1.setBounds(108, 129, 84, 16);
		frmRegistro.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EDAD\r\n");
		lblNewLabel_2.setBounds(108, 179, 56, 16);
		frmRegistro.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CORREO ELECTRONICO\r\n");
		lblNewLabel_3.setBounds(108, 229, 146, 16);
		frmRegistro.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_4.setBounds(108, 279, 146, 16);
		frmRegistro.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("REPETIR CONTRASE\u00D1A");
		lblNewLabel_5.setBounds(108, 329, 146, 16);
		frmRegistro.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(287, 76, 211, 22);
		frmRegistro.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(287, 126, 211, 22);
		frmRegistro.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(287, 226, 211, 22);
		frmRegistro.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0-12 A\u00D1OS.", "13-18 A\u00D1OS.", "19-40 A\u00D1OS.", "41-65 A\u00D1OS.", "66-... A\u00D1OS."}));
		comboBox.setBounds(287, 176, 133, 22);
		frmRegistro.getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(287, 276, 211, 22);
		frmRegistro.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(287, 326, 211, 22);
		frmRegistro.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_6 = new JLabel("TARIFAS\r\n");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(108, 401, 390, 46);
		frmRegistro.getContentPane().add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("7.99\u20AC, 1 usuario y calidad 480p\r\n");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(108, 445, 207, 25);
		frmRegistro.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("10.99\u20AC, 2 usuarios y calidad HD\r\n");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(108, 489, 211, 25);
		frmRegistro.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("13.99\u20AC, 4 usuarios y calidad 4K");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(108, 531, 211, 25);
		frmRegistro.getContentPane().add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("OBSERVACIONES");
		lblNewLabel_7.setBounds(108, 602, 116, 16);
		frmRegistro.getContentPane().add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 645, 390, 53);
		frmRegistro.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(401, 706, 97, 25);
		frmRegistro.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ACEPTO LAS CONDICIONES Y T\u00C9RMINOS LEGALES");
		chckbxNewCheckBox.setBounds(108, 754, 390, 25);
		frmRegistro.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("DESEO RECIBIR INFORMACI\u00D3N DE TERCEROS Y PROMOCIONES");
		chckbxNewCheckBox_1.setBounds(108, 784, 425, 25);
		frmRegistro.getContentPane().add(chckbxNewCheckBox_1);
		
		JButton btnNewButton_1 = new JButton("REGISTRARSE");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(108, 849, 116, 46);
		frmRegistro.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.setBounds(436, 849, 116, 46);
		frmRegistro.getContentPane().add(btnNewButton_2);
		
		JLabel lblNTarjeta = new JLabel("n\u00BA tarjeta");
		lblNTarjeta.setBounds(363, 449, 57, 16);
		frmRegistro.getContentPane().add(lblNTarjeta);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(432, 449, 162, 22);
		frmRegistro.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCcv = new JLabel("ccv");
		lblCcv.setBounds(364, 493, 56, 16);
		frmRegistro.getContentPane().add(lblCcv);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(432, 490, 101, 22);
		frmRegistro.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setBounds(432, 532, 116, 22);
		frmRegistro.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("caducidad\r\n");
		lblNewLabel_8.setBounds(364, 535, 67, 16);
		frmRegistro.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("RECOMENDACIONES");
		lblNewLabel_9.setBounds(108, 379, 162, 16);
		frmRegistro.getContentPane().add(lblNewLabel_9);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(287, 376, 211, 22);
		frmRegistro.getContentPane().add(textArea_1);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_1.setEnabled(true);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				btnNewButton.setEnabled(true);
			}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);
					textField_5.setEnabled(true);
				
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);
					textField_5.setEnabled(true);
					
			}
		});
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);
					textField_5.setEnabled(true);
				
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedIndex()) {
				case 0:
					textArea_1.setText("Dibujos animados.");
					break;
				case 1:
					textArea_1.setText("Peliculas.");
					break;
				case 2:
					textArea_1.setText("Ciencia ficci�n");
					break;
				case 3:
					textArea_1.setText("Comedias rom�nticas");
					break;
				case 4:
					textArea_1.setText("Documentales.");
					break;
				}
			}
		});
	}
}
