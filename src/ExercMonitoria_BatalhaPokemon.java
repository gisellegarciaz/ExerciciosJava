/*1. Batalha Pokémon

Crie uma classe Pokemon com os atributos:
nome, tipo, pontosVida.

Métodos:
atacar(String ataque): imprime "Pikachu usou Choque do Trovão!".

tomarDano(int dano): reduz pontosVida.

No main, crie 2 pokémons, faça um atacar o outro até a vida acabar.

*/


		public class ExercMonitoria_BatalhaPokemon {

	    /**
	     * Método para simular que um Pokémon ataca o outro.
	     * nomeAtacante O nome do Pokémon que ataca.
	     * ataque O nome do ataque.
	     */
		public static void atacar(String nomeAtacante, String ataque) {
	        System.out.println(nomeAtacante + " usou " + ataque + "!");
	    }

		
	    /**
	     * Método para calcular e retornar a nova vida de um Pokémon após tomar dano.
	     * vidaAtual A vida atual do Pokémon que tomou o dano.
	     * dano O valor do dano a ser subtraído.
	     * O novo valor de vida.
	     */
	    public static int tomarDano(int vidaAtual, int dano) {
	        int novaVida = vidaAtual - dano;
	        if (novaVida < 0) {
	            novaVida = 0; // Garante que a vida não fique negativa
	        }
	        return novaVida;
	    }
	  
//----------------------------------------------------------------------------------------------------------
	    
 			public static void main(String[] args) {

	        // Variáveis para representar o Pikachu
	        String nomePikachu = "Pikachu";
	        String tipoPikachu = "Elétrico";
	        int vidaPikachu = 100;

	        // Variáveis para representar o Charmander
	        String nomeCharmander = "Charmander";
	        String tipoCharmander = "Fogo";
	        int vidaCharmander = 100;
	        
	        // Define o dano base para os ataques
	        int danoAtaque = 15;

	        System.out.println("--- Início da Batalha ---");

	        // Loop da batalha: continua enquanto ambos os Pokémon têm pontos de vida
	        while (vidaPikachu > 0 && vidaCharmander > 0) {
	            
	            System.out.println("\n--------------------");
	            
	            // Pikachu ataca
	            System.out.println("Turno de " + nomePikachu + "!");
	            atacar(nomePikachu, "Choque do Trovão");
	            vidaCharmander = tomarDano(vidaCharmander, danoAtaque);
	            System.out.println(nomeCharmander + " tomou " + danoAtaque + " de dano. Pontos de Vida restantes: " + vidaCharmander);
	            
	            // Verifica se o Charmander ainda está vivo após o ataque
	            if (vidaCharmander <= 0) {
	                break; // Sai do loop se a vida de Charmander acabar
	            }
	            
	            System.out.println("\nTurno de " + nomeCharmander + "!");
	            // Charmander ataca
	            atacar(nomeCharmander, "Lança-Chamas");
	            vidaPikachu = tomarDano(vidaPikachu, danoAtaque);
	            System.out.println(nomePikachu + " tomou " + danoAtaque + " de dano. Pontos de Vida restantes: " + vidaPikachu);
	        }

	        System.out.println("\n--- Fim da Batalha ---");

	        // Determina e exibe o vencedor
	        if (vidaPikachu > 0) {
	            System.out.println(nomePikachu + " venceu a batalha!");
	        } else {
	            System.out.println(nomeCharmander + " venceu a batalha!");
	        }
	    }
	}