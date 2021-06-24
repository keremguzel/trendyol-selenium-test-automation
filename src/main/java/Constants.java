import org.openqa.selenium.By;

public class Constants {

    final static By searchBox = By.className("search-box");
    final static By closeHomepagePopUpButton = By.className("modal-close");
    final static By productsList = By.className("p-card-img");
    final static By favoriteCounter = By.className("fv-dt");
    final static By addToCartButton = By.xpath("//button[1]");
    final static By cartItemCount = By.className("basket-item-count-container");
    final static By cartLink = By.cssSelector("p.link-text");
    final static By showCartOnOrderPage = By.id("partial-basket");
}
