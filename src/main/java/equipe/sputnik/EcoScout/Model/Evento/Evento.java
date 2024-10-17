package equipe.sputnik.EcoScout.Model.Evento;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;
import java.time.LocalDate;
import java.util.List;

/*
    Há uma quantidade determinada de tipos de eventos.
    Mas optamos por simplificar o código e o BD sem tornar esta classe abstrata.
 */
@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;
    private int tipoEvento;
        // 0 a 5 (genérico, educação, reflorestamento, reciclagem, spotbiodiversidade, spotqueimadas)
    private String nomeEvento;
    private String coordenadas;
    private LocalDate dataEvento;
    private float duracaoEvento;
        // em horas

    @ElementCollection
    private List<Premio> premios;

    @ElementCollection
    private List<Usuario> coordenadores;

    @ElementCollection
    private List<Usuario> participantes;
    private boolean editavel;

    public Evento(Long idEvento, int tipoEvento, String nomeEvento, String coordenadas, LocalDate dataEvento, float duracaoEvento, List<Premio> premios, List<Usuario> coordenadores, List<Usuario> participantes, boolean editavel) {
        this.idEvento = idEvento;
        this.tipoEvento = tipoEvento;
        this.nomeEvento = nomeEvento;
        this.coordenadas = coordenadas;
        this.dataEvento = dataEvento;
        this.duracaoEvento = duracaoEvento;
        this.premios = premios;
        this.coordenadores = coordenadores;
        this.participantes = participantes;
        this.editavel = editavel;
    }

    public Evento() {
        ;
    }

    public long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public int getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public float getDuracaoEvento() {
        return duracaoEvento;
    }

    public void setDuracaoEvento(float duracaoEvento) {
        this.duracaoEvento = duracaoEvento;
    }

    public List<Premio> getPremios() {
        return premios;
    }

    public void setPremios(List<Premio> premios) {
        this.premios = premios;
    }

    public List<Usuario> getCoordenadores() {
        return coordenadores;
    }

    public void setCoordenadores(List<Usuario> coordenadores) {
        this.coordenadores = coordenadores;
    }

    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }

    public boolean isEditavel() {
        return editavel;
    }

    public void setEditavel(boolean editavel) {
        this.editavel = editavel;
    }
}
