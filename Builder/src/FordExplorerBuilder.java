//Concrete builder
public class FordExplorerBuilder extends Carrobuilder{
    @Override
    public void buildPrecio(){
        carro.setPrecio("33.000");
    }
    @Override
    public void buildMarca(){
        carro.setMarca("Ford");
    }
    @Override
    public void buildTipo(){
        carro.setTipo("Camioneta");
    }
    @Override
    public void buildReferencia(){
        carro.setReferencia("Explorer");
    }
}
