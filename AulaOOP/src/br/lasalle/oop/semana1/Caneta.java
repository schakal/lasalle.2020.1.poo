package br.lasalle.oop.semana1;

public class Caneta {

	//atributos desta classe
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar()
	{
		if(!tampada)
			System.out.println("Rabiscando na cor " + cor + "!!" );
		else
			System.out.println("Caneta Tampada!! Não consigo rabiscar.");
	}
	
	void tampar()
	{
		tampada = true;
	}
	
	void destampar()
	{
		tampada = false;
	}
	
}
