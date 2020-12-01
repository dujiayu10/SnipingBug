package com.webtest.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class MemberAddTest extends BaseTest {

	@Test(priority = 0)
	public void test_login_ad() throws InterruptedException, IOException {
		// ��¼ ������
		webtest.open(ReadProperties.getPropertyValue("base_url2"));
		webtest.type("id=fm[uname]", ReadProperties.getPropertyValue("back_name"));
		webtest.type("id=fm[upass]", ReadProperties.getPropertyValue("back_pwd"));
		webtest.type("xpath=//input[@placeholder='��֤��']", ReadProperties.getPropertyValue("ucode"));
		webtest.click("xpath=//input[@value='�ύ']");
		webtest.click("class=atm_m1adv");
		assertTrue(webtest.isTextPresent("��ַ�ղ�"));

	}

	@Test(priority = 1)
	public void test_member_center() {
		// �����Ա����
		webtest.click("xpath=//a[text()='��Ա����']");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("��Ա����"));
	}
	
	@Test(priority = 2,dataProvider = "member_add", dataProviderClass = NSDataProvider.class)
	public void test_member_add(String s1,String s2,String s3) throws IOException {
		// �����������
		webtest.click("id=adfavor_add");
		webtest.selectByVisibleText("id=fm[pmod]", s1);
		webtest.typeAndClear("id=fm[title]", s2);
		webtest.click("xpath=//input[@value='�������']");
		assertTrue(webtest.isTextPresent("������δ�ظ�!"));
		webtest.type("xpath=//input[@value='�ϴ�']", ReadProperties.getPropertyValue("testphoto_path")+s3);
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "���ӳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);
		assertEquals(webtest.isTextPresent("�����ϣ�"), false);
	}
	
}
