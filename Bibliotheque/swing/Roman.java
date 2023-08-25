package swing;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

public class Roman {
    private String nom;
    private String auteur;
    private int isbn;
    private boolean dispo;
 
    public Roman(String nom, String auteur, int isbn, boolean dispo) {
        super();
 
        this.nom = nom;
        this.auteur = auteur;
        this.isbn = isbn;
        this.dispo = dispo;
    }
 
    public String getNom() {
        return nom;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public String getAuteur() {
        return auteur;
    }
 
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
 
    public int getisbn() {
        return isbn;
    }
 
    public void setisbn(int isbn) {
        this.isbn = isbn;
    }
 
    public boolean isdispo() {
        return dispo;
    }
 
    public void setdispo(boolean dispo) {
        this.dispo = dispo;
    }

	public static TableModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[] getSelectedRows() {
		// TODO Auto-generated method stub
		return null;
	}

	public static DefaultRowSorter<TableModel, Integer> getRowSorter() {
		// TODO Auto-generated method stub
		return null;
	}
}