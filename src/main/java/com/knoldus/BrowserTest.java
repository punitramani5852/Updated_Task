package com.knoldus;

        import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.Thread;
import java.io.IOException;


public class BrowserTest {
    public static void main(String[] args)throws IOException,InterruptedException {
        System.setProperty("webdriver.gecko.driver","drivers/gechodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://sophi.10uplabs.dev");
        Runtime.getRuntime().exec("AutoIT/SeleniumBug.exe");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

int i=5;
do {







    driver.findElement(By.linkText("Investing")).click();
    driver.findElement(By.partialLinkText("Market movers: Stocks that saw action ")).click();
    driver.navigate().to("https://sophi.10uplabs.dev");
    i--;

}
while (i>0);



       //
        //((IJavaScriptExecutor)driver).ExecuteScript("alert('Test')");
        //






    }
}


