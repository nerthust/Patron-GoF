//Abstract builder
public abstract class Carrobuilder {
    protected Carro carro;

    public Carro getCarro(){
        return carro;
    }
    public void newCarro(){
        carro = new Carro();
    }
    public abstract void buildPrecio();
    public abstract void buildTipo();
    public abstract void buildMarca();
    public abstract void buildReferencia();
}
