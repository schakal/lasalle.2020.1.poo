package trab4;

public class TesterAnimal {
	
	
		  public static void main(String[] args){

		    Mamifero m = new Mamifero();
		    Reptil r = new Reptil();
		    Peixe p = new Peixe();
		    Ave a = new Ave();
		    
		    m.setCorPelo("Timbrado Marrom e preto");
		    m.setIdade(2);
		    m.setMembros(4);
		    m.setPeso(3);
		    
		    
		    r.setCorEscama("Preto");
		    r.setIdade(2);
		    r.setMembros(0);
		    r.setPeso(1);
		    
		    
		    p.setCorEscama("Dourada");
		    p.setIdade(1);
		    p.setMembros(3);
		    p.setPeso(1);
		    
		    
		    a.setCorPena("Branco");
		    a.setIdade(2);
		    a.setMembros(4);
		    a.setPeso(1);
		    
		    
		    
		    System.out.println("***********************************");
			System.out.println("NomeAluno: Edgard Diniz Bittencourt Matricula: 0050007061");
			System.out.println("************************************");
			
			
		    System.out.println("Cor do Animal: " + m.getCorPelo());
		    imprimir(m);
		    System.out.println("Cor do Animal: " + r.getcorEscama());
		    imprimir(r);
		    System.out.println("Cor do Animal: " + p.getCorEscama());
		    imprimir(p);
		    System.out.println("Cor do Animal: " + a.getCorPena());
		    imprimir(a);
		    
		    
		    
		    
		  }
		

		  public static void imprimir(Animal Animal) {
			  
			  Animal.alimentar();
			  Animal.emitirSom();
			  Animal.locomover();
			  Animal.getIdade();
			  Animal.getPeso();
			  Animal.getMembros();
			  System.out.println("##########################");
			  
		  }
		  
		  
		  
		  
}
