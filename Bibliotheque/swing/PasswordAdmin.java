package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasswordAdmin {

	JFrame Login;
	private JTextField textField;
	private JPasswordField passwordField;
	private String toto;
	private String to;
	JLabel Error1;
	JLabel error2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordAdmin window = new PasswordAdmin();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PasswordAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.setTitle("Login Admin");
		Login.setBounds(100, 100, 377, 153);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_2 = new JPanel();
		Login.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login(e);
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close(e);
			}
		});
		panel_2.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		Login.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Login");
		
		textField = new JTextField();
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		
		passwordField = new JPasswordField();
		Error1 = new JLabel("Login invalid");
		Error1.setHorizontalAlignment(SwingConstants.CENTER);
		Error1.setForeground(Color.RED);
		Error1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Error1.setVisible(false);
		
		error2 = new JLabel("Password invalid");
		error2.setForeground(Color.RED);
		error2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		error2.setVisible(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(133)
							.addComponent(error2))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(141)
							.addComponent(Error1)))
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(Error1)
					.addGap(3)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(error2))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	public String getTextField() {
		return textField.getText();
	}

	public String getPasswordField() {
		return passwordField.getText();
	}

	private void login(ActionEvent e) {
		if (getTextField().equals("to") && getPasswordField().equals("toto")) {
			Lobby lobby = new Lobby();
			lobby.lobby.setVisible(true);
			Login.dispose();
			
		} else if (getTextField() != "to" && getPasswordField() != "toto"){
			error2.setVisible(true);
			Error1.setVisible(true);	
			System.out.println(e.getActionCommand().toString());
			System.out.println(e.getSource().toString());
			
			JOptionPane.showMessageDialog(null, "Mauvais login ! Veuillez entrer des entrées valide pour se connecter !", 
					"Erreur Connexion", JOptionPane.INFORMATION_MESSAGE);
		}
		}
		
	private void close (ActionEvent e) {
		Bibliotheque_Swing frame = new Bibliotheque_Swing();
		frame.frame.setVisible(true);
		Login.dispose();
			
	}
}
