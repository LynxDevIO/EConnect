package Model.Usuario;

import Model.Comunidade.Comunidade;
import Model.Premio.Premio;

import java.util.ArrayList;

public class Usuario {
    private long idUsuario;
    private String nomeUsuario;
    private double geolocalizacaoAltitude;
    private double geolocalizacaoLongitude;
    private ArrayList<Comunidade> comunidades;
    private ArrayList<Premio> premiosUsuario;
    private ArrayList<Usuario> amigos;
}
