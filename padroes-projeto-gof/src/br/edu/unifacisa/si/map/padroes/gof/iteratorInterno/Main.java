package br.edu.unifacisa.si.map.padroes.gof.iteratorInterno;

import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.AgregadoDeCanais;
import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.CanaisEsportes;
import br.edu.unifacisa.si.map.padroes.gof.iteratorExterno.CanaisFilmes;

public class Main {
	public static void main(String[] args) {
		AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
		System.out.println("Canais de Esporte:");
		IteradorInterno it = new IteradorPrint(canaisDeEsportes.criarIterator());
		it.percorrerLista();

		AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
		System.out.println("\nCanais de Filmes:");
		it = new IteradorPrint(canaisDeFilmes.criarIterator());
		it.percorrerLista();
	}
}
