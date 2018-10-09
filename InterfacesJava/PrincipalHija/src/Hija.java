import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hija {

	private JFrame frmHija;
	static Principal padre;
	Nieta nieta = new Nieta(this);
	public JFrame getFrmHija() {
		return frmHija;
	}

	public void setFrmHija(JFrame frmHija) {
		this.frmHija = frmHija;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hija window = new Hija(padre);
					window.frmHija.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hija(Principal padre) {
		initialize();
		this.padre = padre;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHija = new JFrame();
		frmHija.setTitle("Hija");
		frmHija.setBounds(100, 100, 450, 300);
		frmHija.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHija.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("IR A PADRE");
		btnNewButton.setBounds(156, 36, 109, 25);
		frmHija.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IR A NIETA");
		btnNewButton_1.setBounds(156, 88, 109, 25);
		frmHija.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("TU NOMBRE");
		lblNewLabel.setBounds(63, 224, 128, 16);
		frmHija.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(208, 221, 167, 22);
		frmHija.getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHija.dispose();
				padre.getFrmPadre().setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHija.setVisible(false);
				nieta.getFrmNieta().setVisible(true);
				nieta.getTextField().setText(textField.getText());
			}
		});
	}

}
