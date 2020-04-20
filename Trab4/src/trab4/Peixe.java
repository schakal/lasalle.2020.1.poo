package trab4;

public class Peixe extends Animal{
	
	private String corEscama;
	
	
	  @Override
	  public void locomover(){
	    System.out.println("Nadando!");
	  }
	  @Override
	  public void alimentar(){
	    System.out.println("Sugando!");
	  }
	  @Override
	  public void emitirSom(){
	    System.out.println("glub-glub");
	  }
	  public void soltarBolhas(){
	    System.out.println("Fazendo bolhas!");
	  }

	  public String getCorEscama(){
	    return corEscama;
	  }

	  public void setCorEscama(String corEscama){
	    this.corEscama = corEscama;
	  }

}
