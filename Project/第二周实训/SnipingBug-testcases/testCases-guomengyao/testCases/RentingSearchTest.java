package com.webtest.testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.webtest.dataprovider.NSDataProvider;
public class RentingSearchTest extends LoginTest{
	@Test
	public void before() throws InterruptedException {
		//点击主营
		webtest.click("class=atm_m1main");
		Thread.sleep(1000);
		//点击出租管理
		webtest.click("xpath=//*[text()='出租管理']");
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
	}
	@Test(dataProvider = "rentsearchcol",dataProviderClass = NSDataProvider.class)
	public void test_search_by_column(String column) throws InterruptedException {
		//点击栏目
		webtest.click("name=stype");
		webtest.click(column);
		Thread.sleep(1000);
		//点击搜索
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
	@Test(dataProvider = "rentsearchtit",dataProviderClass = NSDataProvider.class)
	public void test_search_by_title(String title) throws InterruptedException {
		//点击房源标题
		webtest.click("name=sfid");
		webtest.click("xpath=//*[text()='房源标题']");
		Thread.sleep(1000);
		//输入已存在的房源标题
		webtest.typeAndClear("name=sfkw",title);
		//点击搜索
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
	@Test(dataProvider = "rentsearchshow",dataProviderClass = NSDataProvider.class)
	public void test_search_by_show(String show) throws InterruptedException {
		//点击显示
		webtest.click("name=show");
		webtest.click(show);
		//点击搜索
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
	@Test(dataProvider = "rentsearchorder",dataProviderClass = NSDataProvider.class)
	public void test_search_by_order(String order) throws InterruptedException {
		
		//点击排序
		webtest.click("name=order");
		webtest.click(order);
		//点击搜索
		webtest.click("name=sch_rent");
		Thread.sleep(1000);
	}
}
