package caSert;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import caSert.Ami.Sport;

public class JTableBasiqueAvecModeleDynamiqueObjet extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ModeleDynamiqueObjets modele = new ModeleDynamiqueObjets();
    private JTable tableau;
 
    public JTableBasiqueAvecModeleDynamiqueObjet() {
        super();
 
        setTitle("JTable avec modèle dynamique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        tableau = new JTable(modele);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        JPanel boutons = new JPanel();
 
        boutons.add(new JButton(new AddAction()));
        boutons.add(new JButton(new RemoveAction()));
 
        getContentPane().add(boutons, BorderLayout.SOUTH);
 
        pack();
    }
 
    public static void main(String[] args) {
        new JTableBasiqueAvecModeleDynamiqueObjet().setVisible(true);
    }
 
    private class AddAction extends AbstractAction {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private AddAction() {
            super("Ajouter");
        }
 
        public void actionPerformed(ActionEvent e) {
            modele.addAmi(new Ami("Megan", "Sami", Color.green, false, Sport.NATATION));
        }
    }
 
    private class RemoveAction extends AbstractAction {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private RemoveAction() {
            super("Supprimmer");
        }
 
        public void actionPerformed(ActionEvent e) {
            int[] selection = tableau.getSelectedRows();
 
            for(int i = selection.length - 1; i >= 0; i--){
                modele.removeAmi(selection[i]);
            }
        }
    }
}