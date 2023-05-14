import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverTests {


    private WebDriver driver;

//    @BeforeEach
//    public void initialaizWebDriver(){
//
//
//    }

//    1)
    @Test
    public void testFindOtus() {
//    Открыть Chrome в headless режиме
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver();
//    Перейти на https://duckduckgo.com/
        driver.get("https://duckduckgo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));//реализовать ожидание загрузки страницы
        driver.findElement(By.className(".search__input--adv"));
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
//    В поисковую строку ввести ОТУС
//    Проверить что в поисковой выдаче первый результат Онлайн‑курсы для профессионалов, дистанционное обучение


    }
//2)
    @Test
    public void testOpenImage(){
//    Открыть Chrome в режиме киоска
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        driver = new ChromeDriver();
//    Перейти на https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
//    Нажать на любую картинку
//    Проверить что картинка открылась в модальном окне

    }

//3)
    @Test
    public void testCookieInLogFile() {
    Logger logger = LogManager.getLogger(WebDriverTests.class);
//    Открыть Chrome в режиме полного экрана
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver();
//    Перейти на https://otus.ru
        driver.get("https://otus.ru");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    Авторизоваться под каким-нибудь тестовым пользователем(можно создать нового)
//    Вывести в лог все cookie
    }

    @AfterEach
    public void closeBrouser(){
        driver.quit();
    }

}
