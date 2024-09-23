package test.pom;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.base.DriverManager;
import test.stepdefinition.Stepdefinition;

public class pomPage {

	Actions action = new Actions(Stepdefinition.stepdriver);

	public pomPage() {

		PageFactory.initElements(Stepdefinition.stepdriver, this);

	}

	/**
	 * Locators are starting from here
	 */

	@FindBy(xpath = "//div[@class='algoliaSearchBox-root-1hT']")
	private WebElement SearchBox;

	@FindBy(xpath = "//button[@class='algoliaSearchBox-submit-3Vv']")
	private WebElement SearchBtn;

	// a[@class='algoliaHitProducts-root-30e algoliaHits-hit-2sQ']

	@FindBy(xpath = "//a[@class='algoliaHitProducts-root-30e algoliaHits-hit-2sQ']")
	private WebElement hoverProduct;

	@FindBy(xpath = "//a[@class='algoliaHits-link-2iU']")
	private WebElement ShopAllBtn;

	@FindBy(xpath = "//button[@title='Add to bag']")
	private WebElement addToBagBtn;
	
	@FindBy(xpath = "//a[@title='View Bag']")
	private WebElement viewBagBtn;
	
	
	@FindBy(xpath = "//button[@aria-label='Increase Quantity']")
	private List<WebElement> qtyIncrease;
	
	
	@FindBy(xpath = "//button[@title='Proceed to Checkout']")
	private List<WebElement> proceedToCheckoutBtn;
	
	
	
	@FindBy(xpath = "//button[@title='Sign up']")
	private WebElement singUpLink;
	
	@FindBy(xpath = "//input[@id='create_account_page_firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='create_account_page_lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@id='create_account_page_email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='create_account_page_password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@title='Register']")
	private List<WebElement> Register;
	

	public void enterProductName() throws InterruptedException {

		action.click(SearchBox).perform();
		action.sendKeys(SearchBox, "Mustela - Foam Shampoo For Newborn 150ml").perform();

	}

	public void goToPDP() throws InterruptedException {
		
		Thread.sleep(3000);
		action.moveToElement(hoverProduct).build().perform();
		action.click(hoverProduct).perform();

	}

	public void addToBag() throws InterruptedException {
		Thread.sleep(2000);
		addToBagBtn.click();
		
	}
	
	public void viewBag() throws InterruptedException {
		Thread.sleep(2000);
		String child_window=Stepdefinition.stepdriver.getWindowHandle();
		Stepdefinition.stepdriver.switchTo().window(child_window);
		viewBagBtn.click();
	
	}
	
	public void increseQty() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement>l1= qtyIncrease;
		System.out.println("his is size-----------------------------------"+l1.size());
		
		for(int i=0;i<=3;i++) {
			Thread.sleep(2000);
			l1.get(1).click();
		}
	}
	
	public void proceedCheckout() throws InterruptedException {
		List<WebElement>l1= proceedToCheckoutBtn;
		Thread.sleep(2000);
		l1.get(1).click();
		
	}
	
	public void signUp() throws InterruptedException {
		singUpLink.click();
		firstName.click();
		firstName.sendKeys("AnmolTest");
		lastname.click();
		lastname.sendKeys("AnmolTest");
		email.click();
		email.sendKeys("chittoriya99@gmail.com");
		password.click();
		password.sendKeys("Test@123");
		List<WebElement>l1= Register;
		l1.get(2).click();

	}
	

}
