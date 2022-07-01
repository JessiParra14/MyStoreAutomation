package com.jessiparra14.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.automationpractice.com/index.php")
public class ProductPage extends PageObject {

    WebDriver webDriver;
    Actions actions = new Actions(webDriver);

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img[@title='Blouse']")
    WebElementFacade productoBlusa;

    @FindBy(xpath = "//iframe[@class='fancybox-iframe']")
    WebElementFacade contenedor;

    @FindBy(xpath = "//*[@id='add_to_cart']/button[@name='Submit']")
    WebElementFacade btnCart;

    public void verProducto() {
        actions.moveToElement(productoBlusa);
        //productoBlusa.click();
    }

    public void agregarProducto(){
        contenedor.waitUntilVisible();
        webDriver.switchTo().frame("//iframe[@class='fancybox-iframe']");
        btnCart.waitUntilEnabled();
        btnCart.click();
    }
}