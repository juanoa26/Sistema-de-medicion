package co.unicauca.microkernel.common.entities;

/**
 * Envio
 * @author Libardo, Julio
 */
public class Medicion {

    private Product product;
    /**
     * Código del producto.
     * */
    private String codigoProducto;

    public Medicion(Product product, String codigoProducto) {
        this.product = product;
        this.codigoProducto = codigoProducto;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
}
