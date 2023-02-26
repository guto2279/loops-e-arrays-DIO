package br.ex.loops;

import java.util.Scanner;

public class Ex_ParEImpar {

	public void imparOuPar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		System.out.println("        Exercício de ímpar e Par       ");
		System.out.println("---------------------------------------");
		
		// Minha solução para o exercício
		/*
		String escolha = "não";
		int cont = 0;
		int impar = 0;
		int par = 0;
		int numero;
		
		do {
			cont++;
			System.out.println("Digite o número "+ cont +" : ");
			numero = scanner.nextInt();
			
			if ((numero % 2) == 0) {
				par++;
			}else {
				impar++;
			}
			
			System.out.println("Deseja contínuar? (sim/não)");
			escolha = scanner.next();
		}while (escolha.equalsIgnoreCase("sim"));
		
		System.out.println("Números pares: "+ par);
		System.out.println("Números ímpares: "+ impar);*/
		
		// Solução do curso:
		
		int quantidadeNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		
		System.out.println("Digite a quantidade de números que deseja digitar: ");
		quantidadeNumeros = scanner.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Digite o numero: " + (count + 1));
			numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				quantPares ++;
			}else {
				quantImpares ++;
			}
			
			count ++;
		}while(count < quantidadeNumeros);
		
		System.out.println("Números pares: "+ quantPares);
		System.out.println("Números ímpares: "+ quantImpares);
		
	}
}
