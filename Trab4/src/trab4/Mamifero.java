package trab4;

public class Mamifero extends Animal{
	
	private String corPelo;

	  @Override
	  public void locomover(){
	    System.out.println("Andando!");
	  }
	  @Override
	  public void alimentar(){
	    System.out.println("Comendo!");
	  }
	  @Override
	  public void emitirSom(){
	    System.out.println("Au-Au");
	  }

	  public String getCorPelo(){
	    return corPelo;
	  }

	  public void setCorPelo(String corPelo){
	    this.corPelo = corPelo;
	  }

}
