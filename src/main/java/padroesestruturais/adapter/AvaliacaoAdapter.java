package padroesestruturais.adapter;

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoConceito;

    public AvaliacaoAdapter(IAvaliacao avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String atendimentoAvaliacao() {
        if (this.getNota() >= 9.0f)
            avaliacaoConceito.setAvaliacao("Excelente");
        else
            if (this.getNota() >= 8.0f)
                avaliacaoConceito.setAvaliacao("Ótimo");
            else
                if (this.getNota() >= 7.0f)
                    avaliacaoConceito.setAvaliacao("Bom");
                else
                    avaliacaoConceito.setAvaliacao("Regular");
        return avaliacaoConceito.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoConceito.getAvaliacao().equals("Excelente"))
            this.setNota(9.0f);
        else
            if (avaliacaoConceito.getAvaliacao().equals("Ótimo"))
                this.setNota(8.0f);
            else
                if (avaliacaoConceito.getAvaliacao().equals("Bom"))
                    this.setNota(7.0f);
                else
                    this.setNota(0.0f);
    }
}
