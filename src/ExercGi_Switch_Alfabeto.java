/* 
 * Eu pensei que, inspirado no exercicio de times (switch), se seria possivel
 * que o usuário digitasse uma letra e o sistema devolvesse uma palavra que
 * iniciasse com essa letra, USANDO O MÉTODO SWITCH.
 * Para o alfabeto, me inspirei no alfabeto da Xuxa.
 * 
 * */

import java.util.Scanner;

public class ExercGi_Switch_Alfabeto {

	
		public static void main(String[] args) {
			String palavra = "";
			String letra = "";
 			
			//Pro user escrever
			Scanner scanner = new Scanner(System.in);
			

	        System.out.println("Digite uma letra de A a Z para receber uma palavra: ");
	        letra = scanner.nextLine().toUpperCase(); // Converte a entrada para maiúscula para a verificação

	        switch (letra) {
	            case "A":
	                palavra = "Amor";
	                break;
	            case "B":
	                palavra = "Baixinho";
	                break;
	            case "C":
	                palavra = "Coração";
	                break;
	            case "D":
	                palavra = "Docinho";
	                break;
	            case "E":
	                palavra = "Escola";
	                break;
	            case "F":
	                palavra = "Feijão";
	                break;
	            case "G":
	                palavra = "Gente";
	                break;
	            case "H":
	                palavra = "Humano";
	                break;
	            case "I":
	                palavra = "Igualdade";
	                break;
	            case "J":
	                palavra = "Juventude";
	                break;
	            case "K":
	                palavra = "Kiwi";
	                break;
	            case "L":
	                palavra = "Liberdade";
	                break;
	            case "M":
	                palavra = "Molecagem";
	                break;
	            case "N":
	                palavra = "Natureza";
	                break;
	            case "O":
	                palavra = "Obrigado";
	                break;
	            case "P":
	                palavra = "Proteção";
	                break;
	            case "Q":
	                palavra = "Quero-quero";
	                break;
	            case "R":
	                palavra = "Riacho";
	                break;
	            case "S":
	                palavra = "Saudade";
	                break;
	            case "T":
	                palavra = "Terra";
	                break;
	            case "U":
	                palavra = "Universo";
	                break;
	            case "V":
	                palavra = "Vitória";
	                break;
	            case "W":
	                palavra = "Wally, a baleia";
	                break;
	            case "X":
	                palavra = "Xuxa";
	                break;
	            case "Y":
	                palavra = "Yoshi, do Mário Bros";
	                break;
	            case "Z":
	                palavra = "Zum-zum-zum-zum-zum";
	                break;
	            default:
	                palavra = "... Ops! Isso não é uma letra :(";
	                break;
	        }

	        
	        System.out.println("A letra " + letra +  " é de " + palavra);

	        
	        scanner.close();
			
		}
}
