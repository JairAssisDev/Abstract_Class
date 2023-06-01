package Auladia1;

import java.util.ArrayList;
import java.util.List;

public class Dono {
	private List<Animal>animals= new ArrayList<Animal>();
	private String nome;
	
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	
}
