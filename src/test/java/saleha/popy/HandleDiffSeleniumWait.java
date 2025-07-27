package saleha.popy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleDiffSeleniumWait extends DriverSetup{

    @Test
    public void testDelayElement(){

        driver.get("https://qavbox.github.io/demo/delay/");

        driver.findElement(By.cssSelector("input[value='Try me!']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement h2 = driver.findElement(By.xpath("//div[@id='oneMore']//h2[1]"));
        System.out.println(h2.getText());

        driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
        h2 = driver.findElement(By.cssSelector("#loaderdelay"));
        System.out.println(h2.getText());

        driver.findElement(By.xpath("//input[@name='commit']")).click();
        h2 = driver.findElement(By.xpath("//h2[@id='two']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.textToBePresentInElement(h2, "I am here!"));
        System.out.println("Text: " + h2.getText());



    }
}
