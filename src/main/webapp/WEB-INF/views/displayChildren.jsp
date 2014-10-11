<%@page import="com.abhilasha.jdbc.model.Child"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All children in data table</title>
        <link href="resources/media/dataTables/demo_page.css" rel="stylesheet" type="text/css" />
        <link href="resources/media/dataTables/demo_table.css" rel="stylesheet" type="text/css" />
        <link href="resources/media/dataTables/demo_table_jui.css" rel="stylesheet" type="text/css" />
        <link href="resources/media/themes/base/jquery-ui.css" rel="stylesheet" 
           type="text/css" media="all" />
        <link href="resources/media/themes/smoothness/jquery-ui-1.7.2.custom.css" 
           rel="stylesheet" type="text/css" media="all" />
        <script src="resources/scripts/jquery.js"
           type="text/javascript"></script>
        <script src="resources/scripts/jquery.dataTables.min.js" 
           type="text/javascript"></script>
           <script src="resources/scripts/jquery.dataTables.columnFilter.js" 
           type="text/javascript"></script>
           <script src="resources/scripts/jquery.dataTables.rowGrouping.js" 
           type="text/javascript"></script>
</head>
<body>
	<div id="container">
            <div id="demo_jui">
                <table id="childrentable" class="display">
                    <thead>
                        <tr>
                            <th>Company name</th>
                             <th>Company name</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="child" items="${children}">
					  <tr>
                         <td>${child.getName()}</td>
                          <td>${child.getName()}</td>
                    </tr>
					</c:forEach>
                    </tbody>
                </table>
         </div>
        </div> 
         
</body>
<script>
        $(document).ready(function () {
            $("#childrentable").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true
            });
        });
        </script>
</html>