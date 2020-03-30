package trab2;

import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
import java.util.Random;




public class Partida {
	
	private Time timeVisitante;
	private Time timeLocal;
	private int scoreVisitante;
	private int scoreLocal;
	private String dataPartida;
	
	
	Random random = new Random();
	Date data = new Date();
	
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	

	public void iniciarPartida () {
		
		System.out.println("Início de Jogo. Partida Iniciada !!");
		setDataPartida(formatador.format(data));
		System.out.println(this.getDataPartida());
		setScoreVisitante(random.nextInt(10));
		setScoreLocal(random.nextInt(10));
		
		
	}
	
	public void mostrarResultado () {
		
		System.out.printf(this.toString());
	}
	@Override
	public String toString() {
		
		return timeVisitante.getNome() + " " +  getScoreVisitante()+" " + "X"+" " + getScoreLocal() + " " + timeLocal.getNome() + "\n";
	}
	
	public void finalizarPartida() {
		
		
		if (getScoreVisitante() > getScoreLocal() ) {
			
				if (getScoreVisitante() >= getScoreLocal() + 3) 
				{
					this.timeVisitante.setQtdVitorias(1);
					this.timeVisitante.setQtdPontos(4);
					this.timeLocal.setQtdDerrotas(1);
				}
				else {
					this.timeVisitante.setQtdVitorias(1);
					this.timeVisitante.setQtdPontos(3);
					this.timeLocal.setQtdDerrotas(1);
				}
				
				
					
					
				}
				else if (getScoreLocal () > getScoreVisitante() )  {
					
					if ( getScoreLocal () >= getScoreVisitante() + 3) {
						
						this.timeLocal.setQtdVitorias(1);
						this.timeLocal.setQtdPontos(4);
						this.timeVisitante.setQtdDerrotas(1);
					
					}
					else {
						
						this.timeLocal.setQtdVitorias(1);
						this.timeLocal.setQtdPontos(3);
						this.timeVisitante.setQtdDerrotas(1);
						
					}
				}
		
				else  {
				
					this.timeVisitante.setQtdEmpates(1);
					this.timeLocal.setQtdEmpates(1);
					this.timeVisitante.setQtdPontos(1);
					this.timeLocal.setQtdPontos(1);
					
							
							
						}
		
}

		
	
	
	
	
	//getters/setters
	
	public Time  getTimeVisitante() {
		return timeVisitante;
	}
	public Time  getTimeLocal() {
		return timeLocal;
	}
	public int getScoreVisitante() {
		return scoreVisitante;
	}
	public int getScoreLocal() {
		return scoreLocal;
	}
	public String getDataPartida() {
		return dataPartida;
	}
	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public void setTimeLocal(Time timeLocal) {
		this.timeLocal = timeLocal;
	}
	public void setScoreVisitante(int scoreVisitante) {
		this.scoreVisitante = scoreVisitante;
	}
	public void setScoreLocal(int scoreLocal) {
		this.scoreLocal = scoreLocal;
	}
	public void setDataPartida(String dataPartida) {
		this.dataPartida = dataPartida;
	}
	
	/*public void listarTimesPartida ()
	{
		System.out.println("Time:" + this.getTimeVisitante());
		System.out.println("Vitórias:" + this.getTimeVisitante().getQtdVitorias());
		System.out.println("Empates:" + this.getTimeVisitante().getQtdEmpates());
		System.out.println("Derrotas:" + this.getTimeVisitante().getQtdDerrotas());
		System.out.println("Pontos:" + this.getTimeVisitante().getQtdPontos());
		System.out.println("");
		System.out.println("Time:" + this.getTimeLocal());
		System.out.println("Vitórias:" + this.getTimeLocal().getQtdVitorias());
		System.out.println("Empates:" + this.getTimeLocal().getQtdEmpates());
		System.out.println("Derrotas:" + this.getTimeLocal().getQtdDerrotas());
		System.out.println("Pontos:" + this.getTimeLocal().getQtdPontos());
	}
	
	
	
	public void preencheVisitante(Time timeVisitante) {
		
		setTimeVisitante(timeVisitante);
	}
	
	public void preencheLocal() {
		
		setTimeLocal(timeLocal);
	}
	
	public void ListarPartida () {
		
		System.out.println(this.getDataPartida());
		System.out.println(getTimeVisitante() + "" +  getScoreVisitante() + "X"+ "" + getTimeLocal() + "" + getScoreLocal());
		
		
		
	}
	
	
	
	public void GanhouPartida() {
		
		if (this.getScoreVisitante() > this.getScoreLocal()) {
			
			
			this.getTimeVisitante().Ganhou();
			
			if (this.getScoreVisitante() == this.getScoreLocal()){
				
				this.getTimeVisitante().Empatou();
			}
				else {
					
					this.getTimeVisitante().Perdeu();
				}
			}
				
			}
	
	
			
		
		


	//public int listarScoreVisitante(){
		
		//return this.getScoreVisitante();
		
	//}
	
	//public int listarScoreLocal () {
		
		//return this.getScoreLocal();
	//}*/
	

}