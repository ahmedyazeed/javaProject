package Class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTesterE2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver [] arr={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
        for (WebDriver a:arr){
        a.manage().window().maximize();
        Thread.sleep(2000);
        a.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        System.out.println(a.getTitle());
        Thread.sleep(2000);
        a.close();
    }
}}
