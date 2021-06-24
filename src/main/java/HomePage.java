import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProductOnSearchBox(String productName){
        WebElement searchBox = driver.findElement(Constants.searchBox);
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
    }

    public String checkProductNameOnSearchBox(){
        return driver.findElement(Constants.searchBox).getAttribute("value");
    }
}
