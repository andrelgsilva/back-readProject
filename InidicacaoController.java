import java.util.List;

public class IndicacaoController {

    private IndicacaoService indicacaoService;

    public IndicacaoController() {
        // Controller criando o service
        this.indicacaoService = new IndicacaoService();
    }

    public boolean enviarIndicacao(Integer remetenteId, Integer destinatarioId, Integer livroId, String mensagem) {
        return indicacaoService.enviarIndicacao(remetenteId, destinatarioId, livroId, mensagem);
    }

    public void marcarComoLida(Integer indicacaoId) {
        indicacaoService.marcarComoLida(indicacaoId);
    }

    public List<Indicacao> listarIndicacoesRecebidas(Integer usuarioId) {
        return indicacaoService.obterIndicacoesRecebidas(usuarioId);
    }

    public List<Indicacao> listarIndicacoesEnviadas(Integer usuarioId) {
        return indicacaoService.obterIndicacoesEnviadas(usuarioId);
    }

    public boolean removerIndicacao(Integer indicacaoId) {
        return indicacaoService.removerIndicacao(indicacaoId);
    }
}
