public class ModeloAgressivo implements ModeloDeRisco {

    @Override
    public String calcular() {
        System.out.println("Cálculo (Agressivo): Ponderando alta rentabilidade e ações (80%).");
        return "Perfil Agressivo";
    }
}