package saleha.popy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithWebElement extends DriverSetup {

    @Test
    public void interactWithElement() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement head = driver.findElement(By.cssSelector("body h1"));

        String headText = head.getText();
        System.out.println(headText);

        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        radioButton3.click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.sendKeys("Saleha");
        Thread.sleep(3000);

        name.clear();
        Thread.sleep(3000);

        String placeholderText = name.getAttribute("placeholder");
        System.out.println(placeholderText);

        WebElement openTab = driver.findElement(By.cssSelector("#opentab"));
        String color = openTab.getCssValue("background-color");
        System.out.println(color);

        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        System.out.println("Button1: "+radioButton1.isSelected());
        System.out.println("Button3: "+radioButton3.isSelected());

        WebElement show_hide_box = driver.findElement(By.cssSelector("#displayed-text"));
        System.out.println(show_hide_box.isDisplayed());

        driver.findElement(By.cssSelector("#hide-textbox")).click();
        System.out.println(show_hide_box.isDisplayed());

        System.out.println("check_box: " +driver.findElement(By.id("checkBoxOption1")).isEnabled());


    }
}
