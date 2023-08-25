package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import swing.Liste;

public class Recherche {

	boolean i = false;
	private JFrame frmRecherche;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recherche window = new Recherche();
					window.frmRecherche.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Recherche() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRecherche = new JFrame();
		frmRecherche.setTitle("Recherche");
		frmRecherche.setBounds(100, 100, 450, 244);
		frmRecherche.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmRecherche.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Recherche");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frmRecherche.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 5, 264, 30);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Recherche par Auteur\r\n");
		panel_3.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_3.add(textField);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel_2.setBounds(0, 46, 264, 30);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Recherche par Nom   ");
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_2.add(textField_1);
	}
	
	
}
