package atividadePoo;

public abstract class Programador extends Funcionario {

	@Override
	public void aumentasalario(double aumento) {
		// TODO Auto-generated method stub
		setSalario(getSalario()*aumento);	}


}
