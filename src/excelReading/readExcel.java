package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class readExcel {
	
	ArrayList<projects> projectsArr = new ArrayList<projects>();
	
	File excel = new File("/Users/saadalali/Desktop/SWE316/Samples/Projects.xls"); //projects file
	String[] projectsArray= new String[5]; //array of 1 project with basic info
	
	public ArrayList<projects> objectsMaker() throws IOException { //read from Excel file
		FileInputStream fis = new FileInputStream(excel); 
		
		HSSFWorkbook hwb = new HSSFWorkbook(fis);  //used for .xls files
		HSSFSheet sheet1 = hwb.getSheetAt(0); //specify excel sheet
		
		int rowNum = sheet1.getLastRowNum(); //number of rows in the sheet
				
		for(int i=1; i<rowNum+1; i++) { //row loop (i=0 means row 1 in excel which is the header)
			
			String NodeID = "";
			String ProjectID = "";
			int Stage = 0;
			Date StartDate = null;
			Date EndDate = null;
			
			Cell NodeIDCell = sheet1.getRow(i).getCell(0);
			Cell ProjectIDCell = sheet1.getRow(i).getCell(1);
			Cell StageCell = sheet1.getRow(i).getCell(2);
			Cell StartDateCell = sheet1.getRow(i).getCell(3);
			Cell EndDateCell = sheet1.getRow(i).getCell(4);
			
			if(NodeIDCell == null) {
			} else {NodeID = NodeIDCell.getStringCellValue();}
			
			if(ProjectIDCell == null) {
			} else {ProjectID = ProjectIDCell.getStringCellValue();}
			
			if(StageCell == null) {
			} 	
			else {Stage = (int) StageCell.getNumericCellValue();}
			
			if(StartDateCell == null) {
			} else {StartDate = StartDateCell.getDateCellValue();}
			
			if(EndDateCell == null) {
			} else {EndDate =EndDateCell.getDateCellValue();}
			
			projectsArr.add(new projects(NodeID, ProjectID, Stage, StartDate, EndDate));

		}
		hwb.close();
		return projectsArr;
		
	}



}
