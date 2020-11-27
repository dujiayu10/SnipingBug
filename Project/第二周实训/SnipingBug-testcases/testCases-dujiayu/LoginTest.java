package com.webtest.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

public class LoginTest extends BaseTest{
	//��¼ģ����ԣ��û��������������֤�������֤��Ϊ�ա�ȫ����ȷ(4��)
	@Test(description = "�û���¼",dataProvider="login",dataProviderClass=NSDataProvider.class)
	public  void test_login(String username,String password,String ucode) throws InterruptedException, IOException {	
		//��¼
		webtest.open(ReadProperties.getPropertyValue("base_url1"));
		webtest.type("id=fm[uname]",username);
		webtest.type("id=fm[upass]",password);
		webtest.type("xpath=//*[@placeholder='��֤��']",ucode);
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("��Ӫ"));
	}
}
