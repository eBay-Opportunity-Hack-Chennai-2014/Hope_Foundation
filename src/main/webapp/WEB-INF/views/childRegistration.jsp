<jsp:include page="header.jsp"></jsp:include>

<link rel="stylesheet" href="resources/css/pure-min.css">

<section id="about" class="home-section text-center">
	<div class="heading-about">
		<h1>Child Registration</h1>
		<p>&nbsp;</p>
		<div id="intro">
			<form class="pure-form pure-form-aligned"
				action="registerChildAction" method=POST enctype="multipart/form-data">
				<fieldset>

					<div class="pure-control-group">
						<label for="name">Name</label> <input name="name" type="text"
							placeholder="Your Name Please">
					</div>

					<div class="pure-control-group">
						<label for="AdmissionId">Admission ID</label> <input
							name="admissionNumber" type="text" placeholder="Admission ID">
					</div>

					<div class="pure-control-group">
						<label for="dob">Date of Birth</label> <input name="dob"
							type="text" placeholder="DD/MM/YYYY">
					</div>

					<div class="pure-control-group">
						<label for="age">Age</label> <input name="age" type="text"
							placeholder="How Old are you">
					</div>

					<div class="pure-control-group">
						<label for="sex">Gender</label> <select name="sex">
							<option value="0">Boy</option>
							<option value="1">Girl</option>
						</select>
					</div>

					<div class="pure-control-group">
						<label for="standard">Class of study</label> <input name="std"
							type="text" placeholder="Class">
					</div>

					<div class="pure-control-group">
						<label for="f_name">Father's Name</label> <input name="fatherName"
							type="text" placeholder="Your Father's name please">
					</div>

					<div class="pure-control-group">
						<label for="f_education">Father's Education</label> <select
							name="fatherEducation">
							<option value="Illiterate">Illiterate</option>
							<option value="Primary">Primary Education</option>
							<option value="10th">Metric pass</option>
							<option value="Above 10th">Above 10th</option>
						</select>
					</div>

					<div class="pure-control-group">
						<label for="f_profession">Father's Profession</label> <input
							name="fatherEmployment" type="text" placeholder="Profession">
					</div>

					<div class="pure-control-group">
						<label for="m_name">Mother's Name</label> <input name="motherName"
							type="text" placeholder="Mother's Name">
					</div>

					<div class="pure-control-group">
						<label for="m_education">Mother's Education</label> <select
							name="motherEducation">
							<option value="Illiterate">Illiterate</option>
							<option value="Primary">Primary Education</option>
							<option value="10th">Metric pass</option>
							<option value="Above 10th">Above 10th</option>
						</select>
					</div>

					<div class="pure-control-group">
						<label for="m_profession">Mother's Profession</label> <input
							name="motherEmployment" type="text" placeholder="Profession">
					</div>

					<div class="pure-control-group">
						<label for="fam_history">Family History</label> <input
							name="familyHistory" type="text"
							placeholder="Child's family details">
					</div>

					<div class="pure-control-group">
						<label for="res_address">Address</label> <input name="address"
							type="text" placeholder="Residence Address">
					</div>

					<div class="pure-control-group">
						<label for="fam_income">Family Income</label> <input
							name="familyIncome" type="text" placeholder="Family Income">
					</div>

					<div class="pure-control-group">
						<label for="category">Category</label> <input name="category"
							type="text" placeholder="Category">
					</div>

					<div class="pure-control-group">
						<label for="hiv_infected">HIV Infected</label> <select
							name="hivInfection">
							<option value="1">Yes</option>
							<option value="0">No</option>
						</select>
					</div>

					<div class="pure-control-group">
						<label for="parenthiv_infected">Parents HIV Infected</label> <select
							name="parentsHadhiv">
							<option value="1">Yes</option>
							<option value="0">No</option>
						</select>
					</div>

					<div class="pure-control-group">
						<label for="conduct">Conduct</label> <input name="conduct"
							type="text" placeholder="Conduct">
					</div>


					<div class="pure-control-group">
						<label for="Performance">Academic Performance</label> <input
							name="academicPerformance" type="text"
							placeholder="Academic Performance">
					</div>

					<div class="pure-control-group">
						<label for="Dream">Dream</label> <input name="dream" type="text"
							placeholder="Dream">
					</div>

					<div class="pure-control-group">
						<label for="Impactofschool">Impact of school on child</label> <input
							name="schoolImpact" type="text"
							placeholder="Impact of School children">
					</div>
					
					<div class="pure-control-group">
						<label for="Needs">Select Child Needs</label><br>
						 <label>Food</label> <input type="checkbox" name="food" value="1"><br>
						<label>Education</label> <input type="checkbox" name="education" value="2"><br>
						<label>Medical</label> <input type="checkbox" name="medical" value="3"><br>
						<label>Clothing</label> <input type="checkbox" name="clothing" value="4">
					</div>

					<div class="pure-control-group">
						<label for="foo">Profile Pic</label> <input name="photo" type="file"
							placeholder="Choose Your Profile Pic">
					</div>

					<div class="pure-controls">
						<!-- <label for="cb" class="pure-checkbox">
	                	<input id="cb" type="checkbox"> I've read the terms and conditions
	            		</label> -->
						<button type="submit" class="pure-button pure-button-primary">Submit</button>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</section>
<jsp:include page="footer1.jsp"></jsp:include>