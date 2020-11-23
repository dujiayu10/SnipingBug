package com.webtest.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class HomePageAdsSearchTest extends BaseTest{
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
	
	@Test(priority = 2,dataProvider="data2",dataProviderClass=NSDataProvider.class)
	public void test(String value1,String value2,String value3,String value4,String value5,String value6) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("class=atm_m1adv");
		webtest.click("xpath=//a[text()='首页广告']");
		webtest.enterFrame("adf_main");
		webtest.click("id=adblock_add");
//		9种  " "   "abhom" "abfoot0" "abhead0" "abside1" "abside2" "abinn" "a2012" "a2014" "abdel"
		webtest.selectByValue("name=stype", value1);
//		5种 "title" "color" "url" "aip" "eip"
		webtest.selectByValue("name=sfid", value2);
//		5种 "like%" "%like%" "%like" "=" "IN"
		webtest.selectByValue("name=sfop", value3);
		webtest.type("name=sfkw", value4);
//		2种"s1" "s0"
		webtest.selectByValue("name=w60", value5);
//		4种 "atime" "etime" "aid" "aid-a"
		webtest.selectByValue("name=w80", value6);
		webtest.click("name=sch_adblock");
	}
	
}
