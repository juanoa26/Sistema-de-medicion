package co.unicauca.microkernel.plugins.bebidas;


import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.common.entities.Product;

import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

public class BebidasDeliveryPlugin implements IMedicionPlugin {

    public String calcularMedicion(Medicion medicion) {

        Product product = medicion.getProduct();

        String estado;

        if (product.getPeso()<=250) {
            estado = "Aceptado";

        } else {
            estado = "No aceptado";
        }

        return estado;
    }


  
}
