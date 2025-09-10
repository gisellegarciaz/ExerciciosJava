import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	/**
	 * Classe principal que interage com o usuário e usa a classe ExercGi_Encapsulamento_Treino_Classe.
	 */

	public class ExercGi_Encapsulamento_Treino_Main {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        // Cria uma lista para armazenar os objetos de treino
	        List<ExercGi_Encapsulamento_Treino_Classe> listaDeTreinos = new ArrayList<>();

	        System.out.print("Quantos treinos você deseja registrar? ");
	        int numeroDeTreinos = scanner.nextInt();
	        scanner.nextLine(); // Consome a quebra de linha

	        // Loop para coletar os dados de cada treino
	        for (int i = 0; i < numeroDeTreinos; i++) {
	            System.out.println("\n--- Treino #" + (i + 1) + " ---");
	            
	            // Cria um novo objeto para esta sessão de treino
	            ExercGi_Encapsulamento_Treino_Classe treino = new ExercGi_Encapsulamento_Treino_Classe();
	            
	            System.out.print("Digite o nome da academia: ");
	            treino.setAcademia(scanner.nextLine());
	            
	            System.out.print("Digite o modelo do aparelho: ");
	            treino.setModeloAparelho(scanner.nextLine());
	            
	            System.out.print("Digite o peso utilizado (kg): ");
	            treino.setPeso(scanner.nextLine());
	            
	            // Adiciona o objeto preenchido à lista
	            listaDeTreinos.add(treino);
	        }

	        // Exibe o resumo de todos os treinos registrados
	        System.out.println("\n--- Histórico de Treinos ---");
	        if (listaDeTreinos.isEmpty()) {
	            System.out.println("Nenhum treino foi registrado.");
	        } else {
	            for (int i = 0; i < listaDeTreinos.size(); i++) {
	                ExercGi_Encapsulamento_Treino_Classe treino = listaDeTreinos.get(i);
	                System.out.println("--- Treino #" + (i + 1) + " ---");
	                System.out.println("Academia: " + treino.getAcademia());
	                System.out.println("Aparelho: " + treino.getModeloAparelho());
	                System.out.println("Peso: " + treino.getPeso() + " kg");
	            }
	        }
	        
	        scanner.close();
	    }
	}

