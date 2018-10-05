import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

public class Telefono {

	private JFrame frmTelefonoJava;
	public JFrame getFrmTelefonoJava() {
		return frmTelefonoJava;
	}

	public void setFrmTelefonoJava(JFrame frmTelefonoJava) {
		this.frmTelefonoJava = frmTelefonoJava;
	}

	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	static Login login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telefono window = new Telefono(login);
					window.frmTelefonoJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Telefono(Login login) {
		initialize();
		this.login = login;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelefonoJava = new JFrame();
		frmTelefonoJava.setTitle("TELEFONO JAVA");
		
		
		frmTelefonoJava.setBounds(100, 100, 425, 250);
		frmTelefonoJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelefonoJava.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTelefonoJava.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Llamada");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Enviar SMS");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Marcaci\u00F3n:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frmTelefonoJava.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("A\u00F1adir prefijo");
		panel_1.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1a", "Francia", "Alemania"}));
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("LLAMAR");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("ENVIAR SMS");
		btnNewButton_2.setEnabled(false);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SALIR");
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		frmTelefonoJava.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(4, 3, 0, 0));
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_12 = new JButton("3");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("4");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("6\r\n");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("#");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnNewButton_15);
		
		JPanel panel_3 = new JPanel();
		frmTelefonoJava.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
        
		//Evento radiobutton llamar
				rdbtnNewRadioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						btnNewButton.setEnabled(true);
						btnNewButton_2.setEnabled(false);
						textArea_1.setEditable(false);
					}
				});
		//Evento radiobutton enviar sms
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setEnabled(false);
				btnNewButton_2.setEnabled(true);
				textArea_1.setEditable(true);
			}
		});
		//Evento boton 1
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		// Evento boton 2
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		// Evento boton 3
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		// Evento boton 4
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		// Evento boton 5
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		// Evento boton 6
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		// Evento boton 7
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		// Evento boton 8
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		// Evento boton 9
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		// Evento boton *
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"*");
			}
		});
		// Evento boton 0
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		// Evento boton #
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"#");
			}
		});
		//Evento boton borrar
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				
			}
		});
		//Evento checkbox
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!chckbxNewCheckBox.isSelected())
					comboBox.setEnabled(false);
				else
					comboBox.setEnabled(true);
			}
		});
		//Evento combobox
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch(comboBox.getSelectedIndex()) {
				case 0:
					textField.setText("+34");
					break;
				case 1:
					textField.setText("+33");
					break;
				case 2:
					textField.setText("+49");
					break;
				}
			}
		});
		//Evento llamar
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(frmTelefonoJava, "Debe proporcionar un numero de telefono", "Error", JOptionPane.ERROR_MESSAGE);
				else {
					JOptionPane.showMessageDialog(frmTelefonoJava, "Llamando a: " +textField.getText(), "Llamando...", JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
				}
			}
		});
		//Evento enviar sms
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") && textArea_1.getText().equals(""))
					JOptionPane.showMessageDialog(frmTelefonoJava, "Debe proporcionar un numero de telefono y un mensaje de texto", "Error", JOptionPane.ERROR_MESSAGE);
				else
					if(textField.getText().equals(""))
						JOptionPane.showMessageDialog(frmTelefonoJava, "Debe proporcionar un numero de telefono", "Error", JOptionPane.ERROR_MESSAGE);
				else
					if(textArea_1.getText().equals(""))
						JOptionPane.showMessageDialog(frmTelefonoJava, "Debe proporcionar un mensaje de texto", "Error", JOptionPane.ERROR_MESSAGE);
					else {
						JOptionPane.showMessageDialog(frmTelefonoJava, "Enviando mensaje a: " +textField.getText(), "Envio de mensaje...", JOptionPane.INFORMATION_MESSAGE);
						textField.setText("");
						textArea_1.setText("");
					}
			}
		});
		//Evento salir
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frmTelefonoJava, "Desea usted salir", "Salir", JOptionPane.YES_NO_OPTION);
				if (ans == 0) {
				frmTelefonoJava.dispose();
				login.getFrmLogin().setVisible(true);
				}
			}
		});
		
	}

}
