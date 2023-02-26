import java.util.Scanner;

import br.ex.loops.Ex_MaiorEMedia;
import br.ex.loops.Ex_NomeEIdade;
import br.ex.loops.Ex_Nota;
import br.ex.loops.Ex_ParEImpar;

public class Execultavel {

	public static void main(String[] args) {
		int opc;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("-----------------------------");
			System.out.println("Exercícios Loops e Arrays DIO");
			System.out.println("-----------------------------");
			System.out.println("Selecione o exercício:       ");
			System.out.println("1 - Nome e Idade             ");
			System.out.println("2 - Nota                     ");
			System.out.println("3 - Média e maior número     ");
			System.out.println("4 - Impar ou Par             ");
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
			}
			
			
			
		}while(opc == 0);

		
		
		
	}

}
