package trab2;

public class Time {

	
		private String nome;
		private int qtdVitorias;
		private int	qtdEmpates;
		private int qtdDerrotas;
		private int qtdPontos;
		
		public Time() {
			
			
			
		}
		public void listar()
		{
			System.out.println(this.toString());
		}
		
		//listar
		
		
		public String toString() {
			return "\nTime:" + nome + "\nVitórias:" + qtdVitorias + "\nEmpates:" + qtdEmpates + "\nDerrotas:" + qtdDerrotas + "\nPontos:" + qtdPontos;
			
		}
		
		/*public void Ganhou() {
			
			this.qtdVitorias = this.qtdVitorias + 1;
			setQtdVitorias(qtdVitorias);
		}
		
		public void Empatou() {
			
			this.qtdEmpates = this.qtdEmpates + 1;
			setQtdEmpates(qtdEmpates);
		}
		
		public void Perdeu() {
			
			this.qtdDerrotas = this.qtdDerrotas + 1;
			setQtdDerrotas(qtdDerrotas);
		}
		
		public void Pontos (int qtdPontos) {
			
			this.qtdPontos = this.qtdPontos + 1;
			setQtdPontos(qtdPontos);
			
		}*/
		
		//getters/setters
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getQtdVitorias() {
			return qtdVitorias;
		}
		
		public void setQtdVitorias(int qtdVitorias) {
			this.qtdVitorias = qtdVitorias;
		}
		
		public int getQtdEmpates() {
			return qtdEmpates;
		}
		
		public void setQtdEmpates(int qtdEmpates) {
			this.qtdEmpates = qtdEmpates;
		}
		
		public int getQtdDerrotas() {
			return qtdDerrotas;
		}
		
		public void setQtdDerrotas(int qtdDerrotas) {
			this.qtdDerrotas = qtdDerrotas;
		}
		
		public int getQtdPontos() {
			return qtdPontos;
		}
		
		public void setQtdPontos(int qtdPontos) {
			this.qtdPontos = qtdPontos;
		}

		

		
		
		

		
		
	}

