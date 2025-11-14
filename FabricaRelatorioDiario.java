public class FabricaRelatorioDiario extends RelatoriosFactory {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}