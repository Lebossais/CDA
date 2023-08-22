package demo;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FirstApp {

	private JFrame frame;
	private final static String LOOKANDFEEL = "Nimbus";
	private JTextField textField;
	private JLabel label;
	private JButton valid, cancel;
	private JPanel paneltext, panelButton;
	private JComboBox<Object> liste1, liste2;
	private JMenuBar menuBar = new JMenuBar();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		// Gestion du style des fenêtres
		initLookAndFeel();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstApp window = new FirstApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}




	/**
	 * Create the application.
	 */
	public FirstApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Ma 1er APP Swing");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		// PopUp
//		// instanciation
//		JDialog dialog = new JDialog();
//		//On lui donne une taille
//		dialog.setSize(300, 200);
//		//On lui donne un titre
//		dialog.setTitle("Première fenêtre"); 
//		//On la rend visible
//		dialog.setVisible(true);
	
//		// création d'une nouvelle fenetre
//		TestFrame myFrame = new TestFrame();
		
		// crétion d'un label 
		label = new JLabel("Bienvenue dans ma modeste application");
		// Positionnement du label
		label.setHorizontalAlignment(SwingConstants.CENTER);
		// Ajout du label dans le panel de la Frame
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		// Création d'un champs de saisie
		// creation d'un panel qui va contenir nom textfield
		paneltext = new JPanel();
		// ajout de panel dans le contentPane
		frame.getContentPane().add(paneltext, BorderLayout.CENTER);
		
		// instanciation du textfield
		textField = new JTextField();
		// aide à la saisie
		textField.setToolTipText("taper votre réponse");
		//On lui donne un nombre de colonnes à afficher
		textField.setColumns(10); 
		// ajout du textfield dans le panel
		paneltext.add(textField);
		
		Object[] elements = new Object[]{"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"};
		
		
		liste1 = new JComboBox<Object>(elements);
		paneltext.add(liste1);
		textField.setText(liste1.getSelectedItem().toString());
		
		String[] strings = new String[]{"etat 1", "etat 2", "etat 3", "etat 4", "etat 5"};
		
		liste2 = new JComboBox<Object>(new StringModel(strings) );
		paneltext.add(liste2);
		
		
		// creation d'un panel qui va contenir mes boutons
		panelButton = new JPanel();
		frame.getContentPane().add(panelButton, BorderLayout.SOUTH);
		// Creation de mes deux boutons
		valid = new JButton("Valider");
		
		// ajout d'evenement sur les boutons
		valid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valider(e);
				
			}
		});
		cancel = new JButton("Annuler"); 
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				quitter(e);
				
			}
		});
		valid.setBackground(Color.GREEN);
		cancel.setBackground(Color.ORANGE);
		panelButton.add(valid);
		panelButton.add(cancel);
		
	}

	/**
	 * Methode de gestion des styles
	 */
	private static void initLookAndFeel() {
		String lookAndFeel = null;

		if (LOOKANDFEEL != null) {
			switch (LOOKANDFEEL) {
			case "Metal":
				lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
				break;
			case "System":
				lookAndFeel = UIManager.getSystemLookAndFeelClassName();
				break;
			case "Motif":
				lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
				break;
			case "Nimbus":
				lookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
				break;		
			}

			try {
				UIManager.setLookAndFeel(lookAndFeel);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void quitter(ActionEvent e) {
		
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());
		
		int sortie = JOptionPane.showConfirmDialog(frame, "Etes-vous sûr ?", 
				"Quitter", JOptionPane.YES_NO_OPTION);
		
		if (sortie == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	private void valider(ActionEvent e) {
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());
		
		this.label.setText(this.getTextField().getText());
		
		JOptionPane.showMessageDialog(null, "Modif ! vous avez changés le texte", 
				"Modification", JOptionPane.INFORMATION_MESSAGE);
	}
	
}