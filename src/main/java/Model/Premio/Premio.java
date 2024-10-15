package Model.Premio;

public abstract class Premio {
    private long idPremio;
    private String nomePremio;
    private String descricaoPremio;
    private String caminhoImagem;
        // formato da imagem: PNG, com fundo transparente
        // todo: 120x120?
    private long pontuacaoNecessaria;
    private long pontuacaoAtual; // default = 0
    private boolean pontuacaoAtingida; // default = false
        // FRONT-END: se True, então a imagem ficará com uma borda com glow dourado


    public Premio(long idPremio, String nomePremio,
                  String descricaoPremio, String caminhoImagem,
                  long pontuacaoNecessaria, long pontuacaoAtual,
                  boolean pontuacaoAtingida) {
        this.idPremio = idPremio;
        this.nomePremio = nomePremio;
        this.descricaoPremio = descricaoPremio;
        this.caminhoImagem = caminhoImagem;
        this.pontuacaoNecessaria = pontuacaoNecessaria;
        this.pontuacaoAtual = pontuacaoAtual;
        this.pontuacaoAtingida = pontuacaoAtingida;
    }

    public long getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(long idPremio) {
        this.idPremio = idPremio;
    }

    public String getNomePremio() {
        return nomePremio;
    }

    public void setNomePremio(String nomePremio) {
        this.nomePremio = nomePremio;
    }

    public String getDescricaoPremio() {
        return descricaoPremio;
    }

    public void setDescricaoPremio(String descricaoPremio) {
        this.descricaoPremio = descricaoPremio;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public long getPontuacaoNecessaria() {
        return pontuacaoNecessaria;
    }

    public void setPontuacaoNecessaria(long pontuacaoNecessaria) {
        this.pontuacaoNecessaria = pontuacaoNecessaria;
    }

    public long getPontuacaoAtual() {
        return pontuacaoAtual;
    }

    public void setPontuacaoAtual(long pontuacaoAtual) {
        this.pontuacaoAtual = pontuacaoAtual;
    }

    public boolean isPontuacaoAtingida() {
        return pontuacaoAtingida;
    }

    public void setPontuacaoAtingida(boolean pontuacaoAtingida) {
        this.pontuacaoAtingida = pontuacaoAtingida;
    }

    void pontuar(int pontos) {
        if (!pontuacaoAtingida) {
            if (pontuacaoNecessaria - pontuacaoAtual - pontos < 0) {
                this.pontuacaoAtual += pontos;
            } else {
                this.pontuacaoAtual = pontuacaoNecessaria;
                pontuacaoAtingida = true;
            }
        }
    }
}
