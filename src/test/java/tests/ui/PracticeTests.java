package tests.ui;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PracticeTests {

    private static PracticeFormPage practiceForm;

    @BeforeAll
    public static void openPage(){
        practiceForm = new PracticeFormPage();
    }

    @Test
    public void testCheckTitleExists(){
        practiceForm.title.should(Condition.text("Practice Form"));
    }

    @Test
    public void testPracticeForm(){
        practiceForm.fillPracticeForm();
        practiceForm.modalWindow.should(Condition.visible);
    }

    @Test
    public void testSomeUsefulCheck(){
        System.out.println("threadqa");
    }
}
