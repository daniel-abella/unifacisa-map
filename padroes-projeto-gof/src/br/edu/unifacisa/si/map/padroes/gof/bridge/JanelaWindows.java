package br.edu.unifacisa.si.map.padroes.gof.bridge;

public class JanelaWindows implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Windows");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Windows");
	}

}
