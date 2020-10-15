package org.worldbeauty;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Controle controle = new Controle();
		List<Cliente> cadastros = new ArrayList<Cliente>();
		
		int escolha = 0;
		int aux;
		
		
		while ( escolha != 7 ) {
			Menu.mostrarMenu();
			escolha = controle.opcao();
			

			if (escolha == 1) {
				Cliente pessoa = new Cliente();
				pessoa.id = Integer.toString(cadastros.size() + 1);
				System.out.println("Digite o nome:\n");
				pessoa.nome = controle.texto();
				
				System.out.println("Digite a data de nascimento:\n");
				pessoa.dataNasc = controle.texto();
				
				System.out.println("Digite o telefone\n");
				pessoa.tel = controle.texto();
				
				System.out.println("Digite o sexo:\n");
				pessoa.sexo = controle.texto();
				cadastros.add(pessoa); 
				}
				
			if (escolha == 2) {
				System.out.println("Digite o id do cadastro\n");
				aux = controle.opcao2();
				
				Cliente pessoa = new Cliente();
				pessoa.id = Integer.toString(cadastros.size() + 1);
				System.out.println("Digite o nome:\n");
				pessoa.nome = controle.texto();
				
				System.out.println("Digite a data de nascimento:\n");
				pessoa.dataNasc = controle.texto();
				
				System.out.println("Digite o telefone\n");
				pessoa.tel = controle.texto();
				
				System.out.println("Digite o sexo:\n");
				pessoa.sexo = controle.texto();
				cadastros.set(aux-1, pessoa); 
				
				System.out.println("Cadastro editado!\n");
			}
				
			if (escolha == 3) {
				System.out.println("Digite o id do cadastro\n");
				aux = controle.opcao2();
				System.out.println("cad: "+cadastros.get(aux-1));
				cadastros.remove(aux-1);
				System.out.println("Cadastro removido!\n");
			}
				
			if (escolha == 4) {
				cadastros.forEach(p -> System.out.println(p));
				aux = cadastros.size();
				System.out.println("Quantidade de cadastro "+ aux);
				if(cadastros.isEmpty()) {
					System.out.println("Não há cadastros :(");
				}
			}
			
			if (escolha == 5) {
				for (Cliente pessoa : cadastros) {
					EscreveLer.escrever(pessoa);
				}
				if (escolha == 6) {
					System.out.println("Nada definido ainda!");
				}
			}
			if (escolha == 7) {
				System.out.println("\nFechado!\n");
				
			}
		} 
	}

}

//System.out.println("Digite o: ");