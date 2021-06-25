import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartTest extends BaseTest{

    @Test
    @Order(1)
    public void searchProduct(){
        homePage.closeHomepagePopUp();
        homePage.searchProductOnSearchBox("george orwell 1984");
        Assertions.assertEquals("george orwell 1984",homePage.checkProductNameOnSearchBox());
    }

    @Test
    @Order(2)
    public void selectProduct(){
        productsPage.selectFirstProduct();
        productsPage.switchToNextTab();
        Assertions.assertTrue(productsPage.isProductSelected());
    }

    @Test
    @Order(3)
    public void addToCart(){
        productPage.addToCart();
        Assertions.assertTrue(productPage.isProductAddedToCart());
    }

    @Test
    @Order(4)
    public void goToCart(){
        cartPage.goToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.showCartOnOrderPage));
        Assertions.assertTrue(cartPage.isOnCartPage());
    }
}
