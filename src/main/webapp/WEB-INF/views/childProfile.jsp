<jsp:include page="header.jsp"></jsp:include>

<link rel="stylesheet" href="resources/css/pure-min.css">
<style>
	table {
		margin: 10px auto;
		padding: 5px;
	}
	table tr {
		margin: 10px;
		padding: 10px;
	}
	table tr td {
		margin: 10px;
		padding: 10px;
		text-align: right;
	}
	table tr td > label {
		float: left;
	}
</style>
<section id="about" class="home-section text-center">
	<div class="heading-about">
		<p>&nbsp;</p>
		<div id="childDetails">
		<table>
			<tr>
				<td><img alt="child_photo" src="resources/img/team/1.jpg"></td>
				<td>
					<table>
						<tr><td>
							<table>
								<tr><td><label>Name : </label></td><td>${child.getName()}</td></tr>
								<tr><td><label>Sex : </label></td><td>${child.getSex()}</td></tr>
								<tr><td><label>Age : </label></td><td>${child.getAge()}</td></tr>
								<tr><td><label>Father Name : </label></td><td> ${child.getFatherName()}</td></tr>
								<tr><td><label>Father Education : </label></td><td> ${child.getFatherEducation()}</td></tr>
								<tr><td><label>Father Employment : </label></td><td> ${child.getFatherEmployment()}</td></tr>
								<tr><td><label>Family Income (INR): </label></td><td>${child.getFamilyIncome()}</td></tr>
								<tr><td><label>HIV Infected : </label></td><td>${child.getHivInfection()}</td></tr>
							</table>
						</td>
						<td>
							<table>
								<tr><td><label>Admission Number : </label></td><td>${child.getAdmissionNumber()}</td></tr>
								<tr><td><label>Date of Birth : </label></td><td>${child.getDob()}</td></tr>
								<tr><td><label>Standard : </label></td><td>${child.getStd()}</td></tr>
								<tr><td><label>Mother Name : </label></td><td> ${child.getMotherName()}</td></tr>
								<tr><td><label>Mother Education : </label></td><td> ${child.getMotherEducation()}</td></tr>
								<tr><td><label>Mother Employment : </label></td><td> ${child.getMotherEmployment()}</td></tr>
								<tr><td><label>Category : </label></td><td>${child.getCategory()}</td>
								<tr><td><label>Parents HIV Infected : </label></td><td>${child.getParentsHadhiv()}</td></tr>
								</tr>
							</table>
							</td></tr>
						<tr><td><label>Address : </label></td><td style="max-width:500px" >${child.getAddress()}</td></tr>
						<tr><td><label>Family History : </label></td><td style="max-width:500px">${child.getFamilyHistory()}</td></tr>
						<tr><td><label>Conduct : </label></td><td style="max-width:500px">${child.getConduct()}</td></tr>
						<tr><td><label>Academic Performance : </label></td><td style="max-width:500px">${child.getAcademicPerformance()}</td></tr>
						<tr><td><label>Dream : </label></td><td style="max-width:500px">${child.getDream()}</td></tr>
						<tr><td><label>School Impact on Child : </label></td><td style="max-width:500px">${child.getSchoolImpact()}</td></tr>
						<tr><td></td><td></td></tr>
					</table>
				</td>
			</tr>
		</table>
</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
