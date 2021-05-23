package provaP3;

public class MurasList {
	
	private static final int TAM_INICIAL = 10;
	private static final int TAM_FINAL = 100;
	private Object[] listaInterna = new Object[TAM_INICIAL];
	private int inseridos;
	
	public void add(Object elemento) throws ListaLotadaException {
		this.listaInterna[inseridos] = elemento;
		inseridos++;
		if(inseridos == TAM_FINAL) {
			throw new ListaLotadaException("A lista atingiu sua capacidade total");
		}
	}
	
	public int tamanho(){
        return inseridos;
	}

}