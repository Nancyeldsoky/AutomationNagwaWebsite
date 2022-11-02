package Step_Definition;

import pages.HomePage;
import pages.LanguagePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Step_Definition.Hook.driver;

public class SelectLanguage {
   public HomePage homePage;
   LanguagePage languagePage;
    @When("Open Nagwa website")
    public void Open_Nagwa_Web(){

        driver.navigate().to("https://www.nagwa.com/");
        languagePage = new LanguagePage(driver);
    }
    @Given("^Select \"(.*)\" Language$")
    public void Select_Language(String Language){
     homePage=   languagePage.SelectLanguage(Language);
    }

}
