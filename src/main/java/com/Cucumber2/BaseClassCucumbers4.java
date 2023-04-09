package com.Cucumber2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassCucumbers4 {

	public static WebDriver driver; // null driver

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SRBTHAMIZH\\eclipse-workspace\\Cucumber4\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("invalid:check the browser name");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void closethepage() {
		driver.close();

	}

	public static void quitthebrowser() {
		driver.quit();
	}

	public static void SimpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlert() {
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	}

	public static void conAlert() {
		// ToDo Auto generated method stub
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();
	}

	public static void alertPrompt(String url) {
		Alert proalert = driver.switchTo().alert();
		proalert.sendKeys(url);
		System.out.println(url);
		proalert.accept();
	}

	public static void alertPrompt1(String url1) {
		Alert proalert = driver.switchTo().alert();
		proalert.sendKeys(url1);
		System.out.println(url1);
		proalert.dismiss();

	}

	public static void frames(int a) {
		driver.switchTo().frame(a);
	}

	public static void framedefaultcondent() {
		driver.switchTo().defaultContent();
	}

	public static void clickAction(WebElement target) {
		Actions ac = new Actions(driver);
		ac.click(target).build().perform();
	}

	public static void doubleclick(WebElement target1) {
		Actions ac = new Actions(driver);
		ac.doubleClick(target1).build().perform();
	}

	public static void moveToElement(WebElement select) {
		Actions Wom = new Actions(driver);
		Wom.moveToElement(select).build().perform();
	}

	public static void contextclickAction(WebElement target2) {
		Actions ac = new Actions(driver);
		ac.contextClick(target2).build().perform();
	}

	public static void dragdropAction(WebElement source, WebElement targe) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, targe).build().perform();
	}

	public static void waitimplicity(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}

	public static void waitexpli(int a, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(a));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void windowhandles() {
		driver.getWindowHandles();
	}

	public static void gettitle(String title) {
		driver.switchTo().window(title).getTitle();
		System.out.println(title);
	}

	public static void javascripScrollview(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public static void javascripScrollmid() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
	}

	public static void javascripScrollend() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public static void singledrop(WebElement msg, int num) {
		Select s1 = new Select(msg);
		s1.selectByIndex(num);
	}

	public static void singledrop1(WebElement msg1, int num1) {
		Select s2 = new Select(msg1);
		s2.selectByValue("num1");
	}

	public static void singledrop2(WebElement msg2, int num2) {
		Select s3 = new Select(msg2);
		s3.selectByVisibleText("num2");
	}

	/*
	 * public static void getopt(WebElement ge) { List<WebElement> options =
	 * ge.getOptions(); }
	 */
	public static void gettex(WebElement data) {
		String text = data.getText();
		System.out.println(text);
	}

	public static void clickonElement(WebElement ele) {
		ele.click();
	}

	public static void inputValues(WebElement w, String value) {
		w.sendKeys(value);
	}

	public static void takeScreenShot() throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File Source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\SRBTHAMIZH\\eclipse-workspace\\MavensProject\\pictures\\jav.png");
		FileUtils.copyFileToDirectory(Source, destination);
		System.out.println("screenshot Taken");
	}

	public static void pressUpEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void pressDownEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void pressRightEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void pressLeftEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void pressDeleteEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void pressEndEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_END);
		r.keyPress(KeyEvent.VK_END);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void pressBackSpaceEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
