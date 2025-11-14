public class RelatorioSemanal implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Semanal:");
        System.out.println(" - Conectando ao Data Warehouse...");
        System.out.println(" - Compilando KPIs semanais...");
        System.out.println(" - Formato: Dashboard Web");
    }
}