package br.edu.unifacisa.si.map.padroes.gof.decorator;

public class Main {
	public static void main(String[] args) {
		Coquetel meuCoquetel = new Cachaca();
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());

		meuCoquetel = new Refrigerante(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
	}
}
