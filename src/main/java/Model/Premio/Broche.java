package Model.Premio;

public class Broche extends Premio {
    public Broche(long idPremio, String nomePremio, String caminhoImagem,
                  long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
