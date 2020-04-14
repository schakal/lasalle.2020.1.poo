package br.lasalle.oop.semana5.ex2;

public class Pilha implements IPilha{
	
	private Object [] elementos;
	private int topo = 0;
	private int maximo;
	
	public Pilha(int maximo) {
		
		elementos = new Object[maximo];
		this.maximo = maximo;
	}

	@Override
	public void empilhar(Object elemento) {
		
		if (topo <= maximo) {
			
		elementos[topo] = elemento;
		topo++;
		
		}
	}

	@Override
	public Object desempilhar() {
			topo--;
			return elementos[topo];
	}

	@Override
	public Object topo() {
		
		return elementos[topo - 1];
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return topo;
	}
	
	

	
}
