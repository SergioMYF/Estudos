package br.com.estudo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EstudocomIO {

	//private static final String PL = System.lineSeparator();
	
	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("texto3.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String save = "";
		String linha = br.readLine();

		do {
			
			if (linha == null) {break;}

			save = (save+linha+"\n");
			
			linha = br.readLine();
			
		} while (linha != null);
		
		br.close();
				
		FileOutputStream x = new FileOutputStream("texto3.txt");
		OutputStreamWriter y = new OutputStreamWriter(x);
		BufferedWriter z = new BufferedWriter(y);

		z.write(save);

		Scanner scan = new Scanner(System.in);
		
		for (int i = 0;i<3;i++){
		
		System.out.println("digite");
		
		String item = scan.nextLine();
		if(item.length()>1){
			
		z.write(item+"\n");

		}else{}
		
		}

		scan.close();
		z.close();
	
	}
}
