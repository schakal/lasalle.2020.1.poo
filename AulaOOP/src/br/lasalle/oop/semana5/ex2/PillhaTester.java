package br.lasalle.oop.semana5.ex2;

public class PillhaTester {

	public static void main(String[] args) {

		Pilha minhaPilha = new Pilha(10);
		
		minhaPilha.empilhar("Alex");
		minhaPilha.empilhar("Edgard");
		System.out.println("Topo: " + minhaPilha.topo());
		System.out.println("Tamanho :" + minhaPilha.tamanho());
		
		minhaPilha.empilhar("Maria");
		System.out.println("Topo: " + minhaPilha.topo());
		
		minhaPilha.desempilhar();
		minhaPilha.desempilhar();
		System.out.println("Tamanho :" + minhaPilha.tamanho());
		System.out.println("Topo: " + minhaPilha.topo());

	}

}
