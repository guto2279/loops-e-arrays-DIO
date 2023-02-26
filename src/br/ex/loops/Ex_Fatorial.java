package br.ex.loops;

import java.util.Scanner;

public class Ex_Fatorial {
	
	
	public void fatorial() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("-------------------------------------");
		System.out.println("         Exercício Fatorial          ");
		System.out.println("-------------------------------------");
		
		// Minha solução para o exercício: 
		
		/*
		int quantFatorial = 0, fatorial = 0;
		int cont = 0;
		
		System.out.println("Digite o número que deseja ver o fatorial: ");
		quantFatorial = scanner.nextInt(); 
		
		
		
		for (int i = quantFatorial; i > 0; i--) {
			if (cont == 0) {
				fatorial = i * (i-1);
				i--;
				cont += 1;
			}else {
				fatorial *= i;
			}
			
		}
		
		System.out.println(quantFatorial +"!: "+ fatorial);
		*/
		
		//Solução apresentada no curso: 
	
		
		System.out.println("Fatorial: ");
		int fatorial = scanner.nextInt();
		int multiplicacao = 1;
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao *= i;
			
		}
		
		System.out.println(fatorial + "!: " + multiplicacao);
	}

}
