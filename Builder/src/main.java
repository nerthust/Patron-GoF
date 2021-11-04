public class main {
    public static void main(String[]args){
        Fabrica fabrica = new Fabrica();
        Carrobuilder explorer = new FordExplorerBuilder();
        Carrobuilder corvette = new CorvetteBuilder();

        fabrica.setCarrobuilder(explorer);
        fabrica.construirCarro();

        Carro carro = fabrica.getCarro();
        System.out.println(carro);
    }
}
