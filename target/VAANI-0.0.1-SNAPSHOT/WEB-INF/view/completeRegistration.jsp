<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- <link rel="icon" href="adminResources/images/favicon.ico"> -->

<title>VAANI Admin - Complete Registration</title>

<!-- Bootstrap 4.0-->
<link rel="stylesheet" href="adminResources/css/bootstrap.css">

<!-- Bootstrap extend-->
<link rel="stylesheet" href="adminResources/css/bootstrap-extend.css">

<!-- theme style -->
<link rel="stylesheet" href="adminResources/css/master_style.css">

<!-- UltimatePro Admin skins -->
<link rel="stylesheet" href="adminResources/css/_all-skins.css">

<!-- c3 CSS -->
<link rel="stylesheet" type="text/css"
	href="adminResources/css/c3.min.css">

<!-- daterange picker -->
<link rel="stylesheet" href="adminResources/css/daterangepicker.css">


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->


</head>

<body class="hold-transition skin-light light-sidebar sidebar-mini">
	<div class="wrapper">

  <header class="main-header">
  	<%-- <jsp:include page="header.jsp" /> --%>
  </header>
  
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar-->
    <section class="sidebar">
      <%-- <jsp:include page="menu.jsp" /> --%>
    </section>
  </aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<div class="container">
				<!-- Content Header (Page header) -->
				<div class="content-header">
					<div class="d-flex align-items-center">
						<div class="mr-auto">
							<h3 class="page-title">Complete Registration</h3>
						</div>

					</div>
				</div>

				<!-- Main content -->
				<section class="content">

					<!-- Basic Forms -->
					<div class="box">
						<div class="box-header with-border">
							<h4 class="box-title">Enter Details</h4>
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<div class="row">
								<div class="col">
									<form novalidate>
										<div class="row">
											<div class="col-12">
												<div class="form-group">
													<h5>
														Name of Organization<span class="text-danger">*</span>
													</h5>
													<div class="controls">
														<input type="text" name="text" class="form-control"
															required
															data-validation-required-message="This field is required">
													</div>
												</div>

												<div class="form-group">
													<h5>
														Type Of Organization<span class="text-danger">*</span>
													</h5>
													<div class="controls">
														<select name="select" id="select" required
															class="form-control">
															<option value="">Select Your Type</option>
															<option value="1">Public</option>
															<option value="2">Private</option>
															<option value="3">Service</option>
															<option value="4">NGO</option>
														</select>
													</div>
												</div>

												<div class="form-group">
													<h5>
														Website
														<!--<span class="text-danger">*</span>-->
													</h5>
													<div class="controls">
														<input type="text" class="form-control"
															placeholder="Add URL"
															data-validation-regex-regex="((http[s]?|ftp[s]?):\/\/)?([\da-z\.-]+)\.([a-z\.]{2,6})([\/\w \.-]*)*"
															data-validation-regex-message="Only Valid URL's">
													</div>
												</div>

												<div class="form-group">
													<h5>
														State<span class="text-danger">*</span>
													</h5>
													<div class="controls">
														<select name="select" id="select" required
															class="form-control">
															<option value="">Select Your State</option>
															<option value="1">Gujarat</option>
															<option value="2">Rajasthan</option>
															<option value="3">Maharashtra</option>
														</select>
													</div>
												</div>

												<div class="form-group">
													<h5>
														Address<span class="text-danger">*</span>
													</h5>
													<div class="controls">
														<textarea name="textarea" id="textarea"
															class="form-control" required placeholder="Enter Your Address"></textarea>
													</div>
												</div>

												<div class="form-group">
													<h5>
														Contact No.<span class="text-danger">*</span>
													</h5>
													<div class="controls">
														<input type="text" name="noChar" class="form-control"
															required data-validation-containsnumber-regex="(\d)+"
															data-validation-containsnumber-message="No Characters Allowed, Only Numbers">
													</div>
												</div>

											</div>
										</div>
										<div class="text-xs-right">
											<button type="submit" class="btn btn-info">Submit</button>
											<button type="reset" class="btn btn-info">Reset</button>
										</div>
									</form>
								</div>
								<!-- /.col -->
							</div>
							<!-- /.row -->
						</div>
						<!-- /.box-body -->
					</div>
					<!-- /.box -->

				</section>
				<!-- /.content -->
			</div>
		</div>
		<!-- /.content-wrapper -->

		<footer class="main-footer">
			<jsp:include page="footer.jsp" />
		</footer>

	</div>
	<!-- ./wrapper -->

	<!-- jQuery 3 -->
	<script src="adminResources/js/jquery-3.3.1.js"></script>

	<!-- popper -->
	<script src="adminResources/js/popper.min.js"></script>

	<!-- Bootstrap 4.0-->
	<script src="adminResources/js/bootstrap.min.js"></script>

	<!-- SlimScroll -->
	<script src="adminResources/js/jquery.slimscroll.min.js"></script>

	<!-- FastClick -->
	<script src="adminResources/js/fastclick.js"></script>

	<!-- UltimatePro Admin App -->
	<script src="adminResources/js/template.js"></script>

	<!-- UltimatePro Admin for demo purposes -->
	<script src="adminResources/js/demo.js"></script>

	<!-- Form validator JavaScript -->
	<script src="adminResources/js/validation.js"></script>
	<script src="adminResources/js/form-validation.js"></script>

</body>
</html>
