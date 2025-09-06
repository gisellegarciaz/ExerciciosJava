/*Atividade 5 – Função para Converter Celsius para Fahrenheit
• Crie uma função que recebe uma temperatura em graus Celsius
	e retorna o equivalente em Fahrenheit.
• Fórmula: Fahrenheit = (Celsius * 1.8) + 32*/

public class Lista7Ativ5_CelsiusFahrenheit {

	public static void main(String[] args) {
			
			//variaveis celsius e fahrenheit
			double tempCelsius = 12;
			double tempFahrenheit = (tempCelsius * 1.8) + 32;
			
			
			//Resultado na tela
	        System.out.println("A temperatura de " + tempCelsius + "°C em Fahrenheit é: " + tempFahrenheit + "°F");
		}
	
}
