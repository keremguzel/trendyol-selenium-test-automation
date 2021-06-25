import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstProduct(){
        selectNthElement(Constants.productsList,1);
    }

    public boolean isProductSelected(){
        return isDisplayed(Constants.favoriteCounter);
    }
}
