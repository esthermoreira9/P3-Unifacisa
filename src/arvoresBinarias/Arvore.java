package arvoresBinarias;

public class Arvore {
	private int folha;
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

    public int quantidadeFolhas(No no) {
        
        if(no.getDireita() == null && no.getEsquerda() == null) {
            folha++;
        } 

        if(no != null) {
            quantidadeFolhas(no.getEsquerda());
            quantidadeFolhas(no.getDireita());
        }
        return folha;
    }
    
    public void preOrdem(No no) {
    	if(no != null) {
    		System.out.println(no.getCodigo());
    		preOrdem(no.getEsquerda());
    		preOrdem(no.getDireita());
    	}
    }
    public void emOrdem(No no) {
    	if(no != null) {
    		emOrdem(no.getEsquerda());
    		System.out.println(no.getCodigo());
    		emOrdem(no.getDireita());
    	}
    }
    public void posOrdem(No no) {
    	if(no != null) {
    		posOrdem(no.getEsquerda());
    		posOrdem(no.getDireita());
    		System.out.println(no.getCodigo());
    	}
    }
}
