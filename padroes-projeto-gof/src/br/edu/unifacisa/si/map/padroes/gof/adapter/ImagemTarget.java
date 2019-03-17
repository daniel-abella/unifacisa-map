package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Adapter
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public interface ImagemTarget {
	void carregarImagem(String nomeDoArquivo);

	void desenharImagem(int posX, int posY, int largura, int altura);
}
