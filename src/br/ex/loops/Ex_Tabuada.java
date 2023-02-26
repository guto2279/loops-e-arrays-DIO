package br.ex.loops;

import java.util.Scanner;

public class Ex_Tabuada {
	
	public void gerarTabuada() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		System.out.println("          Exercício de Tabuada         ");
		System.out.println("---------------------------------------");
		
		// Minha solução para o exercício: 
		
		/*
		int escolha;
		
		
		System.out.println("Deseja ver qual tabuada? (De 0 a 10)");
		escolha = scanner.nextInt();
		
		while(escolha < 0 || escolha > 10) {
			System.out.println("Digite uma tabuada de 0 a 10: ");
			escolha = scanner.nextInt();
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(escolha + " X " + i +  " = " +  (escolha * i));
		}
		*/
		
		//Solução apresentada no curso:
		
		int tabuada;
		
		System.out.println("Tabuada: ");
		tabuada = scanner.nextInt();
		
		System.out.println("Tabuada de " + tabuada);
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
			
		}
	}

}
