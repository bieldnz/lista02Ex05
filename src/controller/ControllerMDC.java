package controller;

public class ControllerMDC {

	public ControllerMDC() {
		super();
	}

	public int calcMDC(int n1, int n2, int cont) {

		if (cont > 0) {
			if (((n1 % cont) == 0) && ((n2 % cont) == 0)) {
				return cont;
			} else {
				int result = calcMDC(n1, n2, cont - 1);
				return result;
			}

		} else {
			return 0;
		}

	}

}
