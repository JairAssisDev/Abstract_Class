package poo;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int optionUser,inprimir_dados, aumentar_salario;

		Gerente gerente = new Gerente();
		Programador programador = new Programador();
		
		gerente.setNome("Paulo");
		gerente.setSalario(20000);
		

		programador.setNome("jair victor");
		programador.setSalario(44000);
		
		while (true) {
			System.out.println(" Escolha uma das 3 opções ");
			System.out.println("1 - para Imprimir dados dos funcionarios");
			System.out.println("2 - para Aumentar o salario dos funcionarios");
			System.out.println("0 - para sair do programa");
			optionUser = ler.nextInt();
			System.out.println("---_----------_----------_--------_------");
			if(optionUser==1){
				System.out.println("Voce deseja imprimir os dados do Gerente ou do Programador ?");
				System.out.println("1 - para Gerente");
				System.out.println("2 - para Programador");
				inprimir_dados = ler.nextInt();
				System.out.println("---_----------_----------_--------_------");
				if(inprimir_dados==1){
					System.out.println("Nome: "+gerente.getNome());
					System.out.println("Salario: "+ gerente.getSalario());
					System.out.println("---_----------_----------_--------_------");
				}
				if (inprimir_dados==2) {
					System.out.println("Nome: "+programador.getNome());
					System.out.println("Salario: "+ programador.getSalario());
					System.out.println("---_----------_----------_--------_------");
				}
			}
			if(optionUser==2){
				System.out.println("Voce deseja aumentar o salario do Gerente ou do Programador ?");
				System.out.println("1 - para Gerente");
				System.out.println("2 - para Programador");
				aumentar_salario = ler.nextInt();
				System.out.println("---_----------_----------_--------_------");
				if(aumentar_salario==1){
					gerente.aumentasalario(1.10);
					System.out.println("Nome: "+gerente.getNome()+"Salario com os 10% de almento  "+ gerente.getSalario());
					System.out.println("---_----------_----------_--------_------");

				}
				if (aumentar_salario==2) {
					programador.aumentasalario(1.20);
					System.out.println("Nome: "+programador.getNome()+"Salario com os 10% de almento  "+ programador.getSalario());
					System.out.println("---_----------_----------_--------_------");

					}

				}
			if (optionUser==0) {
				break;
			}

			

		

		}
	}
}
