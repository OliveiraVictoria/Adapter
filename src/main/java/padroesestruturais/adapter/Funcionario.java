package padroesestruturais.adapter;

public class Funcionario {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Funcionario() {
        avaliacao = new AvaliacaoConceito();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.atendimentoAvaliacao();
    }

}
