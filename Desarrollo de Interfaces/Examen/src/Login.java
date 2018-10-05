import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
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
	Telefono telephone = new Telefono(this);
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
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(36, 42, 81, 14);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(36, 88, 81, 14);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(127, 39, 204, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 85, 204, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder\r\n");
		
		btnNewButton.setBounds(36, 210, 89, 23);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(314, 210, 89, 23);
		frmLogin.getContentPane().add(btnNewButton_1);
		//Evento boton acceder
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(!textField.getText().equals(passwordField.getText()) || textField.getText().equals(""))
							JOptionPane.showMessageDialog(frmLogin, "Usuario y contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
						else {
							frmLogin.setVisible(false);
							telephone.getFrmTelefonoJava().setVisible(true);
						}
					}
				});
		//Evento boton salir
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int ans = JOptionPane.showConfirmDialog(frmLogin, "Desea usted salir", "Salir", JOptionPane.YES_NO_OPTION);
						if (ans == 0)
							System.exit(0);
					}
				});

	}
}
