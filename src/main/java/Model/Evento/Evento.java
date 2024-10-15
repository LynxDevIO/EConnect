package Model.Evento;

import Model.Premio.Premio;
import Model.Usuario.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Evento {
    private long idEvento;
    private String nomeEvento;
    private LocalDate dataEvento;
    private float duracaoEvento; // em horas
    private ArrayList<Premio> premios;
    private ArrayList<Usuario> participantes;
}
