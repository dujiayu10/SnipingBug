package com.webtest.testCases;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
/**ǰ̨-¥��-��Ҫ��ť--gmy
 */
public class IWantTest extends Front_Login{
	@Test
	public void test_iwant() throws InterruptedException, IOException{	
		//���¥��
		webtest.click("xpath=//*[text()='¥��']");
		Thread.sleep(1000);
		//�����n��������Ϣ
		webtest.sclick("class=img-thumbnail", "4");
		Thread.sleep(1000);
		//�����Ҫ
		webtest.click("xpath=//*[@onclick='omodal()']");
		Thread.sleep(1000);
		//ѡ����������(ѡ��m��,m��Ϊ0)
		webtest.clicks("class=rdcb", "3");
		//��д�绰�ƺ�
		Thread.sleep(1000);
		webtest.type("name=fm[mtel]", "123456");
		webtest.type("name=fm[mname]", "����");
		Thread.sleep(1000);
		//��д��֤��
		webtest.type("xpath=//*[@placeholder='��֤��']", "11111");
		Thread.sleep(2000);
		//����ύ
		webtest.click("xpath=//*[text()='�ύ']");
		//�ж��Ƿ��������ɹ�
		assertTrue(webtest.isTextPresent("ok:�ύ�ɹ�!"));
		Thread.sleep(2000);
	}
}
