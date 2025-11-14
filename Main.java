public class Main {

    public static void main(String[] args) {
        
        //Cria o analisador
        AnalisadorDeInvestimentos analisador = new AnalisadorDeInvestimentos();

        //Simula a escolha para o modelo CONSERVADOR
        ModeloDeRisco modeloDoCliente1 = new ModeloConservador();
        analisador.setModeloDeRisco(modeloDoCliente1);
        analisador.analisarCliente();
        

        //Simula a escolha para o modelo AGRESSIVO
        ModeloDeRisco modeloDoCliente2 = new ModeloAgressivo();
        analisador.setModeloDeRisco(modeloDoCliente2);
        analisador.analisarCliente();
        

        //Simula a escolha para o modelo MODERADO
        analisador.setModeloDeRisco(new ModeloModerado());
        analisador.analisarCliente();
    }
} 
