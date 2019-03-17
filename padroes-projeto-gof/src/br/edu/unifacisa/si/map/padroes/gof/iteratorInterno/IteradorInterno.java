package br.edu.unifacisa.si.map.padroes.gof.iteratorInterno;

import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.Canal;
import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Canal canal);
}
