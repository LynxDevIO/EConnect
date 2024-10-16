package equipe.sputnik.EcoScout.Model.Comunidade;

import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;
import java.util.List;

@Entity
public class Comunidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComunidade;
    private String nome;

    @ElementCollection
    private List<Usuario> organizadores;

    @ElementCollection
    private List<Usuario> membros;

    private final int limiteMembros = 500;
    private int qualidadePremiacao;

    public Comunidade(Long idComunidade, String nome, List<Usuario> organizadores, List<Usuario> membros, int qualidadePremiacao) {
        this.idComunidade = idComunidade;
        this.nome = nome;
        this.organizadores = organizadores;
        this.membros = membros;
        this.qualidadePremiacao = qualidadePremiacao;
    }

    public Comunidade() {
    }

    public Long getIdComunidade() {
        return idComunidade;
    }

    public void setIdComunidade(Long idComunidade) {
        this.idComunidade = idComunidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Usuario> getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(List<Usuario> organizadores) {
        this.organizadores = organizadores;
    }

    public List<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(List<Usuario> membros) {
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
