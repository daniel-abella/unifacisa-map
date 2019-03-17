package br.edu.unifacisa.si.map.padroes.gof.singleton;

public class Conexao {

    private static Conexao instanciaCompartilhada;

    // Construtor privado, apenas a própria classe consegue se instanciar.
    private Conexao() {
    }

    public static Conexao getSingletonInstance() {
        if (instanciaCompartilhada == null){
            instanciaCompartilhada = new Conexao();
        }
        
        return instanciaCompartilhada;
    }
    
    //Override do método clone para evitar clonarem objetos dessa classe
    @Override
    public Conexao clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Esta classe não pode ser clonada");
        }
        
        return null; 
    }

}
