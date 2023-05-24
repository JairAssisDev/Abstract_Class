package catAnddog;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Dono>donos=new ArrayList<Dono>();
		
		Dono dono1 = new Dono("jair");
		Dono dono2 = new Dono("Kaua");
		Dono dono3 = new Dono("lucas");
		
		donos.add(dono1);
		donos.add(dono2);
		donos.add(dono3);
		
		Dog dog1 = new Dog();
		dog1.setNome("Chupacabra");
		dog1.setDono(donos);
		Cat cat1 = new Cat();
		cat1.setNome("batme");
		cat1.setDono(donos);
		for (Dono dono : dog1.getDono()) {
			System.out.println(dog1.getNome() +" "+ dono.getNome());
		}
		for (Dono dono : cat1.getDono()) {
			System.out.println(cat1.getNome()+" "+ dono.getNome());
		}
	}

}
