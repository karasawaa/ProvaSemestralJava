public class FabricaRelatorioSemanal extends RelatoriosFactory {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }
} 