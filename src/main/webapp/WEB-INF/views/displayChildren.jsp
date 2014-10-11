
<jsp:include page="header.jsp"></jsp:include>
	<c:forEach var="child" items="${children}">
	   <p>${child.getName()}</p>
	</c:forEach>
	<div class="circleBase type2" align="center">
<table width="600px" height="200px" border="0" align="left">
  <tbody>
    <tr>
      <td width="150" height="200" valign="top"> 
              <div class="avatar"><img src="resources/img/team/1.jpg" alt="" class="img-responsive img-circle" width = "150"/></div>           
      </td>
      <td align="left" valign="middle" align="center">
			<div class="circleBase type2" align="center" style="margin-left:5px">
            <table>
            <tr>
            <td>
               <label id="name">Yagyavrat Sharma</label>
            </td>
            </tr>
             <tr>
            <td>
                 <label id="sex">Boy</label>
            </td>
            </tr>
             <tr>
            <td>
                <label>Standard : </label><label id="Standard"> 10th Class</label>
            </td>
            </tr>
             <tr>
            <td>
               <label>Date of Birth : </label><label id="dob"> 18 August 1991</label>
            </td>
            </tr>
            <tr>
            <td>
               <label>Category : </label><label id = "category"> Orphan</label>
            </td>
            </tr>
            <tr>
            <td>
               <label>Wish : </label><label id = "Wish"> I want to become doctor</label>
            </td>
            </tr> 
            <tr>
            <td align="right">
               <a href="#" align="right"> More details</a>
            </td>
            </tr>      
            </div>
      </td>
    </tr>
  </tbody>
</table>
</div>
<jsp:include page="footer.jsp"></jsp:include>
