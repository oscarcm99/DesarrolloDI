import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nieta {

	private JFrame frmNieta;
	public JFrame getFrmNieta() {
		return frmNieta;
	}

	public void setFrmNieta(JFrame frmNieta) {
		this.frmNieta = frmNieta;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private JTextField textField;
    static Hija hija;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nieta window = new Nieta(hija);
					window.frmNieta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nieta(Hija hija) {
		initialize();
		this.hija = hija;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNieta = new JFrame();
		frmNieta.setTitle("Nieta\r\n");
		frmNieta.setBounds(100, 100, 450, 300);
		frmNieta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNieta.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("IR A HIJA");
		btnNewButton.setBounds(157, 43, 97, 64);
		frmNieta.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("TU NOMBRE");
		lblNewLabel.setBounds(42, 224, 97, 16);
		frmNieta.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(202, 221, 158, 22);
		frmNieta.getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNieta.dispose();
				hija.getFrmHija().setVisible(true);
			}
		});
	}

}
