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
    private double geolocalizacaoAltitude;
    private double geolocalizacaoLongitude;
    private ArrayList<Comunidade> comunidades;
    private ArrayList<Premio> premiosUsuario;
    private ArrayList<Usuario> amigos;

    public Usuario(long idUsuario,
                   String nomeUsuario,
                   LocalDate dataCriacaoConta,
                   String password,
                   double geolocalizacaoAltitude,
                   double geolocalizacaoLongitude,
                   ArrayList<Comunidade> comunidades,
                   ArrayList<Premio> premiosUsuario,
                   ArrayList<Usuario> amigos) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.dataCriacaoConta = dataCriacaoConta;
        this.nomeUsuario = nomeUsuario;
        this.geolocalizacaoAltitude = geolocalizacaoAltitude;
        this.geolocalizacaoLongitude = geolocalizacaoLongitude;
        this.comunidades = comunidades;
        this.premiosUsuario = premiosUsuario;
        this.amigos = amigos;
    }
}
