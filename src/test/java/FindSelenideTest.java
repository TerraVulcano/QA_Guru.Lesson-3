import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FindSelenideTest {

    @Test
    void SouldFindSelenideInGitHub() {

        Selenide.open("https://github.com");
        Selenide.$("[name=q]").setValue("selenide").pressEnter();
        Selenide.$$("ul.repo-list li").first().$("a").click();
        Selenide.$("h1").shouldHave(Condition.text("selenide / selenide"));


        Selenide.sleep(5000);
    }
}
