package Model.Premio;

public class Broche extends Premio {
    private boolean organizador;
        // organizador ou participante?
    public Broche(long idPremio, String nomePremio, String caminhoImagem,
                  long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
