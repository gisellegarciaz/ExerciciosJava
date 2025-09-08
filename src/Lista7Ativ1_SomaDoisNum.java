/*Atividade 1 – Função para Somar Dois Números
• Crie uma função chamada somar() que recebe dois números e retorna a soma.
• No programa principal, peça dois números ao usuário e use a função
para exibir o resultado.*/


import java.util.Scanner;

public class Lista7Ativ1_SomaDoisNum {

	 
	 
	// Função que calcula o quadrado
    public static double somar (double n1, double n2) {
		return (n1 + n2);
    }
	
	public static void main(String[] args) {
		
		//variaveis
		double n1, n2, resultado;
		
		Scanner scanner = new Scanner(System.in);
			
		// Entrada do numero
	    System.out.print("Digite o primeiro número: ");
	    n1 = scanner.nextDouble();
			
	    System.out.print("Digite o segundo número: ");
	    n2 = scanner.nextDouble();
	    
	    
	 // Chama o método somar() e armazena o resultado.
	    resultado = (n1 + n2);
	    
	 // Exibe o resultado
	    System.out.println("O resultado de " + n1 + " + " + n2 + " é " + resultado + ".\n");

	    scanner.close();
	
	}
}
