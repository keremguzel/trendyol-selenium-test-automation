import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProductOnSearchBox(String productName){
        sendKeys(Constants.searchBox,productName);
        sendKeys(Constants.searchBox,Keys.ENTER);
    }

    public String checkProductNameOnSearchBox(){
        return getAttribute(Constants.searchBox,"value");
    }
}
