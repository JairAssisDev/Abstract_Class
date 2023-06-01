package Auladia1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dono>donos=new ArrayList<Dono>();
		
		
		Animal cachoro1 = new Cachoro();
		cachoro1.setNome("caca");
		Dono dono1 = new Dono();
		dono1.setNome("jair");
		
		Dono dono2 = new Dono();
		dono2.setNome("jair");
		Animal cachoro2 = new Cachoro();
		cachoro2.setNome("caca");
		
	}

}
