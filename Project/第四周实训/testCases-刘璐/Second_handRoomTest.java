package com.webtest.testCasesLL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
//刘璐
//模块：前台二手房
public class Second_handRoomTest extends BaseTest{
	@Test(priority = 1)
	public void test_admin() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
	}
	
	@Test(priority = 2,dataProvider="SubmissionOfIntent_fail",dataProviderClass=NSDataProvider.class)
	public void test_SubmissionOfIntent_fail1(String type1,String type2,String type3,String type4,String name,String phone) throws InterruptedException, IOException {
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
	
	@Test(priority = 3)
	public void test_SubmissionOfIntent_fail2() throws InterruptedException, IOException {
		Thread.sleep(2000);
		webtest.click("xpath=//button[@onclick='omodal()']");
		Thread.sleep(2000);
		//想看房 fm_ntype_5 想买房fm_ntype_7 想咨询fm_ntype_8 想了解fm_ntype_9
		webtest.click("id="+"");
		webtest.click("id="+"");
		webtest.click("id="+"");
		webtest.click("id="+"");
		webtest.type("xpath=//input[@placeholder='电话']", "123456");
		webtest.type("xpath=//input[@placeholder='称呼']", "张先生");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//button[text()='关闭']")).getText();
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(1000);
		webtest.click("xpath=//button[text()='关闭']");
		webtest.leaveFrame();
		assertEquals(a, "关闭");
	
	}
	
	@Test(priority = 4)
	public void test_SubmissionOfIntent_success() throws InterruptedException, IOException {
		Thread.sleep(2000);
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='寿福小区56万元128㎡3室2厅2卫1阳台毛坯，多条公交经过']");
		
		webtest.click("xpath=//button[@onclick='omodal()']");
		Thread.sleep(2000);
		//想看房 fm_ntype_5 想买房fm_ntype_7 想咨询fm_ntype_8 想了解fm_ntype_9
		webtest.click("id=m_ntype_5");
		webtest.click("id=fm_ntype_7");
		webtest.click("id=fm_ntype_8");
		webtest.click("id=fm_ntype_9");
		webtest.type("xpath=//input[@placeholder='电话']","123456");
		webtest.type("xpath=//input[@placeholder='称呼']", "张先生");
		webtest.type("xpath=//input[@placeholder='认证码']", ReadProperties.getPropertyValue("ucode"));
		Thread.sleep(2000);
		webtest.click("xpath=//button[text()='提交']");
		webtest.leaveFrame();
	}
	
	@Test(priority = 5)
	public void test_detail1() {
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='qd得到的dq']");
		assertTrue(webtest.isTextPresent("我要"));
	}
	
	@Test(priority = 6)
	public void test_search2() {
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='系统房源']");
		webtest.click("xpath=//a[text()='2室']");
		assertTrue(webtest.isTextPresent("疯了，居然还有这么便宜的房子，房主降价急售，随时看房"));
	}
	
	@Test(priority = 7)
	public void test_search3() {
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='系统房源']");
		webtest.click("xpath=//a[text()='1室']");
		assertTrue(webtest.isTextPresent("福清花园 独具特色 自然资源 宁静和谐"));
	}
	
	@Test(priority = 8)
	public void test_search() {
		webtest.click("id=idf_sale");
		webtest.click("xpath=//a[text()='系统房源']");
		webtest.click("xpath=//a[text()='3室']");
		assertTrue(webtest.isTextPresent("御景豪园旁边文化村毛坯房148平3房2厅2卫"));
	}
	
	@Test(priority = 9)
	public void test_detail2() {

		webtest.click("xpath=//a[text()='御景豪园旁边文化村毛坯房148平3房2厅2卫']");
		assertTrue(webtest.isTextPresent("我要"));
	}
}
