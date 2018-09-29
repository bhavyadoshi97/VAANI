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

<title>VAANI Admin - View Feedback</title>

<!-- Bootstrap 4.0-->
<link rel="stylesheet" href="adminResources/css/bootstrap.min.css">

<!-- Bootstrap extend-->
<link rel="stylesheet" href="adminResources/css/bootstrap-extend.css">

<!-- Theme style -->
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
			<jsp:include page="header.jsp" />
		</header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar-->
			<section class="sidebar">
				<jsp:include page="menu.jsp" />
			</section>
		</aside>


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<div class="container">
				<!-- Content Header (Page header) -->
				<div class="content-header">
					<div class="d-flex align-items-center">
						<div class="mr-auto">
							<h3 class="page-title">View Feedback</h3>
						</div>
					</div>
				</div>

				<!-- Main content -->
				<section class="content">

					<!-- Basic Forms -->
					<div class="box">
						<div class="box-header with-border">
							<h4 class="box-title">Feedback</h4>
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
														Enter Duration <span class="text-danger">*</span>
													</h5>
													<div class="controls">
														<select name="select" id="select" required
															class="form-control">

															<option value="5">For last week</option>
														</select>
													</div>
												</div>
											</div>
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
	</div>
	<footer class="main-footer">
		<jsp:include page="footer.jsp" />
	</footer>

	<!-- ./wrapper -->

	<!-- jQuery 3 -->
	<script src="adminResources/js/jquery-3.3.1.js"></script>

	<!-- popper -->
	<script src="adminResources/js/popper.min.js"></script>

	<!-- Bootstrap 4.0-->
	<script src="adminResources/js/bootstrap.js"></script>

	<!-- Slimscroll -->
	<script src="adminResources/js/jquery.slimscroll.js"></script>

	<!-- date-range-picker -->
	<script src="adminResources/js/moment.min.js"></script>
	<script src="adminResources/js/daterangepicker.js"></script>

	<!-- Sparkline -->
	<script src="adminResources/js/jquery.sparkline.min.js"></script>

	<!-- C3 Plugins -->
	<script src="adminResources/js/d3.min.js"></script>
	<script src="adminResources/js/c3.min.js"></script>

	<!-- eChart Plugins -->
	<script src="adminResources/js/echarts-en.min.js"></script>

	<!-- FastClick -->
	<script src="adminResources/js/fastclick.js"></script>

	<!-- UltimatePro Admin App -->
	<script src="adminResources/js/template.js"></script>

	<!-- UltimatePro Admin dashboard demo (This is only for demo purposes) -->
	<script src="adminResources/js/dashboard3.js"></script>
	<script src="adminResources/js/chart-dash3-int.js"></script>

	<!-- UltimatePro Admin for demo purposes -->
	<script src="adminResources/js/demo.js"></script>
	<!-- Form validator JavaScript -->
	<script src="adminResources/js/validation.js"></script>
	<script src="adminResources/js/form-validation.js"></script>

</body>
</html>