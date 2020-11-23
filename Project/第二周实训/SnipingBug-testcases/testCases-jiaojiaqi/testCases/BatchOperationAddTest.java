package com.webtest.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
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
		//�л���frame
		System.out.println("�򿪻��͹����������Ͻ���ɹ�");
	}
//	@Test(priority = 1)
//	public void test_column1() {
//		//��ѡ��
//		String[] arr= {"h1012","h1016","h1018",""};
//		int rnum=(int)(1+Math.random()*(4-1+1));
//		System.out.println(arr[rnum]);
//		webtest.selectByValue("xpath=//*[@id=\"fm[catid]\"]", arr[rnum]);
//		assertEquals(webtest.getClass("xpath=//*[@id=\"fm[catid]\"]"), "w150");
//	}
//	@Test(priority = 2)
//	public void test_column2() {
//		//��ʾ
//		String[] arr= {"","1","0"};
//		int rnum=(int)(1+Math.random()*(3-1+1));
//		System.out.println(arr[rnum]);
//		webtest.selectByValue("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]", arr[rnum]);
//		assertEquals(webtest.getClass("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]"), "w80");
//	}
	@Test(priority = 3)
	public void test_choosemessage_search1() {
		//������ѡȡ
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		//�л���frame
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		System.out.println("������ѡȡ�ɹ�");
		//��Ŀ ¥��
		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "lp");
		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]"), "¥��");
		//�뿪frame
		webtest.leaveFrame();
		//�ر�����ѡȡ
		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button");
	}
//	@Test(priority = 4)
//	public void test_choosemessage_search2() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//��Ŀ С��
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[1]", "xq");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]"), "С��");
//		//�ر�����ѡȡ
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 5)
//	public void test_choosemessage_search3() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//���� ���ʱ�䣨����
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "atime");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "¥������");
//		//�ر�����ѡȡ
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 6)
//	public void test_choosemessage_search4() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//���� �޸�
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "etime");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "¥������");
//		//�ر�����ѡȡ
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 7)
//	public void test_choosemessage_search5() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//���� �������
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "¥������");
//		//�ر�����ѡȡ
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 8)
//	public void test_choosemessage_search6() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//���� �������
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "¥������");
//		//�ر�����ѡȡ
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 9)
//	public void test_choosemessage_search7() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//���� ������� ��
//		webtest.selectByValue("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]", "click-a");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		//�ر�����ѡȡ
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "¥������");
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
//	@Test(priority = 10)
//	public void test_choosemessage_search8() {
//		//������ѡȡ
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		//�л���frame
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		System.out.println("������ѡȡ�ɹ�");
//		//���� ���ʱ�� ��
//		webtest.getSelect("xpath=/html/body/form[1]/table/tbody/tr/td/select[4]").selectByValue("atime-a");
//		//�������
//		webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[1]/th[3]"), "¥������");
//		//�ر�����ѡȡ
//		webtest.click("xpath=/html/body/div[2]/div/div/div[1]/button/span[1]");
//	}
}
