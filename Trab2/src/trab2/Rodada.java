package trab2;


import java.util.Scanner;



public class Rodada{
	
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.printf("Iniciando as partidas da rodada do Brasileirão\n");
		

		
		for (int i = 1; i < 4; i++) {
			
			System.out.printf("Vai comecar a partida numero %d \n", i);
			
			Partida partida = new Partida();
			Time time1 = new Time();
			Time time2 = new Time();
			System.out.println("Entre com o time 1:");
			
			time1.setNome(scan.next());
			partida.setTimeVisitante(time1);
			
			
			//time1.setNome(scan.next());
			//time1.setNome(scan.next());
			
			//String tempNome = Console.readLine("");
			
			System.out.println("Entre com o time 2:");
			
			time2.setNome(scan.next());
			partida.setTimeLocal(time2);
				
			//time2.setNome(scan.next());
			//Partida partida1 = new Partida(time1, time2, random.nextInt(10), random.nextInt(10), formatador.format(data));
			System.out.printf("Preparando o jogo n.%d\n", i);
			time1.listar();
			time2.listar();
			
			System.out.println("Pronto para iniciar a partida?  <Pressione uma tecla>");
			scan.next();
			//System.out.println("Inicio de Jogo. Partida Iniciada !!");
			partida.iniciarPartida();
			partida.mostrarResultado();
			partida.finalizarPartida();
			time1.listar();
			time2.listar();
			System.out.println("\n=========================================\n");
			
			
		}
		

		System.out.println("=========================================\n");
		System.out.println("==============FIM DE RODADA==============\n");
		System.out.println("=========================================\n");
		System.out.println("=========================================\n");
		System.out.println("Integrantes do Grupo:\n");
		System.out.println("Edgard Diniz Bittencourt\n");
		System.out.println("=========================================\n");
		System.out.println("Github: \n");
		System.out.println("=========================================\n");
		System.out.println("Video Youtube: \n");
		//public void Gols () {
			
			//this.scoreVisitante = random.nextInt(10);
			//this.scoreLocal = random.nextInt(10);
			//setScoreVisitante(scoreVisitante);
			//setScoreLocal(scoreLocal);
			//
			
			//int numero = random.nextInt(100);
		//}
		scan.close();
}
}
