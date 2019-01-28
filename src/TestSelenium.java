import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class TestSelenium {
    public static void main(String[] args) {

        String driverPath = "/home/ubuntu/Downloads/chromedriver";
        String elementOne = "Checkboxes";
        String elementTwo = "checkbox";
        String url = "https://the-internet.herokuapp.com";

        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        ArrayList<String> elements = new ArrayList<>();
        elements.add(elementOne);
        elements.add(elementTwo);
        for (int i = 0; i < elements.size(); i = i + 1) {
            try {
                WebElement link = driver.findElement(By.xpath(String.format("//a[contains(.,'%1$s')]", elements.get(i))));
                link.click();
                driver.navigate().back();
                System.out.println(elements.get(i)+" Link is present");
            } catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println(" Link's name not found");
            }


        }


    }
}