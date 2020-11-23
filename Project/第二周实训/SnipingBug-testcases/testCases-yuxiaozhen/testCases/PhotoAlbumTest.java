package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.WebElement;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class PhotoAlbumTest extends BaseTest{
	//No.1
//	@Test
//	public void searchByColumn() {
//		webtest.selectByIndex("xpath=//select[@name='stype']",1);
//		webtest.click("xpath=//input[@value='搜索']");
//		
//		for(int i=2;i<22;i++) {
//			String xPath = "xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr["+i+"]/td[3]";
//			assertEquals("户型图", webtest.getText(xPath));
//		}
//	}
	
	//No.2
//	@Test
//	public void searchByTitle() throws InterruptedException {
//		webtest.selectByVisibleText("xpath=//select[@name='stype']","-栏目-");
//		webtest.type("xpath=//*[@id=\"fmid\"]/table/tbody/tr/td/input[1]", "效果图");
//		webtest.click("xpath=//input[@value='搜索']");
//		String now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		int nowPage = Integer.parseInt(now);
//		String con = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[7]/a");
//		int count = Integer.parseInt(con);
//		int thcount = count/20+1;
//		List<WebElement> items = webtest.findElements("tag=tr");
//		for(int i=1;i<=count+thcount;i++) {
//			int t = i%21+1;
//			String xpath = "xpath=/html/body/form[2]/div/table/tbody/tr["+t+"]/td[2]/a";
//			assertEquals(webtest.getText(xpath), "效果图");
//			if(t==items.size()-2) {
//			webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[5]/a");
//			Thread.sleep(1000);
//			items = webtest.findElements("tag=tr");
//			now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//			nowPage = Integer.parseInt(now);
//			i++;
//			}
//		}
//	}
	
	//No.3
//	@Test
//	public void displayTest() throws InterruptedException {
//		webtest.selectByVisibleText("xpath=//select[@name='stype']","-栏目-");
//		webtest.typeAndClear("xpath=//*[@id=\\\"fmid\\\"]/table/tbody/tr/td/input[1]", "");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fmid\"]/table/tbody/tr/td/select[4]", "显示");
//		webtest.click("xpath=//input[@value='搜索']");
//		Thread.sleep(2000);
//		String now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		int nowPage = Integer.parseInt(now);
//		String con = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[7]/a");
//		int count = Integer.parseInt(con);
//		int thcount = count/20+1;
//		List<WebElement> items = webtest.findElements("tag=tr");
//		for(int i=1;i<=count+thcount;i++) {
//			int t = i%21+1;
//			String xpath = "xpath=/html/body/form[2]/div/table/tbody/tr["+t+"]/td[4]";
//			assertEquals(webtest.getText(xpath), "Y");
//			if(t==items.size()-2) {
//			webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[5]/a");
//			Thread.sleep(1000);
//			items = webtest.findElements("tag=tr");
//			now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//			nowPage = Integer.parseInt(now);
//			i++;
//			}
//		}
//	}
	
	//No.4
//	@Test void mixColumnAndTitle() throws InterruptedException {
//		webtest.selectByVisibleText("xpath=//select[@name='stype']","户型图");
//		webtest.type("xpath=//*[@id=\"fmid\"]/table/tbody/tr/td/input[1]", "效果图");
//		webtest.click("xpath=//input[@value='搜索']");
//		Thread.sleep(2000);
//		String now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		int nowPage = Integer.parseInt(now);
//		String con = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[7]/a");
//		int count = Integer.parseInt(con);
//		int thcount = count/20+1;
//		List<WebElement> items = webtest.findElements("tag=tr");
//		for(int i=1;i<=count+thcount;i++) {
//			int t = i%21+1;
//			String xpath = "xpath=/html/body/form[2]/div/table/tbody/tr["+t+"]/td[4]";
//			assertEquals(webtest.getText(xpath), "Y");
//			if(t==items.size()-2) {
//			webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[5]/a");
//			Thread.sleep(1000);
//			items = webtest.findElements("tag=tr");
//			now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//			nowPage = Integer.parseInt(now);
//			i++;
//			}
//		}
//	}
	
	//No.5
//	@Test
//	public void sortTest() throws InterruptedException {
//		webtest.selectByVisibleText("xpath=//select[@name='stype']","-栏目-");
//		webtest.typeAndClear("xpath=//*[@id=\\\"fmid\\\"]/table/tbody/tr/td/input[1]", "");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fmid\"]/table/tbody/tr/td/select[4]", "-显示-");
//		webtest.selectByVisibleText("xpath=/html/body/form[1]/table/tbody/tr/td/select[5]", "添加时间");
//		webtest.click("xpath=//input[@value='搜索']");
//		Thread.sleep(2000);
//		String now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		int nowPage = Integer.parseInt(now);
//		String con = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[7]/a");
//		int count = Integer.parseInt(con);
//		int thcount = count/20+1;
//		List<WebElement> items = webtest.findElements("tag=tr");
//		for(int i=2;i<=count+thcount;i++) {
//			boolean flag;
//			int t = i%21+1;
//			String addtime = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr["+t+"]/td[5]");
//			String addtimeup = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr["+i%21+"]/td[5]");
//			if(addtime.compareTo(addtimeup)<=0) {
//				flag = false;
//			}
//			else {
//				flag = true;
//			}
//			assertEquals(flag, false);
//			if(t==items.size()-2) {
//			webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[5]/a");
//			Thread.sleep(1000);
//			items = webtest.findElements("tag=tr");
//			now = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//			nowPage = Integer.parseInt(now);
//			i+=2;
//			}
//		}
//		String addTime = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[5]");
//	}
	
	//No.6
//	@Test
//	public void pageJumpTest() throws InterruptedException {
//		webtest.typeAndClear("xpath=//*[@id=\"pg_pjump\"]", "5");
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[13]/td[2]/div[1]/input");
//		Thread.sleep(2000);
//		assertEquals(webtest.getValue("xpath=//*[@id='pg_pjump']"), "5");
//	}
	
	//No.7
//	@Test
//	public void checkall() {
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[1]/input");
//		List<WebElement> items = webtest.findElements("tag=tr");
//		for(int i=2;i<items.size();i++) {
//			assertTrue(webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr["+i+"]/td[1]/input"));
//		}
//	}
	
	//No.8
//	@Test
//	public void batchHide() throws InterruptedException {
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[1]/input");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[1]/select", "隐藏");
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[1]/input");
//		Thread.sleep(2000);
//		assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), "20 条记录隐藏成功！");
//	}
	
	//No.9
//	@Test
//	public void batchShow() throws InterruptedException {
//		//20 条记录审核成功！
//		//html/body/form[1]/table/tbody/tr/th/span[1]
//		webtest.selectByVisibleText("xpath=//*[@id=\"fmid\"]/table/tbody/tr/td/select[4]", "隐藏");
//		webtest.click("xpath=//input[@value='搜索']");
//		Thread.sleep(2000);
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[1]/input");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[1]/select", "显示");
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[1]/input");
//		Thread.sleep(2000);
//		assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"),"20 条记录审核成功！");
//	}
	
	//No.10
//	@Test
//	public void batchDelete() throws InterruptedException {
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[1]/input");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[1]/select", "删除");
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[1]/input");
//		Thread.sleep(2000);
//		assertEquals(webtest.getText("xpath=/html/body/form[1]/table/tbody/tr/th/span[1]"), "20 条记录删除成功！");
//	}
	//No.11
//	@Test
//	public void nextPage() throws InterruptedException {
//		//*[@id="fmlist"]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[1]/a
//		//*[@id="pg_pjump"]
//		String nowPage = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[5]/a");
//		Thread.sleep(2000);
//		String jumpPage = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		assertEquals(nowPage.compareTo(jumpPage),-1);
//	}
	//No.12
//	@Test
//	public void jumpToLastPage() throws InterruptedException {
//		//html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[6]/a
//		//html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[1]/a
//		String totalPage = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[1]/a").split("/")[1];
//		webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[6]/a");
//		Thread.sleep(2000);
//		String nowPage = webtest.getValue("xpath=//*[@id=\"pg_pjump\"]");
//		assertEquals(nowPage, totalPage);
//	}
	//No.13
//	@Test
//	public void pageJump() throws InterruptedException {
//		webtest.typeAndClear("xpath=//*[@id=\"pg_pjump\"]", "3");
//		webtest.click("xpath=//input[@value='执行']");
//		Thread.sleep(2000);
//		String nowPage = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[22]/td[2]/div[2]/ul/li[1]/a").split("/")[0];
//		assertEquals(nowPage, "3");
//	}
}
