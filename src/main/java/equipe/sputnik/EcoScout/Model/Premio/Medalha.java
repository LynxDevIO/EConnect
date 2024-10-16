package equipe.sputnik.EcoScout.Model.Premio;

public class Medalha extends Premio {
    public Medalha(long idPremio, String nomePremio, String descricaoPremio, String caminhoImagem, long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, descricaoPremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
    }
}
