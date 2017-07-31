package br.com.estudos.tipagem;

public class TiposDeVariaveis {
		
	byte      a;
	short     b;
	int       c;
	long      d;
	float     e;
	double    f;
	char      g;
	boolean   h;
	Byte      i;
	Short     j;
/**/Integer   k;
	Long      l;
	Float     m;
	Double    n;
	Character o;
/**/Boolean   p;
/**/String    q;

public void explicacao() {

	/* byte (primitivo):
	 * 
	 * Números inteiros positivos e negativos de -128 até 127
	 * 
	 * 
	 * */
	
	a = 127;
	
	/* short (primitivo):
	 * 
	 * Números inteiros positivos e negativos de -32.768 até 32.767 (Não usar ponto para separação de milhar)
	 * 
	 * */
	
	b = 32767; //(e não 32.767)
	
	/* int (primitivo):
	 * 
	 * Números inteiros positivos e negativos de -2.147.483.648 até 2.147.483.647 (Não usar ponto para separação de milhar) 
	 * 
	 * */
	
	
	c = 2147483647; //(e não 2.147.483.647)
	
	/* long (primitivo):
	 * 
	 * Números inteiros positivos e negativos de  -9.223.372.036.854.775.808L até  9.223.372.036.854.775.807L (Não usar ponto para separação de milhar)
	 * (Não esquecer de usar "l" ou "L" no final do número)
	 *
	 * */
	
	d = 9223372036854775807L; //(e não 9.223.372.036.854.775.807)
	
	/* float (primitivo):
	 * 
	 * Números decimais positivos e negativos de  até  (Não usar ponto para separação de milhar)
	 * (Não esquecer de usar "f" ou "F" no final do número)
	 * 
	 * */
	
	
	
	}

}