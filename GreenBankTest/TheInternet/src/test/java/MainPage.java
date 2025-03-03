import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/*
Главная страница
 */
public class MainPage {

  private final SelenideElement searchCheckbox = $x("//*[contains(text(), 'Checkboxes')]");
  private final SelenideElement searchDropdown = $x("//*[contains(text(), 'Dropdown')]");
  private final SelenideElement searchDragAndDrop = $x("//*[contains(text(), 'Drag and Drop')]");


  public MainPage(String url) {
    Selenide.open(url);
  }

  public void clickSearchCheckbox() {
    searchCheckbox.click();
  }

  public void clickSearchDropdown() {
    searchDropdown.click();
  }

  public void clickSearchDragAndDrop() {
    searchDragAndDrop.click();
  }

}
