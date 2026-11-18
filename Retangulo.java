//R2: Classe Retangulo que implementa a interface FormaGeometrica
public class Retangulo implements FormaGeometrica{
    private double base;
    private double altura;

    //Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Métodos da interface FormaGeometrica
    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do retângulo: " + 2 * (base + altura));
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do retângulo: " + base * altura);
    }

    @Override
    public String getForma() {
        return "Retângulo";
    }
}