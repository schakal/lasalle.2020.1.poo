package trab3;

public class Gerente extends Funcionario{
	
	private int senhaEspecial;
	private int numeroDeFuncionarioGerenciados;
	
	
	public boolean autentica(int senhaEspecial) {
		
		
		this.senhaEspecial = 1234;
		
		
		if (senhaEspecial == this.senhaEspecial) { 
			
			System.out.println("Acesso liberado");
			
			
			
			
			return true;
			
		}
		else {
			
			return false;
		}
		
	}
	
	
	
	@Override
	public Double getBonificacao() {
		
		return super.getBonificacao() + 1000;
		
	
		
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
