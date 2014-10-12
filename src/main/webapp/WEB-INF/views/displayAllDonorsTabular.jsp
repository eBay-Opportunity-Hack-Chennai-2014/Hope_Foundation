<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
         <link href="/api/resources/media/dataTables/demo_page.css" rel="stylesheet" type="text/css" />
         <link href="/api/resources/media/dataTables/demo_table.css" rel="stylesheet" type="text/css" />
         <link href="/api/resources/media/dataTables/demo_table_jui.css" rel="stylesheet" type="text/css" />
        <!--  <link href="/api/resources/media/themes/base/jquery-ui.css" rel="stylesheet" 
            type="text/css" media="all" /> -->
         <link href="/api/resources/media/themes/smoothness/jquery-ui-1.7.2.custom.css" 
            rel="stylesheet" type="text/css" media="all" />
        
         <script src="/api/resources/scripts/jquery.dataTables.min.js" 
            type="text/javascript"></script>
            <script src="/api/resources/scripts/jquery.dataTables.columnFilter.js" 
            type="text/javascript"></script>
            <script src="/api/resources/scripts/jquery.dataTables.rowGrouping.js" 
            type="text/javascript"></script>
 	<div id="container" style="margin: 0 auto;width: 80%;margin-top: 80px;">
             <div id="demo_jui">
                 <table id="donortable" class="display">
                     <thead>
                         <tr>
                             <th>Name</th>
                              <th>Date of Birth</th>
                              <th>Address</th>
                              <th>Phone Residence</th>
                              <th>Mobile</th>
                              <th>Phone Office</th>
                              <th>Email</th>
                         </tr>
                     </thead>
                     <tbody>
                     <c:forEach var="donor" items="${donors}">
 					  <tr>
                          <td>${donor.getName()}</td>
                           <td>${donor.getDob()}</td>
                           <td>${donor.getAddress()}</td>
                           <td>${donor.getPhoneNoRes()}</td>
                           <td>${donor.getMobile()}</td>
                           <td>${donor.getPhoneNoOfc()}</td>
                           <td>${donor.getEmail()}</td>
                     </tr>
 					</c:forEach>
                     </tbody>
                 </table>
          </div>
         </div> 
 <script>
         $(document).ready(function () {
             $("#donortable").dataTable({
                 "sPaginationType": "full_numbers",
                 "bJQueryUI": true
             });
         });
         </script>
 <jsp:include page="footer.jsp"></jsp:include>
 