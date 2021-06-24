import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart(){
        driver.findElements(Constants.cartLink).get(2).click();
    }

    public boolean isOnCartPage(){
        return driver.findElement(Constants.showCartOnOrderPage).isDisplayed();
    }
}
