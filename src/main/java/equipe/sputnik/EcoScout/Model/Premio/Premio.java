package equipe.sputnik.EcoScout.Model.Premio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Premio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPremio;
    private int tipoPremio;
        // 0 a 3 (toféu, medalha, broche e sticker
    private String nomePremio;
    private String descricaoPremio;
    private String caminhoImagem;
        // imagem em formato png, com fundo transparente
    private int categoriaPremio;
        // 0 a 5
        // "do evento", educativo, reflorestamento, reciclagem,
        // spot biodiversidade e alerta de queimadas
    private long pontuacaoNecessaria;
        // 1000, 500, 200 e 50 (apenas uma ideia) por tipo de prêmio respectivamente
    private long pontuacaoAtual;
    private boolean pontuacaoAtingida;
        // todo: FRONT-END: borda da imagem com glow dourada

    public Premio(Long idPremio, int tipoPremio, String nomePremio, String descricaoPremio, String caminhoImagem, int categoriaPremio, long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
        this.idPremio = idPremio;
        this.tipoPremio = tipoPremio;
        this.nomePremio = nomePremio;
        this.descricaoPremio = descricaoPremio;
        this.caminhoImagem = caminhoImagem;
        this.categoriaPremio = categoriaPremio;
        this.pontuacaoNecessaria = pontuacaoNecessaria;
        this.pontuacaoAtual = pontuacaoAtual;
        this.pontuacaoAtingida = pontuacaoAtingida;
    }

    public Premio() {
    }

    public long getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(Long idPremio) {
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

    public int getCategoriaPremio() {
        return categoriaPremio;
    }

    public void setCategoriaPremio(int categoriaPremio) {
        this.categoriaPremio = categoriaPremio;
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
