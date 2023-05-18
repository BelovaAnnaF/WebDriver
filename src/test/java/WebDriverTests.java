import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTests {


    private WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//    1)
    @Test
    public void testFindOtus() {
//    Открыть Chrome в headless режиме
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");//без этого не работает
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
//    Перейти на https://duckduckgo.com/
        driver.get("https://duckduckgo.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    В поисковую строку ввести ОТУС
        driver.findElement(By.cssSelector("#search_form_input_homepage")).sendKeys("ОТУС");
        driver.findElement(By.cssSelector("#search_button_homepage")).click();
//    Проверить что в поисковой выдаче первый результат Онлайн‑курсы для профессионалов, дистанционное обучение
        driver.findElement(By.cssSelector(".react-results--main>li:first-child")).click();
        assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям", driver.getTitle());
    }
//2)
    @Test
    public void testOpenImage(){
//    Открыть Chrome в режиме киоска
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--kiosk");
        driver = new ChromeDriver(options);
//    Перейти на https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
//    Нажать на любую картинку
        driver.findElement(By.cssSelector(".content-overlay")).click();
//    Проверить что картинка открылась в модальном окне
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.pp_overlay"))));
    }

//3)
    @Test
    public void testCookieInLogFile() {
    Logger logger = LogManager.getLogger(WebDriverTests.class);
//    Открыть Chrome в режиме полного экрана
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
//    Перейти на https://otus.ru
        driver.get("https://otus.ru");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".title-new__text"))));//проверить, что загрузилась страница
//    Авторизоваться под каким-нибудь тестовым пользователем(можно создать нового)
        wait.until(ExpectedConditions.);//проверить, что не открыто модальное окно Войти
        driver. ;//нажать кнопку войти
        wait.until(ExpectedConditions.);//проверить, что открылось можадьное окно ввода логина/пароля
        //ввести логин пароль

//    Вывести в лог все cookie
    }

    @AfterEach
    public void closeBrouser(){
        driver.quit();
    }

}
