package Model.Premio;

public class Medalha extends Premio {
    public Medalha(long idPremio, String nomePremio, String caminhoImagem,
                   long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
