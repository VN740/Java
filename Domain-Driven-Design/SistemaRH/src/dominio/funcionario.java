package dominio;

public class funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	
	public funcionario(String nome,
	                   String cpf,
	                   double salario) {
	       this.nome = nome;
	       this.cpf = cpf;
	       this.salario;  
	}
	                    
	public double lerBonificacao() {
		double bonificacao =salario * 0,1;
		return bonificacao;
	}
	public String exibir() {
		return "nome:" + nome + "salário" + salario + "bonificação"
	}
}
