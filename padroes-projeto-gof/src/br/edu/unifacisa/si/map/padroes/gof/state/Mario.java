package br.edu.unifacisa.si.map.padroes.gof.state;

public class Mario {
	protected MarioState estado;
	
	public Mario() {
		estado = new MarioPequeno();
	}

	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}

	public void pegarFlor() {
		estado = estado.pegarFlor();
	}

	public void pegarPena() {
		estado = estado.pegarPena();
	}

	public void levarDano() {
		estado = estado.levarDano();
	}
}
