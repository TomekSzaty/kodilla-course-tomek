package com.kodilla.testing2.facebook;

import com.kodilla.testting2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a[@role = \"button\"]";
    public static final String XPATH_ACCEPT_ALL_COOKIES = "//div[contains(@class, \"_9o-r\")]/button[2]";
    public static final String XPATH_REG_BOX = "//div[@class=\"registration_redesign\"]";
    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement searchCookieField = driver.findElement(By.xpath(XPATH_ACCEPT_ALL_COOKIES));
        searchCookieField.click();

        WebElement searchField = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        searchField.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_REG_BOX)));

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("14");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByValue("3");

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1977");
    }
}
