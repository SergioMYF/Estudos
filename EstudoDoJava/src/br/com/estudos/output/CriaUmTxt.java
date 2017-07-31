package br.com.estudos.output;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CriaUmTxt {
	
	private static final String PL = System.lineSeparator();
	
	public static void main(String[] args) throws IOException {

	FileOutputStream is = new FileOutputStream("texto2.txt");
	OutputStreamWriter isr = new OutputStreamWriter(is);
	BufferedWriter br = new BufferedWriter(isr);

	br.write("oloco"+";");
	br.write("funcionou"+";");
	br.write("saporra"+";"+PL);
	
	br.close();
	}

}
