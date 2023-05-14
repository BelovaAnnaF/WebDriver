import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTests {

    Logger logger = LogManager.getLogger(WebDriverTests.class);
    private WebDriver driver;

    @BeforeEach
    public void initialaizWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    1)
    @Test
    public void testFindOtus() {
//    Открыть Chrome в headless режиме
//    Перейти на https://duckduckgo.com/
        driver.get("https://duckduckgo.com/");
//    В поисковую строку ввести ОТУС
//    Проверить что в поисковой выдаче первый результат Онлайн‑курсы для профессионалов, дистанционное обучение


    }
//2)
    @Test
    public void testOpenImage(){
//    Открыть Chrome в режиме киоска
//    Перейти на https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818
//    Нажать на любую картинку
//    Проверить что картинка открылась в модальном окне

    }

//3)
    @Test
    public void testCookieInLogFile() {

//    Открыть Chrome в режиме полного экрана
//    Перейти на https://otus.ru
//    Авторизоваться под каким-нибудь тестовым пользователем(можно создать нового)
//    Вывести в лог все cookie
    }



}
