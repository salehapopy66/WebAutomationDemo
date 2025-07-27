package saleha.popy;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowserRelatedTask extends DriverSetup {

    @Test
    public void testBrowserTask() throws InterruptedException {
        driver.get("https://google.com");

        String title = driver.getTitle();
        System.out.println("Title: " +title);

        String url = driver.getCurrentUrl();
        System.out.println("Url: " + url);

        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://whatsapp.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://instagram.com");
        Thread.sleep(3000);

        String tabHandle = driver.getWindowHandle();
        System.out.println("Insta: " +tabHandle);

        List <String> handles = new ArrayList<>(driver.getWindowHandles());

        for (String handle : handles){
            System.out.println(handle);
        }

        System.out.println("Before switching: " + driver.getCurrentUrl());

        driver.switchTo().window(handles.get(0));
        System.out.println("After switching: " +driver.getCurrentUrl());

        driver.close();
        Thread.sleep(3000);


    }

}
