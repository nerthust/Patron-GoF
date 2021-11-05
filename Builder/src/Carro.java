//Clase producto
public class Carro {
    private String precio= "";
    private String tipo= "";
    private String marca = "";
    private String referencia = "";

    public void setPrecio(String precio){
        this.precio = precio;
    }
    public void setTipo(String Tipo){
        this.tipo = Tipo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setReferencia(String referencia){
        this.referencia = referencia;
    }
    @Override
    public String toString(){
        return tipo +" "+ referencia + " de la marca "+ marca+
                " con un costo de "+ precio + " dolares";
    }
}
