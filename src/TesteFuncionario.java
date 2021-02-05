
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario bruno = new Funcionario();
		
		bruno.setCpf("11111");
		bruno.setNome("Bruno Ricardo");
		bruno.setSalario(4000.00);
		
		System.out.println("CPF do funcionario: " + bruno.getCpf());
		System.out.println("Nome do funcionario: " + bruno.getNome());
		System.out.println("Salario do funcionario: " + bruno.getSalario());
		System.out.println("bonificacao do funcionario: " + bruno.getBonificacao());
		
	}

}
