import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart(){
        selectNthElement(Constants.cartLink,3);
    }

    public boolean isOnCartPage(){
        return isDisplayed(Constants.showCartOnOrderPage);
    }
}
