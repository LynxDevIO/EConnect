package Model.Premio;

public class Trofeu extends Premio {
    public Trofeu(long idPremio, String nomePremio, String descricaoPremio, String caminhoImagem, long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, descricaoPremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
