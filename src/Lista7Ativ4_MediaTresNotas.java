/*Atividade 4 – Função para Calcular a Média de Três Notas
 * • Crie uma função chamada calcularMedia() que recebe três notas
 * e retorna a média aritmética. • No programa principal, peça três notas
 * ao usuário, use a função para calcular a média e exiba o resultado.*/

import java.util.Scanner;
import java.text.DecimalFormat;


public class Lista7Ativ4_MediaTresNotas {
	
	//Variaveis
	double n1, n2, n3;
	double calcularMedia;
	
	// Função que calcula a média de 3 notas
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		  // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        // Calculando a média
        double media = calcularMedia(n1, n2, n3);
        
        //Casas decimais
        DecimalFormat df = new DecimalFormat("#.00");


        System.out.println("\nA média das notas é " + df.format(media) + ".");

        scanner.close();
	}

}
