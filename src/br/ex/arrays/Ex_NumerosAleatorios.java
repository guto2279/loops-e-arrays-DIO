package br.ex.arrays;

import java.util.Random;

public class Ex_NumerosAleatorios {

	public void numerosAleatorios() {
		Random random = new Random();
		
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0;i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		
		System.out.println("Números Aleatórios: ");
		
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\n Sucessores dos números aleatórios: ");
		
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
		
	}
	
}
