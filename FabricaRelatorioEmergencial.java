public class FabricaRelatorioEmergencial extends RelatoriosFactory {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
} 

