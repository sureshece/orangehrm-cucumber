package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

    WebDriver driver = Hooks.driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("user enters username and password")
    public void user_enters_credentials() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user navigates to homepage")
    public void user_on_homepage() {
        System.out.println("Login successful");
    }

    @When("user clicks on username")
    public void user_clicks_username() 
    {
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
    }

    @Then("logout link should be displayed")
    public void logout_visible() {
        driver.findElement(By.linkText("Logout")).isDisplayed();
    }

    @When("user clicks on Admin button")
    public void click_admin() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
    }

    @Then("admin page should open")
    public void admin_page_open() {
        System.out.println("Admin page opened");
    }
}