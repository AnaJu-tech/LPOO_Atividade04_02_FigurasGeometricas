//R3: Classe de Serviço Calculadora que processa formas geométricas
public class Calculadora {
    //R3: Método para processar uma forma geométrica
    public void processarForma(FormaGeometrica forma) {
        System.out.println("--- Forma Geométrica: " + forma.getForma() + " ---");
        forma.calcularPerimetro();
        forma.calcularArea();
        System.out.println();
    }

    //R3:Método para processar um array de formas geométricas
    public void processarTodas(FormaGeometrica[] formas) {
        System.out.println("=== Processando todas as formas geométricas ===");

        for (FormaGeometrica forma : formas) {
            processarForma(forma);
        }

        System.out.println("Total de formas processadas: " + formas.length);
        System.out.println("==============================");
    }
}
