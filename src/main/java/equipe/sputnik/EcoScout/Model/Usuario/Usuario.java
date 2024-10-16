package equipe.sputnik.EcoScout.Model.Usuario;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private LocalDate dataCriacaoConta;
    private String usuario;
    @Column(name = "nomeRealUsuario", nullable = false)
    private String nomeRealUsuario;
    private String password;
    private String coordenadas;

    @ElementCollection
    private List<Comunidade> comunidades;

    @ElementCollection
    private List<Premio> premiosUsuario;

    @ElementCollection
    private List<Usuario> amigos;

    public Usuario() {
    }

    public Usuario(Long idUsuario, LocalDate dataCriacaoConta, String usuario, String nomeRealUsuario, String password, String coordenadas, List<Comunidade> comunidades, List<Premio> premiosUsuario, List<Usuario> amigos) {
        this.idUsuario = idUsuario;
        this.dataCriacaoConta = dataCriacaoConta;
        this.usuario = usuario;
        this.nomeRealUsuario = nomeRealUsuario;
        this.password = password;
        this.coordenadas = coordenadas;
        this.comunidades = comunidades;
        this.premiosUsuario = premiosUsuario;
        this.amigos = amigos;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDate getDataCriacaoConta() {
        return dataCriacaoConta;
    }

    public void setDataCriacaoConta(LocalDate dataCriacaoConta) {
        this.dataCriacaoConta = dataCriacaoConta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNomeRealUsuario() {
        return nomeRealUsuario;
    }

    public void setNomeRealUsuario(String nomeRealUsuario) {
        this.nomeRealUsuario = nomeRealUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public List<Comunidade> getComunidades() {
        return comunidades;
    }

    public void setComunidades(List<Comunidade> comunidades) {
        this.comunidades = comunidades;
    }

    public List<Premio> getPremiosUsuario() {
        return premiosUsuario;
    }

    public void setPremiosUsuario(List<Premio> premiosUsuario) {
        this.premiosUsuario = premiosUsuario;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }
}
