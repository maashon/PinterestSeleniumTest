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


class DashboardPage extends PageBase {

    private By mainCardBy = By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]");
    public By bodyBy = By.tagName("body");
    
    private By LogoutMenu= By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[4]/div[5]/button/div");
    private By LogBar=By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[4]/div[6]/div/div/div/div/div/div/div[2]/div/div[2]/div[6]/div/div/div/div/div");
    
    public DashboardPage(WebDriver driver) {
        super(driver);
    }    
    
    public String getMainCardTitle(){
        WebElement bodyElement = this.waitAndReturnElement(bodyBy);
        return bodyElement.getText();
        //return this.waitAndReturnElement(mainCardBy).getText();
    }
    public LogoutPage logout(){
        this.waitAndReturnElement(LogoutMenu).click();
        this.waitAndReturnElement(LogBar).click();
        System.out.println("calling the logout func\n");
        //this.waitAndReturnElement(passwordInputBoxBy).sendKeys(password+"\n");
       // this.wait.until(ExpectedConditions.visibilityOfElementLocated(MenuLocator));wwww
       
        return new LogoutPage(this.driver);


    }

}
