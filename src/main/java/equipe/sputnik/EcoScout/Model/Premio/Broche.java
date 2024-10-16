package equipe.sputnik.EcoScout.Model.Premio;

public class Broche extends Premio {
    private boolean organizador;
    // organizador ou participante?

    public Broche(boolean organizador, long idPremio, String nomePremio, String descricaoPremio, String caminhoImagem, long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        super(idPremio, nomePremio, descricaoPremio, caminhoImagem, pontuacaoNecessaria, pontuacaoAtual, pontuacaoAtingida);
        this.organizador = organizador;
    }
}
