package ashokit;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo urepo;

	public void genetatexml() throws Exception {

		List<User> records = urepo.findAll();
		records.forEach(System.out::println);

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("User_info");

		XSSFRow head = sheet.createRow(0);
		head.createCell(0).setCellValue("ID");
		head.createCell(1).setCellValue("Name");
		head.createCell(2).setCellValue("Mail");
		head.createCell(3).setCellValue("Pwd");
		head.createCell(4).setCellValue("Phno");

		int rowNum = 1;

		for (User user : records) {
			XSSFRow row = sheet.createRow(rowNum);
			row.createCell(0).setCellValue(user.getU_id());
			row.createCell(1).setCellValue(user.getU_name());
			row.createCell(2).setCellValue(user.getU_mail());
			row.createCell(3).setCellValue(user.getU_pwd());
			row.createCell(4).setCellValue(user.getU_phno());
			rowNum++;

		}

		FileOutputStream fos = new FileOutputStream("C:\\ExcelFile\\user.xlsx");
		workbook.write(fos);

		workbook.close();
		fos.close();

	}
}
