package stepDefinition;

import WebDriver.Web;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.test.test;

public class SDfileOne {

    @Given("go to url")
    public void lol() {
        String webName = Web.getDriver().getTitle();
        Assert.assertEquals(webName, "Google");
    }
    @And("enter an click '{}'")
    public void one(String obj) {
        WebElement search = Web.getDriver().findElement(By.name("q"));
        search.sendKeys(obj);
    }
    @When("click search in app")
    public void njeMolle() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement search = Web.getDriver().findElement(By.name("btnK"));
       search.click();

        System.out.println("Testing formula is : "+test.testing(2,5));
    }

}
