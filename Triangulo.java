//R2: Classe Triangulo que implementa a interface FormaGeometrica
public class Triangulo implements FormaGeometrica{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    //Construtor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Métodos da interface FormaGeometrica
    @Override
    public void calcularPerimetro() {
        //R2: Regra de validação da existencia de um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("O triângulo é válido.");
            System.out.println("Perímetro do triângulo: " + (lado1 + lado2 + lado3));
        } else {
            System.out.println("O triângulo não é válido. Não é possível calcular o perímetro.");
        }
    }

    @Override
    public void calcularArea() {
        //R2: Regra de validação da existencia de um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Área do triângulo: " + (base * altura) / 2);
        } else {
            System.out.println("O triângulo não é válido. Não é possível calcular a área.");
        }
    }

    @Override
    public String getForma() {
        return "Triângulo";
    }
}
