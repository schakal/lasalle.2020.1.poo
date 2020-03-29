package br.lasalle.oop.semana3;

public class Conta {
	private float saldo;
	private String nomeTitular;
	
	public Conta( String nome)
	{
		setNomeTitular(nome);
	}
	
	public String getNomeTitular() {
		return this.nomeTitular;
	}
	
	private void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void depositar(float valor)
	{
		this.saldo = this.saldo + valor;
	}
	
	public float getSaldo()
	{
		return this.saldo;
	}
	
	public float sacar(float valor)
	{
		if(getSaldo()>=valor)
		{
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado com sucesso!");
			return valor;
		}
		else
		{
			System.out.println("Saldo insuficiente!");
			return -1;
		}
	}
	
	public void listar()
	{
		System.out.println("Titular:" + getNomeTitular());
		System.out.println("Saldo em conta:" + getSaldo());
	}
}
