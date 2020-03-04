package br.lasalle.oop.trab1;


public class PilotoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piloto c1;
		c1 = new Piloto();
		c1.nome ="Joao";
		c1.idade = 23;
		c1.segurandoguidao = true;
		
		//c1.status();
	
        
       Piloto c2;
       	c2= new Piloto();
		c2.nome ="Jose";
		c2.idade = 50;
		c2.segurandoguidao = true;
		c2.status();
	}

}
