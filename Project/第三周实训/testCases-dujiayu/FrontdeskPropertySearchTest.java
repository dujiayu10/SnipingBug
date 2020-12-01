package com.webtest.testCases;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.jar.Attributes.Name;

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
	public void test_property_search(String city) {
		webtest.click("xpath=//a[contains(text(),'"+city+"')]");
		assertTrue(webtest.isTextPresent("["+city+"]楼盘")||webtest.isTextPresent("找到0条记录"));
	}
	@Test(priority=1)
	public void test_property_search2() {
		webtest.click("xpath=//a[contain(text(),'冷水滩')]");
		webtest.click("xoath=//a[contains(text(),'育才路')]");
		assertTrue(webtest.isTextPresent("[冷水滩]楼盘 育才路"));
	}
	@Test(priority=2)
	public void test_property_search3(String house) {
		webtest.click("xpath=//a[contain(text(),'冷水滩')]");
		webtest.click("xoath=//a[contains(text(),'"+house+"')]");
		assertTrue(webtest.isTextPresent(house+" |")&&webtest.isTextPresent("[冷水滩]楼盘"));
	}
}
