package com.webtest.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import javax.crypto.interfaces.PBEKey;

import org.apache.poi.hpbf.model.qcbits.QCBit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class GoBackTest extends BaseTest{
	@BeforeClass
	public  void login() throws InterruptedException, IOException {	
		//��¼
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//*[@placeholder='��֤��']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("��Ӫ"));
	}
	@Test(priority=0)
	public void test_refresh() {
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'������')]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/ol/li[1]/a");
	}
	@Test(priority=1,dataProvider="RecentTest",dataProviderClass=NSDataProvider.class)
	public void test_nearTake(String column,String choice) {
		webtest.leaveFrame();
		webtest.click("xpath=//*[text()='"+choice+"']");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div/i");
		assertTrue(webtest.isTextPresent(choice));
	}
	@Test(priority=2)
	public void test_sign_out() throws IOException {
		webtest.leaveFrame();
		webtest.click("xpath=//a[contains(text(),'������')]");
		webtest.click("id=nav_mdoc1");
		webtest.click("xpath=//*[text()='��ȫ�˳�']");
		boolean b=webtest.isTextPresent("�Ѿ��˳� ����Ա��");
		webtest.type("id=fm[uname]",ReadProperties.getPropertyValue("usname"));
		webtest.type("id=fm[upass]",ReadProperties.getPropertyValue("upasswd"));
		webtest.type("xpath=//*[@placeholder='��֤��']",ReadProperties.getPropertyValue("ucode"));
		webtest.click("name=submit");
		assertTrue(b);
	}
	@Test(priority=3)
	public void test_transformation_English() {
		webtest.leaveFrame();
		webtest.click("xpath=//a[conatins(text(),'������')]");
		webtest.click("id=nav_mdoc1");
		webtest.click("xpath=/html/body/div[2]/div/ul/li[8]/a");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("AddInfo"));
	}
	@Test(priority=4)
	public void test_transformation_Chinese() {
		webtest.leaveFrame();
		webtest.click("xpath=//a[conatins(text(),'������')]");
		webtest.click("id=nav_mdoc1");
		webtest.click("xpath=/html/body/div[2]/div/ul/li[9]/a");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("��������"));
	}
}
