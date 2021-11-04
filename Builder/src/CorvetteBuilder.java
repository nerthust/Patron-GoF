//Concrete builder
public class CorvetteBuilder extends Carrobuilder{
    @Override
    public void buildPrecio(){
        carro.setPrecio("62.000");
    }
    @Override
    public void buildMarca(){
        carro.setMarca("Chevrolet");
    }
    @Override
    public void buildTipo(){
        carro.setTipo("Automóvil");
    }
    @Override
    public void buildReferencia(){
        carro.setReferencia("Corvette");
    }
}

