package br.edu.unifacisa.si.map.padroes.gof.iteratorInterno;

import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.Canal;
import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Canal canal) {
		System.out.println(canal.nome);
	}

}
