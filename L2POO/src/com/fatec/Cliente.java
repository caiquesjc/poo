package com.fatec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente {
	
	public String nome, tel, end, cpf;
	int id;
	static Controle controle = new Controle();
	
	static Random gerador = new Random();
	
	public static List<Cliente> pessoas = new ArrayList<Cliente>();
	
	public String toString() {
		String del = "\n####################";
		return del + "\nid: "+ id + "\nNome:"+nome + "\nTelefone: "+tel
				+"\nEndereço: "+end + "\nCPF: "+cpf+ "\n"+del;
	}
	
	public static void cadastrar() {
		Cliente pessoa = new Cliente();
		
		pessoa.id =gerador.nextInt(1000);
		while (pessoa.id < 0)
			pessoa.id =gerador.nextInt(1000);
		
		System.out.println("Digite o nome: \n");
		pessoa.nome = controle.texto().toUpperCase();
		
		System.out.println("Digite o telefone (xx)xxxxx-xxxx: \n");
		pessoa.tel = controle.texto().toUpperCase();
		
		System.out.println("Digite o Endereço: \n");
		pessoa.end = controle.texto().toUpperCase();
		
		System.out.println("Digite o CPF: \n");
		pessoa.cpf = controle.texto().toUpperCase();
		
		pessoas.add(pessoa);
		System.out.println(pessoa);
		
			
	}
	
	public static void listar() {
		System.out.println("\n############### Clientes ##############\n");
		if(pessoas.isEmpty()) {
			System.out.println("Não há cadastros :(");
		}else {
		pessoas.forEach(p -> System.out.println(p));
		int aux = pessoas.size();
		System.out.println("Quantidade de cadastro "+ aux);
		}
	}
	

}
