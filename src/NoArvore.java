/*
 * Augusto Henrique da Concei��o
 * Marcelo Luiz Jung
 * Eduardo Cesar Pascoali
 */

public class NoArvore<T> {
	private T info;
	private NoArvore<T> filho;
	private NoArvore<T> irmao;
	
	public NoArvore(T info) {
		this.info = info;
	}	
	public String imprimePre() {
        String texto = "(" + this.getInfo();
        
        if (this.filho != null) {
        	texto += this.filho.imprimePre() + ")";
		} else {
			texto += ")";
		}
		if (this.irmao != null) {
			texto += this.irmao.imprimePre();
		}

        return texto;
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
	
	public int getNivel(T info, int altura) {
		if (this.info.equals(info)) {
			return altura;
		}
		if (this.filho != null) {
			int nivel = this.filho.getNivel(info, altura+1);
			if (nivel != -1) {
				return nivel;
			}
		}
		if (this.irmao != null) {
			int nivel = this.irmao.getNivel(info, altura);
			if (nivel != -1) {
				return nivel;
			}
		}
		return -1;
	}
	
	public int getAltura(int altura) {
		int alturaAux = altura;
		if (this.filho != null) {
			int nivel = this.filho.getAltura(altura+1);
			if (nivel > altura) {
				alturaAux = nivel;
			}
		}
		
		if (this.irmao != null) {	
			int nivel = this.irmao.getAltura(altura);
			if (nivel > alturaAux) {
				alturaAux = nivel;
			}
			
		}
		return alturaAux;
	}
	
	public boolean isDegenerada(int altura, int alturaArvore) {
		if (this.filho != null) {
			if(this.filho.isDegenerada(altura+1, alturaArvore))
				return true;
		}
		
		if (this.irmao != null) {
			if (this.irmao.isDegenerada(altura, alturaArvore))
				return true;
		}
		if (alturaArvore - altura > 1 && this.filho == null) {
			return true;
		}
		return false;
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
