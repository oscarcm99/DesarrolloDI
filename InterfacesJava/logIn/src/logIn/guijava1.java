package logIn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guijava1 {

	private JFrame frmHospitalGeneralDe;
	private JTextField textField = new JTextField();
	static guijava padre;
	public JFrame getFrmHospitalGeneralDe() {
		return frmHospitalGeneralDe;
	}

	public void setFrmHospitalGeneralDe(JFrame frmHospitalGeneralDe) {
		this.frmHospitalGeneralDe = frmHospitalGeneralDe;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
    
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guijava1 window = new guijava1(padre);
					window.frmHospitalGeneralDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guijava1(guijava padre) {
		initialize();
		this.padre = padre;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHospitalGeneralDe = new JFrame();
		frmHospitalGeneralDe.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmHospitalGeneralDe.setTitle("Hospital general de monesterio\r\n");
		frmHospitalGeneralDe.setBounds(100, 100, 499, 543);
		frmHospitalGeneralDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHospitalGeneralDe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al HCDM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 65, 285, 37);
		frmHospitalGeneralDe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Log Out\r\n");
		btnNewButton.setBounds(354, 458, 97, 25);
		frmHospitalGeneralDe.getContentPane().add(btnNewButton);
		
		JLabel lblUsuarioConectado = new JLabel("Usuario conectado");
		lblUsuarioConectado.setBounds(43, 135, 115, 16);
		frmHospitalGeneralDe.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(216, 132, 159, 22);
		frmHospitalGeneralDe.getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(frmHospitalGeneralDe, "Desea salir","Salir",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if(respuesta == 0) {
					frmHospitalGeneralDe.dispose();
					padre.getFrame().setVisible(true);
					}		
			}
		});
	}

}
