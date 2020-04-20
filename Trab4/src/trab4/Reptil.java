package trab4;

public class Reptil extends Animal{
	
	private String corEscama;
	  @Override
	  public void locomover(){
	    System.out.println("Arrastando");
	  }
	  @Override
	  public void alimentar(){
	    System.out.println("Engolindo!");
	  }
	  @Override
	  public void emitirSom(){
	    System.out.println("sSSSSSsssss");
	  }

	  public String getcorEscama(){
	    return corEscama;
	  }

	  public void setCorEscama(String corEscama){
	    this.corEscama = corEscama;
	  }

}
