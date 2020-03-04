package br.lasalle.oop.trab1;

public class MotoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moto c1;
		c1 = new Moto();
		c1.modelo ="Fat Boy";
		c1.marca = "Harley";
		c1.cor = "Preta";
		c1.cilindrada = 1800;
		c1.ligada = true;
		c1.andar();
		
		//c1.status();
	
        
       Moto c2 = new Moto();
       	c2.modelo ="Teneré";
       	c2.marca = "Yamaha";
       	c2.cor = "Cinza";
       	c2.cilindrada = 250;
       	c2.ligada = false;
       	c2.andar();

	}

}
