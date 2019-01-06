package escala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Escala {
	public static void main(String[] args) throws IOException {
		
		File em = new File("/home/edilson/eclipse-workspace/escala/src/resorces/em.xlsx");
		FileInputStream emf = new FileInputStream(em);

		XSSFWorkbook workbook = new XSSFWorkbook(emf);
		XSSFSheet sheet = workbook.getSheetAt(0);
		 
	     for (Row row: sheet) {
	    	    if(row.getRowNum() > 4) {
		            for(Cell cell: row) {
		                
		                System.out.print(cell + "\t");
		            }
		            System.out.println();
	        }
	     }
	}
}
