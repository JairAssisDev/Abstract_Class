package AulaCarros;

import java.util.List;

public class Dono {

	List<Veiculo>veiculos;
	private String nome;
	public Dono(List<Veiculo> veiculos, String nome) {
		super();
		this.veiculos = veiculos;
		this.nome = nome;
	}
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
