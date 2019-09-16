package observer;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ErroIdentificadoListenerConsole implements ProblemaListener {

	public void notificar(int quantidadeDeProblemas) {
		JOptionPane optionPane = new JOptionPane("Quantidade de erros em seu carro: " + quantidadeDeProblemas, JOptionPane.ERROR_MESSAGE);
		JDialog dialog = optionPane.createDialog("Erros");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
	}

}
