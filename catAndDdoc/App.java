package atividade;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dono>donos= new ArrayList<Dono>();
		
		Dono dono1 = new Dono("jair");
		Dono dono2 = new Dono("Victor");
		Dono dono3 = new Dono("joao");
		
		donos.add(dono1);
		donos.add(dono2);
		donos.add(dono3);
		Dog dog =new Dog();
		dog.setNome("chupaCabra");
		dog.setDono(donos);
		Cat cat = new Cat();
		cat.setNome("pipila");
		for (Dono dono : dog.getDono()) {
			System.out.println(dono.getNome());
			
		}
	}

}
