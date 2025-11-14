public abstract class RelatoriosFactory {

    public abstract Relatorio criarRelatorio();

    public void gerarEnviarRelatorio() {
        Relatorio relatorio = criarRelatorio(); 
        
        relatorio.gerar(); 
        
        System.out.println(" - Relatório enviado para os gerentes.");
        System.out.println("---");
    }
}