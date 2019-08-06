package com.acme.dbo.it.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("it")
@Transactional
public class SeleniumIT {
    @LocalServerPort protected int serverPort;

    @Test @Rollback
    public void shouldRespondWithSwaggerUI() throws InterruptedException {
        //download at https://chromedriver.storage.googleapis.com/index.html?path=74.0.3729.6/
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--whitelisted-ips='0.0.0.0/0'");
        chromeOptions.addArguments("--verbose");
        chromeOptions.addArguments("--disable-gpu");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://localhost:" + serverPort + "/swagger-ui.html");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("base-url")));
        driver.findElement(By.xpath("//a[@href='#/account-controller']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/operations/account-controller/getAccountsUsingGET']")));
        driver.findElement(By.xpath("//a[@href='#/operations/account-controller/getAccountsUsingGET']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='operations-account-controller-getAccountsUsingGET']/div[2]/div/div[2]/div[1]/div[2]/button")));
        driver.findElement(By.xpath("//*[@id='operations-account-controller-getAccountsUsingGET']/div[2]/div/div[2]/div[1]/div[2]/button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='operations-account-controller-getAccountsUsingGET']/div[2]/div/div[3]/button")));
        driver.findElement(By.xpath("//*[@id='operations-account-controller-getAccountsUsingGET']/div[2]/div/div[3]/button")).click();

        driver.quit();
    }

}
