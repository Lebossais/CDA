package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.FlowLayout;

import swing.PasswordAdmin;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Bibliotheque_Swing {

	public JFrame frame;
	ItemEvent a;
	public boolean b;
	private final static String LOOKANDFEEL = "Nimbus";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		initLookAndFeel();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bibliotheque_Swing window = new Bibliotheque_Swing();
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
	public Bibliotheque_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Bibliothèque");
		frame.setBounds(100, 100, 394, 138);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				newFrame(e);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Utilisateur", "Gestionnaire"}));
		panel.add(comboBox, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newFramed(e);
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close(e);
			}
		});
		panel_1.add(btnNewButton_1);
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

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
	
	public void newFrame(ItemEvent e) {
		if ( e.getItem() == "Gestionnaire" ) {
		setB(true);
	} else if (e.getItem() == "Utilisateur") {
		setB(false) ;
	}
	}
	public void close (ActionEvent e) {
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());
		
		int sortie = JOptionPane.showConfirmDialog(frame, "Etes-vous sûr ?", 
				"Quitter", JOptionPane.YES_NO_OPTION);
		
		if (sortie == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void newFramed(ActionEvent e) {
	if (isB() == true) {
		PasswordAdmin password = new PasswordAdmin();
		password.Login.setVisible(true);
		frame.dispose();
	} else if (isB() == false) {
		PasswordUtilisateur password1 = new PasswordUtilisateur();
		password1.Login.setVisible(true);
		frame.dispose();
	}
}
}
