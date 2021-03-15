package com.knoldus;


        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.firefox.FirefoxOptions;
        import org.openqa.selenium.firefox.FirefoxProfile;

        import java.io.IOException;
        import java.net.URLEncoder;


        import static java.net.URLEncoder.*;


public class BrowserTest {
    public static void main(String[] args)throws IOException {
        System.setProperty("webdriver.gecko.driver","drivers/gechodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://sophi.10uplabs.dev");
        Runtime.getRuntime().exec("AutoIT/SeleniumBug.exe");





    }
}


