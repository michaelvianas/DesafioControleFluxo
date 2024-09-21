package testes;

import java.util.Scanner;
import classes.ParametrosInvalidosException;
import classes.Contador;

public class ContadorTeste {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		Contador contador = new Contador();
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contador.contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
	}
}
