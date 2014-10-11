<jsp:include page="header.jsp"></jsp:include>

<link rel="stylesheet" href="resources/css/pure-min.css">

<section id="about" class="home-section text-center">
	<div class="heading-about">
		<h1>Donor Registration</h1>
		<p>&nbsp;</p>
		<div id="intro">
			<form class="pure-form pure-form-aligned" action="registerDonorAction"
				method="POST" enctype="multipart/form-data">
				<fieldset>
					<div class="pure-control-group">
						<label for="name">Name</label> <input name="name" type="text"
							placeholder="Username">
					</div>

					<div class="pure-control-group">
						<label for="text">Date Of Birth</label> <input name="dob"
							type="text" placeholder="DD/MM/YYYY">
					</div>

					<div class="pure-control-group">
						<label for="text">Address</label> <input name="address"
							type="text" placeholder="Where do you live">
					</div>

					<div class="pure-control-group">
						<label for="foo">Residence Ph No#</label> <input name="phNoRes"
							type="text" placeholder="+Contact number">
					</div>

					<div class="pure-control-group">
						<label for="foo">Office Ph No#</label> <input name="phNoOfc"
							type="text" placeholder="+Contact number">
					</div>

					<div class="pure-control-group">
						<label for="foo">Mobile</label> <input name="mobile" type="text"
							placeholder="+Contact number">
					</div>

					<div class="pure-control-group">
						<label for="foo">Email</label> <input name="email" type="email"
							placeholder="Email ID">
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
</div>
</td>
</tr>
</table>
</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
