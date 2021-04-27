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


class SearchItem extends PageBase {
    private By SearchIcon=By.xpath("//*[@id=\"searchBoxContainer\"]");
    //*[@id="searchBoxContainer"]
    private By HomePageAbout=By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/a");
    private By SearchBar=By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[3]");
    public SearchItem(WebDriver driver) {
        super(driver);
    }  
    
    public void Search(String inputData){
        this.waitAndReturnElement(SearchIcon).click();
        this.waitAndReturnElement(SearchBar).sendKeys(inputData+"\n");
        this.waitAndReturnElement(HomePageAbout);
        
    }
    
    
}
