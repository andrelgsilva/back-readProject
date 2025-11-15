import java.time.LocalDateTime;
import java.util.List;

public class IndicacaoService {

    private IndicacaoRepository repository;

    public IndicacaoService() {
        
        this.repository = new IndicacaoRepositoryImpl(); // pode ser memória
    }

    public boolean enviarIndicacao(Integer remetenteId, Integer destinatarioId,
                                   Integer livroId, String mensagem) {

        Indicacao indicacao = new Indicacao(
                null,                       // id gerado depois
                remetenteId,
                destinatarioId,
                livroId,
                mensagem,
                false,                      // lida
                LocalDateTime.now()         // dataEnvio
        );

        return repository.salvar(indicacao);
    }

    public void marcarComoLida(Integer indicacaoId) {
        Indicacao ind = repository.buscarPorId(indicacaoId);
        if (ind != null) {
            ind.setLida(true);
            repository.atualizar(ind);
        }
    }

    public List<Indicacao> obterIndicacoesRecebidas(Integer usuarioId) {
        return repository.buscarRecebidasPorUsuario(usuarioId);
    }

    public List<Indicacao> obterIndicacoesEnviadas(Integer usuarioId) {
        return repository.buscarEnviadasPorUsuario(usuarioId);
    }

    public boolean removerIndicacao(Integer indicacaoId) {
        return repository.remover(indicacaoId);
    }
}
