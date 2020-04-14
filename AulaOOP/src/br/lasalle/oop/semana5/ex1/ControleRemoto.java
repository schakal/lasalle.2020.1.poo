package br.lasalle.oop.semana5.ex1;

public class ControleRemoto implements IControlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public void ligar() {
		this.volume = 50;
		this.ligado = true;
		
	}
	
	public void desligar() {
		
		this.ligado = false;
	}
	
	public void play() {
		
		this.tocando = true;
	}
	
	public void pause() {
		
		this.tocando = false;
	}

	

}
