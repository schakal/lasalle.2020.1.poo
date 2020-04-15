package trab3;

public class Funcionario {
	
	
	private String nome;
	private String cpf;
	private Double salario;
	
	
	
	
	
	
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
		
		return salario * 10.0/100;
		
	
		
	}
	

}
