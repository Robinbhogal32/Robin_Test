package org.continuum.framework.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TC0005 extends Common {

	//Search multiple item //
	
	@Test(dataProvider="All")
	public void tC0005(String a) 
	{
		LandingPage LP = new LandingPage(driver);
		LP.tWSearchBox(a);
		//Thread.sleep(10000);
		LP.tWSearchButton(); 
		//Thread.sleep(10000);
	}
	
/*@DataProvider(name="Dp1")
	public Object [][]testData()
	{
		Object[][] arr={{"Iphone"}, {"Dell"}, {"Samsung"}};
		return arr;
	} */
	
@DataProvider(name="All")
	public Object[][] testdataexcel() throws BiffException, IOException
	{
		File f = new File("F:\\TestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s1=wk.getSheet("Sheet1");
		int r=s1.getRows();
		int c=s1.getColumns();
		Object [][] arr= new Object[r][c];
		for(int i=0; i<r; i++)
		{
			Cell c1=s1.getCell(0, i);
			arr[i][0]= c1.getContents();
			
		}
		return arr;
		
		
		
	}
	
	/*	@DataProvider(name="Dp2")
	public Object[][] testdataexcel() throws BiffException, IOException
	{
		File f = new File("F:\\TestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s1=wk.getSheet("Sheet1");
		int r=s1.getRows();
		int c=s1.getColumns();
		Object [][] arr= new Object[r][c];
		for(int i=0; i<r; i++)
		{
		
		  for(intj=0; j<c; j++)
		  {
			Cell c1=s1.getCell(j, i);
			arr[i][j]= c1.getContents();
			
		}
		return arr;
		
		
		
	}*/
	
	
/*	@DataProvider(name="Dp2")
	public void testdataexcel() throws IOException
	{
		File f = new File("F:\\TestData.xls");
		FileInputStream Fs= new FileInputStream(f);
		HSSFWorkbook wk = new  HSSFWorkbook(Fs);
	//	System.out.println(wk.getNumberOfSheets());
		HSSFSheet s1 = wk.getSheet("Sheet1");
		//System.out.println(s1.getPhysicalNumberOfRows());
		
	     Iterator<Row> rowIterator = sheet.iterator();
         while (rowIterator.hasNext())
         {
             Row row = rowIterator.next();
	}
         Iterator<Cell> cellIterator = row.cellIterator();
         
         while (cellIterator.hasNext())
         {
             Cell cell = cellIterator.next();
             //Check the cell type and format accordingly
             switch (cell.getCellType())
             {
                 case Cell.CELL_TYPE_NUMERIC:
                     System.out.print(cell.getNumericCellValue() + "t");
                     break;
                 case Cell.CELL_TYPE_STRING:
                     System.out.print(cell.getStringCellValue() + "t");
                     break;
             }
         }
         System.out.println("");
     }
     
		*/
		
	}

