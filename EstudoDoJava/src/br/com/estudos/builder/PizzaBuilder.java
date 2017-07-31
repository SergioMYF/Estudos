package br.com.estudos.builder;

import java.util.Scanner;

public class PizzaBuilder {
	
	private static Scanner scan;
	
	public PizzaBuilder(){	
		
		Pizza nome = new Pizza(escolherMassa(),escolherIngrediente(),escolherIngrediente());
		teste.pizzas.add(nome);
		
	}
	
	private String escolherIngrediente(){
		
		scan = new Scanner(System.in);
		
		System.out.println("Escolha um ingrediente: tomate, queijo ou calabresa.");
		
		return scan.nextLine();
		
	}
	
	private String escolherMassa(){
		
		System.out.println("Escolha uma massa: massa fina ou massa grossa.");
		
		scan = new Scanner(System.in);
		
		return scan.nextLine();
	
	}

}
