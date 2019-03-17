package br.edu.unifacisa.si.map.padroes.gof.memento;

public class TextoMemento {
	protected String estadoTexto;

	public TextoMemento(String texto) {
		estadoTexto = texto;
	}

	public String getTextoSalvo() {
		return estadoTexto;
	}
}
