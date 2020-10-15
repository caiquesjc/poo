package org.worldbeauty;

public class Cliente {
	public String id, nome, dataNasc, tel, sexo;

	@Override
	public String toString() {
		String delimiter = "##############################";
		return delimiter + "\nId: " + id + "\nNome: " + nome + "\nNascimento: " + dataNasc +
				"\nTelefone: " + tel + "\nSexo: " + sexo + "\n"+delimiter;
	}
	
	
}
