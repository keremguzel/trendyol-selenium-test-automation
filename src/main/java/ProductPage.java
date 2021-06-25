import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(){
        click(Constants.addToCartButton);
    }

    public boolean isProductAddedToCart(){
        return !driver.findElement(Constants.cartItemCount).getText().equals(0);
    }
}
