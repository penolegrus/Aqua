package tests.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {
    public SelenideElement title = $x("//div[@class='main-header']");
    private SelenideElement h5Forms = $x( "//h5[text()='Forms']");
    private SelenideElement practiceForm = $x("//*[text()='Practice Form']");
    public SelenideElement modalWindow = $x("//div[@class='modal-content']");

    public PracticeFormPage(){
        Selenide.open("http://85.192.34.140:8081/");
        h5Forms.click();
        practiceForm.click();
    }

    public void fillPracticeForm(){
        $("input[id='firstName']").sendKeys("First Name");
        $x("//input[@id='lastName']").sendKeys("Last name");
        $x("//label[@for='gender-radio-1']").click();
        $x("//*[@id='userNumber']").sendKeys("88005553535");
    }
}
