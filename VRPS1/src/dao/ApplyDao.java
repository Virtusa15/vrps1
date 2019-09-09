package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.ApplyBean;
import bean.LoginBean;
import util.DBConnection;

public class ApplyDao {
	public String Apply(ApplyBean applybean)
	 {
	 String title = applybean.getTitle();
	 String firstname = applybean.getFirstname();
	 String middlename = applybean.getMiddlename();
	 String lastname = applybean.getLastname();
	 String ftitle = applybean.getFtitle();
	 String ffirstname = applybean.getFfirstname();
	 String fmiddlename = applybean.getFmiddlename();
	 String flastname = applybean.getFlastname();
	 String gender = applybean.getGender();
	 String hno = applybean.getHno();
	 String street = applybean.getStreet();
	 String state = applybean.getState();
	 String country = applybean.getCountry();
	 String city = applybean.getCity();
	 int pin= applybean.getPin();
	 String email = applybean.getEmail();
	 int num = applybean.getNum();
	 String qualification = applybean.getQualification();
	 int y_o_P = applybean.getY_o_p();
	 int academic = applybean.getAcademic_p();
	 String specilization = applybean.getSpecilization();
	 String languages = applybean.getLanguages_known();
	 int experience= applybean.getExperience();
	 Connection con = null;
	 PreparedStatement ps = null;
	 try
	 {
	 con = DBConnection.createConnection();
	 String query ="insert into Reg(title,firstname,middlename,lastname,ftitle,ffirstname,fmiddlename,flastname,gender,hno,street,state,country,city,pin,email,num,qualification,y_o_P,academic_p,specilization,languages_known,experience,Refferal_Id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,Reg_seq.NEXTVAL)";
	 
	 ps.setString(1,title);
	 ps.setString(3,firstname);
	 ps.setString(4,middlename);
	 ps.setString(2,lastname);
	 
	 
	 ps.setString(5,ftitle);
	 ps.setString(7,ffirstname);
	 ps.setString(8,fmiddlename);
	 ps.setString(6,flastname);
	 
	 
	 //ps.setInt(12,"b");
	ps.setString(9,gender);
	
	 
	 
	 ps.setString(10,hno);
	ps.setString(11,street);
	 ps.setString(12,state);
	 ps.setString(13,country);
	 ps.setString(14,city);
	
	 ps.setInt(15,pin);

	 
	 ps.setString(16,email);
		
	 ps.setInt(17,num);
	 
	 ps.setString(18,qualification);
		
	 ps.setInt(19,y_o_P);
	 ps.setInt(20,academic);
	 ps.setString(21,specilization);
	 ps.setString(22,languages);
	 
	 ps.setInt(23,experience);
	 
	 int i= ps.executeUpdate();
	 if (i!=0) {
		 return "SUCCESS"; 
		 }
		 else
		 {
			 return "failed";
		 }
	 
	 
	 
	 
      }catch(Exception e)
	 {
	 System.out.println(e);
}

return "hi";
	 }
}
