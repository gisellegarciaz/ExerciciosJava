/*Atividade 3 – Função para Verificar se um Número é Par ou Ímpar
• Crie uma função chamada ehPar() que recebe um número e retorna verdadeiro
se for par e falso se for ímpar.
• No programa principal, peça um número ao usuário e use a função para exibir a
mensagem correspondente.*/

import java.util.Scanner; //gera interacao com o user

public class Lista7Ativ3_ParImpar {

	// Função que verifica se um número é par
    public static boolean ehPar(int numero) {
       
    	if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
	
	public static void main(String[] args) {
		
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // Chama o método ehPar() e armazena o resultado em uma variável booleana
        boolean ehPar = ehPar(numero);

        // Usa o valor retornado por ehPar() para exibir a mensagem correta
        if (ehPar) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    
    }

}
