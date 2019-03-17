package br.edu.unifacisa.si.map.padroes.gof.iteratorExterno;

public interface IteradorInterface {
	void first();

	void next();

	boolean isDone();

	Canal currentItem();
}
