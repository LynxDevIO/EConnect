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
public abstract class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEvento;
    private String nomeEvento;
    private String coordenadas;
    private LocalDate dataEvento;
    private float duracaoEvento;
        // em horas
    private ArrayList<Premio> premios;
    private ArrayList<Usuario> coordenadores;
    private ArrayList<Usuario> participantes;
    private boolean editavel;
}
