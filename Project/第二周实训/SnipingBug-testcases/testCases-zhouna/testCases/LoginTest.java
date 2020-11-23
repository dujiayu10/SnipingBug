package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class LoginTest extends BaseTest{
	//登录
	@Test(priority=1)
	public  void test_login() throws InterruptedException, IOException {	
		
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='提交']");
		
		Thread.sleep(3000);
		
		}
		//增加资料
	//@Test(priority = 2,dataProvider="ourhouse",dataProviderClass=NSDataProvider.class)
	public void test_add(String title) throws InterruptedException{
		
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		webtest.click("id=house_add");
		Thread.sleep(1000);
		webtest.click("id=fm[catid]");
		Thread.sleep(1000);
		webtest.selectByIndex("id=fm[catid]",2);
		webtest.type("id=fm[title]",title);
		webtest.click("xpath=//input[@value='提交']");
		webtest.alertAccept();
		webtest.leaveFrame();			
			
		}
		
		//批量删除
	//@Test(priority=3)
	public void test_delete() {
		
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		for (int i = 2; i < 4; i++) {
			List<WebElement> list=driver.findElements(By.tagName("tr"));
			list.get(i).findElement(By.className("rdcb")).click();
		}
		
		webtest.selectByIndex("name=fs_do",1);
		webtest.click("name=bsend");
		webtest.leaveFrame();		
		
			
		}
		//批量隐藏
	//@Test(priority=4)
	public void test_hide() throws InterruptedException {
		
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		for (int i = 2; i < 4; i++) {
			List<WebElement> list=driver.findElements(By.tagName("tr"));
			list.get(i).findElement(By.className("rdcb")).click();
		}
		webtest.selectByIndex("name=fs_do",2);
		Thread.sleep(1000);
		webtest.click("name=bsend");
		webtest.leaveFrame();	
		Thread.sleep(1000);			
			
		}
		//批量显示
	//@Test(priority=5)
	public void test_show() throws InterruptedException {
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		for (int i = 2; i < 4; i++) {
			List<WebElement> list=driver.findElements(By.tagName("tr"));
			list.get(i).findElement(By.className("rdcb")).click();
		}
		webtest.selectByIndex("name=fs_do",3);
		Thread.sleep(1000);
		webtest.click("name=bsend");
		webtest.leaveFrame();	
		Thread.sleep(1000);			
			
		}
	//@Test(priority=6)
		
		//批量更新关联
	public void test_update() throws InterruptedException {
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		for (int i = 2; i < 4; i++) {
			List<WebElement> list=driver.findElements(By.tagName("tr"));
			list.get(i).findElement(By.className("rdcb")).click();
		}
		webtest.selectByIndex("name=fs_do",4);
		Thread.sleep(1000);
		webtest.click("name=bsend");
		webtest.leaveFrame();	
		Thread.sleep(1000);
		
	}		
		//修改名称
	//@Test(priority=7,dataProvider="ourhouse",dataProviderClass=NSDataProvider.class)
	public void test_rename(String newtitle) {
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		
			List<WebElement> list=driver.findElements(By.tagName("tr"));
			list.get(2).findElement(By.xpath("//a[text()='修改']")).click();
			webtest.type("id=fm[title]",newtitle);
			webtest.click("xpath=//input[@value='提交']");
			webtest.alertAccept();
			webtest.leaveFrame();
		
		
	}
		
		//修改栏目
	//@Test(priority=8)
	public void test_recolumn() throws InterruptedException {
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		for (int i = 2; i < 4; i++) {
			List<WebElement> list=driver.findElements(By.tagName("tr"));
			list.get(i).findElement(By.xpath("//a[text()='修改']")).click();
			webtest.click("id=fm[catid]");
			Thread.sleep(1000);
			webtest.selectByIndex("id=fm[catid]",3);
			webtest.click("xpath=//input[@value='提交']");
			webtest.alertAccept();
		
		}
		webtest.leaveFrame();
	}
	//循环添加搜索
	//@Test(priority=9,dataProvider="ourhouse",dataProviderClass=NSDataProvider.class)
	public void test_search(String search) throws InterruptedException {
		webtest.click("xpath=//li[@id='left_m3house']/a");
		webtest.enterFrame("adf_main");
		webtest.type("name=sfkw",search);
		Thread.sleep(1000);
		webtest.click("name=sch_house");
		webtest.leaveFrame();
	}	

	//不通栏目搜索失败
	@Test(priority=10,dataProvider="ourhouse",dataProviderClass=NSDataProvider.class)
	public void test_decolumn(String desearch) throws InterruptedException {
		webtest.click("xpath=//li[@id='left_m3house']/a");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		webtest.selectByIndex("name=type",1);
		webtest.type("name=sfkw",desearch);
		webtest.click("name=sch_house");
		webtest.leaveFrame();
	}
//		//相反显示属性搜索失败
//		webtest.click("xpath=//*[@name='type']");
//		webtest.click("xpath=//*[@name='type']/option[3]");
//		webtest.click("xpath=//*[@value='搜索']");
//		webtest.click("xpath=//*[@name='show']");
//		webtest.click("xpath=//*[@name='show']/option[3]");
//		webtest.click("xpath=//*[@value='搜索']");
//		//按照添加时间排序
//		webtest.click("xpath=//*[@name='order']");
//		webtest.click("xpath=//*[@name='order']/option[2]");
//		webtest.click("xpath=//*[@value='搜索']");
//		//按照修改时间
//		webtest.click("xpath=//*[@name='order']");
//		webtest.click("xpath=//*[@name='order']/option[3]");
//		webtest.click("xpath=//*[@value='搜索']");
//		//按照ID升
//		webtest.click("xpath=//*[@name='order']");
//		webtest.click("xpath=//*[@name='order']/option[5]");
//		webtest.click("xpath=//*[@value='搜索']");
//		//按照ID降
//		webtest.click("xpath=//*[@name='order']");
//		webtest.click("xpath=//*[@name='order']/option[4]");
//		webtest.click("xpath=//*[@value='搜索']");
		
		
	
}
