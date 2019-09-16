package builder;

public class App {
	public static void main(String[] args) {
		Computador meuComputador = Computador.builder()
				.setProcessador(Processador.intel3v5)
				.setMemoria(Memoria.M16GB)
				.build();
		
		System.out.println("meuComputador: " + meuComputador.toString());
	}
}
