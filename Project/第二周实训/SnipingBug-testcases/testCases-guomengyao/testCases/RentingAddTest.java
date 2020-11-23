package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;

public class RentingAddTest extends LoginTest{
	@Test(dataProvider = "rentaddfa",dataProviderClass = NSDataProvider.class)
	public void test_rentingadd_fail(String catid,String show,String title,String refname,String homenum) throws InterruptedException {
		//点击主营
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//点击出租管理
		webtest.click("xpath=//*[text()='出租管理']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//所在栏目
		webtest.click("id=fm[catid]");
		webtest.click(catid);
		//显示
		webtest.click("name=fm[show]");
		webtest.click(show);
		//关联小区
		webtest.type("id=fm_lpid_refname", refname);
		//房源标题
		webtest.type("id=fm[title]",title);
		//房号
		webtest.type("fm[fyno]", homenum);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//增加成功
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("请检查表单的规范性与完整性：", addsuccess);
		Thread.sleep(3000);
	}
	@Test(dataProvider = "rentaddsuc",dataProviderClass = NSDataProvider.class)
	public void test_rentingadd_success(String catid,String show,String title,String refname,String homenum) throws InterruptedException {
		//点击主营
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//点击出租管理
		webtest.click("xpath=//*[text()='出租管理']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//所在栏目
		webtest.click("id=fm[catid]");
		webtest.click(catid);
		Thread.sleep(1000);
		//显示
		webtest.click("name=fm[show]");
		webtest.click(show);
		Thread.sleep(1000);
		//关联小区
		webtest.click("name=fm[lpid_refname]");
		webtest.type("name=fm[lpid_refname]", refname);
		Thread.sleep(1000);
		//房源标题
		webtest.type("id=fm[title]",title);
		Thread.sleep(1000);
		//房号
		webtest.type("name=fm[fyno]", homenum);
		Thread.sleep(1000);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//增加成功
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", addsuccess);
		Thread.sleep(3000);
	}
}
