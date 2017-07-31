package br.com.estudos.builder;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {
	
	private static Scanner scan;
	public static ArrayList<Pizza> pizzas;
	
	public static void main(String[] args) {
		
		pizzas = new ArrayList<>();
		
		int continuar =0;
		
		do{
		
		new PizzaBuilder();
		scan = new Scanner(System.in);
		continuar = scan.nextInt();
		
		}while(continuar == 1);
		
	
	System.out.println(pizzas);
	
	
	}

}
