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

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.WebElement;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class AddDataTest extends BaseTest{
	//No.14
//	@Test
//	public void addNormalData() {
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "aa");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fm[catid]\"]", "户型图");
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
//		assertEquals(webtest.getAlertText(), "增加成功！");
//	}
	//No.15
//	@Test
//	public void checkDuplicateNames() {
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "aa");
//		webtest.selectByVisibleText("xpath=//*[@id=\"fm[catid]\"]", "户型图");
	//图片标题为“aa”栏目属于“户型图”的资料必重复
//		webtest.click("xpath=//*[@id=\"fm_repeat_ndb_repeat\"]");
//		assertEquals(webtest.getText("xpath=//div[@class='layui-layer-content']"), "该资料重复！");
//	}
	//No.16
//	@Test
//	public void selectData() throws InterruptedException {
//		//html/body/form[2]/div/table/tbody/tr[3]/td[3]/a
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		Thread.sleep(3000);
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		String dataName = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[3]/a");
//		if(!webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input")) {
//			webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input");
//		}
//		webtest.leaveFrame();
//		assertEquals(webtest.getValue("xpath=//*[@id=\"fm_lpid_refname\"]"), dataName);
//	}
	//@No.17
//	@Test
//	public void changeTextColor() {
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", "changeTextColor");
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[5]/td[2]/span[1]");
//		webtest.enterFrame("fm_color__win");
//		webtest.typeAndClear("xpath=//*[@id=\"resCode\"]", "#FF9966");
//		webtest.click("xpath=/html/body/table/tbody/tr[3]/td/table/tbody/tr/td[3]/button[1]");
//		webtest.leaveFrame();
//		assertEquals(webtest.getValue("xpath=//*[@id=\"fm[color]\"]"), "FF9966");
//	}
	//No.18
//	@Test
//	public void uploadPhotoTest() throws InterruptedException, AWTException {
//		webtest.click("xpath=//*[@id=\"fm_mpic_b\"]");
//		StringSelection selection=new StringSelection("C:\\Users\\yu\\Pictures\\demo.jpg");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		Robot robot=new Robot();
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//	    //释放Ctrl+V
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    robot.keyRelease(KeyEvent.VK_V);
//	    Thread.sleep(2000);
//	    //点击回车
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    Thread.sleep(2000);
//	    
//	    String uri = webtest.getValue("xpath=//*[@id=\"fm_mpic_\"]");
//	    
//	    assertTrue(!uri.equals(""));
//	}
	//No.19
//	@Test
//	public void clearUplodaText() throws InterruptedException {
//		webtest.type("xpath=//*[@id=\"fm_mpic_\"]", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[6]/td[2]/input[5]");
//		
//		Thread.sleep(1000);
//		
//		assertTrue(webtest.getValue("xpath=//*[@id=\"fm_mpic_\"]").equals(""));
//	}
	//No.20
//	@Test
//	public void addData() throws AWTException, InterruptedException {
//		webtest.selectByVisibleText("xpath=//*[@id=\"fm[catid]\"]", "户型图");
//		
//		webtest.selectByVisibleText("xpath=/html/body/form/div/table/tbody/tr[1]/td[2]/select[2]","显示");
//		
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[4]");
//		
//		webtest.enterFrame1("xpath=/html/body/div[2]/div/div/div[2]/iframe");
//		String photoTitle = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[3]/a");
//		if(!webtest.isChecked("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input")) {
//			webtest.click("xpath=/html/body/form[2]/div/table/tbody/tr[3]/td[1]/input");
//		}
//		webtest.leaveFrame();
//		
//		Thread.sleep(1000);
//		
//		webtest.click("xpath=//*[@id=\"fm_mpic_b\"]");
//		StringSelection selection=new StringSelection("C:\\Users\\yu\\Pictures\\demo.jpg");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		Robot robot=new Robot();
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//	    //释放Ctrl+V
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    robot.keyRelease(KeyEvent.VK_V);
//	    Thread.sleep(2000);
//	    //点击回车
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    Thread.sleep(2000);
//	    
//	    webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
//	    
//	    Thread.sleep(2000);
//	    
//	    String alertTextString =  webtest.getAlertText();
//	    webtest.alertAccept();
//	    
//	    webtest.open("http://127.0.0.3/root/run/adm.php?dops-a&mod=album&part=house");
//	    Thread.sleep(2000);
//	    
//	    webtest.selectByVisibleText("xpath=/html/body/form[1]/table/tbody/tr/td/select[2]", "图片标题");
//	    webtest.typeAndClear("xpath=/html/body/form[1]/table/tbody/tr/td/input[1]", photoTitle);
//	    webtest.selectByVisibleText("xpath=/html/body/form[1]/table/tbody/tr/td/select[5]", "添加时间");
//	    webtest.click("xpath=/html/body/form[1]/table/tbody/tr/td/input[2]");
//	    
//	    Thread.sleep(2000);
//	    
//	    String savTitle = webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]/a");
//	    assertTrue(
//	    		photoTitle.equals(savTitle)
//	    		&&alertTextString.equals("增加成功！")
//	    		&&webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[4]").equals("Y")
//	    		&&webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[2]/span").equals("[图]")
//	    		);   
//	}
	
	//No.21
//	@Test
//	public void hoverShowAndHide() throws InterruptedException {
//		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
//		
//		Thread.sleep(3000);
//		
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[6]/td[2]/input[5]");
//		
//		assertEquals(webtest.getSrc("xpath=/html/body/form/div/table/tbody/tr[6]/td[2]/span/img"), "");
//	}
	
	//No.22
//	@Test
//	public void clearData() throws InterruptedException {
//		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
//		
//		Thread.sleep(3000);
//		
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[2]/td[2]/input[5]");
//		
//		assertEquals(webtest.getValue("xpath=//*[@id=\"fm_lpid_refname\"]"), "");
//	}
	//No.23
//	@Test
//	public void changeAddTime() throws InterruptedException {
//		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
//		
//		Thread.sleep(3000);
//		
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[9]/td[2]/span[1]");
//		
//		webtest.enterFrame1("xpath=/html/body/div[2]/iframe");
//		webtest.click("xpath=//*[@id=\"dpTodayInput\"]");
//		
//		webtest.leaveFrame();
//		
//		String time =  webtest.getValue("xpath=//*[@id=\"fm[atime]\"]");
//		String[] s = time.split(":");
//		time = s[0] +":" +s[1];
//		
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
//		
//		webtest.alertAccept();
//		
//		Thread.sleep(2000);
//		
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[5]"), time);
//	}
	//No.24
//	@Test
//	public void changTime() throws InterruptedException {
//		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		Date date = new Date(System.currentTimeMillis());
//		String currentTime = formatter.format(date);
//		webtest.click("xpath=//*[@id=\"fmlist\"]/div/table/tbody/tr[2]/td[8]/a");
//		
//		Thread.sleep(3000);
//		
//		webtest.typeAndClear("xpath=//*[@id=\"fm[title]\"]", currentTime);
//		webtest.click("xpath=/html/body/form/div/table/tbody/tr[12]/td[2]/input");
//		formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		date = new Date(System.currentTimeMillis());
//		currentTime = formatter.format(date);
//		
//		webtest.alertAccept();
//		
//		Thread.sleep(2000);
//		
//		assertEquals(webtest.getText("xpath=/html/body/form[2]/div/table/tbody/tr[2]/td[7]"), currentTime);
//	}
}
