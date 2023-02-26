package br.ex.loops;
import java.util.Scanner;

public class Ex_NomeEIdade {
	
	
	String nome;
	int idade;
	
	public void lerDados(){
		Scanner scanner = new Scanner (System.in);
	
		
		while(true) {
			
			System.out.println("---------------------------------");
			System.out.println("   Exercicio 1 - Nome e Idade    ");
			System.out.println("---------------------------------");
			System.out.println("Digite 0 no campo nome para sair ");
			System.out.println("---------------------------------");
			
				System.out.println("Digite o nome do aluno: ");
				nome = scanner.next();
				if (nome.equals("0")) break;
				
				System.out.println("Digite a idade do aluno: ");
				idade = scanner.nextInt();
	
		}
			
	} 
		
		
}

