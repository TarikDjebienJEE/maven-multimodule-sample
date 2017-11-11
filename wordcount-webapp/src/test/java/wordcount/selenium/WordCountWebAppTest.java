package wordcount.selenium;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import wordcount.service.IWordCount;
import wordcount.service.impl.WordCountBrut;
import wordcount.util.PropertiesLoader;


public class WordCountWebAppTest {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testAll() throws Exception {
		testDysplayTextBrutOnHomeScreen();
		testServiceCountAllWordInTextSuccess();
		testServiceCountOneWordInTextSuccess();
		testServiceIsWordInTextSuccess();
		testServiceGetAllFrequentWordsInTextSuccess();
	}

	public synchronized void testDysplayTextBrutOnHomeScreen() throws Exception {
		driver.get(baseUrl + "/wordcount-webapp/");
		try {
			String textPathFile = PropertiesLoader.getProperties().getProperty("textPathFile");
			IWordCount wordCountTextBrut = new WordCountBrut(textPathFile);
			assertEquals(wordCountTextBrut.getText(), driver.findElement(By.id("texteBrut")).getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	public synchronized void testServiceCountAllWordInTextSuccess() throws Exception {
		driver.get(baseUrl + "/wordcount-webapp/");

		// Call Services WordCountWebApp
		driver.findElement(By.xpath("//input[@value='Call All Service']")).click();
		Thread.sleep(1000);
		// VerifyTextPresent to matche response expected
		assertEquals("Result : {Tarik=5, Djebien=3}", driver.findElement(By.xpath("//div[@id='menu']/div[1]/label")).getText());
	}

	public synchronized void testServiceCountOneWordInTextSuccess() throws Exception {
		driver.get(baseUrl + "/wordcount-webapp/");

		driver.findElement(By.xpath("//div[@id='menu']/h4[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("paramCountOneWordInText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("paramCountOneWordInText")).sendKeys("Tarik");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Call All Service']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='menu']/h4[2]")).click();
		Thread.sleep(1000);
		assertEquals("Result : 5", driver.findElement(By.xpath("//div[@id='menu']/div[2]/label")).getText());
		Thread.sleep(1000);
	}

	public synchronized void testServiceIsWordInTextSuccess() throws Exception {
		driver.get(baseUrl + "/wordcount-webapp/");

		// Set values
		driver.findElement(By.xpath("//div[@id='menu']/h4[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("paramIsWordInText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("paramIsWordInText")).sendKeys("Tarik");
		Thread.sleep(1000);

		// Call Services WordCountWebApp
		driver.findElement(By.xpath("//input[@value='Call All Service']")).click();
		Thread.sleep(1000);

		// VerifyTextPresent to matche response expected
		driver.findElement(By.xpath("//div[@id='menu']/h4[3]")).click();
		Thread.sleep(1000);
		assertEquals("Result : true", driver.findElement(By.xpath("//div[@id='menu']/div[3]/label")).getText());
		Thread.sleep(1000);

	}

	public synchronized void testServiceGetAllFrequentWordsInTextSuccess() throws Exception {
		driver.get(baseUrl + "/wordcount-webapp/");

		// Set values
		driver.findElement(By.xpath("//div[@id='menu']/h4[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("paramForbiddenValueGetAllFrequentWordsInText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("paramForbiddenValueGetAllFrequentWordsInText")).sendKeys("Tarik");
		Thread.sleep(1000);
		driver.findElement(By.id("paramNValueGetAllFrequentWordsInText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("paramNValueGetAllFrequentWordsInText")).sendKeys("1");
		Thread.sleep(1000);
		// Call Services WordCountWebApp
		driver.findElement(By.xpath("//input[@value='Call All Service']")).click();
		Thread.sleep(1000);

		// VerifyTextPresent to matche response expected
		driver.findElement(By.xpath("//div[@id='menu']/h4[4]")).click();
		Thread.sleep(1000);
		assertEquals("Result : [Djebien]", driver.findElement(By.xpath("//div[@id='menu']/div[4]/label")).getText());
		Thread.sleep(1000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
