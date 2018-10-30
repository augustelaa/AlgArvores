/*
 * Augusto Henrique da Conceição
 * Marcelo Luiz Jung
 * Eduardo Cesar Pascoali
 */

public class Arvore<T> {
	private NoArvore<T> raiz;
	
	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}
	private NoArvore<T> getRaiz() {
		return raiz;
	}
	public NoArvore<T> percente(T info) {
		if (vazia()) {
			return null;
		}
		return this.raiz.pertence(info);
	}
	public int getAlturaMaxima() {
		if (vazia()) {
			return -1;
		}
		return this.raiz.getAltura(0);
	}
	public boolean vazia() {
		return getRaiz() == null;
	}
	public String toString() {
		return null;
	}
}
