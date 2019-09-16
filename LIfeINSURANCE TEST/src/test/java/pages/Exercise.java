package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utulitis.Driver;

public class Exercise {

	public Exercise() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "lbl_val_1")
	public WebElement value1;

	@FindBy(id = "lbl_val_2")
	public WebElement value2;

	@FindBy(id = "lbl_val_3")
	public WebElement value3;

	@FindBy(id = "lbl_val_4")
	public WebElement value4;

	@FindBy(id = "lbl_val_5")
	public WebElement value5;

	@FindBy(id = "txt_val_1")
	public WebElement value1_money;

	@FindBy(id = "txt_val_2")
	public WebElement value2_money;
	
	@FindBy(id = "txt_val_4")
	public WebElement value3_money;

	@FindBy(id = "txt_val_5")
	public WebElement value4_money;
	@FindBy(id = "txt_val_6")
	public WebElement value5_money;

	@FindBy(id = "lbl_ttl_val")
	public WebElement totalBalance;
	
	@FindBy(id = "txt_ttl_val")
	public WebElement totalBalance_Value;
}
