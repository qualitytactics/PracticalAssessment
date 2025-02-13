package assessment.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String projectpath;
	static XSSFCell cell;

	public ArrayList<ArrayList<Object>> readdata(String sheetname) {

		ArrayList<ArrayList<Object>> SearchCriteria = new ArrayList<ArrayList<Object>>();

		try {

			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath + File.separator + "Data" + File.separator + "Input.xlsx");
			sheet = workbook.getSheet(sheetname);
			int totarow = sheet.getPhysicalNumberOfRows();
			for (int rowcount = 1; rowcount < totarow; rowcount++) {
				SearchCriteria.add(new ArrayList<Object>());
				for (int j = 0; j < 4; j++) {
					XSSFCell cell = sheet.getRow(rowcount).getCell(j);
					if (cell != null && cell.getCellType() != CellType.BLANK) {
						SearchCriteria.get(rowcount - 1).add(j, sheet.getRow(rowcount).getCell(j).getStringCellValue());
					} else {
						SearchCriteria.get(rowcount - 1).add(j, "");
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SearchCriteria;
	}
}
