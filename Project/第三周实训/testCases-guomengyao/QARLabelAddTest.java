package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
/**
 * 互动-问答回复-标签-增加资料
 * 
 * 
 * */
public class QARLabelAddTest extends LoginTest{
	@Test(dataProvider = "qarladdfa",dataProviderClass = NSDataProvider.class)
	public void test_qarlabeladd_fail(String show,String title,String hot) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复-标签
		webtest.click("xpath=//*[text()='标签']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//选择显示
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标签
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//热度
		webtest.typeAndClear("name=fm[hotcnt]", hot);
		Thread.sleep(1000);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//判断是否增加成功
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", addsuccess);
		Thread.sleep(3000);
	}
	@Test(dataProvider = "qarladdsuc",dataProviderClass = NSDataProvider.class)
	public void test_qarlabeladd_success(String show,String title,String hot) throws InterruptedException {
		//点击互动
		webtest.click("class=atm_m1coms");
		Thread.sleep(1000);
		//点击问答回复-标签
		webtest.click("xpath=//*[text()='标签']");
		Thread.sleep(1000);
		//点击增加资料
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[text()='增加资料>>']");
		Thread.sleep(1000);
		//选择显示
		webtest.selectByVisibleText("name=fm[show]", show);
		Thread.sleep(1000);
		//填写标签
		webtest.type("name=fm[title]",title);
		Thread.sleep(1000);
		//热度
		webtest.typeAndClear("name=fm[hotcnt]", hot);
		Thread.sleep(1000);
		//提交
		webtest.click("name=bsend");
		Thread.sleep(1000);
		//判断是否增加成功
		String addsuccess=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("增加成功！", addsuccess);
		Thread.sleep(3000);
	}
}
