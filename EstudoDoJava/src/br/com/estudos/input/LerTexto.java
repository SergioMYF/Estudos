package br.com.estudos.input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LerTexto {

	public static void main(String[] args) throws IOException {

		ArrayList<QualquerCoisa> objetos = new ArrayList<>();
		String[] valores;
		InputStream is = new FileInputStream("texto.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String linha;

		QualquerCoisa coisa;

		do {

			linha = br.readLine();

			if (linha == null) {
			
				break;
			
			}
			
			valores = linha.split(";");
			
			coisa = new QualquerCoisa(valores[0],valores[1]);

			objetos.add(coisa);

		} while (linha != null);
		br.close();
		System.out.println(objetos);
		System.out.println(objetos.get(0).valor);
		int x = (objetos.get(0).valor + objetos.get(1).valor);
		System.out.println(x);
		
	}
	
}
