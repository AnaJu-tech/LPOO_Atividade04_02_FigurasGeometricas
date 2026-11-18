public class Main{
    public static void main(String[] args) {
        //R4: Variável do tipo da Interface FormaGeometrica que recebe um objeto concreto do tipo Quadrado
        FormaGeometrica figuraUnica = new Quadrado(10);
        Calculadora calculadora = new Calculadora();
        calculadora.processarForma(figuraUnica);

        //R4: Vetor do tipo da Interface FormaGeometrica que recebe objetos concretos de diferentes formas geométricas
        FormaGeometrica[] figuras = new FormaGeometrica[]{
            new Quadrado(5),
            new Retangulo(4, 6),
            new Triangulo(4, 3, 3, 4, 5),
            new Circulo(7) // R5: A classe Circulo foi adicionada, sem que houvesse alteração na classe Calculadora.
        };
        calculadora.processarTodas(figuras);

        figuraUnica.exibirInformacoes(); //Desafio A: Teste do método default da interface FormaGeometrica
        ((VolumeCalculavel) figuraUnica).calcularVolume(); //Desafio B: Teste do método da interface VolumeCalculavel

        //Desafio C: Teste da constante da interface FormaGeometrica
        System.out.println("Valor máximo permitido para dimensões das formas geométricas: " + FormaGeometrica.VALOR_MAXIMO_PERMITIDO);

        //R6: Erros de compilação 
        //ERRO A: "Cannot instantiate the type FormaGeometrica" - Interface não pode ser instanciada diretamente, 
        // apenas classes concretas que implementam a interface podem ser instanciadas.

        //ERRO B: "The type Quadrado must implement the inherited abstract method FormaGeometrica.getForma()" - 
        // Ao implementar a interface FormaGeometrica, a classe Quadrado deve conter todos os métodos da interface, 
        // incluindo getForma().
    }
}