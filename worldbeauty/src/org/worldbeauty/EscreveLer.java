package org.worldbeauty;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class EscreveLer {
	static String local = "C:\\Users\\Caique Silverio\\Desktop\\Clientes.txt";
	
	
	public static void escrever(Cliente pessoa) throws Exception{
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(local));
		buffWrite.append(pessoa + "\n");
		buffWrite.close();
	
	}
	

}


