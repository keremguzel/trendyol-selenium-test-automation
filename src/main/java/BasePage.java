import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeHomepagePopUp(){
        click(Constants.closeHomepagePopUpButton);
    }

    public void switchToNextTab(){
        Object nextTab = driver.getWindowHandles().toArray()[1];
        driver.switchTo().window(nextTab.toString());
    }

    public void sendKeys(By locator, String key){
        driver.findElement(locator).sendKeys(key);
    }

    public void sendKeys(By locator, Keys key){
        driver.findElement(locator).sendKeys(key);
    }

    public String getAttribute(By locator,String attribute){
        return driver.findElement(locator).getAttribute(attribute);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public void selectNthElement(By locator, int nThElement){
        List<WebElement> productsList = driver.findElements(locator);
        productsList.get(nThElement-1).click();
    }
}
