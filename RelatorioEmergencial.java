public class RelatorioEmergencial implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("GERANDO RELATÓRIO EMERGENCIAL (ALTA PRIORIDADE):");
        System.out.println(" - Buscando dados em tempo real...");
        System.out.println(" - Foco: Falhas críticas e desvios de rota.");
        System.out.println(" - Formato: Alerta SMS e Email");
    }
}