package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BatchOperationAddTest extends BaseTest{
	@Test(priority = 0)
	public void openUrl() {
		//�򿪻��͹������
		webtest.click("xpath=//*[@id=\"left_m3hxdt\"]/a[1]");
		//�л���frame
		webtest.enterFrame("adf_main");
		//���������Ͻ���
		webtest.click("xpath=//*[@id=\"huxing_add\"]");
		System.out.println("�򿪻��͹����������Ͻ���ɹ�");
	}
	@Test(priority = 1)
	public void test_column1() {
		//��ѡ��
		String[] arr= {"h1012","h1016","h1018",""};
		int rnum=(int)(Math.random()*(4-1+1));
		System.out.println(arr[rnum]);
		webtest.selectByValue("xpath=//*[@id=\"fm[catid]\"]", arr[rnum]);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm[catid]\"]"), "w150");
	}
	@Test(priority = 2)
	public void test_column2() {
		//��ʾ
		String[] arr= {"1","0",""};
		int rnum=(int)(Math.random()*(3-1+1));
		System.out.println(arr[rnum]);
		webtest.selectByValue("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]", arr[rnum]);
		assertEquals(webtest.getClass("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]"), "w80");
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
	public void test_choosemessage_click() {
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
	public void test_platformcode() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.type("xpath=//*[@id=\"fm[exid]\"]", "0123");
	}
	@Test(priority = 13)
	public void test_sign() {
		webtest.type("xpath=//*[@id=\"fm[aflag]\"]", "0123");
	}
	@Test(priority = 14)
	public void test_changecolor() {
		//����ı���ɫ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[5]/td[2]/span[1]");
		//����frame
		webtest.enterFrame("fm_color__win");
		//ѡ����ɫ
		webtest.click("xpath=/html/body/table/tbody/tr[1]/td/table/tbody/tr[11]/td[12]");
		//ȷ��
		webtest.click("xpath=/html/body/table/tbody/tr[3]/td/table/tbody/tr/td[3]/button[1]");
	}
//	@Test(priority = 15)
//	public void test_checkname1() {
//		//������
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertTrue(webtest.isTextPresent("������δ�ظ�!"));
//	}
//	@Test(priority = 16)
//	public void test_checkname2() {
//		//����ո�
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", " ");
//		//������
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertTrue(webtest.isTextPresent("��������!"));
//	}
//	@Test(priority = 17)
//	public void test_checkname3() {
//		//������
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "");
//		//������
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertTrue(webtest.isTextPresent("��������!"));
//	}
	@Test(priority = 18)
	public void test_add() {
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		webtest.typeAndClear("xpath=//*[@id=\"fm[hxs]\"]", "3��2��1��1��1��");
		webtest.typeAndClear("xpath=//*[@id=\"fm[mjout]\"]", "100");
		webtest.typeAndClear("xpath=//*[@id=\"fm[mjin]\"]", "200");
		webtest.typeAndClear("xpath=//*[@id=\"fm[price]\"]", "5000");
		webtest.typeAndClear("xpath=//*[@id=\"fm[pall]\"]", "500000");
		webtest.typeAndClear("xpath=//*[@id=\"fm[sotags]\"]", "�ش�");
		webtest.typeAndClear("xpath=//*[@id=\"fm[remark]\"]", "�ɹ�����");
	}
	@Test(priority = 19)
	public void test_Salesstatus1() {
		String[] arr= {"1","2","3","4",""};
		int rnum=(int)(Math.random()*(5-1+1));
		webtest.selectByValue("xpath=//*[@id=\"fm[sales]\"]", arr[rnum]);
	}
	@Test(priority = 20)
	public void test_Salesstatus2() {
		String[] arr= {"x12","x16","x20","x24","x28","x32","x36","x40","x44","x48",""};
		int rnum=(int)(Math.random()*(11-1+1));
		webtest.selectByValue("xpath=//*[@id=\"fm[cxtype]\"]", arr[rnum]);
	}
	@Test(priority = 21)
	public void test_files1() throws InterruptedException {
		//ѡ��һ�������ϸ�ʽ���ļ�
		webtest.type("xpath=//*[@id=\"fm_mpic_f\"]", "D:\\��ʦ�ʸ�֤��Bվ�˺Ź㶫�й������ٷ���.zip");
		Thread.sleep(3000);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm_mpic_\"]"), "file");
	}
	@Test(priority = 23)
	public void test_files2() throws InterruptedException {
		Thread.sleep(3000);
		//���
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[11]/td[2]/input[5]");
		Thread.sleep(3000);
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm_mpic_\"]"), "file");
	}
	@Test(priority = 24)
	public void test_files3() throws InterruptedException {
		Thread.sleep(3000);
		//ѡ��һ�����ϸ�ʽ���ļ�
		webtest.type("xpath=//*[@id=\"fm_mpic_f\"]", "D:\\��ֽ.jpg");
		assertEquals(webtest.getClass("xpath=//*[@id=\"fm_mpic_\"]"), "file");
	}
	@Test(priority = 25)
	public void test_submit() {
		//����ύ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[18]/td[2]/input");
		assertEquals(webtest.getAlertTest(), "���ӳɹ�!");
		webtest.alertAccept();
	}
}
