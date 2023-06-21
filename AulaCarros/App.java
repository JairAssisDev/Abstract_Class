package AulaCarros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		List<Dono>donos=new ArrayList<Dono>();
		List<Veiculo>listaVeiculos = new ArrayList<Veiculo>();

		Veiculo carro1 = new Carro("fiat", 2000, "fiat uno");
		Veiculo carro2 = new Carro("honda", 1999, "Civic");
		Veiculo carro3 = new Carro("honda", 2023, "Civic");

		Veiculo moto1 = new Moto("yamara", 2000, "fazer");
		Veiculo moto2 = new Moto("BMW", 2018, "f800");
		Veiculo moto3 = new Moto("Honda", 2020, "cb1000");

		Veiculo caminhao1 = new Camilhao("scania", 2010, "1313");

		listaVeiculos.add(carro1);
		listaVeiculos.add(carro2);
		listaVeiculos.add(carro3);
		listaVeiculos.add(moto1);
		listaVeiculos.add(moto2);
		listaVeiculos.add(moto3);
		listaVeiculos.add(caminhao1);

		Dono dono1 = new Dono(listaVeiculos, "jair");
		donos.add(dono1);


		List<Veiculo>listaVeiculos2 = new ArrayList<Veiculo>();

		Veiculo carro4 = new Carro("fiat", 2000, "marea");
		Veiculo carro5 = new Carro("honda", 1997, "Civic");
		Veiculo carro6 = new Carro("BMW", 2023, "x7");

		Veiculo moto4 = new Moto("honda", 2000, "bis");
		Veiculo moto5 = new Moto("BMW", 2018, "f1200");
		Veiculo moto6 = new Moto("Honda", 2020, "xre300");

		Veiculo caminhao2 = new Camilhao("mercedes", 1970, "1113");

		listaVeiculos2.add(carro4);
		listaVeiculos2.add(carro5);
		listaVeiculos2.add(carro6);
		listaVeiculos2.add(moto4);
		listaVeiculos2.add(moto5);
		listaVeiculos2.add(moto6);
		listaVeiculos2.add(caminhao2);
		Dono dono2 = new Dono(listaVeiculos2, "everton");
		donos.add(dono2);

		for (Dono dono : donos) {
			System.out.println(dono.getNome());
			System.out.println("------------------------");
			System.out.println("Digite qual tipo de veiculo você quer ver: (1-Caminhão, 2-Carro, 3-Moto, 0-Sair)");
			String valor = s.nextLine();

			switch (valor) {
			case "1": {
				for (Veiculo veiculo : dono.getVeiculos()) {
					if (veiculo instanceof Camilhao) {
						System.out.println("Marca: " + veiculo.getMarca());
						System.out.println("Ano: " + veiculo.getAno());
						System.out.println("Modelo: " + veiculo.getModelo());
						System.out.println("-----------------------");
					}
				}
				break;
			}
			case "2": {
				for (Veiculo veiculo : dono.getVeiculos()) {
					if (veiculo instanceof Carro) {
						System.out.println("Marca: " + veiculo.getMarca());
						System.out.println("Ano: " + veiculo.getAno());
						System.out.println("Modelo: " + veiculo.getModelo());
						System.out.println("-----------------------");
					}
				}
				break;
			}
			case "3": {
				for (Veiculo veiculo : dono.getVeiculos()) {
					if (veiculo instanceof Moto) {
						System.out.println("Marca: " + veiculo.getMarca());
						System.out.println("Ano: " + veiculo.getAno());
						System.out.println("Modelo: " + veiculo.getModelo());
						System.out.println("-----------------------");
					}
				}
				break;
			}
			case "0": {
				break;
			}
			}
		}
	}
}

