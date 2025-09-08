/*3. Pet Virtual (Tamagotchi)

Classe Pet: nome, energia, fome, diversao.
Métodos:
brincar(): aumenta diversão, diminui energia.
comer(): reduz fome, aumenta energia.
dormir(): restaura energia.

No main, simule o dia do pet.*/


import java.util.Scanner;


public class ExercMonitoria_PetVirtual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Qual nome você quer dar ao seu pet virtual? ");
	    String nome = scanner.nextLine();
	    
	    // As características do pet são variáveis separadas, não atributos de uma classe.
	    int energia = 100;
	    int fome = 50;
	    int diversao = 50;
	    
	    
	    // Loop principal do jogo
	    while (energia > 0) {
	        System.out.println("\n--- Status de " + nome + " ---");
	        System.out.println("Energia: " + energia);
	        System.out.println("Fome: " + fome);
	        System.out.println("Diversão: " + diversao);
	        System.out.println("-------------------------");
	        
	        // Verifica se a fome do pet está baixa e exibe uma mensagem de alerta
	        if (fome <= 20) {
	            System.out.println("\nSeu pet está com a barriga roncando! Alimente-o!");
	        }
	        
	        System.out.println("\nO que você quer fazer com " + nome + "?");
	        System.out.println("1. Brincar");
	        System.out.println("2. Comer");
	        System.out.println("3. Dormir");
	        System.out.println("4. Sair");
	        
	        System.out.print("Escolha uma opção: ");
	        int opcao = scanner.nextInt();
	
	        switch (opcao) {
	            case 1:
	                // A lógica de brincar está aqui diretamente, manipulando as variáveis.
	                if (energia >= 30) {
	                    System.out.println("\n" + nome + " está brincando!");
	                    diversao += 20;
	                    energia -= 30;
	                    fome -= 10;
	                } else {
	                    System.out.println("\n" + nome + " está muito cansado para brincar.");
	                }
	                break;
	            
	            case 2:
	                // A lógica de comer também está aqui.
	                // Ajustado para que a fome diminua ao comer.
	                if (fome < 100) {
	                    System.out.println("\n" + nome + " está comendo!");
	                    fome += 15;
	                    energia += 25;
	                } else {
	                    System.out.println("\n" + nome + " não está com fome agora.");
	                }
	                break;
	            
	            case 3:
	                // A lógica de dormir também está aqui.
	                // Ajustado para que a fome aumente levemente ao dormir.
	                System.out.println("\nzZzZz..." + nome + " está tirando uma soneca...zZzZ");
	                energia = 100; // Restaura a energia ao máximo
	                fome += 5;
	                break;
	            case 4:
	                System.out.println("\nAté a próxima! Seu pet sentirá saudades.");
	                return; // Encerra o programa
	            default:
	                System.out.println("Opção inválida. Tente novamente.");
	        }
	        
	        // Garantindo que os valores não ultrapassem os limites
	        energia = Math.min(100, energia);
	        fome = Math.min(100, fome);
	        diversao = Math.min(100, diversao);
	    }
	    
	    System.out.println("\n--- Game Over ---");
	    System.out.println("A energia de " + nome + " acabou.");
	    scanner.close();
	}
}