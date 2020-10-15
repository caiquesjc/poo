package com.fatec;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	
	public String placa, model, anoF, Vcom, id;
	
	static Controle controle = new Controle();
	
	public static List<Veiculo> carros = new ArrayList<Veiculo>();
	
	public String toString() {
		String del = "####################";
		return del +"\nID Cliente: " +id +"\nPlaca: "+placa + "\nModelo: "+model
				+"\nAno Fab.: "+anoF + "\nValor: "+Vcom;
	} 
	public static void adcVei() {
		
		Veiculo vei = new Veiculo();
		
		System.out.println("Digite o id: \n");
		vei.id = controle.texto();
		
		System.out.println("Digite a placa: \n");
		vei.placa = controle.texto().toUpperCase();
		
		System.out.println("Digite o modelo: \n");
		vei.model = controle.texto().toUpperCase();
		
		System.out.println("Digite o ano de fabricação: \n");
		vei.anoF = controle.texto().toUpperCase();
		
		System.out.println("Digite o valor: \n");
		vei.Vcom = controle.texto().toUpperCase();
		
		carros.add(vei);
		System.out.println(vei);
		
	}
	
	public static void listarVei() {
		System.out.println("\n############### Veiculos ##############\n");
		if(carros.isEmpty()) {
			System.out.println("Não há cadastros :(");
		}else {
		carros.forEach(p -> System.out.println(p));
		int aux2 = carros.size();
		System.out.println("Quantidade de cadastro "+ aux2);
		}
	}
}
