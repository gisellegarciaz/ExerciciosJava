/*2. Carrinho de Compras

Crie uma classe Produto com atributos: nome, preco.

Crie uma classe Carrinho que pode: adicionarProduto(Produto p)

calcularTotal()

No main, crie alguns produtos (Arroz, Feijão, Coca-Cola) e mostre o total.*/

	import java.util.ArrayList;
	import java.util.List;

	
public class ExercMonitoria_CarrinhoCompras {
	
	public static void main(String[] args) {

        // 1. Definição dos produtos com seus preços
        String nomeArroz = "Arroz";
        double precoArroz = 12.50;

        String nomeFeijao = "Feijão";
        double precoFeijao = 8.75;

        String nomePepsi = "Pepsi";
        double precoPepsi = 5.99;

        // 2. Criação de uma lista para simular o carrinho
        // O carrinho armazena apenas os preços para simplificar o cálculo
        List<Double> carrinho = new ArrayList<>();

        // 3. Simulação de "adicionar produtos" ao carrinho
        // Adicionando os preços dos produtos à lista
        carrinho.add(precoArroz);
        System.out.println("Adicionando " + nomeArroz + " por R$" + precoArroz);
        
        carrinho.add(precoFeijao);
        System.out.println("Adicionando " + nomeFeijao + " por R$" + precoFeijao);

        carrinho.add(precoPepsi);
        System.out.println("Adicionando " + nomePepsi + " por R$" + precoPepsi);
    
    
        // 4. Cálculo do total do carrinho
        double total = 0.0;
        // Usa um loop para somar todos os preços na lista
        for (double preco : carrinho) {
            total += preco;
        }

        // 5. Exibição do total final
        System.out.println("\n--- Resumo do Carrinho ---");
        System.out.printf("O total da compra é: R$%.2f%n", total);
    
    }
	
}	 	

