package aulapoo1506;

public class Automovel extends Veicolo {

	public Automovel(int ano, String marca, Double podenciaCV) {
		super(ano, marca, podenciaCV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligarANDdesligar() {
		// TODO Auto-generated method stub
				System.out.println("acender farol");
	}

	@Override
	public void qtdRodas() {
		// TODO Auto-generated method stub
		System.out.println("tem 4 rodas");
	}

}
