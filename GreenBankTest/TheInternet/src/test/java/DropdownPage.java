import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

/*
 *страница с Dropdown
 */
public class DropdownPage {

  public final SelenideElement searchDropdown = $x("//*[@id='dropdown']");
  public final SelenideElement searchOption1 = $x("//*[@value='1']");
  public final SelenideElement searchOption2 = $x("//*[@value='2']");

  public void clickDropdown() {
    searchDropdown.click();
  }

  public void clickOption1() {
    searchOption1.click();
  }

  public void clickOption2() {
    searchOption2.click();
  }


}

