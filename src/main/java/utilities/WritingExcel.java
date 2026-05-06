package utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	private List<String> list = new ArrayList<String>();
	private Workbook workbook;
	private Sheet sheet;
	
	public WritingExcel(List<String> ls)
	{
		this.list = ls;
	}
	
	public void createExcel(String filename)
	{
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("book1");
		
		writeIntoExcel(list);
		saveFile(filename);
	}
	
	private void writeIntoExcel(List<String> ls)
	{
		Row header = sheet.createRow(0);
	    header.createCell(0).setCellValue("Project Number");
	    header.createCell(1).setCellValue("Project Name");
	 
	    int rowIdx = 1;
	 
	    for(int i = 0; i < ls.size(); i++)
	    {
	        Row row = sheet.createRow(rowIdx++);
	        row.createCell(0).setCellValue(i + 1);
	        row.createCell(1).setCellValue(ls.get(i));
	    }
	}
	
	private void saveFile(String filename)
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\"+filename;
		try {
			FileOutputStream fos = new FileOutputStream(new File(path));
			workbook.write(fos);
			workbook.close();
			fos.close();
			System.out.println("Excel File saved succefully");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Writing Excel failed : "+e.getMessage());
		}
	}
	
}
