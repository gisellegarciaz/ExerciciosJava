package guiaTeresopolis;

public class ClasseEstabelecimento {
	
	    private int id;
	    private String nome;
	    private String endereco;
	    private String descricao;
	    private String classe;

	    // Construtor para inicializar um objeto Estabelecimento
	    public ClasseEstabelecimento(int id, String nome, String endereco, String descricao) {
	        this.id = id;
	        this.nome = nome;
	        this.endereco = endereco;
	        this.descricao = descricao;
	    }
	    public ClasseEstabelecimento(int id, String nome, String endereco, String descricao, String categoria) {
	        this.id = id;
	        this.nome = nome;
	        this.endereco = endereco;
	        this.descricao = descricao;
	        this.classe = categoria;
	    }
	    
	    

	    /*
	     * // Método para exibir as informações do estabelecimento
	    public void exibirInfo() {
	        //System.out.println("ID: " + this.id);
	        System.out.println("\nNome: " + this.nome);
	        System.out.println("Endereço: " + this.endereco);
	        System.out.println("Descrição: " + this.descricao);
	        System.out.println("\n--------------------");
	    }
	    */

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getClasse() {
			return classe;
		}
		public void setClasse(String categoria) {
			this.classe = categoria;
		}
		@Override
		public String toString() {
			return "\nNome: " + nome + "\nEndereco: " + endereco + "\nDescricao: " + descricao + "\n-------------------------------------------";
		}
} 



