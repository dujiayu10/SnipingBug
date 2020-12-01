package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
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
import com.webtest.dataprovider.NSDataProvider;
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
	@Test(priority = 2,dataProvider="BuildingIntentionModifies_success",dataProviderClass=NSDataProvider.class)
	public void test_modifies_success(String title,String name,String phone,String detail) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='楼盘意向']");
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		System.out.println(list.size());
		list.get(2).findElement(By.xpath("//a[text()='修改']")).click();
		
		webtest.typeAndClear("id=fm_lpid_refname", title);
		webtest.typeAndClear("id=fm[mname]", name);
		webtest.typeAndClear("id=fm[mtel]", phone);
		webtest.typeAndClear("id=fm[detail]", detail);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
	@Test(priority = 3,dataProvider="BuildingIntentionModifies_fail",dataProviderClass=NSDataProvider.class)
	public void test_modifies_fail(String title,String name,String phone,String detail) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='楼盘意向']");
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		System.out.println(list.size());
		list.get(2).findElement(By.xpath("//a[text()='修改']")).click();
		webtest.typeAndClear("id=fm_lpid_refname", title);
		webtest.typeAndClear("id=fm[mname]", name);
		webtest.typeAndClear("id=fm[mtel]", phone);
		webtest.typeAndClear("id=fm[detail]", detail);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertNotEquals("修改成功！", a);
	}
	@Test(priority = 4,dataProvider="BuildingIntentionManage",dataProviderClass=NSDataProvider.class)
	public void test_manageFirst(String type) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='楼盘意向']");
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		list.get(2).findElement(By.xpath("//input[@class='rdcb']")).click();
//		del show hidden
		webtest.selectByValue("name=fs_do", type);
		webtest.click("name=bsend");
		webtest.leaveFrame();
		
		}
	@Test(priority = 5,dataProvider="BuildingIntentionManage",dataProviderClass=NSDataProvider.class)
	public void test_manageAll(String type) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='楼盘意向']");
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		webtest.click("name=fs_act");
//		del show hidden
		webtest.selectByValue("name=fs_do", type);
		webtest.click("name=bsend");
		webtest.leaveFrame();
		}
	@Test(priority = 8,dataProvider="HomePageAdsAdd_success",dataProviderClass=NSDataProvider.class)
	public void test_add_homepageadd_success(String pid,String  value,String title,String detail,String click) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='首页广告']"));
		list.get(2).click();
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
//		来源资料 文字
		webtest.type("id=fm[pid]", pid);
//		来源资料select  
		webtest.selectByValue("id=fm[pmod]",value);
//		标题
		webtest.type("id=fm[title]", title);

		webtest.type("id=fm[detail]", detail);
//		url地址
//		webtest.type("id=fm[url]", url);
//		点击次数
		webtest.type("id=fm[click]", click);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", a);	
	}
	@Test(priority = 9,dataProvider="HomePageAdsAdd_fail",dataProviderClass=NSDataProvider.class)
	public void test_add_homepageadd_fail(String pid,String  value,String title,String detail,String click) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='首页广告']"));
		list.get(2).click();
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
//		来源资料 文字
		webtest.type("id=fm[pid]", pid);
//		来源资料select  
		webtest.selectByValue("id=fm[pmod]",value);
//		标题
		webtest.type("id=fm[title]", title);

		webtest.type("id=fm[detail]", detail);
//		点击次数
		webtest.type("id=fm[click]", click);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();	
		assertNotEquals(a, "增加成功！");
	}
	@Test(priority = 10,dataProvider="HomePageAdsSearch",dataProviderClass=NSDataProvider.class)
	public void test_homepageads_search(String value1,String value2,String value3,String value4,String value5,String value6) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='[回收站]']"));
		list.get(2).click();
		webtest.enterFrame("adf_main");
//		webtest.click("id=adblock_add");
//		9种  " "   "abhom" "abfoot0" "abhead0" "abside1" "abside2" "abinn" "a2012" "a2014" "abdel"
		webtest.selectByValue("name=stype", value1);
//		5种 "title" "color" "url" "aip" "eip"
		webtest.selectByValue("name=sfid", value2);
//		5种 "like%" "%like%" "%like" "=" "IN"
		webtest.selectByValue("name=sfop", value3);
		
		webtest.type("name=sfkw", value4);
//		2种"s1" "s0"
		webtest.selectByValue("name=show", value5);
//		4种 "atime" "etime" "aid" "aid-a"
		webtest.selectByValue("name=order", value6);
		webtest.click("name=sch_adblock");
		webtest.leaveFrame();
	}
	
	
	
	@Test(priority = 6,dataProvider="BuildingIntentionAdd_success",dataProviderClass=NSDataProvider.class)
	public void test_intentionAdd_success(String title,String name,String phone,String detail) throws InterruptedException {
			Thread.sleep(2000);
			webtest.click("xpath=//a[text()='楼盘意向']");
			Thread.sleep(2000);
			webtest.enterFrame("adf_main");
			webtest.click("id=need_add");
			Thread.sleep(1000);
			//true
			webtest.type("id=fm_lpid_refname", title);
			webtest.click("id=fm_ntype_1");
			webtest.type("id=fm[mname]", name);
			webtest.type("id=fm[mtel]", phone);
			webtest.type("id=fm[detail]", detail);
			webtest.click("name=bsend");
			String a = webtest.getAlertTest();
			webtest.alertAccept();
			webtest.leaveFrame();
			assertEquals("增加成功！", a);
		}
//		fail
	@Test(priority = 7,dataProvider="BuildingIntentionAdd_fail",dataProviderClass=NSDataProvider.class)

		public void test__intentionAdd_fail(String title,String name,String phone,String detail) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='楼盘意向']");
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		webtest.click("id=need_add");
		Thread.sleep(1000);
		webtest.type("id=fm_lpid_refname", title);
		webtest.click("id=fm_ntype_1");
		webtest.type("id=fm[mname]", name);
		webtest.type("id=fm[mtel]", phone);
		webtest.type("id=fm[detail]", detail);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertNotEquals("增加成功！", a);
		}
	@Test(priority = 11)
	public void test_admin() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
	}
	@Test(priority = 13,dataProvider="SubmissionOfIntent_success",dataProviderClass=NSDataProvider.class)
	public void test_SubmissionOfIntent_success(String type1,String type2,String type3,String type4,String name,String phone) throws InterruptedException, IOException {
		Thread.sleep(2000);
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='寿福小区56万元128㎡3室2厅2卫1阳台毛坯，多条公交经过']");
		
		webtest.click("xpath=//button[@onclick='omodal()']");
		Thread.sleep(2000);
		//想看房 fm_ntype_5 想买房fm_ntype_7 想咨询fm_ntype_8 想了解fm_ntype_9
		webtest.click("id="+type1);
		webtest.click("id="+type2);
		webtest.click("id="+type3);
		webtest.click("id="+type4);
		webtest.type("xpath=//input[@placeholder='电话']", phone);
		webtest.type("xpath=//input[@placeholder='称呼']", name);
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		Thread.sleep(2000);
		webtest.click("xpath=//button[text()='提交']");
		webtest.leaveFrame();
	}
	@Test(priority = 12,dataProvider="SubmissionOfIntent_fail",dataProviderClass=NSDataProvider.class)
	public void test_SubmissionOfIntent_fail(String type1,String type2,String type3,String type4,String name,String phone) throws InterruptedException, IOException {
		Thread.sleep(2000);
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='寿福小区56万元128㎡3室2厅2卫1阳台毛坯，多条公交经过']");
		
		webtest.click("xpath=//button[@onclick='omodal()']");
		Thread.sleep(2000);
		//想看房 fm_ntype_5 想买房fm_ntype_7 想咨询fm_ntype_8 想了解fm_ntype_9
		webtest.click("id="+type1);
		webtest.click("id="+type2);
		webtest.click("id="+type3);
		webtest.click("id="+type4);
		webtest.type("xpath=//input[@placeholder='电话']", phone);
		webtest.type("xpath=//input[@placeholder='称呼']", name);
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//button[text()='关闭']")).getText();
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(1000);
		webtest.click("xpath=//button[text()='关闭']");
		webtest.leaveFrame();
		assertEquals(a, "关闭");

		
		
	}
	
	
	
	
	
	
	
}
