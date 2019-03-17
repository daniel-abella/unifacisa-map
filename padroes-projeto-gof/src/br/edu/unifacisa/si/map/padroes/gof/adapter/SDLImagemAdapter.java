package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Adapter
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		SDL_CarregarSurface(nomeDoArquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		SDL_DesenharSurface(largura, altura, posX, posY);
	}
}
