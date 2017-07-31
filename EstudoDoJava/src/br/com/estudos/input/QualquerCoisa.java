package br.com.estudos.input;

public class QualquerCoisa {

	String nome;
	int valor;
	
	public QualquerCoisa(String nome, String valor) {
		
		this.nome = nome;
		this.valor = (int)Integer.valueOf(valor);
		
	}
	
	@Override
	public String toString() {
		
		return this.nome;
		
	}
	
}
