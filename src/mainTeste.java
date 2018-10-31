/*
 * Augusto Henrique da Conceição
 * Marcelo Luiz Jung
 * Eduardo Cesar Pascoali
 */

public class mainTeste {

	public static void main(String[] args) {
		
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);		
		
		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);
		
		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		
		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);
		
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);
		
//		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
//		n9.inserirFilho(n11);
//		
//		NoArvore<Integer> n12 = new NoArvore<Integer>(12);
//		n9.inserirFilho(n12);
		
		NoArvore<Integer> n13 = new NoArvore<Integer>(13);
		n10.inserirFilho(n13);
		
		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		
		System.out.println(a.getAltura());
		System.out.println(a.getNivel(17));
		System.out.println(a.isDegenerada());
		
		System.out.println("--------------");
		
		
		
		
		NoArvore<Integer> nb2 = new NoArvore<Integer>(2);
		NoArvore<Integer> nb3 = new NoArvore<Integer>(3);
		NoArvore<Integer> nb5 = new NoArvore<Integer>(5);
		nb2.inserirFilho(nb5);
		nb2.inserirFilho(nb3);
		
		NoArvore<Integer> nb4 = new NoArvore<Integer>(4);
		nb3.inserirFilho(nb4);
		
		NoArvore<Integer> nb6 = new NoArvore<Integer>(6);
		
		
		NoArvore<Integer> nb7 = new NoArvore<Integer>(7);
		NoArvore<Integer> nb8 = new NoArvore<Integer>(8);
		NoArvore<Integer> nb9 = new NoArvore<Integer>(9);
		nb7.inserirFilho(nb9);
		nb7.inserirFilho(nb8);
		
		NoArvore<Integer> nb10 = new NoArvore<Integer>(10);
		nb9.inserirFilho(nb10);
		
		
		NoArvore<Integer> raiz = new NoArvore<Integer>(1);
		
		raiz.inserirFilho(nb7);
		raiz.inserirFilho(nb6);
		raiz.inserirFilho(nb2);
		
		NoArvore<Integer> nb11 = new NoArvore<Integer>(11);
//		nb6.inserirFilho(nb11);
		
		NoArvore<Integer> nb12 = new NoArvore<Integer>(12);
//		nb4.inserirFilho(nb12);
		
		
		Arvore<Integer> b = new Arvore<>();
		b.setRaiz(raiz);
		
		System.out.println(b.getAltura());
		System.out.println(b.getNivel(6));
		
		System.out.println(b.isDegenerada());
		System.out.println(b.toString());
		
	}

}
