package br.ex.loops;

import java.util.Scanner;

public class Ex_Nota {
	
	public void pedirNota() {
		
		Scanner scanner = new Scanner(System.in);
		
		int nota;
		System.out.println("Digite um valor ente 0 e 10");
		nota = scanner.nextInt();
		
		/*
		 // Minha solução para o exercício: 
		int verificador;
		
		
		
		do {
			if (nota < 0 || nota > 10) {
				System.out.println("Digite uma nota válida");
				nota = scanner.nextInt();
				verificador = 0;
			}else {
				verificador = 1;
			}
		}while(verificador != 1);
		*/
		
		//Solução apresentada no curso:
		
		while (nota < 0 || nota > 10) {
			System.out.println("Digite uma nota válida: ");
			nota = scanner.nextInt();
		}
		
		System.out.println("Programa Finalizado!");
		
	}

}
