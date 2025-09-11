package guiaTeresopolis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* A classe principal que executa o programa Guia de Teresópolis. */

public class MainGuiaTeresopolis {
	
	public static List<ClasseEstabelecimento> filtroCategoria(List<ClasseEstabelecimento> lista, String categoria) {
		List<ClasseEstabelecimento> novaLista = new ArrayList<>();
		
		for (ClasseEstabelecimento e : lista) {
            if(e.getClasse() == categoria) {
            	novaLista.add(e);
            }
        }
		
		return novaLista;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		List<ClasseEstabelecimento> listaCompleta = new ArrayList<>();
		listaCompleta.add(new ClasseEstabelecimento(1, "Vila St. Gallen", "Rua Augusto do Amaral, 41", "Fábrica de cerveja com restaurante e pub.", "bar"));
		listaCompleta.add(new ClasseEstabelecimento(2, "Buteco do Xopin", "Rua Tijuca, s/n", "Bar descontraído, ideal para petiscos e happy hour.", "bar"));
		listaCompleta.add(new ClasseEstabelecimento(3, "Beer Garden Teresópolis", "Av. Oliveira Botelho, 444", "Ambiente agradável com grande variedade de cervejas.", "bar"));
		listaCompleta.add(new ClasseEstabelecimento(4, "Big Ape Bar", "R. Heitor de Moura Estevão, 826", "Ótima opção para quem busca um ambiente animado.", "bar"));
		listaCompleta.add(new ClasseEstabelecimento(5, "Paradise Garage", "R. Tenente Luiz Meirelles, 3.377", "Pub com palco para shows e música ao vivo.", "bar"));
		listaCompleta.add(new ClasseEstabelecimento(6, "Dona Irene", "R. Tte. Luiz Meirelles, 1800", "Restaurante russo com menu degustação.", "restaurante"));
		listaCompleta.add(new ClasseEstabelecimento(7, "È Vero", "R. Carmela Dutra, 306", "Típica cantina italiana com pratos fartos.", "restaurante"));
		listaCompleta.add(new ClasseEstabelecimento(8, "Imbuhy Restaurante", "Est. dos Pinheiros, 297", "Opções a la carte com buffet nos finais de semana.", "restaurante"));
		listaCompleta.add(new ClasseEstabelecimento(9, "Cremerie Geneve", "Est. Teresópolis-Friburgo, km 16", "Restaurante suíço, famoso pelo fondue.", "restaurante"));
		listaCompleta.add(new ClasseEstabelecimento(10, "Burrata Empório e Bistrô", "Av. Oliveira Botelho, 456", "Ambiente aconchegante, com massas e vinhos.", "restaurante"));
		listaCompleta.add(new ClasseEstabelecimento(11, "Parque Nacional da Serra dos Órgãos", "Av. Rotariana, s/n", "Cachoeiras e trilhas como a do Poço Dois Irmãos.", "atividadeArLivre"));
		listaCompleta.add(new ClasseEstabelecimento(12, "Granja Comary", "R. Hercílio Ferreira dos Santos", "Sede da CBF, com um belo lago e jardins.", "atividadeArLivre"));
		listaCompleta.add(new ClasseEstabelecimento(13, "Parque Municipal Montanhas", "Rodovia BR 116, km 74", "Pedra da Tartaruga e mirantes com vistas incríveis.", "atividadeArLivre"));
		listaCompleta.add(new ClasseEstabelecimento(14, "Feirinha do Alto", "Praça Higino da Silveira", "Feira de artesanato e gastronomia local.", "atividadeArLivre"));
		listaCompleta.add(new ClasseEstabelecimento(15, "Mirante do Soberbo", "BR-116, s/n", "Ponto de observação com vista panorâmica da cidade e do Dedo de Deus.", "atividadeArLivre"));
		listaCompleta.add(new ClasseEstabelecimento(16, "Teresópolis Shopping Center", "Rua Edmundo Bittencourt, 101", "Shopping tradicional com lojas, cinema e praça de alimentação.", "shopping"));
		listaCompleta.add(new ClasseEstabelecimento(17, "Várzea Shopping", "Av. Alm. Lúcio Meira, 670", "Opção de compras e serviços na região central.", "shopping"));
		listaCompleta.add(new ClasseEstabelecimento(18, "Shopping do Alto", "Praça Higino da Silveira, 61", "Pequeno shopping no bairro Alto.", "shopping"));
		listaCompleta.add(new ClasseEstabelecimento(19, "Estação Teresópolis", "Av. Rotariana, 400", "Centro comercial próximo à entrada da cidade.", "shopping"));
		listaCompleta.add(new ClasseEstabelecimento(20, "Comary Shopping", "Praça Higino da Silveira, 161", "Pequeno shopping center localizado no bairro Alto.", "shopping"));
		listaCompleta.add(new ClasseEstabelecimento(21, "Pousada Matitaterê", "Rua Ten. Luiz Meirelles, 1.800", "Acolhedora pousada próxima ao Parque Nacional.", "hospedagem"));
		listaCompleta.add(new ClasseEstabelecimento(22, "Intercity Teresópolis", "Rua Armando Fajardo, 100", "Hotel moderno com piscina, academia e restaurante.", "hospedagem"));
		listaCompleta.add(new ClasseEstabelecimento(23, "Pousada Tankamana", "Estrada da Toca da Onça, 500", "Pousada romântica com chalés privativos.", "hospedagem"));
		listaCompleta.add(new ClasseEstabelecimento(24, "Pousada Cascata dos Amores", "Rua Armando Fajardo, 14", "Pousada charmosa com piscina e belas vistas.", "hospedagem"));
		listaCompleta.add(new ClasseEstabelecimento(25, "Pousada & Spa Vrindavana", "Est. Teresópolis-Friburgo, km 6,5", "Spa e pousada focados em bem-estar e contato com a natureza.", "hospedagem"));
        

		
     // Loop 'for' para controlar a execução do programa
        // O loop é infinito (for (;;)) e só para com o 'break' ou 'return'
        for (;;) {
            System.out.println("\n----- Guia de Teresópolis -----\n");
            System.out.println("Qual serviço você deseja?\n");
            System.out.println("1) Bares/Vida Noturna");
            System.out.println("2) Restaurantes");
            System.out.println("3) Atividades ao Ar Livre");
            System.out.println("4) Shoppings");
            System.out.println("5) Hospedagens");
            System.out.println("6) Sair");
            System.out.print("\nDigite o número da opção: ");

            int opcao = scanner.nextInt();
            List<ClasseEstabelecimento> listaSelecionada = null;

            switch (opcao) {
                case 1:
                    listaSelecionada = filtroCategoria(listaCompleta, "bar"); 
                    System.out.println("\n\n--- Bares e Vida Noturna ---\n");
                    break;
                case 2:
                    listaSelecionada = filtroCategoria(listaCompleta, "restaurante");
                    System.out.println("\n\n--- Restaurantes ---\n");
                    break;
                case 3:
                    listaSelecionada = filtroCategoria(listaCompleta, "atividadeArLivre");
                    System.out.println("\n\n--- Atividades ao Ar Livre ---\n");
                    break;
                case 4:
                    listaSelecionada = filtroCategoria(listaCompleta, "shopping");
                    System.out.println("\n\n--- Shoppings ---\n");
                    break;
                case 5:
                    listaSelecionada = filtroCategoria(listaCompleta, "hospedagem");;
                    System.out.println("\n\n--- Hospedagens ---\n");
                    break;
                case 6:
                    System.out.println("Obrigado por usar o Guia de Teresópolis! Até a próxima.");
                    scanner.close();
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida. Por favor, digite um número de 1 a 6.");
            }
            
            // Exibe as sugestões, se a opção for válida
            if (listaSelecionada != null) {
                for (ClasseEstabelecimento e : listaSelecionada) {
                    System.out.println(e.toString());
                }
                
                // --- Código Adicional para Continuar a Busca ---
                System.out.print("\nDeseja conferir outra categoria? (s/n): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("n")) {
                    System.out.println("\nObrigado por usar o Guia de Teresópolis! Até a próxima.");
                    scanner.close();
                    return;
                }
                // Se a resposta for 's', o loop continua e o menu é exibido novamente.
            }
        }
		

	}
}


//descartados
/* Listas de sugestões para cada categoria
List<ClasseEstabelecimento> bares = new ArrayList<>();
bares.add(new ClasseEstabelecimento(1, "Vila St. Gallen", "Rua Augusto do Amaral, 41", "Fábrica de cerveja com restaurante e pub.", "bar"));
bares.add(new ClasseEstabelecimento(2, "Buteco do Xopin", "Rua Tijuca, s/n", "Bar descontraído, ideal para petiscos e happy hour.", "bar"));
bares.add(new ClasseEstabelecimento(3, "Beer Garden Teresópolis", "Av. Oliveira Botelho, 444", "Ambiente agradável com grande variedade de cervejas.", "bar"));
bares.add(new ClasseEstabelecimento(4, "Big Ape Bar", "R. Heitor de Moura Estevão, 826", "Ótima opção para quem busca um ambiente animado.", "bar"));
bares.add(new ClasseEstabelecimento(5, "Paradise Garage", "R. Tenente Luiz Meirelles, 3.377", "Pub com palco para shows e música ao vivo.", "bar"));

List<ClasseEstabelecimento> restaurantes = new ArrayList<>();
restaurantes.add(new ClasseEstabelecimento(1, "Dona Irene", "R. Tte. Luiz Meirelles, 1800", "Restaurante russo com menu degustação.", "restaurante"));
restaurantes.add(new ClasseEstabelecimento(2, "È Vero", "R. Carmela Dutra, 306", "Típica cantina italiana com pratos fartos.", "restaurante"));
restaurantes.add(new ClasseEstabelecimento(3, "Imbuhy Restaurante", "Est. dos Pinheiros, 297", "Opções a la carte com buffet nos finais de semana.", "restaurante"));
restaurantes.add(new ClasseEstabelecimento(4, "Cremerie Geneve", "Est. Teresópolis-Friburgo, km 16", "Restaurante suíço, famoso pelo fondue.", "restaurante"));
restaurantes.add(new ClasseEstabelecimento(5, "Burrata Empório e Bistrô", "Av. Oliveira Botelho, 456", "Ambiente aconchegante, com massas e vinhos.", "restaurante"));

List<ClasseEstabelecimento> atividades = new ArrayList<>();
atividades.add(new ClasseEstabelecimento(1, "Parque Nacional da Serra dos Órgãos", "Av. Rotariana, s/n", "Cachoeiras e trilhas como a do Poço Dois Irmãos.", "atividadeArLivre"));
atividades.add(new ClasseEstabelecimento(2, "Granja Comary", "R. Hercílio Ferreira dos Santos", "Sede da CBF, com um belo lago e jardins.", "atividadeArLivre"));
atividades.add(new ClasseEstabelecimento(3, "Parque Municipal Montanhas", "Rodovia BR 116, km 74", "Pedra da Tartaruga e mirantes com vistas incríveis.", "atividadeArLivre"));
atividades.add(new ClasseEstabelecimento(4, "Feirinha do Alto", "Praça Higino da Silveira", "Feira de artesanato e gastronomia local.", "atividadeArLivre"));
atividades.add(new ClasseEstabelecimento(5, "Mirante do Soberbo", "BR-116, s/n", "Ponto de observação com vista panorâmica da cidade e do Dedo de Deus.", "atividadeArLivre"));

List<ClasseEstabelecimento> shoppings = new ArrayList<>();
shoppings.add(new ClasseEstabelecimento(1, "Teresópolis Shopping Center", "Rua Edmundo Bittencourt, 101", "Shopping tradicional com lojas, cinema e praça de alimentação.", "shopping"));
shoppings.add(new ClasseEstabelecimento(2, "Várzea Shopping", "Av. Alm. Lúcio Meira, 670", "Opção de compras e serviços na região central.", "shopping"));
shoppings.add(new ClasseEstabelecimento(3, "Shopping do Alto", "Praça Higino da Silveira, 61", "Pequeno shopping no bairro Alto.", "shopping"));
shoppings.add(new ClasseEstabelecimento(4, "Estação Teresópolis", "Av. Rotariana, 400", "Centro comercial próximo à entrada da cidade.", "shopping"));
shoppings.add(new ClasseEstabelecimento(5, "Comary Shopping", "Praça Higino da Silveira, 161", "Pequeno shopping center localizado no bairro Alto.", "shopping"));

List<ClasseEstabelecimento> hospedagens = new ArrayList<>();
hospedagens.add(new ClasseEstabelecimento(1, "Pousada Matitaterê", "Rua Ten. Luiz Meirelles, 1.800", "Acolhedora pousada próxima ao Parque Nacional.", "hospedagem"));
hospedagens.add(new ClasseEstabelecimento(2, "Intercity Teresópolis", "Rua Armando Fajardo, 100", "Hotel moderno com piscina, academia e restaurante.", "hospedagem"));
hospedagens.add(new ClasseEstabelecimento(3, "Pousada Tankamana", "Estrada da Toca da Onça, 500", "Pousada romântica com chalés privativos.", "hospedagem"));
hospedagens.add(new ClasseEstabelecimento(4, "Pousada Cascata dos Amores", "Rua Armando Fajardo, 14", "Pousada charmosa com piscina e belas vistas.", "hospedagem"));
hospedagens.add(new ClasseEstabelecimento(5, "Pousada & Spa Vrindavana", "Est. Teresópolis-Friburgo, km 6,5", "Spa e pousada focados em bem-estar e contato com a natureza.", "hospedagem"));
*/


