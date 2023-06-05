package Auladia1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dono>donos=new ArrayList<Dono>();
		
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		
		Dono dono = new Dono();
		dono.getAnimais().add(cachorro);
		dono.getAnimais().add(gato);
		dono.getNome("Paulo mendos");
		donos.add(dono);
		
		Animal cachorro1 = new Cachorro();
		Dono dono1 = new Dono();
		dono.getAnimais().add(cachorro1);
		dono.getNome("fernandes mendos");
		donos.add(dono);
		
		for (Dono x : donos){
			System.out.println(x.getNome());
			for (Animal animal : x.getAnimais()){
				if(animal instanceof Cachorro){
					if(animal.getNome() != null)
						System.out.println("Nome do Cachorro: "+animal.getNome());
	}
	animal.fazerBarulho();
}
			System.out.println("----_____-----")
			}
	}
