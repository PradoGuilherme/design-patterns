package factory;

public abstract class LG {
	
	public static Televisao criarTelevisao(Screen screen) {
		if (screen == Screen.ULTRAWIDE) {
			return new LG29WK500P();
		} else if (screen == Screen.WIDE){
			return new LG24ZK100P();
		}
		return null;
	}

}
