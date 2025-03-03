import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.webdriver;
import static java.lang.System.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
/*
 *Страница с Драг энд Дропс
 */

public class DragAndDropsPage {

  public final SelenideElement searchA = $x("//*[@class='column'][1]");
  public final SelenideElement searchB = $x("//*[@class='column'][2]");
  public final SelenideElement searchTextA = $x("//*[@id='column-a']/header");
  public final SelenideElement searchTextB = $x("//*[@id='column-b']/header");

  public void drag_and_dropAtoB() {
    Actions actions = new Actions(webdriver().object());
    actions().clickAndHold(searchA).moveToElement(searchB).release().build().perform();
    String text1 = searchTextA.getText();
    if (text1.equals(String.valueOf('A'))) {
      out.println("Фигура А не сдвинулась");
    }
  }

  public void drag_and_dropBtoA() {
    Actions actions = new Actions(webdriver().object());
    actions().clickAndHold(searchA).moveToElement(searchB).release().build().perform();
    String text2 = searchTextB.getText();
    if (text2.equals(String.valueOf('A'))) {
      out.println("Фигура В не сдвинулась");
    }

  }


}
