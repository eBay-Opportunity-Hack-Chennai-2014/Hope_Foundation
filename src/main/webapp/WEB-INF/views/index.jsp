<jsp:include page="header.jsp"></jsp:include>

<script>
// Focus = Changes the background color of input to yellow
function focusFunction() {
    document.getElementById("intro").style.backgroundImage = 'url(resources/img/bg2.jpg)';
}
</script>
<!-- Section: intro -->
<section id="intro" class="intro" onMouseOver="focusFunction()" >
  <div class="slogan">
    <h2>WELCOME TO ABHILASHA</span></h2>
    <h4>Ray of Hope</h4>
  </div>
  <div class="page-scroll"> <a href="#about" class="btn btn-circle"> <i class="fa fa-angle-double-down animated"></i> </a> </div>
</section>
<!-- /Section: intro --> 

<!-- Section: about -->
<section id="about" class="home-section text-center">
  <div class="heading-about">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
          <div class="wow bounceInDown" data-wow-delay="0.4s">
            <div class="section-heading">
              <h2>Meet us</h2>
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
      <div class="col-xs-6 col-sm-3 col-md-3">
        <div class="wow bounceInUp" data-wow-delay="0.2s">
          <div class="team boxed-grey">
            <div class="inner">
              <p class="subtitle">
                Hope foundation began its work in India in 1991. Its programs have expanded from a mobile clinic in  Chennai to 90 diverse programs
                , across 21 cities/villages in India. HOPE foundation is a registered Indian charity and works in close conjuction with the government, the corporate
                world, other service organizations and volunteers.</p>
               <p class="subtitle">
               HOPE foundation's employees and trained volunteers bring hope to a hurting world by providing humanitarian aid to children, youth and adults. Our focus is children
               , education, health, employment and seniors. We educate, train and serve through disease control, community outreach, adoption and orphange assistance, development assistance and disaster relief. 
               </p> 
            </div>
          </div>
        </div>
      </div>
      </div>
    </div>
</section>
<!-- /Section: about --> 

<jsp:include page="footer.jsp"></jsp:include>