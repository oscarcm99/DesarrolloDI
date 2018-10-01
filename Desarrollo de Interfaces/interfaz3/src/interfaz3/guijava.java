package interfaz3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class guijava {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guijava window = new guijava();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		JTextPane textPane = new JTextPane();
		JList list = new JList();
		
		frame.setBounds(100, 100, 523, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Aceptar\r\n");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(74, 332, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(355, 332, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(206, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				textField.setText("Hola");
			}
		});
		passwordField.setBounds(206, 86, 86, 20);
		frame.getContentPane().add(passwordField);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(117, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(100, 89, 63, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 120, 55, 96);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(list);

		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Madrid ", "Valencia", "Barcelona", "Sevilla", "Badajoz", "Granada" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Si");
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(183, 122, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("No");
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(183, 169, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		textPane.setBounds(332, 122, 80, 63);
		frame.getContentPane().add(textPane);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto terminos");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected())
					btnNewButton.setEnabled(true);
				else
					btnNewButton.setEnabled(false);
			}
		});
		chckbxNewCheckBox.setIgnoreRepaint(true);
		chckbxNewCheckBox.setBounds(310, 38, 118, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch(comboBox.getSelectedIndex()) {
				case 0:
					frame.getContentPane().setBackground(new Color(255, 0, 0));
					break;
				case 1:
					frame.getContentPane().setBackground(new Color(0, 0, 255));
					break;
				case 2:
					frame.getContentPane().setBackground(new Color(0, 255, 0));
					break;
				case 3:
					frame.getContentPane().setBackground(new Color(255, 255, 0));
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Azul", "Verde", "Amarillo"}));
		comboBox.setBounds(135, 247, 63, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(220, 332, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				list.setSelectedIndex(0);
			}
		});
	}
}
