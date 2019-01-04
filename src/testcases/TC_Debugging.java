package testcases;

import utils.PropertyUtils;
import utils.ScreenshotUtils;

public class TC_Debugging {
	
	public static void main(String[] args) {
		String path = "D:\\lpgs\\Utils\\Data.utils";
		String folderPath = "D:\\logs\\ScreenShot";
		
//		PropertyUtils.propertyFile_Write(path, "FirstName", "Md");
//		PropertyUtils.propertyFile_Write(path, "LastName", "Rahad");
//		PropertyUtils.propertyFile_Read(path, "FirstName");
		
		ScreenshotUtils.screenshot(folderPath, 1);
	}
	
}
