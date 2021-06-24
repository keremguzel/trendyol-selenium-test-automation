import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeHomepagePopUp(){
        driver.findElement(Constants.closeHomepagePopUpButton).click();
    }

    public void switchToNextTab(){
        Object nextTab = driver.getWindowHandles().toArray()[1];
        driver.switchTo().window(nextTab.toString());
    }
}
