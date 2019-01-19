package br.com.array.estudo;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		String nome[] = new String[4];
		for (int i = 1; i <= 4; ++i) {
			String txt = JOptionPane.showInputDialog("Nome : " + i);
			if (txt == null) {
				break;

			}
			nome[i - 1] = txt;
		}
		String msg = "Lista de Nomes :";
		for (int i = 0; i < nome.length; ++i) {
			if (nome[i] == null) {
				break;
			}
			msg += "\n - " + nome[i];
		}
		JOptionPane.showMessageDialog(null, msg);

	}

}
