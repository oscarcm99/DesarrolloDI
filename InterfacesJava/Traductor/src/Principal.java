import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Principal {

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
    static LogIn padre;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal(padre);
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
	public Principal(LogIn padre) {
		initialize();
		this.padre = padre;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Traducir\r\n");
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					URL webhost = null;
					try {
						webhost = new URL("http://www.spanishdict.com/translate/"+textField.getText());
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						String codigoHTML = obtenerHTML(webhost);
						int corteIni = codigoHTML.indexOf("\"translationText\":\"");			
						int corteFin = codigoHTML.indexOf("\",\"translationContext\"");
						textField_1.setText(codigoHTML.substring(corteIni+19, corteFin));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			       
				
			}
		});
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, BorderLayout.SOUTH);
		textField_1.setColumns(10);
		
		btnNewButton_1 = new JButton("LogOut");
		frame.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INGLES A ESPA\u00D1OL ", "ESPA\u00D1OL A INGLES"}));
		frame.getContentPane().add(comboBox, BorderLayout.WEST);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				padre.getFrame().setVisible(true);
			}
		});
	}
	public static String obtenerHTML (URL direccionWeb) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(direccionWeb.openStream()));
		String inputLine, codigo="";

		while ((inputLine = in.readLine()) != null)
			codigo+=inputLine;

		in.close();
		
		return codigo;
	}
}
