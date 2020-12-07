package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	
//	@DataProvider(name="BuildingIntentionAdd_fail")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/BuildingIntentionAdd_fail.txt");
	}
	@DataProvider(name="HomePageAdsSearch")
	public  Object[][] getHomePageAdsSearchData() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/HomePageAdsSearch.txt");
	}
	@DataProvider(name="SubmissionOfIntent_success")
	public  Object[][] getSubmissionOfIntentData1() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/SubmissionOfIntent_success.txt");
	}
	@DataProvider(name="SubmissionOfIntent_fail")
	public  Object[][] getSubmissionOfIntentData2() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/SubmissionOfIntent_fail.txt");
	}
	@DataProvider(name="BuildingIntentionModifies_success")
	public  Object[][] getBuildingIntentionModifiesData1() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/BuildingIntentionModifies_success.txt");
	}
	@DataProvider(name="BuildingIntentionModifies_fail")
	public  Object[][] getBuildingIntentionModifiesData2() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/BuildingIntentionModifies_fail.txt");
	}
	@DataProvider(name="BuildingIntentionAdd_success")
	public  Object[][] getBuildingIntentionAddData1() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/BuildingIntentionAdd_success.txt");
	}
	@DataProvider(name="BuildingIntentionAdd_fail")
	public  Object[][] getBuildingIntentionAddData2() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/BuildingIntentionAdd_fail.txt");
	}
	@DataProvider(name="BuildingIntentionManage")
	public  Object[][] getBuildingIntentionManageData() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/BuildingintentionManage.txt");
	}
	@DataProvider(name="HomePageAdsAdd_fail")
	public  Object[][] getHomePageAdsAddData2() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/HomePageAdsAdd_fail.txt");
	}
	@DataProvider(name="HomePageAdsAdd_success")
	public  Object[][] getHomePageAdsAddData1() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/HomePageAdsAdd_success.txt");
	}
	
	@Test(dataProvider="txt")
	public void getData(String a,String b) {
		System.out.println(a+" "+b);
		
	}
	
	@DataProvider(name="excel")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/user.xlsx","Sheet1");
	}
	
	@DataProvider(name="mysql")
	public Object[][] getMysqlDada() throws IOException{
		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" + 
				"FROM `mm_movie` ");
	}
	
	@Test(dataProvider="mysql")
	public void testDB(String a,String b) {
		System.out.println(a+" "+b);
	}
	
}
