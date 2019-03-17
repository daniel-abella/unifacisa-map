package br.edu.unifacisa.si.map.padroes.gof.singleton;


/**
 * Exemplo da Padrão de Projeto Singleton
 * 
 * @author abella
 *
 */
public class ExemploSingleton {

	public static void main(String[] args) {

		Conexao con1 = Conexao.getSingletonInstance();
		Conexao con2 = Conexao.getSingletonInstance();

		System.out.println(con2.toString());
		System.out.println(con1.toString());

		// Clone não é permitido
		try {
			Conexao con3 = con1.clone();
			System.out.println(con3.toString());
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}

}
