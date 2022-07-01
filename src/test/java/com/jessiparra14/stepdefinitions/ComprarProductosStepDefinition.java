package com.jessiparra14.stepdefinitions;

import com.jessiparra14.steps.ProductStep;
import com.jessiparra14.steps.ProductViewStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ComprarProductosStepDefinition {

    @Steps
    ProductStep productStep;

    @Steps
    ProductViewStep productViewStep;

    @Dado("que el usuario se encuentra en My Store")
    public void queElUsuarioSeEncuentraEnMyStore() {
        productStep.abrirNavegador();
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        productStep.vistaProducto();
        productStep.agregarProductoCarrito();
    }

    @Cuando("rellena los datos solicitados")
    public void rellenaLosDatosSolicitados() {

    }

    @Entonces("el usuario deberia ver su compra efectiva")
    public void elUsuarioDeberiaVerSuCompraEfectiva() {

    }
}
