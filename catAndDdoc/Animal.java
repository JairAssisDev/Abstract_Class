package catAnddog;

import java.util.List;

public abstract class Animal {
	private String nome;
	
	private List<Dono>dono;
	
	public abstract void falar();
	public void dormir() {
		System.out.println("rivotril");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome =nome;
	}
	
	public List<Dono>getDono(){
		return dono;
	}
	public void setDono(List<Dono>dono) {
		this.dono=dono;
	}
	

}
