//R1: Contrato da interface FormaGeometrica
public interface FormaGeometrica{
    //Desafio C: Constante da interface FormaGeometrica
    double VALOR_MAXIMO_PERMITIDO = 1000.0; //Valor máximo para dimensões das formas geométricas

    void calcularPerimetro();
    void calcularArea();
    String getForma(); //R1: Método que retorna o nome da forma geométrica em forma de String

    default void exibirInformacoes() { //Desafio: Método default para exibir informações da forma geométrica
        System.out.println("Forma Geométrica: " + getForma());
        calcularPerimetro();
        calcularArea();
    }
}