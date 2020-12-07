package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FrontdeskPropertySearchTest extends BaseTest  {
	@BeforeClass
	public void take_url2() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.click("xpath=//a[contains(text(),'¥��')]");
		webtest.selectByVisibleText("name=stype", "¥��");
		webtest.click("id=sobtn");
	}
	@Test(priority=0)
	public void test_property_search1() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		assertTrue(webtest.isTextPresent("[��ˮ̲]¥��")||webtest.isTextPresent("�ҵ�0����¼"));
	}
	@Test(priority=1)
	public void test_property_search2() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'����·')]");
		assertTrue(webtest.isTextPresent("[��ˮ̲]¥�� ����·"));
	}
	@Test(priority=2)
	public void test_property_search3() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'סլ')]");
		assertTrue(webtest.isTextPresent("סլ"));
	}
	@Test(priority=3)
	public void test_property_search4() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'סլ')]");
		webtest.click("xpath=//a[contains(text(),'ë��')]");
		assertTrue(webtest.isTextPresent("ë��"));
	}
	@Test(priority=4)
	public void test_property_search5() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'<0.5��')]");
	}
	@Test(priority=5)
	public void test_property_search6() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'סլ')]");
		webtest.click("xpath=//a[contains(text(),'�۸�')]");
		assertTrue(webtest.isTextPresent("ë��"));
	}
	@Test(priority=6)
	public void test_property_house() {
		webtest.click("xpath=//a[contains(text(),'�����ƶ�')]");
		webtest.click("xpath=//a[contains(text(),'K����')]");
		assertTrue(webtest.isTextPresent("K����"));
	}
	@Test(priority=7)
	public void test_property_goback() throws InterruptedException {
		webtest.goBack();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¥��')]");
		assertTrue(webtest.isTextPresent("���ѷ��� v5.3 --- ����è��Դ��Ŀ��"));
	}
}
