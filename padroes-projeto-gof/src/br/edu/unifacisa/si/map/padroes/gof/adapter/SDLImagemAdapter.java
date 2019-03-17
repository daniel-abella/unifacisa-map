package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informa��o - UniFacisa
 * M�todos Avan�ados de Programa��o (MAP)
 * Padr�o Adapter
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
