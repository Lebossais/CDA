package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Liste {

	JFrame frmListe;
	public JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Liste window = new Liste();
					window.frmListe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Liste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListe = new JFrame();
		frmListe.setTitle("Liste");
		frmListe.setBounds(100, 100, 508, 281);
		
		JPanel panel = new JPanel();
		frmListe.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnNewMenu_1 = new JMenu("Menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("retour");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retour(e);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Déconnexion");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu = new JMenu("Roman");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("emprunter");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("rendre");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("rechercher");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("BD");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("emprunter");
		mntmNewMenuItem.setSelected(true);
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("rendre");
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Rechercher");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JPanel panel_1 = new JPanel();
		frmListe.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		table_1 = new JTable();
		table_1.setBorder(UIManager.getBorder("CheckBox.border"));
		table_1.setForeground(Color.BLACK);
		table_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Titre", "Auteur", "ISBN", "Collection", "Disponibilite"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_1.add(table_1);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"The Witcher", "Andrew", "4", null, Boolean.TRUE},
				{"Baldur", "Larian", "6", null, Boolean.TRUE},
				{"Divinity", "Larian", "16", null, Boolean.TRUE},
				{"Les Aventures", "Fournier", null, "Spirou", Boolean.TRUE},
				{"La plan\u00E8te Myst\u00E8rieuse", "Herg\u00E9", null, "Tintin", Boolean.TRUE},
				{"Les Douzes Travaux", null, null, "Ast\u00E9rix & Ob\u00E9lix", Boolean.TRUE},
			},
			new String[] {
				"Titre", "Auteur", "ISBN", "Collection", "Disponibilit\u00E9"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		panel_1.add(table_2);
	}

	
	public void retour(ActionEvent e) {
		frmListe.dispose();
	}
	public void recherche(String src) {
		boolean i = false;
		for (int o = 0; o <= 19; o++) {
			if (getTable_1()[o] == null) {
				i = false;
			} else if (Liste.table_1[o].nom.equals(src)) {
				i = true;
				break;
			}
		}
	}

	public JTable getTable_1() {
		return table_1;
	}
}
