package by.epam.rudenkov;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginScreen {
	private WebDriver driver;
	private final String NAME_XPATH = "//*[@id='user_login']";
	private final String PASS_XPATH = "//*[@id='user_password']";
	private final String SIGNIN_XPATH = "//*[@value='Sign in']";

	public LoginScreen(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void expandFullScreen() {
		driver.findElement(By.xpath("./*")).sendKeys(Keys.F11);
	}

	public void setName(String name) {
		driver.findElement(By.xpath(NAME_XPATH)).sendKeys(name);
	}

	public void setPassword(String pass) {
		driver.findElement(By.xpath(PASS_XPATH)).sendKeys(pass);
	}

	public void clickSignIn() {
		driver.findElement(By.xpath(SIGNIN_XPATH)).click();
	}
}
