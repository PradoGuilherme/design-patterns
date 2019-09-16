package builder;

public class Computador {
	
	public Processador processador;
	public Memoria memoria;
	
	private Computador() {

	}
	
	public static ComputerBuilder builder() {
		return new ComputerBuilder();
	}

	public Processador getProcessador() {
		return processador;
	}
	
    @Override
    public String toString() {
        return "Computador { " +
                "processador='" + this.processador + '\'' +
                ", memoria='" + this.memoria + '\'' +
                '}';
    }
	
	static class ComputerBuilder {
		
		private Processador processador;
		private Memoria memoria;

		public ComputerBuilder setProcessador(Processador processador) {
			this.processador = processador;
			return this;
		}
		
		public ComputerBuilder setMemoria(Memoria memoria) {
			this.memoria = memoria;
			return this;
		}

		public Computador build() {
			Computador computador = new Computador();
			if (this.processador != null) {
				computador.processador = this.processador;
			}
			
			if (this.memoria != null) {
				computador.memoria = this.memoria;
			}
			return computador; 
		}

	}
	
}
