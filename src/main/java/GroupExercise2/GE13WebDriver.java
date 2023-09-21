package GroupExercise2;

public interface GE13WebDriver {

    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends GE13WebDriver{

    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
 class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }

    public static void main(String[] args) {
        SafariDriver s=new SafariDriver();
        s.open();
        s.close();
        s.getTitle();
        s.navigate();

        FirefoxDriver f=new FirefoxDriver();
        f.open();
        f.close();
        f.getTitle();
        f.navigate();
        ChromeDriver c=new ChromeDriver();
        c.open();
        c.close();
        c.getTitle();
        c.navigate();

        // All methods are available except  void getScreenshot();
        // because we didn't implement or inherit from it's interface
    }
}