package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.logging.Level;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;
//��̨-��Ա����-������
public class BrokerAddTest extends BaseTest {
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
	//�������ӺϷ�������(4��)
	@Test(priority=1,description = "����������",dataProvider="broker",dataProviderClass=NSDataProvider.class)
	public void test_add_success(String password,String select,String show,String mname,String indep,String phone) throws InterruptedException, IOException {	
		webtest.click("xpath=//a[contains(text(),'������')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='"+select+"']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='"+show+"']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='"+indep+"']");
		webtest.type("id=fm[mtel]",phone);
		webtest.click("xpath=//input[@value='�ύ']");
		String a=webtest.getAlertTest();
		webtest.alertAccept();
		webtest.leaveFrame();
		assertEquals("���ӳɹ���", a);
	}
	//���Ӳ��Ϸ�����(���벻�Ϸ�)
	@Test(priority=2,description = "����������",dataProvider="brokerfail",dataProviderClass=NSDataProvider.class)
	public void test_add_fail(String password,String mname,String phone) {
		webtest.click("xpath=//a[contains(text(),'������')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='������Ա']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='��ʾ']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='����']");
		webtest.type("id=fm[mtel]", phone);
		webtest.click("xpath=//input[@value='�ύ']");
		String a=webtest.getAlertTest();
		boolean b=a.contains("������Ĺ淶���������ԣ�");
		webtest.alertAccept();
		webtest.leaveFrame();
		assertTrue(b);
	}
	//���Ӳ��Ϸ����ݣ��û������Ϸ���
	@Test(priority=3,description = "����������",dataProvider="brokerfailname",dataProviderClass=NSDataProvider.class)
	public void test_add_failname(String password,String mname,String phone) {
		webtest.click("xpath=//a[contains(text(),'������')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='������Ա']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='��ʾ']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='����']");
		webtest.type("id=fm[mtel]", phone);
		webtest.click("xpath=//input[@value='�ύ']");
		String a=webtest.getAlertTest();
		boolean b=a.contains("������Ĺ淶���������ԣ�");
		webtest.alertAccept();
		webtest.leaveFrame();
		assertTrue(b);
	}
	@Test(priority=4,description = "����������",dataProvider="brokerfailphone",dataProviderClass=NSDataProvider.class)//�ֻ��Ų��Ϸ�
	public void test_add_failphone(String password,String mname,String phone) {
		webtest.click("xpath=//a[contains(text(),'������')]");
		webtest.enterFrame("adf_main");
		webtest.click("id=inmem_add");
		webtest.type("id=fm[upass]",password);
		webtest.click("id=fm[grade]");
		webtest.click("xpath=//*[text()='������Ա']");
		webtest.click("id=fm[show]");
		webtest.click("xpath=//*[text()='��ʾ']");
		webtest.type("id=fm[mname]",mname);
		webtest.click("xpath=//*[text()='����']");
		webtest.type("id=fm[mtel]", phone);
		webtest.click("xpath=//input[@value='�ύ']");
		String a=webtest.getAlertTest();
		boolean b=a.contains("������Ĺ淶���������ԣ�");
		webtest.alertAccept();
		webtest.leaveFrame();
		assertTrue(b);
	}
}
