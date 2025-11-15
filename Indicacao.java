import java.time.LocalDateTime;

public class Indicacao {

    
    private Integer id;
    private Integer remetenteId;
    private Integer destinatarioId;
    private Integer livroId;
    private String mensagem;
    private Boolean lida;
    private LocalDateTime dataEnvio;

    
    public Indicacao() {
    }

    public Indicacao(Integer id, Integer remetenteId, Integer destinatarioId, Integer livroId,
                     String mensagem, Boolean lida, LocalDateTime dataEnvio) {
        this.id = id;
        this.remetenteId = remetenteId;
        this.destinatarioId = destinatarioId;
        this.livroId = livroId;
        this.mensagem = mensagem;
        this.lida = lida;
        this.dataEnvio = dataEnvio;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRemetenteId() {
        return remetenteId;
    }

    public void setRemetenteId(Integer remetenteId) {
        this.remetenteId = remetenteId;
    }

    public Integer getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(Integer destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public Integer getLivroId() {
        return livroId;
    }

    public void setLivroId(Integer livroId) {
        this.livroId = livroId;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getLida() {
        return lida;
    }

    public void setLida(Boolean lida) {
        this.lida = lida;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
}
