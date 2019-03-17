package br.edu.unifacisa.si.map.padroes.gof.abstractFactory;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Abstract Factory
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria:Popular");
	}

}
