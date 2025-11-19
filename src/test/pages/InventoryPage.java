package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;

    private By title = By.className("title");
    private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartBtn = By.id("shopping_cart_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public void addProductToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public String getCartCounter() {
        return driver.findElement(cartBadge).getText();
    }

    public void openCart() {
        driver.findElement(cartBtn).click();
    }
}
