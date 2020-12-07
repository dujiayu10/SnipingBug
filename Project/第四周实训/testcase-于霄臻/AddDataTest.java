package com.webtest.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.WebElement;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.utils.ReadProperties;

public class AddDataTest extends BaseTest{
	//No.14
	@Test(priority = 1)
	public void addNormalData() {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		ExcelDataProvider excelDataProvider = new ExcelDataProvider();
		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "aa");
		webtest.selectByVisibleText("xpath=//*[@id=\"fm[catid]\"]", "户型图");
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
		assertEquals(webtest.getAlertText(), "增加成功！");
		webtest.alertAccept();
		webtest.leaveFrame();
	}
	//No.15
	@Test(priority = 2)
	public void checkDuplicateNames() {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "aa");
		webtest.selectByVisibleText("xpath=//*[@id=\"fm[catid]\"]", "户型图");
//		图片标题为“aa”栏目属于“户型图”的资料必重复
		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
		assertEquals(webtest.getText("xpath=//div[@class='layui-layer-content']"), "该资料重复！");
		webtest.leaveFrame();
	}
	//No.16
	@Test(priority = 3)
	public void selectData() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		//html/body/form[2]/div/table/tbody/tr[3]/td[3]/a
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		Thread.sleep(3000);
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		String dataName = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[3]/a");
		if(!webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input")) {
			webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input");
		}
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		assertEquals(webtest.getValue("xpath=//*[@id=\"fm_lpid_refname\"]"), dataName);
		webtest.leaveFrame();
	}
	//@No.17
	@Test(priority = 4)
	public void changeTextColor() {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "changeTextColor");
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[5]/td[2]/span[1]");
		webtest.enterFrame("fm_color__win");
		webtest.typeAndClear("xpath=//*[@id=\"resCode\"]", "#FF9966");
		webtest.click("xpath=/html/body/table/tbody/tr[3]/td/table/tbody/tr/td[3]/button[1]");
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		assertEquals(webtest.getValue("xpath=//*[@id=\"fm[color]\"]"), "FF9966");
		webtest.leaveFrame();
	}
	//No.18
	@Test(priority = 5)
	public void uploadPhotoTest() throws InterruptedException, AWTException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		webtest.click("xpath=//*[@id=\"fm_mpic_b\"]");
		StringSelection selection=new StringSelection("C:\\Users\\yu\\Pictures\\demo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
	    //释放Ctrl+V
		
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    //点击回车
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(2000);
	    
	    String uri = webtest.getValue("xpath=//*[@id=\"fm_mpic_\"]");
	    
	    assertTrue(!uri.equals(""));
	    webtest.leaveFrame();
	}
	//No.19
	@Test(priority = 6)
	public void clearUplodaText() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		webtest.type("xpath=//*[@id=\"fm_mpic_\"]", "aaaa");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[6]/td[2]/input[5]");
		
		Thread.sleep(1000);
		
		assertTrue(webtest.getValue("xpath=//*[@id=\"fm_mpic_\"]").equals(""));
		webtest.leaveFrame();
	}
	//No.20
	@Test(priority = 7)
	public void addData() throws AWTException, InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"album_add\"]");
		
		webtest.selectByVisibleText("xpath=//*[@id=\"fm[catid]\"]", "户型图");
		
		webtest.selectByVisibleText("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]","显示");
		
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
		
		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
		String photoTitle = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[3]/a");
		if(!webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input")) {
			webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input");
		}
		webtest.leaveFrame();
		
		Thread.sleep(1000);
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"fm_mpic_b\"]");
		StringSelection selection=new StringSelection("C:\\Users\\yu\\Pictures\\demo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
	    //释放Ctrl+V
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    //点击回车
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(2000);
	    
	    webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
	    
	    Thread.sleep(2000);
	    
	    String alertTextString =  webtest.getAlertText();
	    webtest.alertAccept();
	    
	    Thread.sleep(2000);
	    
	    webtest.selectByVisibleText("xpath=/html/body/form[1]/table/tbody/tr/td/select[2]", "图片标题");
	    webtest.typeAndClear("xpath=/html/body/form[1]/table/tbody/tr/td/input[1]", photoTitle);
	    webtest.selectByVisibleText("xpath=/html/body/form[1]/table/tbody/tr/td/select[5]", "添加时间");
	    webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
	    
	    Thread.sleep(2000);
	    
	    String savTitle = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]/a");
	    assertTrue(
	    		photoTitle.equals(savTitle)
	    		&&alertTextString.equals("增加成功！")
	    		&&webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[4]").equals("Y")
	    		&&webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]/span").equals("[图]")
	    		);  
	    
	    webtest.leaveFrame();
	}
	
	//No.21
	@Test(priority = 8)
	public void hoverShowAndHide() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
	    webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
		
		Thread.sleep(3000);
		
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[6]/td[2]/input[5]");
		
		assertEquals(webtest.getSrc("xpath=/html/body/form/div/table/tbody/tr[6]/td[2]/span/img"), "");
		webtest.leaveFrame();
	}
	
	//No.22
	@Test(priority = 9)
	public void clearData() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
		
		Thread.sleep(3000);
		
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[5]");
		
		assertEquals(webtest.getValue("xpath=//*[@id=\"fm_lpid_refname\"]"), "");
		webtest.leaveFrame();
	}
//	//No.23
	@Test(priority = 10)
	public void changeAddTime() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
		
		Thread.sleep(3000);
		
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[9]/td[2]/span[1]");
		
		webtest.enterFrame1("xpath=/html/body/div[2]/iframe");
		webtest.click("xpath=//*[@id=\"dpTodayInput\"]");
		
		webtest.leaveFrame();
		webtest.enterFrame("adf_main");
		
		String time =  webtest.getValue("xpath=//*[@id=\"fm[atime]\"]");
		String[] s = time.split(":");
		time = s[0] +":" +s[1];
		
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
		
		webtest.alertAccept();
		
		Thread.sleep(2000);
		
		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[5]"), time);
		webtest.leaveFrame();
	}
	//No.24
	@Test(priority = 11)
	public void changTime() throws InterruptedException {
		webtest.open("http://127.0.0.1/root/run/adm.php?");
		webtest.click("xpath=/html/body/div[3]/div[1]/ul[1]/li[6]/a[1]");
		webtest.enterFrame("adf_main");
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(System.currentTimeMillis());
		String currentTime = formatter.format(date);
		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
		
		Thread.sleep(3000);
		
		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", currentTime);
		webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
		formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		date = new Date(System.currentTimeMillis());
		currentTime = formatter.format(date);
		
		webtest.alertAccept();
		
		Thread.sleep(2000);
		
		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[7]"), currentTime);
		webtest.leaveFrame();
	}
}
