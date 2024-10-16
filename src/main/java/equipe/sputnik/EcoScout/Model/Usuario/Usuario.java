package equipe.sputnik.EcoScout.Model.Usuario;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    private LocalDate dataCriacaoConta;
    private String usuario;
    private String nomeRealUsuario;
    private String password;
    private String coordenadas;
    private ArrayList<Comunidade> comunidades;
    private ArrayList<Premio> premiosUsuario;
    private ArrayList<Usuario> amigos;

    public Usuario(){
        ;
    }

    public Usuario(long idUsuario, LocalDate dataCriacaoConta,
                   String usuario, String nomeRealUsuario,
                   String password, String coordenadas,
                   ArrayList<Comunidade> comunidades, ArrayList<Premio> premiosUsuario,
                   ArrayList<Usuario> amigos) {
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

    public void setIdUsuario(long idUsuario) {
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

    public ArrayList<Comunidade> getComunidades() {
        return comunidades;
    }

    public void setComunidades(ArrayList<Comunidade> comunidades) {
        this.comunidades = comunidades;
    }

    public ArrayList<Premio> getPremiosUsuario() {
        return premiosUsuario;
    }

    public void setPremiosUsuario(ArrayList<Premio> premiosUsuario) {
        this.premiosUsuario = premiosUsuario;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }
}
