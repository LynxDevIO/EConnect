package equipe.sputnik.EcoScout.Model.Premio;

public class Premio {
    private long idPremio;
    private int tipoPremio; // 0 a 3 (trofeu, medalha, broche e sticker)
    private String nomePremio;
    private String descricaoPremio;
    private String caminhoImagem;
        // formato da imagem: PNG, com fundo transparente
        // todo: 120x120?
    private long pontuacaoNecessaria;
    private long pontuacaoAtual; // default = 0
    private boolean pontuacaoAtingida; // default = false
        // FRONT-END: se True, então a imagem ficará com uma borda com glow dourado


    public Premio(boolean pontuacaoAtingida, long pontuacaoAtual, long pontuacaoNecessaria, String caminhoImagem, String descricaoPremio, String nomePremio, int tipoPremio, long idPremio) {
        this.pontuacaoAtingida = pontuacaoAtingida;
        this.pontuacaoAtual = pontuacaoAtual;
        this.pontuacaoNecessaria = pontuacaoNecessaria;
        this.caminhoImagem = caminhoImagem;
        this.descricaoPremio = descricaoPremio;
        this.nomePremio = nomePremio;
        this.tipoPremio = tipoPremio;
        this.idPremio = idPremio;
    }

    public long getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(long idPremio) {
        this.idPremio = idPremio;
    }

    public int getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(int tipoPremio) {
        this.tipoPremio = tipoPremio;
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
}
