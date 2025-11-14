public class AnalisadorDeInvestimentos {

    private ModeloDeRisco modeloAtual;

    public void setModeloDeRisco(ModeloDeRisco novoModelo) {
        System.out.println("\n[Plataforma]: Trocando a estratégia de cálculo...");
        this.modeloAtual = novoModelo;
    }

    public void analisarCliente() {
        if (modeloAtual == null) {
            System.out.println("Erro: Nenhuma estratégia de cálculo foi definida.");
            return;
        }

        String perfil = modeloAtual.calcular();
        
        System.out.println("-> Análise concluída. Perfil do cliente: " + perfil);
    }
}