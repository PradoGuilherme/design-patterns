package observer;

public class Carro {
	
	private int quantidadeDeProblemas = 0;
	private ProblemaListener listener;
	
	public void defeitoIdentificado() {
		if (listener != null) {
			listener.notificar(quantidadeDeProblemas);
		}
		this.quantidadeDeProblemas++;
	}
	
	public void ativarAlerta(ProblemaListener listener) {
		this.listener = listener;
	}
	
	public void desativarAlerta() {
		this.listener = null;
	}

}
