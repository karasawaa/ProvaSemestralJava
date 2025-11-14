public class ModeloModerado implements ModeloDeRisco {

    @Override
    public String calcular() {
        System.out.println("Cálculo (Moderado): Balanço de fundos e renda fixa (50%/50%).");
        return "Perfil Moderado";
    }
}