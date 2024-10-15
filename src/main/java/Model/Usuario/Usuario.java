package Model.Usuario;

import Model.Comunidade.Comunidade;
import Model.Premio.Premio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private long idUsuario;
    private String password;
    private final LocalDate dataCriacaoConta;
    private String nomeUsuario;
    private String coordenadas;
    private ArrayList<Comunidade> comunidades;
    private ArrayList<Premio> premiosUsuario;
    private ArrayList<Usuario> amigos;

    public Usuario(long idUsuario,
                   String nomeUsuario,
                   LocalDate dataCriacaoConta,
                   String password,
                   String coordenadas,
                   ArrayList<Comunidade> comunidades,
                   ArrayList<Premio> premiosUsuario,
                   ArrayList<Usuario> amigos) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.dataCriacaoConta = dataCriacaoConta;
        this.nomeUsuario = nomeUsuario;
        this.coordenadas = coordenadas;
        this.comunidades = comunidades;
        this.premiosUsuario = premiosUsuario;
        this.amigos = amigos;
    }
}
