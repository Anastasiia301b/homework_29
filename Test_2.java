
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Test_2 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyingdescriptionforitems() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("item_4_title_link")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_desc")).getText(), is("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."));
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("item_0_title_link")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_container .inventory_details_desc")).getText(),is("A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."));
        assertThat(driver.findElement(By.cssSelector(".inventory_details_container .inventory_details_price")).getText(),is("$9.99"));
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("item_1_title_link")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_container .inventory_details_desc")).getText(),is("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."));
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("item_5_title_link")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_container .inventory_details_desc")).getText(),is("It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."));
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("item_2_title_link")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_container .inventory_details_desc")).getText(),is("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."));
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("item_3_title_link")).click();
        assertThat(driver.findElement(By.cssSelector(".inventory_details_container .inventory_details_desc")).getText(),is("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton."));
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());



    }
}

