import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A classe de modelo para armazenar as informações de um treino.
 * Esta classe usa o conceito de encapsulamento com atributos privados
 * e métodos públicos (getters e setters) para acesso.
 */
class ExercGi_Encapsulamento_Treino_Classe {
	private String academia;
	private String modeloAparelho;
	private String peso;
	
	
	public String getAcademia() {
		return academia;
	}
	public void setAcademia(String academia) {
		this.academia = academia;
	}
	public String getModeloAparelho() {
		return modeloAparelho;
	}
	public void setModeloAparelho(String modeloAparelho) {
		this.modeloAparelho = modeloAparelho;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
}

