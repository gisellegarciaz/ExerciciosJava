/*Atividade 2 – Função para Calcular o Quadrado de um Número
• Crie uma função chamada quadrado() que recebe um número e retorna o seu
quadrado.
• No programa principal, peça um número ao usuário e use a função para calcular
e exibir o resultado.*/

import java.util.Scanner;

public class Lista7Ativ2_QuadradoDoNumero {
	
	// Variaveis
	double n;
	double quadradoNumero = quadrado(n);
	
	// Função que calcula o quadrado
    public static double quadrado(double n) {
        return (n * n);
    }
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	// Entrada do numero
    System.out.print("Digite o número pra saber seu quadrado: ");
    double n = scanner.nextDouble();
		
    System.out.println("O quadrado de " + n + " é " + quadrado(n) + ".\n");

    scanner.close();
    
   
	}
	
}