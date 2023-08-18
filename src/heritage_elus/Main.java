package heritage_elus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.start();
	}

	
	public void start() {
		
		Elus elus = new Elus("Jean", "Yves");
		Elus_mafieux elus_mafieux = new Elus_mafieux("Sergio", "Constani");
//		elus.embaucher();
//		elus.embaucher();
//		elus.addSous(5000);
//		elus.dotation();
		
		elus_mafieux.embaucher();
	}
	
}
