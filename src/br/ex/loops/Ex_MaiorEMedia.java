package br.ex.loops;

import java.util.Scanner;

public class Ex_MaiorEMedia {

	
	public void calcularMedia() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println(" Exercício de média e maior número ");
		System.out.println("-----------------------------------");
		
		/*
		// Minha solução para o exercício: 
	
		int vNum[] = new int [5];
		int media, maior;
		media = 0;
		maior = 0;
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite o valor "+ (i + 1) +" :" );
			vNum[i] = scanner.nextInt();
			media += vNum[i];
			
			if (maior < vNum[i]) maior = vNum[i];
				
		}
		
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);*/
		
		//Solução apresentada no curso:
		
		int numero;
		int count = 0;
		int maior = 0;
		int soma = 0;
		
		do {
		
			System.out.println("Digite o numero " +(count + 1)+" : ");
			numero = scanner.nextInt();
			
			soma += numero;
			
			if (numero > maior) maior = numero;
			
			count = count + 1;
		}while(count < 5);
		System.out.println("Maior número: " + maior);
		System.out.println("Média: " + (soma / 5));
	}
}
