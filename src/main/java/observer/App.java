package observer;

public class App {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		
		meuCarro.defeitoIdentificado();
		meuCarro.defeitoIdentificado();
		meuCarro.defeitoIdentificado();
		
		meuCarro.ativarAlerta(new ErroIdentificadoListenerConsole());
		
		meuCarro.defeitoIdentificado();
		meuCarro.defeitoIdentificado();
	}
}
