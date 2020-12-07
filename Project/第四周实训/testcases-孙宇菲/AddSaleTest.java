package com.webtest.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class AddSaleTest extends BaseTest{
	
	@Test(priority=0)
	public void test_login() throws InterruptedException, IOException {
		// ��¼
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.type("id=fm[uname]", ReadProperties.getPropertyValue("back_name"));
		webtest.type("id=fm[upass]", ReadProperties.getPropertyValue("back_pwd"));
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("��Ӫ"));
	}
	
	@Test(priority=1)
	public void test_add(){
		// ������۹���-����
		webtest.click("xpath=//a[@onclick='admJsClick(this)']");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("�������"));
	}

	@Test(priority = 2, dataProvider = "add_title", dataProviderClass = NSDataProvider.class)
	public void test_add_title(String s1, String s2, String s3, String s4, String s5) {
		webtest.selectByVisibleText("id=fm[catid]", s1);
		webtest.selectByVisibleText("name=fm[show]", s2);
		webtest.click("xpath=//input[@value='���']");
		webtest.click("xpath=//input[@value='����ѡȡ']");
		webtest.enterFrame1("xpath=//div[@class='modal-body']/iframe");
		webtest.clicks("xpath=//input[@class='rdcb']", Integer.parseInt(s3));
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		// webtest.click("xpath=//button[@onclick='popClose()']");
		webtest.typeAndClear("xpath=//input[@id='fm[title]']", s4);
		webtest.click("xpath=//input[@value='�������']");
		assertTrue(webtest.isTextPresent("������δ�ظ�!"));
		webtest.click("xpath=//input[@text()=" + s5 + "]");
		webtest.click("xpath=//input[@value='�ύ']");
		assertEquals(webtest.getAlertTest(), "���ӳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);

	}
	
	@Test(priority=3,dataProvider = "add_property",dataProviderClass = NSDataProvider.class)
	public void test_property_setting(String s1,String s2,String s3) {
		webtest.selectByVisibleText("id=fm[catid]",s1);
		webtest.typeAndClear("xpath=//input[@id='fm[title]']", s2);
		webtest.click("xpath=//span[@class='fldicon fdate']");
		webtest.click("id=dpClearInput");
		webtest.click("id=dpTodayInput");
		webtest.click("id=dpOkInput");
		webtest.typeAndClear("id=fm[euser]", s3);
		webtest.click("xpath=//input[@value='�ύ']");
		assertEquals(webtest.getAlertTest(), "���ӳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);
	}
	
	@Test(priority=4)
	public void test_title_color1() {
		webtest.selectByVisibleText("id=fm[catid]","ϵͳ��Դ");
		webtest.typeAndClear("xpath=//input[@id='fm[title]']","����blue");
		webtest.click("xpath=//span[@class='fldicon fcolor']");
		webtest.enterFrame("fm_color__win");
		webtest.click("xpath=//td[@style='background-color:#6699FF']");
		webtest.click("xpath=//button[@type='SUBMIT']");
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//input[@value='�ύ']");
		assertEquals(webtest.getAlertTest(), "���ӳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);
	}
	
	@Test(priority=5)
	public void test_title_color2() {
		webtest.selectByVisibleText("id=fm[catid]","���˷�Դ");
		webtest.typeAndClear("xpath=//input[@id='fm[title]']","����red");
		webtest.click("xpath=//span[@class='fldicon fcolor']");
		webtest.enterFrame("fm_color__win");
		webtest.typeAndClear("id=resCode", "#FF0000");
		webtest.click("xpath=//button[@type='SUBMIT']");
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//input[@value='�ύ']");
		assertEquals(webtest.getAlertTest(), "���ӳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);
		webtest.leaveFrame();
		webtest.click("xpath=//a[@target='adf_main']");
		webtest.enterFrame("adf_main");
	}
}
