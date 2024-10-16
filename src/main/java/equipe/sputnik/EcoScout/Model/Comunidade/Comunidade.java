package equipe.sputnik.EcoScout.Model.Comunidade;

import equipe.sputnik.EcoScout.Model.Usuario.Usuario;

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


    public Comunidade(long idComunidade, String nome, ArrayList<Usuario> organizadores, ArrayList<Usuario> membros, int qualidadePremiacao) {
        this.idComunidade = idComunidade;
        this.nome = nome;
        this.organizadores = organizadores;
        this.membros = membros;
        this.qualidadePremiacao = qualidadePremiacao;
    }

    public long getIdComunidade() {
        return idComunidade;
    }

    public void setIdComunidade(long idComunidade) {
        this.idComunidade = idComunidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Usuario> getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(ArrayList<Usuario> organizadores) {
        this.organizadores = organizadores;
    }

    public ArrayList<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Usuario> membros) {
        this.membros = membros;
    }

    public int getLimiteMembros() {
        return limiteMembros;
    }

    public int getQualidadePremiacao() {
        return qualidadePremiacao;
    }

    public void setQualidadePremiacao(int qualidadePremiacao) {
        this.qualidadePremiacao = qualidadePremiacao;
    }
}
