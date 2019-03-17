package br.edu.unifacisa.si.map.padroes.gof.decorator;

public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;

	public CoquetelDecorator(Coquetel umCoquetel) {
		coquetel = umCoquetel;
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nome;
	}

	public double getPreco() {
		return coquetel.getPreco() + preco;
	}
}
