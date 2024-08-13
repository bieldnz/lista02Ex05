package view;

import controller.ControllerMDC;

public class Principal {

	public static void main(String[] args) {
		ControllerMDC controller = new ControllerMDC();
		
		int maior = 8;
		int menor = 8;
		
		int result = controller.calcMDC(maior, menor, maior);
		System.out.println(result);
	}

}
