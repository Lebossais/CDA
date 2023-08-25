package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class RomanDynamique extends AbstractTableModel {

		private static final long serialVersionUID = 5380417556060869746L;

		private final List<Roman> romans = new ArrayList<Roman>();
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Roman.getModel());   
	 
	    private final String[] entetes = {"Auteur", "Nom", "ISBN", "Dispo"};
	 
	    public RomanDynamique() {
	        super();
	 
	        romans.add(new Roman("Andrew", "The Witcher", 1, true ));
	        romans.add(new Roman("Larian", "Divinity", 2, true));
	        romans.add(new Roman("Larian", "Les Portes de Baldur", 3, true));
	        romans.add(new Roman("Lang", "Naheulbeuk", 4 , false ));
	        romans.add(new Roman("Le Chat", "Schrödinger", 5 , false ));
	        romans.add(new Roman("Jerôme", "Apprendre à coder", 6 , false ));
	        romans.add(new Roman("Kim", "Deviens Anarchique", 7 , true));
	    }
	 
	    public int getRowCount() {
	        return romans.size();
	    }
	 
	    public int getColumnCount() {
	        return entetes.length;
	    }
	 
	    public String getColumnName(int columnIndex) {
	        return entetes[columnIndex];
	    }
	 
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch(columnIndex){
	            case 0:
	                return romans.get(rowIndex).getAuteur();
	            case 1:
	                return romans.get(rowIndex).getNom();
	            case 2:
	                return romans.get(rowIndex).getisbn();
	            case 3:
	                return romans.get(rowIndex).isdispo();
	            default:
	                return null; //Ne devrait jamais arriver
	        }
	    }
	 
	    public void addRoman(Roman roman) {
	        romans.add(roman);
	 
	        fireTableRowsInserted(romans.size() -1, romans.size() -1);
	    }
	 
	    public void removeRoman(int rowIndex) {
	        romans.remove(rowIndex);
	 
	        fireTableRowsDeleted(rowIndex, rowIndex);
	    }
	    
	}