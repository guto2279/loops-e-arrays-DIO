import java.util.Scanner;

public class Execultavel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Visual visual = new Visual();
		int opc = 1;
		
		
		
		do {
			System.out.println("----------------------------------");
			System.out.println("   Exercicios de Arrays e Loops   ");
			System.out.println("----------------------------------");
			System.out.println("1 - Loops                         ");
			System.out.println("2 - Arrays                        ");
			System.out.println("0 - Sair                          ");
			System.out.println("----------------------------------");
			System.out.println("Escolha uma opção: ");
			opc = scanner.nextInt();
			if (opc == 1) {
				visual.opcLoops();
			}else if (opc == 2){
				visual.opcArrays();
			}
			
			
		}while(opc == 0);

		
		
		
	}

}
