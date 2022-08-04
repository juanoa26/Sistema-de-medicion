package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.plugin.manager.PluginManager;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

public class ServicioMedicion {

    public String calculateDeliveryCost(Medicion datosMedicion) throws Exception {

        String codigoProduct = datosMedicion.getCodigoProducto();
        PluginManager manager = PluginManager.getInstance();
        IMedicionPlugin plugin = manager.getDeliveryPlugin(codigoProduct);

        if (plugin == null) {
            throw new Exception("El pligin no se encuentra dispnible: " + codigoProduct);
        }

        return plugin.calcularMedicion(datosMedicion);

    }

}
