package interfaz1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;

public class GUI {

	private JFrame frmPrimeraInterfaz;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmPrimeraInterfaz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeraInterfaz = new JFrame();
		frmPrimeraInterfaz.setTitle("Primera interfaz");
		frmPrimeraInterfaz.getContentPane().setBackground(Color.YELLOW);
		frmPrimeraInterfaz.getContentPane().setForeground(Color.BLACK);
		frmPrimeraInterfaz.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBounds(261, 212, 89, 65);
		frmPrimeraInterfaz.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		buttonGroup_1.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(115, 212, 89, 65);
		frmPrimeraInterfaz.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("usuario");
		lblNewLabel.setBounds(114, 55, 46, 14);
		frmPrimeraInterfaz.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("contrase\u00F1a");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setBounds(100, 111, 65, 14);
		frmPrimeraInterfaz.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(185, 52, 139, 20);
		frmPrimeraInterfaz.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 108, 139, 20);
		frmPrimeraInterfaz.getContentPane().add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceptar terminos");
		chckbxNewCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxNewCheckBox.setBounds(106, 284, 125, 23);
		frmPrimeraInterfaz.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(114, 144, 109, 23);
		frmPrimeraInterfaz.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(261, 144, 109, 23);
		frmPrimeraInterfaz.getContentPane().add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(261, 284, 97, 23);
		frmPrimeraInterfaz.getContentPane().add(chckbxNewCheckBox_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(114, 170, 109, 23);
		frmPrimeraInterfaz.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(261, 170, 109, 23);
		frmPrimeraInterfaz.getContentPane().add(rdbtnNewRadioButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"es\u00E0a`", "sdas", "fg"}));
		comboBox.setEditable(true);
		comboBox.setBounds(31, 11, 129, 20);
		frmPrimeraInterfaz.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 182, 29, 125);
		frmPrimeraInterfaz.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		frmPrimeraInterfaz.setBounds(100, 100, 486, 375);
		frmPrimeraInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
