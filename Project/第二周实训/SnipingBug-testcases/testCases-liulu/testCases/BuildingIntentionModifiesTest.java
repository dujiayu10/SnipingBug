package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class BuildingIntentionModifiesTest extends BaseTest{
	//修改   最多只能勾选四个意向
	@Test(priority = 2,dataProvider="data5",dataProviderClass=NSDataProvider.class)
	public void test_3(String title,String name,String phone,String detail) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='楼盘意向']");
		Thread.sleep(2000);
		webtest.enterFrame("adf_main");
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		System.out.println(list.size());
		list.get(2).findElement(By.xpath("//a[text()='修改']")).click();
		webtest.type("id=fm_lpid_refname", title);
		webtest.type("id=fm[mname]", name);
		webtest.type("id=fm[mtel]", phone);
		webtest.type("id=fm[detail]", detail);
		webtest.click("name=bsend");
		String a = webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("修改成功！", a);
	}
}
