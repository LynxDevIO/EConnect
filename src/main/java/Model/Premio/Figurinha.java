package Model.Premio;

public class Figurinha extends Premio {
    public Figurinha(long idPremio, String nomePremio, String caminhoImagem,
                     long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
