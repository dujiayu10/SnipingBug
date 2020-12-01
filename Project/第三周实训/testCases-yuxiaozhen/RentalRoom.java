package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class RentalRoom extends BaseTest{
//	//No.28
//	@Test(priority = 1)
//	public void clickByTitle() {
//		String title = webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[3]/p[1]/a");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[3]/p[1]/a");
//		assertEquals(webtest.getText("xpath=/html/body/div/div[3]/div[2]/div[1]/h1"),title);
//	}
//
////	//No.29
//	@Test(priority = 2)
//	public void clickByPhoto() {
//		String title = webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[3]/p[1]/a");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[2]/a");
//		assertEquals(webtest.getText("xpath=/html/body/div/div[3]/div[2]/div[1]/h1"),title);
//	}
//	
//	//No.30
//	@Test(priority = 3)
//	public void clickByPanel() {
//		String title = webtest.getText("xpath=/html/body/div/div[3]/div[2]/div[4]/div[2]/li[1]/a");
//		webtest.click("xpath=/html/body/div/div[3]/div[2]/div[4]/div[2]/li[1]/a");
//		assertEquals(webtest.getText("xpath=/html/body/div/div[3]/div[2]/div[1]/h1"), title);
//	}
//	
//	//No.31
//	@Test(priority = 4)
//	public void lookMore() {
//		webtest.click("xpath=/html/body/div/div[3]/div[2]/div[4]/div[1]/span/a");
//		assertEquals(webtest.getUrl(), "http://127.0.0.3/home.php/rent");
//	}
//	
//	//No.32
//	@Test(priority = 5)
//	public void search() throws InterruptedException {
//		webtest.selectByVisibleText("xpath=/html/body/div/div[3]/div[2]/div[1]/div/form/select", "中介房源");
//		webtest.typeAndClear("xpath=//*[@id=\"keywd\"]", "dddddd");
//		webtest.click("xpath=//*[@id=\"sobtn\"]");
//		assertEquals(webtest.getText("xpath=/html/body/div/div[3]/div[1]/div[2]/p[2]/i"), "1");
//		assertEquals(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li/div[3]/p[1]/a"), "dddddd");
//	}
//	
//	//No.33
//	@Test(priority = 6)
//	public void zclearCondition() throws InterruptedException {
//		Thread.sleep(2000);
//		webtest.click("xpath=//*[@id=\"soclear\"]");
//		assertFalse(webtest.isTextPresent("爱窝房产"));
//	}
	
	//No.34
//	@Test(priority = 7)
//	public void defaultchose() {
//		webtest.click("xpath=//*[@id=\"so_def\"]/a");
//		assertFalse(webtest.getText("xpath=//*[@id=\"sokeys\"]/i").equals("0"));
//	}
	
	//No.35
//	@Test(priority = 8)
//	public void changeClickVolume() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[2]/p[1]/i[2]/a");
//		assertFalse(webtest.getText("xpath=//*[@id=\\\"sokeys\\\"]/i").equals("0"));
//	}
	
	//No.36
//	@Test(priority = 9)
//	public void classificationByCounties() {
//		webtest.click("xpath=//*[@id=\"solocal1\"]/a[1]");
//		assertEquals(webtest.getText("xpath=//*[@id=\"sokeys\"]/i"),"3");
//	}
	
	//No.37
//	@Test(priority = 10)
//	public void changeSortByPrice() {
//		///html/body/div/div[3]/div[1]/ul/li[1]
//		//html/body/div/div[3]/div[1]/ul/li[1]/div[1]/span
//		List<String> price = new ArrayList<String>();
//		for(int i =1;i<=12;i++) {
//			price.add(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li["+i+"]/div[1]/span"));
//		}
//		webtest.click("//*[@id=\"so_salse\"]/a");
//		List<String> priceAfter = new ArrayList<String>();
//		for(int i =1;i<=12;i++) {
//			priceAfter.add(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li["+i+"]/div[1]/span"));
//		}
//		List<String> pricereverse = new ArrayList<String>();
//		for (int i = priceAfter.size() - 1; i >= 0; i--) {
//		    pricereverse.add(priceAfter.get(i));
//		  }
//		assertEquals(pricereverse, price);
//	}
	
	//No.38
//	@Test(priority = 11)
//	public void choseAll() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[4]/span/a[4]");
//		assertFalse(webtest.getText("xpath=/html/body/div/div[3]/div[1]/div[2]/p[2]/i").equals("0"));
//	}
//	
	//No.39
//	@Test(priority = 12)
//	public void pageJump() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[6]/a");
//		String page = webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[1]/a");
//		String[] pages = page.split("/");
//		assertEquals(pages[1], pages[0]);
//	}
	//No.40
//	@Test(priority = 13)
//	public void changeSortByPriceafterChangePage() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[6]/a");
//		List<String> price = new ArrayList<String>();
//		for(int i =1;i<=12;i++) {
//			price.add(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li["+i+"]/div[1]/span"));
//		}
//		webtest.click("//*[@id=\"so_salse\"]/a");
//		List<String> priceAfter = new ArrayList<String>();
//		for(int i =1;i<=12;i++) {
//			priceAfter.add(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li["+i+"]/div[1]/span"));
//		}
//		List<String> pricereverse = new ArrayList<String>();
//		for (int i = priceAfter.size() - 1; i >= 0; i--) {
//		    pricereverse.add(priceAfter.get(i));
//		  }
//		assertEquals(pricereverse, price);
//	}
	
	//No.41
//	@Test(priority = 14)
//	public void classificationByCountiesAfterChangePage() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[6]/a");
//		webtest.click("xpath=//*[@id=\"solocal1\"]/a[1]");
//		assertEquals(webtest.getText("xpath=//*[@id=\"sokeys\"]/i"),"3");
//	}
	
	//No.42
//	@Test(priority = 15)
//	public void changeClickVolumeAfterChangePage() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[6]/a");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[2]/p[1]/i[2]/a");
//		assertFalse(webtest.getText("xpath=//*[@id=\\\"sokeys\\\"]/i").equals("0"));
//	}
	
	//No.43
//	@Test(priority = 16)
//	public void defaultchoseAfterChangePage() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[6]/a");
//		webtest.click("xpath=//*[@id=\"so_def\"]/a");
//		assertFalse(webtest.getText("xpath=//*[@id=\"sokeys\"]/i").equals("0"));
//	}
	
	//No.44
//	@Test(priority = 17)
//	public void findByMonthly() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[2]/span/a[1]");
//		assertFalse(webtest.getText("xpath=/html/body/div/div[3]/div[1]/div[2]/p[2]/i").equals("0"));
//	}
	
	//No.45
//	@Test(priority = 18)
//	public void IWantTest() throws InterruptedException {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/li[2]/div[2]/a/img");
//		webtest.click("xpath=/html/body/div/div[3]/div[2]/div[2]/ul/li[10]/button");
//		webtest.click("xpath=//*[@id=\"fm_ntype_5\"]");
//		webtest.typeAndClear("xpath=/html/body/div[1]/div[6]/div/div/div[2]/form/table/tbody/tr[3]/td[2]/label[1]/input", "(0769)22028558");
//		webtest.typeAndClear("xpath=//*[@id=\"nform\"]/table/tbody/tr[3]/td[2]/label[2]/input", "yu");
//		webtest.typeAndClear("xpath=//*[@placeholder=\"认证码\"]", "11111");
//		webtest.clickWithoutSleep("xpath=//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
//		assertEquals(webtest.getText("xpath=//*[@id=\"myModal\"]/div/div/div[2]/div/div"), "ok:提交成功!");
//      webtest.click("xpath=/html/body/div/nav/div/div[2]/ul[1]/li[3]/a")
//	}
	
	//No.46
//	@Test(priority = 19)
//	public void choseAllAfterChangeumpPage() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[6]/a");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[4]/span/a[4]");
//		assertFalse(webtest.getText("xpath=/html/body/div/div[3]/div[1]/div[2]/p[2]/i").equals("0"));
//	}
	
//	//No.47
//	@Test(priority = 20)
//	public void PhotoAlbumPageJump() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[2]/a/img");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div/div/ul[1]/li[4]/a");
//		String[] fyStrings = webtest.getText("xpath=/html/body/div[2]/p").split("   ");
//		String[] fucy = fyStrings[2].split("\n");
//		String[] Pages = fucy[1].split("/");
//		int page = Integer.parseInt(Pages[0]);
//		int pages = Integer.parseInt(Pages[1]);
//		webtest.click("xpath=/html/body/div[2]/p/a[3]");
//		fyStrings = webtest.getText("xpath=/html/body/div[2]/p").split("   ");
//		fucy = fyStrings[2].split("\n");
//		String[] nowPages = fucy[1].split("/");
//		int nowpage = Integer.parseInt(nowPages[0]);
//		assertEquals((page+1)%4, nowpage);
//	}
	
	//No.48
//	@Test(priority = 21)
//	public void Calculator() throws InterruptedException {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/li[1]/div[2]/a/img");
//		webtest.click("xpath=/html/body/div/div[3]/div[2]/div[2]/ul/li[1]/span[1]/a");
//		Thread.sleep(3000);
//		String[] windowTitles = webtest.getAllWindowTitles();
//		assertEquals(windowTitles[1], "房贷计算器_公积金贷款计算器_2017版_房天下");
//	}
	
	//No.49
//	@Test(priority = 22)
//	public void search1() {
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/ul/div/div/ul/li[5]/a");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[1]/span/a[1]");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[3]/span/a[1]");
//		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[4]/span/a[6]");
//		boolean monthly=false;
//		if(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li/div[1]/b").compareTo("300")<0) {
//			monthly=true;
//		}
//		boolean area = false;
//		if(webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li/div[1]").split("\n")[1].split(":")[1].compareTo("150㎡")<0
//				&&webtest.getText("xpath=/html/body/div/div[3]/div[1]/ul/li/div[1]").split("\n")[1].split(":")[1].compareTo("130㎡")>0){
//					area = true;
//				}
//		assertTrue(monthly&&area);
//	}
	
	//No.50
	@Test(priority = 23)
	public void chooseCatalog() {
		webtest.click("xpath=/html/body/div/div[3]/div[1]/div[1]/p[4]/span/a[1]");
		assertFalse(webtest.getText("xpath=/html/body/div/div[3]/div[1]/div[2]/p[2]/i").equals("0"));
	}
}
