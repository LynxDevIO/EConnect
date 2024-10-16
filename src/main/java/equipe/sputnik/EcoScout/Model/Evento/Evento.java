package equipe.sputnik.EcoScout.Model.Evento;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEvento;
    private int tipoEvento; // 0 a 3 (reflorestamento, reciclagem, spotbiodiversidade, spotqueimadas)
    private String nomeEvento;
    private String coordenadas;
    private LocalDate dataEvento;
    private float duracaoEvento;
        // em horas
    private ArrayList<Premio> premios;
    private ArrayList<Usuario> coordenadores;
    private ArrayList<Usuario> participantes;
    private boolean editavel;

    public Evento(long idEvento, int tipoEvento, String nomeEvento, String coordenadas, LocalDate dataEvento, float duracaoEvento, ArrayList<Premio> premios, ArrayList<Usuario> coordenadores, ArrayList<Usuario> participantes, boolean editavel) {
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

    public long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(long idEvento) {
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

    public ArrayList<Premio> getPremios() {
        return premios;
    }

    public void setPremios(ArrayList<Premio> premios) {
        this.premios = premios;
    }

    public ArrayList<Usuario> getCoordenadores() {
        return coordenadores;
    }

    public void setCoordenadores(ArrayList<Usuario> coordenadores) {
        this.coordenadores = coordenadores;
    }

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }

    public boolean isEditavel() {
        return editavel;
    }

    public void setEditavel(boolean editavel) {
        this.editavel = editavel;
    }
}
