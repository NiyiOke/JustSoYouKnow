package com.Jpmc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class DriverInstance {

    public static WebDriver driver;

    //This will open the browser
    public void openBrowser() {
        ResourceBundle config = ResourceBundle.getBundle("config");

        /* use the below to run on Windows system - uncomment the below and comment out the Mac chrome browser code */

//        config.getString("browser").equalsIgnoreCase("Chrome");
//            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriverWin_76.0.exe");
//            driver = new ChromeDriver();

            /* use the below to run on Mac system - uncomment the below and comment out the windows chrome browser code above */

        config.getString("browser").equalsIgnoreCase("Chrome");
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(config.getString("URL"));
        driver.manage().window().maximize();
    }
            //This will close browser
            public void closeBrowser(){
            driver.quit();
        }

}
