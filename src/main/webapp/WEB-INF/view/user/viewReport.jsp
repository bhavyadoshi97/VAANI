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
<!-- <link rel="icon" href="../adminResources/images/favicon.ico"> -->

<title>VAANI Admin - View Report</title>

<!-- Bootstrap 4.0-->
<link rel="stylesheet" href="../adminResources/css/bootstrap.min.css">

<!-- Data Table-->
<link rel="stylesheet" href="../adminResources/css/datatables.min.css" />

<!-- Bootstrap extend-->
<link rel="stylesheet" href="../adminResources/css/bootstrap-extend.css">

<!-- Theme style -->
<link rel="stylesheet" href="../adminResources/css/master_style.css">

<!-- UltimatePro Admin skins -->
<link rel="stylesheet" href="../adminResources/css/_all-skins.css">

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
			<jsp:include page="../header.jsp" />
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
							<h3 class="page-title">View Report</h3>
							<div class="d-inline-block align-items-center">
								<nav>
									<ol class="breadcrumb">
										<li class="breadcrumb-item"><a href="/user/index"><i class="mdi mdi-home-outline"></i></a></li>
										<li class="breadcrumb-item" aria-current="page">Report</li>
										<li class="breadcrumb-item active" aria-current="page">View Report</li>
									</ol>
								</nav>
							</div>
						</div>
					</div>
				</div>

				<!-- Main content -->
				<section class="content">
					<div class="row">
						<div class="box">
							<div class="box-header with-border">
								<h3 class="box-title">Session Report</h3>
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<div class="table-responsive">
									<table id="example"
										class="table table-bordered table-hover display nowrap margin-top-10 w-p100">
										<thead>
											<tr>
												<th colspan="3">Details</th>
												<th colspan="3">Time</th>
												<th colspan="3">Results</th>
											</tr>
											<tr>
												<th>Sr. No.</th>
												<th>ID</th>
												<th>Name</th>
												<th>Start</th>
												<th>End</th>
												<th>Duration</th>
												<th>Total</th>
												<th>Correct</th>
												<th>Accuracy(%)</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
											<tr>
												<td>01</td>
												<td>Tets_1</td>
												<td>XYZ</td>
												<td>10:20</td>
												<td>10:45</td>
												<td>25</td>
												<td>100</td>
												<td>50</td>
												<td>50</td>
											</tr>
										</tbody>
										<tfoot>
											<tr>
												<th>Sr. No.</th>
												<th>ID</th>
												<th>Name</th>
												<th>Start</th>
												<th>End</th>
												<th>Duration</th>
												<th>Total</th>
												<th>Correct</th>
												<th>Accuracy(%)</th>
											</tr>
										</tfoot>
									</table>
								</div>
							</div>
							<!-- /.box-body -->
						</div>
						<!-- /.box -->
					</div>
					<!-- /.col -->
				</section>
			</div>
			<!-- /.row -->

			<!-- /.content -->

		</div>
		<!-- /.content-wrapper -->


		<footer class="main-footer">
			<jsp:include page="../footer.jsp" />
		</footer>
	</div>
	<!-- ./wrapper -->

	<!-- jQuery 3 -->
	<script src="../adminResources/js/jquery-3.3.1.js"></script>

	<!-- popper -->
	<script src="../adminResources/js/popper.min.js"></script>

	<!-- Bootstrap 4.0-->
	<script src="../adminResources/js/bootstrap.min.js"></script>

	<!-- SlimScroll -->
	<script src="../adminResources/js/jquery.slimscroll.min.js"></script>

	<!-- FastClick -->
	<script src="../adminResources/js/fastclick.js"></script>

	<!-- UltimatePro Admin App -->
	<script src="../adminResources/js/template.js"></script>

	<!-- UltimatePro Admin for demo purposes -->
	<script src="../adminResources/js/demo.js"></script>

	<!-- This is data table -->
	<script src="../adminResources/js/datatables.min.js"></script>

	<!-- UltimatePro Admin for Data Table -->
	<script src="../adminResources/js/data-table.js"></script>

</body>
</html>
