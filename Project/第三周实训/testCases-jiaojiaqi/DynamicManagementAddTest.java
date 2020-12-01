package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DynamicManagementAddTest extends BaseTest{
	@Test(priority = 0)
	public void openurl() {
		//�򿪶�̬�������
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[5]/a[2]");
		//�л���frame
		webtest.enterFrame("adf_main");
		System.out.println("�򿪶�̬�������ɹ�");
		//����������ҳ��
		webtest.click("xpath=//*[@id=\"hnews_add\"]");
		System.out.println("�򿪶�̬�����������Ͻ���ɹ�");
	}
	@Test(priority = 1)
	public void test_column1() {
		String[] arr= {"h1012","h1016","h1018","h1020",""};
		int rnum=(int)(Math.random()*(5-1+1));
		webtest.selectByValue("xpath=//*[@id=\"fm[catid]\"]", arr[rnum]);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm[catid]\"]"), "w150");
	}
	@Test(priority = 2)
	public void test_column2() {
		String[] arr= {"1","0",""};
		int rnum=(int)(Math.random()*(3-1+1));
		webtest.selectByValue("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[1]/td[2]/select[2]", arr[rnum]);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[1]/td[2]/select[2]"), "w80");
	}
	@Test(priority = 3)
	public void test_choosemessage_search1() throws InterruptedException {
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//��Ŀ ¥��
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "lp");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥��"));
		
	}
	@Test(priority = 4)
	public void test_choosemessage_search2() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//��Ŀ С��
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "xq");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("С��"));
		
	}
	@Test(priority = 5)
	public void test_choosemessage_search3() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//���� ���ʱ�䣨����
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "atime");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥������"));
		
	}
	@Test(priority = 6)
	public void test_choosemessage_search4() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//���� �޸�
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "etime");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥������"));
		
	}
	@Test(priority = 7)
	public void test_choosemessage_search5() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//���� �������
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥������"));
		
	}
	@Test(priority = 8)
	public void test_choosemessage_search6() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//���� �������
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥������"));
		
	}
	@Test(priority = 9)
	public void test_choosemessage_search7() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//���� ������� ��
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click-a");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥������"));
		
	}
	@Test(priority = 10)
	public void test_choosemessage_search8() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//���� ���ʱ�� ��
		webtest.getSelect("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]").selectByValue("atime-a");
		//�������
		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
		assertTrue(webtest.isTextPresent("¥������"));
	}
	@Test(priority = 11)
	public void test_choosemessage_click1() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//����frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		//��ȡѡ����Ϣ
		String mString=webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[3]/a");
		//ѡ������
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[1]/input");
		assertTrue(webtest.isTextPresent(mString));
	}
	@Test(priority = 12)
	public void test_clear() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[5]");
	}
	@Test(priority = 13)
	public void test_choosemessage_click2() {
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//����frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		//��ȡѡ����Ϣ
		String mString=webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[3]/a");
		//ѡ������
		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[1]/input");
		assertTrue(webtest.isTextPresent(mString));
	}
	@Test(priority = 14)
	public void test_platformcode() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.typeAndClear("xpath=/html/body/form/div/table/tbody/tr[3]/td[2]/input", "0123");
		assertEquals(webtest.getText("xpath=/html/body/form/div/table/tbody/tr[3]/td[2]/input"), "0123");
	}
	@Test(priority = 15)
	public void test_message() {
		webtest.type("xpath=/html/body/form/div/table/tbody/tr[5]/td[2]/textarea", "��");
		assertEquals(webtest.getText("xpath=/html/body/form/div/table/tbody/tr[5]/td[2]/textarea"), "��");
	}
	@Test(priority = 16)
	public void test_submit() {
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[11]/td[2]/input");
		assertEquals(webtest.getAlertTest(), "���ӳɹ�!");
		webtest.alertAccept();
	}
}
