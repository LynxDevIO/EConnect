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
}
