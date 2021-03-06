import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frmPadre;
	public JFrame getFrmPadre() {
		return frmPadre;
	}

	public void setFrmPadre(JFrame frmPadre) {
		this.frmPadre = frmPadre;
	}

	private JTextField textField;
	Hija hija = new Hija(this);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmPadre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPadre = new JFrame();
		frmPadre.setTitle("Padre");
		frmPadre.setBounds(100, 100, 450, 300);
		frmPadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPadre.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("IR A HIJA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmPadre.setVisible(false);
				hija.getFrmHija().setVisible(true);
				hija.getTextField().setText(textField.getText());
			}
		});
		btnNewButton.setBounds(146, 45, 97, 68);
		frmPadre.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("TU NOMBRE\r\n");
		lblNewLabel.setBounds(44, 224, 118, 16);
		frmPadre.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 221, 180, 22);
		frmPadre.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
