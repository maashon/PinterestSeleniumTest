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
    private By body = By.tagName("body");
    private By SearchIcon=By.xpath("//*[@id=\"searchBoxContainer\"]/div/div/div[3]/input");
    private By LogoutMenu= By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[4]/div[5]/button/div");
    private By LogBar=By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[4]/div[6]/div/div/div/div/div/div/div[2]/div/div[2]/div[6]/div/div/div/div/div");
    private By HomePageAbout=By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]");
    private By SearchBarLoadedElement= By.xpath("//div[@title=\"Ideas for you\"]");
    private By SearchBar=By.xpath("//*[@id=\"searchBoxContainer\"]/div/div/div[3]/input");
    public DashboardPage(WebDriver driver) {
        super(driver);
    }    
    
    public String getMainCardTitle(){
        WebElement bodyElement = this.waitAndReturnElement(body);
        return bodyElement.getText();
    }
    public LogoutPage logout(){
        this.waitAndReturnElement(LogoutMenu).click();
        this.waitAndReturnElement(LogBar).click();
        return new LogoutPage(this.driver);
    }

    public SearchItem goToSearch(){
        this.waitAndReturnElement(SearchBar).sendKeys("wood\n");
        this.waitAndReturnElement(body);
        return new SearchItem(this.driver);
    }

}
