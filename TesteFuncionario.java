
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Souza");
		nico.setCpf("42171358823");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getbonificacao());
		
		//nico.salario = 300;
	}
}
