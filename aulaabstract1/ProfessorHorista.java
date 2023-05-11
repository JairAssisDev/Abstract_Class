package aulaabstract1;

import poo.Funcionario;

public class ProfessorHorista extends Funcionario {

	@Override
	public void aumentasalario(double salario) {
		// TODO Auto-generated method stub
		setSalario(getSalario()+salario);
	}

}
