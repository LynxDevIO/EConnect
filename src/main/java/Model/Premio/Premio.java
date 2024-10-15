package Model.Premio;

public abstract class Premio {
    private long idPremio;
    private String nomePremio;
    private String caminhoImagem;
    private long pontuacaoNecessaria;
    private long pontuacaoAtual = 0;

    void pontuar(int pontos) {
        this.pontuacaoAtual += pontos;
    }
}
