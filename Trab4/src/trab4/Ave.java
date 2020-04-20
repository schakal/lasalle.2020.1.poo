package trab4;

public class Ave extends Animal {
	
	private String corPena;
	
	  @Override
	  public void locomover(){
	    System.out.println("plainando!");
	  }
	  @Override
	  public void alimentar(){
	    System.out.println("Comendo Frutas!");
	  }
	  @Override
	  public void emitirSom(){
	    System.out.println("Pru-Pru");
	  }
	  public void fazerNinho(){
	    System.out.println("Ninho Contruido!");
	  }

	  public String getCorPena(){
	    return corPena;
	  }

	  public void setCorPena(String corPena){
	    this.corPena = corPena;
	  }

}
