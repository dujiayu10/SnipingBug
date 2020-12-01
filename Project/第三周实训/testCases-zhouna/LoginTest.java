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
//	//登录后台
//	@Test(priority=1)
//	public  void test_login() throws InterruptedException, IOException {	
//		
//		webtest.open(ReadProperties.getPropertyValue("base_url1"));
//		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
//		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
//		webtest.type("xpath=//input[@placeholder='认证码']",ReadProperties.getPropertyValue("ucode"));
//		webtest.click("xpath=//input[@value='提交']");
//		
//		Thread.sleep(3000);
//		
//		}
//
//		//增加资料
//	@Test(priority = 2,dataProvider="dataadd",dataProviderClass=NSDataProvider.class)
//	public void test_add(String title) throws InterruptedException{
//		
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		webtest.click("id=house_add");
//		Thread.sleep(1000);
//		webtest.click("id=fm[catid]");
//		Thread.sleep(1000);
//		webtest.selectByIndex("id=fm[catid]",2);
//		webtest.type("id=fm[title]",title);
//		webtest.click("xpath=//input[@value='提交']");
//		webtest.alertAccept();
//		webtest.leaveFrame();			
//			
//		}
//		
//		//批量删除
//	@Test(priority=3)
//	public void test_delete() {
//		
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		
//		webtest.selectByIndex("name=fs_do",1);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();		
//		
//			
//		}
//		//批量显示
//	@Test(priority=4)
//	public void test_hide() throws InterruptedException {
//		
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		webtest.selectByIndex("name=fs_do",2);
//		Thread.sleep(1000);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();	
//		Thread.sleep(1000);			
//			
//		}
//		//批量隐藏
//	@Test(priority=5)
//	public void test_show() throws InterruptedException {
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		webtest.selectByIndex("name=fs_do",3);
//		Thread.sleep(1000);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();	
//		Thread.sleep(1000);			
//			
//		}
//
//		
//	//批量更新关联
//	@Test(priority=6)
//	public void test_update() throws InterruptedException {
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		webtest.selectByIndex("name=fs_do",4);
//		Thread.sleep(1000);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();	
//		Thread.sleep(1000);
//		
//	}		
//	//修改名称
//	@Test(priority=7,dataProvider="rename",dataProviderClass=NSDataProvider.class)
//	public void test_rename(String line,String newtitle) {
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(Integer.parseInt(line)).findElement(By.linkText("修改")).click();
//			webtest.typeAndClear("id=fm[title]",newtitle);
//			webtest.click("xpath=//input[@value='提交']");
//			webtest.alertAccept();
//			webtest.leaveFrame();
//		
//		
//	}
//		
//		//修改栏目
//	@Test(priority=8)
//	public void test_recolumn() throws InterruptedException {
//		
//		for (int i = 2; i < 4; i++) {
//			webtest.click("xpath=//li[@id='left_m3house']/a");
//			webtest.enterFrame("adf_main");
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//				list.get(i).findElement(By.xpath("//a[text()='修改']")).click();
//			webtest.click("id=fm[catid]");
//			Thread.sleep(1000);
//			webtest.selectByIndex("id=fm[catid]",2);
//			Thread.sleep(1000);
//			webtest.click("xpath=//input[@value='提交']");
//			Thread.sleep(1000);
//			webtest.alertAccept();
//			webtest.leaveFrame();
//		}
//		
//	}
//	//循环添加搜索
//	@Test(priority=9,dataProvider="search",dataProviderClass=NSDataProvider.class)
//	public void test_search(String search) throws InterruptedException {
//		webtest.click("xpath=//li[@id='left_m3house']/a");
//		webtest.enterFrame("adf_main");
//		Thread.sleep(2000);
//		webtest.selectByIndex("name=stype",2);
//		webtest.type("name=sfkw",search);
//		Thread.sleep(1000);
//		webtest.click("name=sch_house");
//		webtest.leaveFrame();
//	}	
//
//	//按照添加时间排序
//	@Test(priority=10)
//	public void test_order() {
//		for(int i=1;i<5;i++) {
//			webtest.click("xpath=//li[@id='left_m3house']/a");
//			webtest.enterFrame("adf_main");
//			webtest.selectByIndex("name=order",i);
//			webtest.click("name=sch_house");
//			webtest.leaveFrame();
//		}
//	}
//	//广告模块文字连接测试增加资料
//	@Test(priority=11,dataProvider="adadd",dataProviderClass=NSDataProvider.class)
//	public void test_ad(String title,String URL,String click) throws InterruptedException {
//		webtest.click("xpath=//div[@id='adf_nav1']/a[4]");
//		webtest.click("xpath=//li[@id='left_athom']/a");
//		webtest.enterFrame("adf_main");
//		webtest.click("id=adtext_add");
//		webtest.type("id=fm[title]",title );
//		Thread.sleep(1000);
//		webtest.type("id=fm[url]]",URL );
//		Thread.sleep(1000);
//		webtest.type("id=fm[click]",click );
//		webtest.click("name=bsend");
//		webtest.alertAccept();
//		webtest.leaveFrame();
//		
//	}
//	
//	//广告模块文字连接测试修改模块fm[title]
//	@Test(priority=11,dataProvider="word",dataProviderClass=NSDataProvider.class)
//	public void test_rewritead(String line,String newtitle,String newclick) throws InterruptedException {
//		webtest.click("xpath=//div[@id='adf_nav1']/a[4]");
//		webtest.click("xpath=//li[@id='left_athom']/a");
//		webtest.enterFrame("adf_main");
//
//		List<WebElement> list=driver.findElements(By.tagName("tr"));
//		Thread.sleep(1000);
//		list.get(Integer.parseInt(line)).findElement(By.linkText("修改")).click();
//		Thread.sleep(1000);
//		webtest.typeAndClear("id=fm[title]",newtitle );
//		webtest.typeAndClear("id=fm[click]",newclick );
//		Thread.sleep(1000);
//		webtest.click("name=bsend");
//		webtest.alertAccept();
//		webtest.leaveFrame();
//
//	}
//	
//		//批量隐藏
//	@Test(priority=12)
//	public void test_deletead() {
//		
//		webtest.click("xpath=//div[@id='adf_nav1']/a[4]");
//		webtest.click("xpath=//li[@id='left_athom']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		
//		webtest.selectByIndex("name=fs_do",3);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();		
//		
//			
//		}
//		//批量删除
//	@Test(priority=13)
//	public void test_hidead() throws InterruptedException {
//		
//		webtest.click("xpath=//div[@id='adf_nav1']/a[4]");
//		webtest.click("xpath=//li[@id='left_athom']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		
//		webtest.selectByIndex("name=fs_do",2);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();			
//			
//		}
//		//批量显示
//	@Test(priority=14)
//	public void test_showad() throws InterruptedException {
//		webtest.click("xpath=//div[@id='adf_nav1']/a[4]");
//		webtest.click("xpath=//li[@id='left_athom']/a");
//		webtest.enterFrame("adf_main");
//		for (int i = 2; i < 4; i++) {
//			List<WebElement> list=driver.findElements(By.tagName("tr"));
//			list.get(i).findElement(By.className("rdcb")).click();
//		}
//		
//		webtest.selectByIndex("name=fs_do",1);
//		webtest.click("name=bsend");
//		webtest.leaveFrame();		
//			
//		}
//	//广告模块搜索
//	@Test(priority=15,dataProvider="searchad",dataProviderClass=NSDataProvider.class)
//		public void test_searchad(String name,String line) throws InterruptedException {
//			webtest.click("xpath=//div[@id='adf_nav1']/a[4]");
//			webtest.click("xpath=//li[@id='left_athom']/a");
//			webtest.enterFrame("adf_main");
//			Thread.sleep(2000);
//			webtest.selectByIndex("name=stype",Integer.parseInt(line));
//			webtest.type("name=sfkw",name);
//			Thread.sleep(1000);
//			webtest.click("name=sch_adtext");
//			Thread.sleep(1000);
//			webtest.leaveFrame();
//		}
	
	//前台测试
	//登录前台
	@Test(priority=16)
	public void test_login2() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
	 }
	//筛选提交意向
	@Test(priority=17,dataProvider="ourhouse",dataProviderClass=NSDataProvider.class)
	public void test_location(String number,String name,String path) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("id=idf_sale");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='冷水滩']");
		webtest.click("xpath=//a[text()='系统房源']");
		webtest.click(path);
		webtest.click("xpath=//li[@class='yixi']/button");
		webtest.click("id=fm_ntype_5");
		webtest.type("name=fm[mtel]", number);
		webtest.type("name=fm[mname]", name);
		webtest.type("xpath=//*[@placeholder='认证码']", "11111");
		webtest.click("xpath=//button[@class='btn btn-primary']");
		Thread.sleep(1000);
	}
	
}
