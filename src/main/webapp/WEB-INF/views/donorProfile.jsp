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
		<div id="donorDetails">
		<table>
			<tr>
				<td><img alt="donor_photo" src="resources/img/team/1.jpg"></td>
				<td>
					<table>
						<tr><td>
							<table>
								<tr><td><label>Name : </label></td><td>${donor.getName()}</td></tr>
								<tr><td><label>Date of Birth : </label></td><td>${donor.getDob()}</td></tr>
								<tr><td><label>Address : </label></td><td>${donor.getAddress()}</td></tr>
								<tr><td><label>Residence Phone Number : </label></td><td> ${donor.getPhoneNoRes()}</td></tr>
								<tr><td><label>Mobile Number : </label></td><td> ${donor.getMobile()}</td></tr>
								<tr><td><label>Office Phone Number : </label></td><td> ${donor.getPhoneNoOfc()}</td></tr>
								<tr><td><label>Email: </label></td><td>${donor.getEmail()}</td></tr>
							</table>
						</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
</div>
</div>

<jsp:include page="footer1.jsp"></jsp:include>
