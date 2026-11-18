//R5: Extensão -Classe Circulo que implementa a interface FormaGeometrica
public class Circulo implements FormaGeometrica{
    private double raio;

    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Métodos da interface FormaGeometrica
    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do círculo: " + 2 * Math.PI * raio);
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do círculo: " + Math.PI * raio * raio);
    }

    @Override
    public String getForma() {
        return "Círculo";
    }
    
}
