import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGooglePage {

WebDriver driver;

@BeforeEach
public void driverSetUp(){
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();
}
 @AfterEach
    //ZAMYKANIE PRZEGLADARKI
    public void driverClose(){
        driver.quit();
    }
//task1 Wybierz konkretny element na stronie głównej Google
// (np. pasek wyszukiwania) do przetestowania. 
//sprawdzić element i zanotować jego atrybuty w celu identyfikacji (np. nazwa, id, klasa).
@Test
public void testSzukaj(){
    driver.get("https://www.google.com/");
    WebElement searchZaakceptuj = driver.findElement(By.id("L2AGLb"));
    searchZaakceptuj.click();
    WebElement searchTextarea = driver.findElement(By.className("gLFyf"));
    searchTextarea.clear();
    searchTextarea.sendKeys("null");
}
@Test
public void testButtonSzukaj(){
    driver.get("https://www.google.com/");
    WebElement searchZaakceptuj = driver.findElement(By.id("L2AGLb"));
    searchZaakceptuj.click();
    WebElement searchTextarea = driver.findElement(By.className("gLFyf"));
    searchTextarea.clear();
    searchTextarea.sendKeys("null");
    searchTextarea.submit();
}
@Test
public void testasercja(){
    driver.get("https://www.google.com/");
    WebElement searchZaakceptuj = driver.findElement(By.id("L2AGLb"));
    searchZaakceptuj.click();
    WebElement searchTextarea = driver.findElement(By.className("gLFyf"));
    searchTextarea.clear();
    searchTextarea.sendKeys("test");
    searchTextarea.submit();
    Assertions.assertNotNull(searchTextarea);
}
}
