package br.ex.arrays;

import java.util.Scanner;

public class Ex1_OrdemIversa {
	Scanner scanner = new Scanner (System.in);

	public void inverterOrdem() {
		System.out.println("------------------------");
		System.out.println("Exercício Inverter Ordem");
		System.out.println("------------------------");
		
		// Minha solução para o exercício: 
		
		/*
		int vNum[] = new int[6];
		int vInverter[] = new int[6];
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Digite o "+ (i + 1) +" número: ");
			vNum[i] = scanner.nextInt();
		}
		
		for (int i = 5, j = 0; i >= 0; i--, j++ ) {
			vInverter[j] = vNum[i];
			
			System.out.print(vInverter[j]);
		}
	*/
		
		
		//Solução do curso:
		
		int[] vetor = {0, -5, 15, 50, 8, 4};
		int count = 0;
		
		while(count < (vetor.length)) {
			
			System.out.print(vetor[count] + " ");
			
			count++;
		}
		
		System.out.println();
		
		for (int i = (vetor.length - 1); i >= 0; i--){
			System.out.print(vetor[i] + " ");
		}
		
	}
	
}
