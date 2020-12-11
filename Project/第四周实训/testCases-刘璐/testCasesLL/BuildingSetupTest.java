package com.webtest.testCasesLL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
//刘璐
//模块：首页-房产设置
public class BuildingSetupTest extends BaseTest{
	@Test(priority = 1)
	public  void test_login() throws InterruptedException, IOException {	
		//登录
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		Thread.sleep(2000);
				
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

}
