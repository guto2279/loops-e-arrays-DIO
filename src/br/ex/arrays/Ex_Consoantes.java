package br.ex.arrays;

import java.util.Scanner;

public class Ex_Consoantes {
	
	Scanner scanner = new Scanner(System.in);
	
	public void identificaConsoantes() {
		
		
	// Minha solução para o exercício: 
	
	/* 
	int quantConsoantes = 0, contConsoantes = 0;
	char vLetras[] = new char [6]; 
	char vConsoantes[] = new char [6]; 
		
		for (int i = 0; i <= 5; i++) {
			
			System.out.println("Digite uma letra: ");
			vLetras[i] = scanner.next().charAt(0);
			
			if (vLetras[i] != 'a' && vLetras[i] != 'e' &&
					vLetras[i] != 'i' && vLetras[i] != 'o' && vLetras[i] != 'u') {
				
				vConsoantes[contConsoantes] = vLetras[i];
				contConsoantes++;
			}
			
		}
		
		if (contConsoantes > 0) {
			System.out.println("Foram identificados " + (contConsoantes) + " consoantes");
			for (int i = 0; i < contConsoantes; i++) {
				System.out.print(vConsoantes[i] + " ");
			}
		}else {
			System.out.println("Não foram identificados consoantes!");
		} */
	
	
	// Solução apresentada pelo curso:
		
		String []consoantes = new String[6];		
		
		int quantidadeConsoantes = 0;
		int count = 0;
		 
		do {
			System.out.println("Digite uma letra: ");
			String letra = scanner.next();
			if ( ! (letra.equalsIgnoreCase("a") || 
				letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") || 
				letra.equalsIgnoreCase("u") ) ) {
				
				consoantes[count] = letra;
				quantidadeConsoantes++;
			}
				
			count++;
			
		 }while(count < consoantes.length);
		
		System.out.println("Foram identificados " + quantidadeConsoantes + " consoantes");
		for (String consoante : consoantes) {
			if (consoante != null) 
			System.out.print(consoante + " ");
		}
	}
	
}
