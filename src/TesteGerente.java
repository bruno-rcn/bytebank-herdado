
public class TesteGerente {

	public static void main(String[] args) {

		Gerente bruno = new Gerente();
		
		bruno.setCpf("22222");
		bruno.setNome("Bruno Noberto");
		bruno.setSalario(6000.00);
		
		bruno.setSenha(0);
		boolean autentica = bruno.autenticarSenha(0);
		
		System.out.println("CPF do gerente: " + bruno.getCpf());
		System.out.println("Nome do gerente: " + bruno.getNome());
		System.out.println("Salario do gerente: " + bruno.getSalario());
		System.out.println("autenticando a senha: " + autentica);
		System.out.println("bonificacao do gerente: " + bruno.getBonificacao());
	}

}
