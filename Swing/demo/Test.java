package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frmerAppSwing;
	private JTextField txtElement;
	private final static String LOOKANDFEEL = "Nimbus";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		initLookAndFeel();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frmerAppSwing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmerAppSwing = new JFrame();
		frmerAppSwing.setTitle("1er App Swing");
		frmerAppSwing.setBounds(100, 100, 450, 300);
		frmerAppSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelButton = new JPanel();
		frmerAppSwing.getContentPane().add(panelButton, BorderLayout.SOUTH);
		
		JButton valid = new JButton("Valider");
		valid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valider(e);
			}
		});
		valid.setBackground(new Color(255, 255, 255));
		valid.setForeground(new Color(46, 139, 87));
		panelButton.add(valid);
		
		JButton cancel = new JButton("Annuler");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				quitter(e);
			}
		});
		cancel.setBackground(new Color(255, 255, 255));
		cancel.setForeground(new Color(255, 0, 0));
		panelButton.add(cancel);
		
		JLabel lblNewLabel = new JLabel("Ceci est mon test, soyez indulgent.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmerAppSwing.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel paneltext = new JPanel();
		frmerAppSwing.getContentPane().add(paneltext, BorderLayout.CENTER);
		
		txtElement = new JTextField();
		txtElement.setToolTipText("Tappe ta réponse");
		txtElement.setText("Element 1");
		paneltext.add(txtElement);
		txtElement.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"}));
		comboBox.setSelectedIndex(0);
		paneltext.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"etat 1", "etat 2", "etat 3", "etat 4", "etat 5"}));
		paneltext.add(comboBox_1);
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
	
	private void quitter(ActionEvent e) {
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());
		
		int sortie = JOptionPane.showConfirmDialog(frmerAppSwing, "Etes-vous sûr de vouloir quitter ?",
				"Quitter",JOptionPane.YES_NO_OPTION);
		if (sortie == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	
	private void valider(ActionEvent e) {
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());
		
		JOptionPane.showMessageDialog(null, "Modification ! T'as changé quelque chose !",
				"Modification", JOptionPane.INFORMATION_MESSAGE);
	}
}
