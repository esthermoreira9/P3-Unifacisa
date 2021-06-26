package arvoresBinarias;

public class Arvore {
	private No raiz;
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	
	public void inserir(int valor) {
		inserir(this.raiz, valor);
	}
	
	private void inserir(No no, int valor) {
		if(isEmpty()) {
			this.raiz = new No(valor);
		}else {
			if(valor < no.getCodigo()) {
				if(no.getEsquerda() != null) {
					inserir(no.getEsquerda(), valor);
				}else {
					no.setEsquerda(new No(valor));
				}
			}else if (valor > no.getCodigo()) {
				if(no.getDireita() != null) {
					inserir(no.getDireita(), valor);
				}else {
					no.setDireita(new No(valor));
				}
			}
		}
	}
    
    public void preOrdem(No no) {
    	if(no != null) {
    		System.out.println(no.getCodigo());
    		preOrdem(no.getEsquerda());
    		preOrdem(no.getDireita());
    	}
    }
    
    public No getRaiz(No novoNo) {
    	if(novoNo.getPai() == null) {
    		return novoNo;
    	}
    	return getRaiz(novoNo.getPai());
    }

}
