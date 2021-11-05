public class main {
    public static void main(String[]args){
        //Se crea al director
        Fabrica fabrica = new Fabrica();
        //Se instancian los concrete builders que heredan del abstract builder
        Carrobuilder explorer = new FordExplorerBuilder();
        Carrobuilder corvette = new CorvetteBuilder();
        //Se elige el concrete builder
        fabrica.setCarrobuilder(explorer);
        //Se crea objeto
        fabrica.construirCarro();
        //Se imprime informacion del objeto
        Carro carro = fabrica.getCarro();
        System.out.println(carro);
    }
}
