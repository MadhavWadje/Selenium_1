package Com.hrms.Tscript_1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib_1.General_1;

public class TC_001 extends General_1 {
//public static void main(String[] args) throws Throwable {
	
	@Test
	public void m1() throws Exception {
		DOMConfigurator.configure("log.xml");
   General_1 s = new General_1();
   s.openapp();
   s.loginapp(); 
   s.Add();
   s.Edit();
   s.delete();
   s.closeapp();
   
}
}
