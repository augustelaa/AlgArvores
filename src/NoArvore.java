/*
 * Augusto Henrique da Conceição
 * Marcelo Luiz Jung
 * Eduardo Cesar Pascoali
 */

public class NoArvore<T> {
	private T info;
	private NoArvore<T> filho;
	private NoArvore<T> irmao;
	private int altura;
	
	public NoArvore(T info) {
		this.info = info;
	}	
	protected String imprimePre() {
		return null;
	}
	public void inserirFilho(NoArvore<T> filho) {
		filho.irmao = this.filho;
		this.filho = filho;
	}
	protected NoArvore<T> pertence(T info) {
		NoArvore<T> no = null;
		if (this.info.equals(info)) {
			return this;
		}
		if (this.filho != null) {
			no = this.filho.pertence(info);
			if (no != null) {
				return no;
			}
		}
		if (this.irmao != null) {
			no = this.irmao.pertence(info);
			if (no != null) {
				return no;
			}
		}
		return null;
	}
	
	public int getAltura(int altura) {
		this.altura = altura;
		if (this.filho != null) {
			int alturaFilho = this.filho.getAltura(altura+1);
			if (alturaFilho > altura) {
				return alturaFilho;
			}
		}
		if (this.irmao != null) {
			this.irmao.getAltura(altura);
		}
		return altura;
	}
	
	public NoArvore<T> getFilho() {
		return filho;
	}
	
	public NoArvore<T> getIrmao() {
		return irmao;
	}
	
	public T getInfo() {
		return info;
	}
	
}
