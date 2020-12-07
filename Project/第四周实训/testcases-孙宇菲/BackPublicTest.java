package com.webtest.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.omg.CORBA.portable.ValueOutputStream;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class BackPublicTest extends BaseTest {

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
	public void test_ad() throws InterruptedException, IOException {
		// �����̨����
		webtest.click("xpath=//a[text()='��̨����']");
		webtest.enterFrame("adf_main");
		assertTrue(webtest.isTextPresent("��̨����"));
	}
	
	@Test(priority = 2)
	public void test_ad_url()  {
		// ���ǰ����URL
		for(int i=0;i<5;i++) {
			int count=i+2;
			String text=webtest.getText("xpath=//table[@class='table tblist']/tbody/tr["+count+"]/td[2]/a");
			webtest.click("xpath=//table[@class='table tblist']/tbody/tr["+count+"]/td[5]/a");
			webtest.pause(3000);
			webtest.switchWidow(1);
			webtest.isTextPresent(text);
			webtest.close();
			
		}
		
	}
	
	@Test(priority=3,dataProvider = "ad_update", dataProviderClass = NSDataProvider.class)
	public void test_ad_update(String s1,String s2,String s3,String s4) throws IOException {
		webtest.clicks("xpath=//a[text()='�޸�']",Integer.parseInt(s1));
		webtest.selectByVisibleText("id=fm[pmod]", s2);
		webtest.typeAndClear("id=fm[title]", s3);
		webtest.click("xpath=//input[@value='�������']");
		assertTrue(webtest.isTextPresent("������δ�ظ�!"));
		webtest.type("xpath=//input[@value='�ϴ�']", ReadProperties.getPropertyValue("testphoto_path")+s4);
		webtest.click("xpath=//input[@type='submit']");
		assertEquals(webtest.getAlertTest(), "�޸ĳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);
	}

	@Test(priority=4)
	public void test_ad_browse() {
		webtest.clicks("xpath=//a[text()='�޸�']",4);
		webtest.click("xpath=//input[@value='���']");
		webtest.click("xpath=//input[@value='���']");
		webtest.enterFrame1("xpath=//div[@class='layui-layer-content']/iframe");
		webtest.click("xpath=//a[text()='ͼ��']");
		webtest.click("xpath=//table[@class='tbdata']/tbody/tr[4]/td[3]");
		webtest.click("xpath=//input[@value='�ύ']");
		assertEquals(webtest.getAlertTest(), "�޸ĳɹ���");
		webtest.alertAccept();
		webtest.pause(3000);
	}
	
}
