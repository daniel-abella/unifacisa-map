package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Adapter
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class SDL_Surface {

	public void SDL_CarregarSurface(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void SDL_DesenharSurface(int largura, int altura, int posicaoX,
			int posicaoY) {
		System.out.println("SDL_Surface desenhada");
	}

}
