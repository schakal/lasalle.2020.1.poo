package trab3;

public class Gerente extends Funcionario{
	
	private int senhaEspecial = 1234;
	private int numeroDeFuncionarioGerenciados;
	
	
	public void autentica() {
		
		
		
		if (senhaEspecial == 1234) { 
			
			System.out.println("Acesso liberado");
			getNumeroDeFuncionarioGerenciados();
			
		}
		else {
			System.out.println("Acesso negado");
			
		}
	}
	
	
	
	@Override
	public void getBonificacao() {
		
		Double bonificacao = 10.0;
		
		
		
		System.out.println(getSalario() * bonificacao/100 + 1000); 
	
	
	}
	
	
	public int getSenhaEspecial() {
		return senhaEspecial;
	}





	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}





	public int getNumeroDeFuncionarioGerenciados() {
		return numeroDeFuncionarioGerenciados;
	}
	public void setNumeroDeFuncionarioGerenciados(int numeroDeFuncionarioGerenciados) {
		this.numeroDeFuncionarioGerenciados = numeroDeFuncionarioGerenciados;
	}
	
	
	
	
	
		
	

}
