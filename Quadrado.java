//R2: Classe Quadrado que implementa a interface FormaGeometrica
public class Quadrado implements FormaGeometrica, VolumeCalculavel {
    private double lado;

    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //Métodos da interface FormaGeometrica
    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do quadrado: " + 4 * lado);
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    @Override
    public String getForma() {
        return "Quadrado";
    }

    //Método da interface VolumeCalculavel + Desafio
    @Override
    public double calcularVolume() {
        System.out.println("Volume do cubo composto por esse quadrado: " + Math.pow(lado, 3));
        return Math.pow(lado, 3);
    }
}
