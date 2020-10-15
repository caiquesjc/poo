package com.fatec;

public class Sistema {

	public static void main(String[] args) {
		Controle controle = new Controle();
		Menu.menu();
		int op = controle.opcao();
		
		
		while (op != 5) {
			if (op == 1) {
				Cliente.cadastrar();
				Menu.menu();
				op = controle.opcao();
			}
			if (op == 2) {
				Veiculo.adcVei();
				Menu.menu();
				op = controle.opcao();
			}
			if (op == 3) {
				Cliente.listar();
				System.out.println("\n####################\n");
				Menu.menu();
				op = controle.opcao();
			}
			if (op == 4) {
				Veiculo.listarVei();
				Menu.menu();
				op = controle.opcao();
			}	
		}
		
		System.out.println("Finalizado!\n");
	}

}
