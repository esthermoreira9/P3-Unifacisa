package arvoresBinarias;

public class No {
	private No direita;
    private No esquerda;
    private No pai;
    private int codigo;

    public No(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
        return codigo;
    }
    
    public No getDireita() {
        return direita;
    }
    
    public No getEsquerda() {
        return esquerda;
    }

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	public No getPai() {
		return pai;
	}
}
