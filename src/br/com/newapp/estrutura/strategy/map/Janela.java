package br.com.newapp.estrutura.strategy.map;

import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Estrategies estrategias;

	public static void main(String[] args) {
		estrategias = new Estrategies();

		Janela tela = new Janela();
		tela.setBounds(600, 150, 500, 300);
		tela.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				IEstrategia estrategia = estrategias.of(code);
				estrategia.mover();
			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		});
		tela.setVisible(true);
	}

}
