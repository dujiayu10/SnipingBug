package com.webtest.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class SubmissionOfIntentTest extends BaseTest{
	@Test(priority = 1)
	public void test_login1() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
	}
	
	
	@Test(priority = 2,dataProvider="data1",dataProviderClass=NSDataProvider.class)
	public void test1(String type1,String type2,String type3,String type4,String name,String phone) throws InterruptedException, IOException {
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
		webtest.click("xpath=//button[text()='提交']");
		
	}
}
	


