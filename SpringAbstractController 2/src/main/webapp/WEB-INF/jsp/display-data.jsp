<%@page import="java.util.List"%>
<%@page import="com.spring.mvc.bo.PersonalInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Display Data</title>
	</head>
	
	<body>
		<!-- <div>Displaying Data...</div> -->
		
		<div>
			<% 
			
				List<PersonalInfo> personalInfos = (List) request.getAttribute("personalInfo"); 
			
				for(int k = 0; k < personalInfos.size(); k++) {
					PersonalInfo personalInfo = null;
					personalInfo = personalInfos.get(k);
					
					out.print("\t \t" + personalInfo.getIdentificationNumber());
					out.print("\t \t" + personalInfo.getFrstName());
					out.print("\t \t" + personalInfo.getLastName());
					out.print("\t \t" + personalInfo.getEmailID());
					out.print("\t \t" + personalInfo.getMobileNumber());
					out.print("\t \t" + personalInfo.getOrganization());
					out.println("\n");
				}
				
 			%>
		</div>
		
		
	</body>
	
</html>