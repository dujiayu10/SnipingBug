package com.webtest.testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.webtest.dataprovider.NSDataProvider;
public class RentingSearchTest extends LoginTest{
	@Test
	public void before() throws InterruptedException {
		//�����Ӫ
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//����������
		webtest.click("xpath=//*[text()='�������']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(dataProvider = "rentsearchcol",dataProviderClass = NSDataProvider.class)
	public void test_search_by_column(String column) throws InterruptedException {
		//�����Ŀ
		webtest.click("name=stype");
		webtest.click(column);
		Thread.sleep(1000);
		//�������
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
	@Test(dataProvider = "rentsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//�����Դ����
		webtest.click("name=sfid");
		webtest.click("xpath=//*[text()='��Դ����']");
		Thread.sleep(1000);
		//�����Ѵ��ڵķ�Դ����
		webtest.typeAndClear("name=sfkw",title);
		//�������
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
	@Test(dataProvider = "rentsearchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//�����ʾ
		webtest.click("name=show");
		webtest.click(show);
		//�������
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
	@Test(dataProvider = "rentsearchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		
		//�������
		webtest.click("name=order");
		webtest.click(order);
		//�������
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
}
