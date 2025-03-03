import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.SelenideElement;


/*
Страница с чекбоксами
 */
public class CheckboxPage {

  public final SelenideElement searchCheckbox1 = $x("//*[@type='checkbox'][1]");
  public final SelenideElement searchCheckbox2 = $x("//*[@type='checkbox'][2]");

  public void checkbox1Click() {
    searchCheckbox1.click();
  }

  public void checkbox2Click() {
    searchCheckbox2.click();
  }

  public void checkboxIsChecked1() {
    assertTrue(searchCheckbox1.isSelected(), "Чекбокс должен быть выбран");
  }
  public void checkboxNotChecked1() {
    assertFalse(searchCheckbox1.isSelected(), "Чекбокс должен быть снят");
  }


  public void checkboxIsChecked2() {
    assertTrue(searchCheckbox2.isSelected(), "Чекбокс должен быть выбран");
  }
  public void checkboxNotChecked2() {
    assertFalse(searchCheckbox2.isSelected(), "Чекбокс должен быть снят");
  }


}
