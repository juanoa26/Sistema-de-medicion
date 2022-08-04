package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();

        Product productUno = new Product(1, "Cerveza Poker 100ml");
        Product productDos = new Product(2, "Cerveza Aguila 100ml");
        Product productTres = new Product(3, "Cerveza Corona");

        products.add(productUno);
        products.add(productDos);
        products.add(productTres);

        return products;
    }

}
