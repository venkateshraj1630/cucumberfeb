package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import java.util.HashMap;
//import java.util.Map;


//import org.locators.Encapsulation;

public class ParameterMap {

public static void main(String[] args) throws IOException {

	File f = new File("D:\\Facebook\\Instagram\\Whatsapp\\hello.txt");

//	boolean mkdir = f.mkdir();
//	System.out.println(mkdir);
//	boolean mkdirs = f.mkdirs();
//	System.out.println(mkdirs);
//	boolean mkdirs1 = f.mkdirs();
//	System.out.println(mkdirs1);
//	boolean createNewFile = f.createNewFile();
//	System.out.println(createNewFile);
	boolean canRead = f.canRead();
	System.out.println(canRead);
	boolean canWrite = f.canWrite();
	System.out.println(canWrite);
	
	//write in txtfile
	//FileUtils.write(f, "Welcome to Javafile");
	FileUtils.write(f, "This is Venkateshraj",true);
	FileUtils.write(f, "HelloWorld", false);
	
	List<String> readLines = FileUtils.readLines(f);
	System.out.println(readLines);
	
	for (String string : readLines) {
		System.out.println(string);
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//	
//
//		
//		public void empDetails(int empId, String name, String email) {
//			System.out.println(empId);
//			System.out.println(name);
//			System.out.println(email);
//	}
//
//     public void test(int a) {
//    	 System.out.println(a);
//     }
//public static void main(String[] args) {
//	
//	ParameterMap pm = new ParameterMap();
//	
////	Map <Integer,String> m = new HashMap<Integer,String>();
////	m.put(100,"venkat");
////	m.put(200,"Bala");
////	m.put(300,"Mala");
////	
//	
//	pm.empDetails(100, "venkateshraj", "email");
//	
//	
// }
//}