package guiaTeresopolis;

public class ClasseEstabelecimento {
	
	    private int id;
	    private String nome;
	    private String endereco;
	    private String descricao;

	    // Construtor para inicializar um objeto Estabelecimento
	    public ClasseEstabelecimento(int id, String nome, String endereco, String descricao) {
	        this.id = id;
	        this.nome = nome;
	        this.endereco = endereco;
	        this.descricao = descricao;
	    }

	    // Método para exibir as informações do estabelecimento
	    public void exibirInfo() {
	        //System.out.println("ID: " + this.id);
	        System.out.println("\nNome: " + this.nome);
	        System.out.println("Endereço: " + this.endereco);
	        System.out.println("Descrição: " + this.descricao);
	        System.out.println("\n--------------------");
	    }
} 



