package factory;

public class App {
	public static void main(String[] args) {
		Televisao televisao = LG.criarTelevisao(Screen.WIDE);
		
		System.out.println("Televisao => " + televisao.getScreen());
	}
}
