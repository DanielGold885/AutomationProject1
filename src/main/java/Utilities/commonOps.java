package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class commonOps extends base{

    public static void initBrowser(String browserType){
        if(browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
            else if(browserType.equalsIgnoreCase("firefox"))
                driver = initFirefoxDriver();
            else if(browserType.equalsIgnoreCase("internetExplorer"))
                driver = initInternetExplorerDriver();
            else if(browserType.equalsIgnoreCase("remote"))
                driver = initRemoteWebDriver();
            else
                throw new RuntimeException("Invalid Platform type stated!");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
            driver.manage().window().setSize(new Dimension(1024, 768));
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 10);
            driver.get("http://localhost:3333");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 10);
            actions = new Actions(driver);
    }

    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initInternetExplorerDriver(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    public static WebDriver initRemoteWebDriver(){
       // WebDriver driver = new RemoteWebDriver();
        return driver;
    }

    @BeforeClass
    public void startSession(){
        String platform = "web";
                if(platform.equalsIgnoreCase("web"))
                    initBrowser("chrome");
          //      else if(platform.equalsIgnoreCase("mobile"))
           //       initMobile();
                else
                    throw new RuntimeException("Invalid Platform name!");
                managePages.initPageObjectElements();
    }

    @AfterClass
    public void cleanSession(){
        driver.quit();
    }
}
