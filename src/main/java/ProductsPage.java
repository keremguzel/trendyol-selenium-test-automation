import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstProduct(){
        List<WebElement> productsList = driver.findElements(Constants.productsList);
        productsList.get(0).click();
    }

    public boolean isProductSelected(){
        return driver.findElement(Constants.favoriteCounter).isDisplayed();
    }
}
