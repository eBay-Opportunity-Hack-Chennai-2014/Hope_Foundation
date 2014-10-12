<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>


<div style="width: 130px;
height: 32px;
position: relative;
padding: 5px;
z-index: 10000000000000000;
top: 6%;
left: 18%;
border: 1px solid #aaa;
border-radius: 5px;
background: rgb(58, 142, 182);">
<div style="top-margin: 150px" class="color:#fff"><a href="/api/registerChild" style="width:30px height:10px;color:#fff">Register New Child</a></div>
</div>
<table align="center" style="margin-top: 70px">

		<c:forEach var="child" items="${children}" varStatus="loop">
			<c:if test="${loop.index % 3 == 0}"><tr></c:if>
			<td width="30%" style="padding: 15px;">
				<div class="row">
					<div class="col-xs-6 col-sm-3 col-md-3">
						<table width="100%" height="200px" border="0">
							<tbody>
								<tr>
									<td width="150px" height="200px" align="center">
										<div class="avatar">
											<img src="/api/resources/dp/child_${child.getId()}.jpg" alt=""
												class="img-responsive img-circle" width="100" />
										</div>
									</td>
									<td align="left" valign="middle" align="center">
										<div class="circleBase type2" align="center"
											style="margin-left: 5px">
											<table>
												<tr>
												</tr>
												<tr>
													<td><label id="name">${child.getName()}</label></td>
												</tr>
												<tr>
													<td><label id="sex"><c:choose><c:when test="${child.getSex() == 0}">Boy</c:when><c:when test="${child.getSex() == 1}">Girl</c:when></c:choose></label></td>
												</tr>
												<tr>
													<td><label>Standard : </label><label id="Standard">
															${child.getStd()}</label></td>
												</tr>
												<tr>
													<td><label>Date of Birth : </label><label id="dob">
															${child.getDob()}</label></td>
												</tr>
												<tr>
													<td><label>Category : </label><label id="category">
															${child.getCategory()}</label></td>
												</tr>
												<tr>
													<td><label>Wish : </label><label id="Wish">${wishes.get(loop.index)}</label></td>
												</tr>
												<tr>
													<td align="right"><a href="/api/childProfile/<c:out value='${child.getId()}'/>"> More
															details</a></td>
												</tr>
											</table>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</td>
			<c:if test="${(loop.index+1) % 3 == 0}"></tr></c:if>
	</c:forEach>
</table>

<jsp:include page="footer1.jsp"></jsp:include>
