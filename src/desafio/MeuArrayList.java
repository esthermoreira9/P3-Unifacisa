package desafio;

public class MeuArrayList {
	
	private Object[] listaInterna = new Object[3];
	private int inseridos;
	
	public boolean contains(Object elemento) {
		for(int i = 0; i < listaInterna.length; i++) {
			if(listaInterna[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public void add(Object elemento) {
		if(inseridos == listaInterna.length) {
			Object[] listaDobrada = new Object[inseridos + 3];
			for(int i = 0; i < listaInterna.length; i++) {
				listaDobrada[i] = listaInterna[i];
			}
			listaDobrada = listaInterna;
		}
		listaInterna[inseridos] = elemento;
		inseridos++;
	}

	public void remove(Object elemento) {
		boolean deslocarAEsquerda = false;
		for(int i = 0; i < listaInterna.length; i++) {
			if(listaInterna[i].equals(elemento)) {
				deslocarAEsquerda = true;
			}
			if(deslocarAEsquerda) {
				this.listaInterna[i] = this.listaInterna[i+1];
			}
		}
	}
	
	public void removeByIndex(int index) {
		//TODO implementar
	}
	
	public int size() {
		return inseridos;
	}

}
