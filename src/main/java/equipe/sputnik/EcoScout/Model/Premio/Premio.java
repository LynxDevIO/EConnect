package equipe.sputnik.EcoScout.Model.Premio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Premio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPremio;
    private int tipoPremio;
        // 0 a 3 (trofeu, medalha, broche e sticker)
    private String nomePremio;
    private String descricaoPremio;
    private String caminhoImagem;
        // formato da imagem: PNG, com fundo transparente
        // 640x640
    private int categoriaPremio;
        // 0 (do evento), 1 (educacional), 2 (reflorestamento), 3 (reciclagem)...
        // 4 (spot de biodiversidade) e 5 (spot de queimadas)
        // Eventos genéricos só premiam sticker e broches do evento.
    private long pontuacaoNecessaria;
        // 1000 troféu, 500 medalha, 200 broche, 50 sticker.
    private long pontuacaoAtual; // default = 0
    private boolean pontuacaoAtingida; // default = false
        // FRONT-END: se True, então a imagem ficará com uma borda com glow dourado


    public Premio(long idPremio, int tipoPremio, String nomePremio, String descricaoPremio, String caminhoImagem, int categoriaPremio, long pontuacaoNecessaria, long pontuacaoAtual, boolean pontuacaoAtingida) {
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
