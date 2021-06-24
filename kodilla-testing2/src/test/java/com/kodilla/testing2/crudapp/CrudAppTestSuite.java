package com.kodilla.testing2.crudapp;

import com.kodilla.testting2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://tomekszaty.github.io/";
    private WebDriver driver;
    private Random genarator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        genarator = new Random();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_TASK_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task nuber " + genarator.nextInt(100000);
        String taskContent = taskName + "content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_TASK_BUTTON));
        addButton.click();

        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(
                By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });

        Thread.sleep(2000);
    }

    private List<WebElement> getRowElements(String taskName) {
        return driver.findElements
                (By.xpath("//form[@class=\"datatable__row\"]"))
                .stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .collect(Collectors.toList());
    }

    public void deleteTaskFromCrudApp(String taskName) throws InterruptedException {
        getRowElements(taskName).stream()
                .forEach(theForm -> {
                    WebElement deleteButton = theForm.findElement(
                            By.xpath("//form[@class=\"datatable__row\"]//fieldset[1]/button[4]"));
                    deleteButton.click();
                });
        Thread.sleep(2000);
        driver.navigate().refresh();
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("tomek.szatylowicz@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("z3n<]3^8R^L2U*G");
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();

        Thread.sleep(4000);

        driverTrello.findElement(By.id("password")).sendKeys("z3n<]3^8R^L2U*G");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(4000);
        WebElement button =
                driverTrello.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[2]/ul/li[1]/a/div"));
        button.click();

        /*WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_KODILA_BUTTON)));
        WebElement button = driverTrello.findElement(By.xpath(XPATH_KODILA_BUTTON));
        button.click();*/


        /*driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(WebElement::click);*/

        Thread.sleep(4000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));
        driverTrello.close();

        return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        //sendTestTaskToTrello(taskName);
        //assertTrue(checkTaskExistsInTrello(taskName));
        deleteTaskFromCrudApp(taskName);

    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }
}
