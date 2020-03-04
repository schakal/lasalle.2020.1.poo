package br.lasalle.oop.trab1;

public class Moto {
	String modelo;
	String marca;
	String cor;
	int cilindrada;
	boolean ligada;
	
	
	
	
	void andar()
	{
		if(ligada){
		 System.out.println("Só Acelerar!");
		}
		 else
		 {
			 System.out.println("Precisa ligar a moto!");
		}
	   }
	void desligar()
	{
		ligada = false;

    }
	void ligar()
	{
		ligada = true;
	}
	void status()
	{
		System.out.println("Classe Moto");
		System.out.println("Modelo:" + modelo);
		System.out.println("Marca:" + marca);
		System.out.println("Cor:" + cor);
		System.out.println("Cilindrada:" + cilindrada);
		System.out.println("Ligada:"+ ligada);
		
		
	}
		

}
