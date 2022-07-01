package com.jessiparra14.steps;

import com.jessiparra14.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductStep {

    @Page
    private ProductPage productPage;

    @Step
    public void abrirNavegador(){
        productPage.open();
    }

    public void vistaProducto() {
        productPage.verProducto();
    }

    public void agregarProductoCarrito(){
        productPage.agregarProducto();
    }
}
