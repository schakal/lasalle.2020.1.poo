package trab3;

public class Funcionario {
	
	
	private String nome;
	private String cpf;
	private Double salario;
	private Double bonificacao = 10.0;
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Double getSalario() {
		return salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double getBonificacao() {
		
		return salario * setBonificacao()/100;
		
	
		
	}
	public Double setBonificacao() {
		
		
		return bonificacao;
	}
	

}
