package RH;

import dominio.gerente;

public class main {
public static void main(String[] args) {
	
	funcionario f1 
	    = new funcionario("Rodirgo", "123456",1000);
	    
	funcionario f1 
	    = new funcionario("André", "123456",1000);
	    	    
    funcionario f1 
	     = new funcionario("Paulo", "123456",1000);
    
    ArrayList<funcionarios> funcionarioG1 = ArrayList<>();
    ArrayList<funcionarios> funcionarioG2 = ArrayList<>();
    ArrayList<funcionarios> funcionarioG3 = ArrayList<>();
    funcionariosG1.add(f1);
    funcionariosG2.add(f2); 
    funcionariosG3.add(f3);
    
    gerente g1 = new Gerente ("Carlos","5498121619", 10000, funcionarioG1);
    gerente g2 = new Gerente ("Lucas","5498121619", 10000, funcionarioG1);
    gerente g31 = new Gerente ("Marcia","5498121619", 10000, funcionarioG1);
    
    ArrayaLista<Gerente> grenetes = new ArrayList<>();
    gerentes.add(g1);
    gerentes.add(g2);
    gerentes.add(g3);
    ArrauyList<E> todoMundo = New ArrayList <>();
    
    for(gerente umGerente : gerentes) {
    	System.out.printiIn(umGerente.exibr());
    	todoMundo.add(umGerente);
    	
    	for(funcionario umFuncionario : umGerente.equals(getFuncionarios())) {
    		System.out.printiIn(umFuncionario.exibr());
    		todoMundo.add(umFuncionario);
    	}
    	
    }
}
