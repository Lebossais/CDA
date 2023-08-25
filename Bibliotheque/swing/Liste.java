package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;

public class Liste extends JFrame {

private static final long serialVersionUID = 1L;
private RomanDynamique modele = new RomanDynamique();
private JTable tableau;

public Liste() {
    super();

    setTitle("Liste des Romans");
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
    new Liste().setVisible(true);
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
        modele.addRoman(new Roman("Eragon", "Paolini", 17, false));
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
            modele.removeRoman(selection[i]);
        }
    }
}
public void actionPerformed(ActionEvent e) {
    int[] selection = Roman.getSelectedRows();
    int[] modelIndexes = new int[selection.length];

    for(int i = 0; i < selection.length; i++){
        modelIndexes[i] = Roman.getRowSorter().convertRowIndexToModel(selection[i]);
    }

    Arrays.sort(modelIndexes);

    for(int i = modelIndexes.length - 1; i >= 0; i--){
    //    Roman.removeRoman(modelIndexes[i]);
    }
}

class FilterAction extends AbstractAction {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



private FilterAction() {
    super("Filtrer");
}



public void actionPerformed(ActionEvent e) {
    String regex = JOptionPane.showInputDialog("Regex de filtre : ");

  //  sorter.setRowFilter(RowFilter.regexFilter(regex, 0, 1));
}
}
}
