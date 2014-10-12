<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>Squadfree - Free bootstrap 3 one page template</title>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<!-- Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="css/animate.css" rel="stylesheet" />
<!-- Squad theme CSS -->
<link href="css/style.css" rel="stylesheet">
<link href="color/default.css" rel="stylesheet">
<link rel="stylesheet" href="pure-min.css">
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">
<!-- Preloader -->
<div id="preloader"></div>
<div stylev="width = 100%">
<table>
<tr>
<td style="width:10%; margin-top: 0px; padding-top: 0px; vertical-align: top">          
            <nav class="navbar-default navbar-static-side" role="navigation" 
             style="background-color:#F0F8FF; margin-top: 0px; padding-top: 0px; height: 100%; ">
                <div class="sidebar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>                          
                        </li>
                        <li>
                            <a href="index.html"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>                                        
                        <li>
                            <a href="#"><i class="fa fa-user fa-fw"></i>Donors<span class="fa arrow"></span></a>                      
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-users fa-fw"></i>Children<span class="fa arrow"></span></a>	                        </li>                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </nav> 
</td>
<td>
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header page-scroll">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse"> <i class="fa fa-bars"></i> </button>
      <a class="navbar-brand" href="index.html">
      <h1>Hope is a good thing</h1>
      </a> </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#intro">Home</a></li>
        <li><a href="#about">About</a></li>
        <li><a href="#service">Service</a></li>
        <li><a href="#contact">Contact</a></li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
          <ul class="dropdown-menu">
            <li><a href="#">Example menu</a></li>
            <li><a href="#">Example menu</a></li>
            <li><a href="#">Example menu</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse --> 
  <!-- /.container -->
  <section id="about" class="home-section text-center">
    <div class="heading-about">
     <div id="intro">
      <form class="pure-form pure-form-aligned">
   		 <fieldset>
        <div class="pure-control-group">
        <form action>
            <label for="name">Search</label>
            <input id="name" type="text" placeholder="Enter Name">
            <button type="submit" class="pure-button pure-button-primary">Submit</button>
         </form>
        </div>           
        </div>
<div id="demo">
<%
    

%> 
</div>

<script>
var text = '{"employees":[' +
'{"firstName":"John","lastName":"Doe" },' +
'{"firstName":"Anna","lastName":"Smith" },' +
'{"firstName":"Peter","lastName":"Jones" }]}';
obj = JSON.parse(text);
var count  = 0;
while (count < obj.employees.length) 
{
	alert(obj.employees[count].firstName);  
    count++;
}

//alert(obj.employees[count].firstName);  
//count++;

</script>
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
<!-- Section: services -->
<section id="service" class="home-section text-center bg-gray">
  <div class="heading-about">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
          <div class="wow bounceInDown" data-wow-delay="0.4s">
            <div class="section-heading">
              <h2>Our Services</h2>
              <i class="fa fa-2x fa-angle-down"></i> </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-lg-2 col-lg-offset-5">
        <hr class="marginbot-50">
      </div>
    </div>
    <div class="row">
      <div class="col-sm-3 col-md-3">
        <div class="wow fadeInLeft" data-wow-delay="0.2s">
          <div class="service-box">
            <div class="service-icon"> <img src="img/icons/service-icon-1.png" alt="" /> </div>
            <div class="service-desc">
              <h5>Print</h5>
              <p>Vestibulum tincidunt enim in pharetra malesuada. Duis semper magna metus electram accommodare.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-3 col-md-3">
        <div class="wow fadeInUp" data-wow-delay="0.2s">
          <div class="service-box">
            <div class="service-icon"> <img src="img/icons/service-icon-2.png" alt="" /> </div>
            <div class="service-desc">
              <h5>Web Design</h5>
              <p>Vestibulum tincidunt enim in pharetra malesuada. Duis semper magna metus electram accommodare.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-3 col-md-3">
        <div class="wow fadeInUp" data-wow-delay="0.2s">
          <div class="service-box">
            <div class="service-icon"> <img src="img/icons/service-icon-3.png" alt="" /> </div>
            <div class="service-desc">
              <h5>Photography</h5>
              <p>Vestibulum tincidunt enim in pharetra malesuada. Duis semper magna metus electram accommodare.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-3 col-md-3">
        <div class="wow fadeInRight" data-wow-delay="0.2s">
          <div class="service-box">
            <div class="service-icon"> <img src="img/icons/service-icon-4.png" alt="" /> </div>
            <div class="service-desc">
              <h5>Cloud System</h5>
              <p>Vestibulum tincidunt enim in pharetra malesuada. Duis semper magna metus electram accommodare.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Section: services --> 

<!-- Section: contact -->
<section id="contact" class="home-section text-center">
  <div class="heading-contact">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
          <div class="wow bounceInDown" data-wow-delay="0.4s">
            <div class="section-heading">
              <h2>Get in touch</h2>
              <i class="fa fa-2x fa-angle-down"></i> </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-lg-2 col-lg-offset-5">
        <hr class="marginbot-50">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-8">
        <div class="boxed-grey">
          <form id="contact-form">
            <div class="row">
              <div class="col-md-6">
                <div class="form-group">
                  <label for="name"> Name</label>
                  <input type="text" class="form-control" id="name" placeholder="Enter name" required="required" />
                </div>
                <div class="form-group">
                  <label for="email"> Email Address</label>
                  <div class="input-group"> <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span> </span>
                    <input type="email" class="form-control" id="email" placeholder="Enter email" required="required" />
                  </div>
                </div>
                <div class="form-group">
                  <label for="subject"> Subject</label>
                  <select id="subject" name="subject" class="form-control" required>
                    <option value="na" selected="">Choose One:</option>
                    <option value="service">General Customer Service</option>
                    <option value="suggestions">Suggestions</option>
                    <option value="product">Product Support</option>
                  </select>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <label for="name"> Message</label>
                  <textarea name="message" id="message" class="form-control" rows="9" cols="25" required
                                placeholder="Message"></textarea>
                </div>
              </div>
              <div class="col-md-12">
                <button type="submit" class="btn btn-skin pull-right" id="btnContactUs"> Send Message</button>
              </div>
            </div>
          </form>
        </div>
      </div>
      <div class="col-lg-4">
        <div class="widget-contact">
          <h5>Main Office</h5>
          <address>
          <strong>Squas Design, Inc.</strong><br>
          Tower 795 Folsom Ave, Beautiful Suite 600<br>
          San Francisco, CA 94107<br>
          <abbr title="Phone">P:</abbr> (123) 456-7890
          </address>
          <address>
          <strong>Email</strong><br>
          <a href="mailto:#">email.name@example.com</a>
          </address>
          <address>
          <strong>We're on social networks</strong><br>
          <ul class="company-social">
            <li class="social-facebook"><a href="#" target="_blank"><i class="fa fa-facebook"></i></a></li>
            <li class="social-twitter"><a href="#" target="_blank"><i class="fa fa-twitter"></i></a></li>
            <li class="social-dribble"><a href="#" target="_blank"><i class="fa fa-dribbble"></i></a></li>
            <li class="social-google"><a href="#" target="_blank"><i class="fa fa-google-plus"></i></a></li>
          </ul>
          </address>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Section: contact -->

<footer>
  <div class="container">
    <div class="row">
      <div class="col-md-12 col-lg-12">
        <div class="wow shake" data-wow-delay="0.4s">
          <div class="page-scroll marginbot-30"> <a href="#intro" id="totop" class="btn btn-circle"> <i class="fa fa-angle-double-up animated"></i> </a> </div>
        </div>
        <p>&copy;Copyright 2014 - Squad. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>

<!-- Core JavaScript Files --> 
<script src="js/jquery.min.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.easing.min.js"></script> 
<script src="js/jquery.scrollTo.js"></script> 
<script src="js/wow.min.js"></script> 
<!-- Custom Theme JavaScript --> 
<script src="js/custom.js"></script>
</body>
</html>
