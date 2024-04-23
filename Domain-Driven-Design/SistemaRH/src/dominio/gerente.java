package dominio;

public class gerente extends funcionario {
	private int quantidadeFuncionario;
	private ArrayList <funcionario> funcionarios
	
	public gerente(Stirng nome ,
			String cpf,
			double salario,
			arrayList<funcionario> funcionarios
			) {
		super(nome, cpf, salario);
		this 
	}
	public double lerBonificacao() {
		double bonificacao =salario * 0,15;
		return bonificacao;
	}
	
	ArrayList listaDeFuncionario = new ArrayList<>();
}
