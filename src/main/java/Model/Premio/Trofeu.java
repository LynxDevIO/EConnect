package Model.Premio;

public class Trofeu extends Premio {
    public Trofeu(long idPremio, String nomePremio, String caminhoImagem,
                  long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
