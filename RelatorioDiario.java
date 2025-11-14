// Implementação específica para o relatório diário
public class RelatorioDiario implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Diário:");
        System.out.println(" - Buscando dados das últimas 24h...");
        System.out.println(" - Agrupando métricas de entregas...");
        System.out.println(" - Formato: PDF Simples");
    }
}