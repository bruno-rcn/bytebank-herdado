
public class TesteReferencia {

	public static void main(String[] args) {
		
		EditorDeVideo ediVid = new EditorDeVideo();
		ediVid.setSalario(2500.00);
		System.out.println("bonificacao do editor de video: " + ediVid.getBonificacao());
		
		Designer des = new Designer();
		des.setSalario(2000.0);
		System.out.println("bonificacao do designer: " + des.getBonificacao());
		
		Gerente ge = new Gerente();
		ge.setSalario(5000.0);
		System.out.println("bonificacao do gerente: " + ge.getBonificacao());
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(ediVid);
		controle.registra(des);
		controle.registra(ge);
		
		System.out.println("a soma das bonificacoes: " + controle.getSoma());
	}

}
