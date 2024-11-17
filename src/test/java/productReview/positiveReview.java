package productReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class positiveReview {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // launches chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(priority = 1)
    public void launchHomepage() {
        //Section: opens homepage & verify it loaded correctly
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//button[@aria-label='Consent']")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Automation Exercise");
    }

    @Test(priority = 2)
    public void product() {
        // Navigates to the product page & verify it loaded correctly
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
        String pageUrl = driver.getCurrentUrl();
        Assert.assertEquals(pageUrl, "https://automationexercise.com/products");
    }

    @Test(priority = 3)
    public void viewProduct() {
        // scrolls to the product
        WebElement fourthProduct = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(fourthProduct).perform();
        // clicks on view product & verifies write review
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        String writeReview = driver.findElement(By.xpath("//a[contains(text(),'Write Your Review')]")).getText();
        Assert.assertEquals(writeReview, "WRITE YOUR REVIEW");
        // fills the review form
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("New");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("new@gmail.com");
        WebElement reviewField = driver.findElement(By.id("review"));
        reviewField.sendKeys("looks nice");
        WebElement submit = driver.findElement(By.id("button-review"));
        submit.click();
        // verifies success message
        String reviewConfirmation = driver.findElement(By.xpath("//span[contains(text(),'Thank you for your review.')]")).getText();
        Assert.assertTrue(reviewConfirmation.contains("Thank you for your review"));

    }

    @AfterClass
    public void tearDown() {
        // closes the browser
        driver.quit();
    }
}
