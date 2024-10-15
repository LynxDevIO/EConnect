package Model.Comunidade;

import Model.Usuario.Usuario;

import java.util.ArrayList;

public class Comunidade {
    private long idComunidade;
    private String nome;
    private ArrayList<Usuario> organizadores;
        // todo: limite de 10% dos membros?
    private ArrayList<Usuario> membros;
    private final int limiteMembros = 500;
    private int qualidadePremiacao;
        // 1 a 4;
        // 1: 1.25x; 2: 1.5x; 3: 1.75x; 4: 2x;
}
