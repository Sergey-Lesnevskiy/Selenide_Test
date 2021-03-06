import com.codeborne.selenide.SelenideElement;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
    SelenideElement loginField = $("#user-name");
    SelenideElement passwordField = $("#password");
    SelenideElement signInButton = $("#login-button");


    void login() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/user.properties"));
        loginField.sendKeys(props.getProperty("user.username"));
        passwordField.sendKeys(props.getProperty("user.password"));
        signInButton.click();
    }

    public void openLoginPage() {
        open("https://www.saucedemo.com/");
    }


}