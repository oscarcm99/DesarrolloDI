package listaCompra;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;

	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public void setFrmLogin(JFrame frmLogin) {
		this.frmLogin = frmLogin;
	}

	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	Ticket list = new Ticket(this);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("LogIn");
		frmLogin.setBounds(100, 100, 508, 459);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO\r\n");
		lblNewLabel.setBounds(51, 45, 96, 16);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1.setBounds(51, 107, 96, 16);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(171, 42, 178, 22);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(171, 104, 178, 22);
		frmLogin.getContentPane().add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Soy cliente\r\n");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(51, 167, 127, 25);
		frmLogin.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Soy invitado\r\n");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(51, 206, 127, 25);
		frmLogin.getContentPane().add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto las condiciones de uso");
		chckbxNewCheckBox.setBounds(51, 264, 254, 25);
		frmLogin.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(51, 340, 97, 38);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(317, 340, 97, 38);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setEditable(true);
				passwordField.setEditable(true);
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(false);
				passwordField.setEditable(false);
			}
		});
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
					btnNewButton.setEnabled(true);
				else
					btnNewButton.setEnabled(false);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					if(!textField.getText().equals(passwordField.getText()) || textField.getText().equals(""))
							JOptionPane.showMessageDialog(frmLogin, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
					else {
						frmLogin.setVisible(false);
						list.getFrame().setVisible(true);
						list.getTextField().setText(textField.getText());
					}
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					frmLogin.setVisible(false);
					list.getFrame().setVisible(true);
				}
					
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respueta = JOptionPane.showConfirmDialog(frmLogin, "Realmente usted desea salir","Salir", JOptionPane.YES_NO_OPTION);
				if(respueta == 0)
					System.exit(0);
			}
		});
	}
}
