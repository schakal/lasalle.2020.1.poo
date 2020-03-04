package br.lasalle.oop.trab1;

public class Piloto {

	String nome;
	int idade;
    boolean segurandoguidao;           
			
    	
    	
    	void pilotando()
    	{
    		if(segurandoguidao){
    		 System.out.println("Voce está pronto, acelere!");
    		}
    		 else
    		 {
    			 System.out.println("Segure o guidao");
    		}
    	   }
    	void andando()
    	{
    		segurandoguidao= true;

        }
    	void parado()
    	{
    		segurandoguidao = false;
    	}
    	void status()
    	{
    		System.out.println("Classe Piloto");
    		System.out.println("Nome:" + nome);
    		System.out.println("Idade:"+ idade);
    		System.out.println("Acelerando:"+ segurandoguidao);
    		
    	}
}
