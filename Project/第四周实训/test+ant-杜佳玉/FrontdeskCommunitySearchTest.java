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
		webtest.click("xpath=//a[contains(text(),'¥��')]");
		webtest.selectByVisibleText("name=stype", "С��");
		webtest.click("id=sobtn");
	}
	@Test(priority=0)
	public void test_community_search1() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		assertTrue(webtest.isTextPresent("[��ˮ̲]"));
	}
	@Test(priority=1)
	public void test_community_search2() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'סլ')]");
		assertTrue(webtest.isTextPresent("סլ"));
	}
	@Test(priority=2)
	public void test_community_search3() {
		webtest.click("xpath=//a[contains(text(),'��ˮ̲')]");
		webtest.click("xpath=//a[contains(text(),'ë��')]");
		assertTrue(webtest.isTextPresent("ë��"));
	}
	@Test(priority=3)
	public void test_community_search4() {
		webtest.click("xpath=//a[contains(text(),'����')]");
		assertTrue(webtest.isTextPresent("����"));
	}
}
