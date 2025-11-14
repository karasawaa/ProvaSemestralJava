// Este é o "núcleo do sistema" (o cliente)
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Logística...");

        // O sistema decide qual fábrica usar
        
        // Para gerar o relatório diário:
        RelatoriosFactory fabricaDiaria = new FabricaRelatorioDiario();
        fabricaDiaria.gerarEnviarRelatorio();

        // Para gerar o relatório semanal:
        RelatoriosFactory fabricaSemanal = new FabricaRelatorioSemanal();
        fabricaSemanal.gerarEnviarRelatorio();
        
        // Para gerar o relatório emergencial:
        RelatoriosFactory fabricaEmergencial = new FabricaRelatorioEmergencial();
        fabricaEmergencial.gerarEnviarRelatorio();
    }
}