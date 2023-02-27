import java.util.Scanner;

import br.ex.arrays.Ex1_OrdemIversa;
import br.ex.arrays.Ex_Consoantes;
import br.ex.arrays.Ex_NumerosAleatorios;
import br.ex.loops.Ex_Fatorial;
import br.ex.loops.Ex_MaiorEMedia;
import br.ex.loops.Ex_NomeEIdade;
import br.ex.loops.Ex_Nota;
import br.ex.loops.Ex_ParEImpar;
import br.ex.loops.Ex_Tabuada;

public class Visual {
	Scanner scanner = new Scanner (System.in);
	int opc = 1;
	
	public void opcLoops() {
	
		do {
			System.out.println("-----------------------------");
			System.out.println("      Exercícios Loops       ");
			System.out.println("-----------------------------");
			System.out.println("Selecione o exercício:       ");
			System.out.println("1 - Nome e Idade             ");
			System.out.println("2 - Nota                     ");
			System.out.println("3 - Média e maior número     ");
			System.out.println("4 - Impar ou Par             ");
			System.out.println("5 - Tabuada                  ");
			System.out.println("6 - Fatorial                 ");
			System.out.println("0 - Sair                     ");
			System.out.println("-----------------------------");
			opc = scanner.nextInt();
			
			switch (opc) {
			case 0:
				break;
				
			case 1:
				Ex_NomeEIdade ex1 = new Ex_NomeEIdade();
				ex1.lerDados();
				break;
				
			case 2:
				Ex_Nota ex2 = new Ex_Nota();
				ex2.pedirNota();
				break;
				
			case 3:
				Ex_MaiorEMedia ex3 = new Ex_MaiorEMedia();
				ex3.calcularMedia();
			
			case 4:
				Ex_ParEImpar ex4 = new Ex_ParEImpar();
				ex4.imparOuPar();
				
			case 5: 
				Ex_Tabuada ex5 = new Ex_Tabuada();
				ex5.gerarTabuada();
				
			case 6:
				Ex_Fatorial ex6 = new Ex_Fatorial();
				ex6.fatorial();
			}
			
		} while (opc == 0);
		
	}
	
	
	
	public void opcArrays() {
		
		do {
			System.out.println("-----------------------------");
			System.out.println("      Exercícios Loops       ");
			System.out.println("-----------------------------");
			System.out.println("Selecione o exercício:       ");
			System.out.println("1 - Ordem Inversa            ");
			System.out.println("2 - Consoantes               ");
			System.out.println("3 - Números Aleatórios       ");
			System.out.println("0 - Sair                     ");
			System.out.println("-----------------------------");
			opc = scanner.nextInt();
			
			switch (opc) {
			case 0:
				break;
				
			case 1:
				Ex1_OrdemIversa ex1 = new Ex1_OrdemIversa();
				ex1.inverterOrdem();
				
				break;
			
			case 2:
				Ex_Consoantes ex2 = new Ex_Consoantes();
				ex2.identificaConsoantes();
				
				break;
				
			case 3: 
				Ex_NumerosAleatorios ex3 = new Ex_NumerosAleatorios();
				ex3.numerosAleatorios();
				
				break;
			}
		} while  (opc == 0);
			
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
