package Class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome=new ChromeDriver();

        chrome.navigate().to("https://facebook.com");
        // navigates to this url and don't forget the--> ""

        System.out.println(chrome.getTitle());
        // prints the title of the website - expected output (Facebook - log in or sign up)
        chrome.navigate().to("https://amazon.com");
        Thread.sleep(3000);//waits for 3000 milliseconds (3 seconds) before closing
        // we will request in the next line
        chrome.close(); //closes the browser
        chrome.navigate().to("https://facebook.com");
        chrome.navigate().refresh(); // refreshes the browser
        Thread.sleep(3000);
        chrome.navigate().back(); //clicks back in the browser
        chrome.close();

        //Note:out of topic above-- StringBuffer ( slow-but thread safe means makes sure FIFO)
        /* StringBuilder (fast- not thread safe means you can use it
        when you know that it's gonna be only one process*/



    }

}
