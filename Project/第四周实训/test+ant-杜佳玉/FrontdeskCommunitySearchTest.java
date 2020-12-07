package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class FrontdeskCommunitySearchTest extends BaseTest {
	@BeforeClass
	public void take_url2() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.click("xpath=//a[contains(text(),'楼盘')]");
		webtest.selectByVisibleText("name=stype", "小区");
		webtest.click("id=sobtn");
	}
	@Test(priority=0)
	public void test_community_search1() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		assertTrue(webtest.isTextPresent("[冷水滩]"));
	}
	@Test(priority=1)
	public void test_community_search2() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'住宅')]");
		assertTrue(webtest.isTextPresent("住宅"));
	}
	@Test(priority=2)
	public void test_community_search3() {
		webtest.click("xpath=//a[contains(text(),'冷水滩')]");
		webtest.click("xpath=//a[contains(text(),'毛坯')]");
		assertTrue(webtest.isTextPresent("毛坯"));
	}
	@Test(priority=3)
	public void test_community_search4() {
		webtest.click("xpath=//a[contains(text(),'待售')]");
		assertTrue(webtest.isTextPresent("待售"));
	}
}
