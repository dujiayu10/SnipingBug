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
		webtest.click("xpath=//a[contains(text(),'楼盘')]");
		webtest.selectByVisibleText("name=stype", "楼盘");
		webtest.click("id=sobtn");
	}
	@Test(priority=0)
	public void test_property_search1() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		assertTrue(webtest.isTextPresent("[冷水滩]楼盘")||webtest.isTextPresent("找到0条记录"));
	}
	@Test(priority=1)
	public void test_property_search2() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'育才路')]");
		assertTrue(webtest.isTextPresent("[冷水滩]楼盘 育才路"));
	}
	@Test(priority=2)
	public void test_property_search3() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'住宅')]");
		assertTrue(webtest.isTextPresent("住宅"));
	}
	@Test(priority=3)
	public void test_property_search4() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'住宅')]");
		webtest.click("xpath=//a[contains(text(),'毛坯')]");
		assertTrue(webtest.isTextPresent("毛坯"));
	}
	@Test(priority=4)
	public void test_property_search5() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'<0.5万')]");
	}
	@Test(priority=5)
	public void test_property_search6() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'住宅')]");
		webtest.click("xpath=//a[contains(text(),'价格')]");
		assertTrue(webtest.isTextPresent("毛坯"));
	}
	@Test(priority=6)
	public void test_property_house() {
		webtest.click("xpath=//a[contains(text(),'东城云顶')]");
		webtest.click("xpath=//a[contains(text(),'K户型')]");
		assertTrue(webtest.isTextPresent("K户型"));
	}
	@Test(priority=7)
	public void test_property_goback() throws InterruptedException {
		webtest.goBack();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'其他楼盘')]");
		assertTrue(webtest.isTextPresent("爱窝房产 v5.3 --- 贴心猫开源项目！"));
	}
}
