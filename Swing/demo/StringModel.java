package demo;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;


import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class StringModel extends DefaultComboBoxModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> strings;
 
	public StringModel(){
		super();
 
		strings = new ArrayList<String>();
	}
 
	public StringModel(String[] strings){
		super();
 
		this.strings = new ArrayList<String>();
 
		for(String string : strings){
			this.strings.add(string);
		}
	}
 
	protected ArrayList<String> getStrings(){
		return strings;
	}
 
	public String getSelectedString(){
		return (String)getSelectedItem();
	}
 
	@Override
	public Object getElementAt(int index) {
		return strings.get(index);
	}
 
	@Override
	public int getSize() {
		return strings.size();
	}
 
	@Override
	public int getIndexOf(Object element) {
		return strings.indexOf(element);
	}
}
