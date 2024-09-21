package classes;

public class Contador {
	public Contador() {}
	
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i+1));
		}
	}
}
