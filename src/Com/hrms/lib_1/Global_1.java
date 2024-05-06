package Com.hrms.lib_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Global_1 {
 WebDriver driver;
	
//	*** Test data ***
// login
public String url = "http://183.82.103.245/nareshit/index.php";
public String un = "nareshit";
public String pw = "nareshit";

//Add
public String fn = "Manual";
public String ln = "Automation";

//Edit
public String fn1 = "Fresher";
public String ln1 = "Experienced";

//Delete
public String srchid = "0514";


	
	
//  *** Objectives ***
//login
public String txtun    = "txtUserName";
public String txtpw    = "txtPassword";
public String loginbtn = "Submit";
public String logoutbtn= "Logout";
	
//Add
public String Abtn = "//input[@value='Add']";
public String txtfn = "txtEmpFirstName";
public String txtln = "txtEmpLastName";
public String svbtn = "btnEdit";      //id

//Edit
public String ebtn = "EditMain";
public String svbtn1 = "EditMain";
public String bckbtn = "//input[@value='Back']";
	
//delete
public String txtsrchbx = "loc_name";
public String eid =  "Emp. ID";
public String txtsrchbx1 = "loc_name";
public String sbtn = "//input[@value='Search']";
public String ckbx = "chkLocID[]";
public String Dbtn = "//input[@value='Delete']";

}
