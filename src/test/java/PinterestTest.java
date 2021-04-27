import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import java.util.*;  


public class PinterestTest {
    public WebDriver driver;
    
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void testSearch() {
        MainPage mainPage = new MainPage(this.driver);
        LoginPage loginPage = mainPage.openLogin();
        DashboardPage dashboardPage = loginPage.login("velow29219@iludir.com","Parsa@1234");
        
        //System.out.println(dashboardPage.getMainCardTitle());
        //Assert.assertTrue(dashboardPage.getMainCardTitle().contains("Velow"));
    }
    

    
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
