package trab3;
import java.util.Scanner;
public class TesterFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		Scanner input = new Scanner(System.in);
		
		System.out.println("***********************************");
		System.out.println("NomeAluno: Edgard Diniz Bittencourt Matricula: 0050007061");
		System.out.println("************************************");
		
		
		
		
		
		funcionario.setNome("Joao");
		funcionario.setCpf("00000000000000");
		funcionario.setSalario(2000.0);
		System.out.println(funcionario.getBonificacao());
		
		
		
		
		System.out.println("Entre com a sua senha:");
		int pass = input.nextInt();
		gerente.autentica();
		gerente.setNome("Joao");
		gerente.setCpf("00000000000000");
		gerente.setSalario(6000.0);
		System.out.println(gerente.getBonificacao());
	
		
	}

}
