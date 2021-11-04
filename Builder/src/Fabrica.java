//Director
public class Fabrica {
    private Carrobuilder carrobuilder;

    public void setCarrobuilder(Carrobuilder cb){
        carrobuilder = cb;
    }
    public Carro getCarro(){
        return carrobuilder.getCarro();
    }
    public void construirCarro(){
        carrobuilder.newCarro();
        carrobuilder.buildMarca();
        carrobuilder.buildPrecio();
        carrobuilder.buildTipo();
        carrobuilder.buildReferencia();
    }
}
