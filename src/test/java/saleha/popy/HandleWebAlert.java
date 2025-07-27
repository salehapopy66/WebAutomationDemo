package saleha.popy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetup {

    @Test
    public void interactWithAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        Thread.sleep(3000);

        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        Thread.sleep(3000);

        System.out.println(alert.getText());

        alert.sendKeys("Hello");
        alert.accept();
        Thread.sleep(3000);


    }
}
