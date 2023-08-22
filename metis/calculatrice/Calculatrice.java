package calculatrice;

import calculatrice.MyException;

public class Calculatrice {

	public static double calculer(char ope, double var1, double var2) throws MyException {

		switch (ope) {

		case '+':
			return var1 + var2;

		case '-':
			return var1 - var2;

		case '*':
			return var1 * var2;

		case '/':
			if (var2 == 0) {
				throw new MyException("Division par zéro impossible");
			}

			return var1 / var2;

		default:
			throw new MyException("Opérateur '" + ope + "' inconnu");
		}

	}

	public static long factorielle(int valeur) throws MyException {
		if (valeur <= 1) {
			return 1;
		} else
			return valeur * factorielle(valeur - 1);
	}

}
