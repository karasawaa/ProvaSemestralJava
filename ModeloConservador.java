public class ModeloConservador implements ModeloDeRisco {

    @Override
    public String calcular() {
        System.out.println("Cálculo (Conservador): Foco em Tesouro Direto e CDBs (90%).");
        return "Perfil Conservador";
    }
} 
    

