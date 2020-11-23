package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.event.TreeWillExpandListener;

import org.apache.logging.log4j.core.appender.rolling.DirectFileRolloverStrategy;
import org.apache.poi.hssf.record.chart.FontIndexRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.ElementFinder;
import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

//@Listeners(com.webtest.freemarker.GenerateReporter.class)
public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public  void test_login() throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		Thread.sleep(2000);
//		webtest.click("id=idf_sale");
//		webtest.click("xpath=//a[text()='1室']");
//		assertTrue(webtest.isTextPresent("找到 0 条纪录"));
//		System.out.println(webtest.isTextPresent("找到 0 条纪录"));
				
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
			
	}
	@Test
	public void test_login1() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
	}
	
	
	
	
	
	
	
	
//	@Test(priority = 3)
	public void test3() {
		webtest.click("xpath=//a[text()='清除条件']");
		assertFalse(webtest.isTextPresent("运行中错误"));
	}
	
//	@Test(priority = 4)
	public void test4() {
		driver.navigate().back();
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='寿福小区56万元128㎡3室2厅2卫1阳台毛坯，多条公交经过']");
		assertTrue(webtest.isTextPresent("房贷计算器"));
	}
//	@Test(priority = 5)
//	public void test5() throws InterruptedException {
//		
//		webtest.click("xpath=//a[text()='房贷计算器']");
//		Thread.sleep(2000);
//		webtest.type("xpath=//ul[@class=clearfix fl]/input[@placeholder='请输入房屋单价']","0");
//		webtest.type("xpath=//input[@placeholder='请输入房屋面积']","0");
//		webtest.click("xpath=//span[text()='开始计算']");
//		
//	}
//	@Test(priority = 6)
	public void test6() throws InterruptedException {
		
		for(int i=0;i<3;i++) {
			webtest.click("xpath=//button[@onclick='omodal()']");
			Thread.sleep(2000);
			webtest.click("id=fm_ntype_5");
			webtest.type("xpath=//input[@placeholder='称呼']", "test1");
			webtest.type("xpath=//input[@placeholder='认证码']", "11111");
			Thread.sleep(2000);
			if(i==1) {
				webtest.type("xpath=//input[@placeholder='称呼']", "12345");
			}else if(i==2) {
				webtest.type("xpath=//input[@placeholder='称呼']", "13417788193");
			}
			Thread.sleep(2000);
			webtest.click("xpath=//button[text()='提交']");
		}
		
		
	}
//	打印
//	@Test(priority = 7)
	public void test7() {
		webtest.click("xpath=//a[text()='打印']");
		assertTrue(webtest.isTextPresent("福寿小区"));
	}
//	前台登录
//	@Test(priority = 8)
	public void test8() throws IOException {
		driver.navigate().back();
		webtest.click("xpath=//a[@class='dropdown-toggle'");
		webtest.click("xpath=//a[text()='登录'");
		webtest.click("xpath=//a[text()='点击我登录'");
		webtest.type("id=fm[uname]","aab");
		webtest.type("id=fm[upass]","000999");
		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("已经登录"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(priority = 2)
//	public void test_house() throws InterruptedException {
//		ElementFinder finder = new ElementFinder(driver);;
//		int i=1;
//		
////		webtest.click("link=参数属性");
//		Thread.sleep(2000);
////		webtest.enterFrame("adf_main");
//		webtest.click("id=adi_links");
//		System.out.println();
//		System.out.println("****************");
////		finder.findElement("class=pcbody")
//		
////		List<WebElement> list = new ArrayList<WebElement>();
//		Thread.sleep(3000);
////		webtest.click("link='增加条目>>'");
//		
//		WebElement mElement = driver.findElement(By.id("adf_right"));
//		WebElement mElementmElement=driver.findElement(By.xpath("//*[text()='增加条目>>']"));
//		
//		System.out.println(mElementmElement.isEnabled());
//		
//		
//		
////		WebElement fmlist = finder.findElement("xpath=//input[@value='执行操作']");
//		
////		webtest.selectByValue("xpath=//select[@class='w120 form-control']", "show");
////		System.out.println("*************show");
////		Select select1 = new Select(finder.findElement("name=fs_do"));
////		System.out.println(select1.getAllSelectedOptions().isEmpty());
////		Thread.sleep(1000);
////		webtest.click("xpath=//input[@value='执行操作']");
////		list = fmlist.findElements(By.tagName("tr"));
////		webtest.isChecked("name=fs[hx]");
//		
//		
//	}
	
	
}
