package co.unicauca.microkernel.common.entities;

/**
 * Producto
 *
 * @author Libardo, Julio
 */
public class Product {

    private int productId;
    private String name;

    /**
     * Largo del producto.
     *
     */
    private double largo;
    /**
     * Diametro del producto.
     *
     */
    private double diametro;
    /**
     * Peso del producto
     *
     */
    private double peso;
    /**
     * Estado del producto.
     *
     */
    
    private String estado;
   

    public Product() {

    }

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }
    
    public Product(int productId, String name, double largo, double diametro, double peso, String estado) {
        this.productId = productId;
        this.name = name;
        this.largo = largo;
        this.diametro = diametro;
        this.peso = peso;
        this.estado = estado;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
