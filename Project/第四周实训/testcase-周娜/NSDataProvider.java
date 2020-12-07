package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	
	@DataProvider(name="zl_shop")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/user.txt");
	}
	@DataProvider(name="dataaddt")
	public  Object[][] getTxtDataadd() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/dataaddt.txt");
	}
	@DataProvider(name="ourhouset")
	public  Object[][] getTxtDataourhouset() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/ourhouset.txt");
	}
	@DataProvider(name="searchadt")
	public  Object[][] getTxtDatasearchad() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/searchadt.txt");
	}
	@DataProvider(name="renamet")
	public  Object[][] getTxtDataRename() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/renamet.txt");
	}
	@DataProvider(name="searcht")
	public  Object[][] getTxtDatasearcht() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/searcht.txt");
	}
	@DataProvider(name="adaddt")
	public  Object[][] getTxtDataadaddt() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/adaddt.txt");
	}
	@DataProvider(name="wordt")
	public  Object[][] getTxtDatawordt() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/wordt.txt");
	}
	@DataProvider(name="dataadd")
	public  Object[][] getHouseData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/dataadd.xlsx","Sheet1");
	}
	@DataProvider(name="rename")
	public  Object[][] getRenameData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/rename.xlsx","Sheet1");
	}
	@DataProvider(name="search")
	public  Object[][] getsearchData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/search.xlsx","Sheet1");
	}
	@DataProvider(name="searchad")
	public  Object[][] getsearchadData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/searchad.xlsx","Sheet1");
	}
	@DataProvider(name="word")
	public  Object[][] getwordData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/word.xlsx","Sheet1");
	}
	@DataProvider(name="adadd")
	public  Object[][] getadaddData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/adadd.xlsx","Sheet1");
	}
	@DataProvider(name="ourhouse")
	public  Object[][] getourhouseData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/ourhouse.xlsx","Sheet1");
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
