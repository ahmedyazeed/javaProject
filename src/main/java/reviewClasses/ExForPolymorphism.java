package reviewClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExForPolymorphism {

        public static void main(String[] args) {

                WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
                for (int i = 0; i < webDrivers.length; i++) {
                        WebDriver w=webDrivers[i];
                        w.manage().window().maximize();
                        w.get("https://www.amazon.com");
                                System.out.println(w.getTitle());
                        w.quit();
                }

        }
        }
