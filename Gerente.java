//Gerente herda da Class Funcionario           
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getbonificacao() {
		//Indicação para a Class mãe/Base Class ou Super Class
		return super.getbonificacao() + super.getSalario();
	}

}


