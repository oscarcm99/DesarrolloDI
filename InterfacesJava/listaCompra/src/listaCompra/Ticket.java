package listaCompra;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Ticket {
    double precioTotal, cantidad, precioUnidad,precioPedido=0;
	private JFrame frmListaDeLa;
	private JTextField textField;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
    static Login logeo;
	public JFrame getFrame() {
		return frmListaDeLa;
	}

	public void setFrame(JFrame frame) {
		this.frmListaDeLa = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket(logeo);
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket(Login logeo) {
		initialize();
		this.logeo = logeo;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeLa = new JFrame();
		frmListaDeLa.setTitle("Lista de la compra");
		frmListaDeLa.setBounds(100, 100, 657, 445);
		frmListaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente\r\n");
		lblNewLabel.setBounds(37, 48, 75, 16);
		frmListaDeLa.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(124, 45, 150, 22);
		frmListaDeLa.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total a pagar(\u20AC)");
		lblNewLabel_1.setBounds(320, 48, 102, 16);
		frmListaDeLa.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(432, 45, 142, 22);
		frmListaDeLa.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Producto");
		lblNewLabel_2.setBounds(37, 96, 56, 16);
		frmListaDeLa.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 93, 150, 22);
		frmListaDeLa.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad y precio");
		lblNewLabel_3.setBounds(320, 96, 102, 16);
		frmListaDeLa.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(434, 93, 56, 22);
		frmListaDeLa.getContentPane().add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(511, 93, 89, 22);
		frmListaDeLa.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(37, 159, 385, 192);
		frmListaDeLa.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("A\u00F1adir producto");
		btnNewButton.setBounds(468, 158, 142, 25);
		frmListaDeLa.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Finalizar compra\r\n");
		btnNewButton_1.setBounds(468, 239, 142, 25);
		frmListaDeLa.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Log out");
		btnNewButton_2.setBounds(468, 319, 142, 25);
		frmListaDeLa.getContentPane().add(btnNewButton_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidad = Double.parseDouble(comboBox.getSelectedItem().toString());
				precioUnidad = Double.parseDouble(textField_3.getText());
				
				textArea.append(textField_2.getText()+" "+(cantidad*precioUnidad)+"€"+"\n");
				precioPedido+=cantidad*precioUnidad;
				textField_1.setText(precioPedido+"€");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmListaDeLa, "El precio total = " +textField_1.getText(), "Finalizar compra", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(frmListaDeLa, "Deseas cerrar sesion", "Log out",JOptionPane.YES_NO_OPTION);
				if(res == 0) {
					frmListaDeLa.dispose();
					logeo.getFrmLogin().setVisible(true);
				}
			}
		});
	}
}
